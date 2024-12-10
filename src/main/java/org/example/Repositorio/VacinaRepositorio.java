package org.example.Repositorio;

import org.example.InfraEstrutura.ConexaoBancoDados;
import org.example.Modelo.Vacina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class VacinaRepositorio implements RepositorioBase <Vacina>{

    @Override
    public void Adicionar(Vacina vacina) {

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "INSERT INTO T_Vacina (id_cordeiro, n_brinco, data_vacina, nome_vacina) VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, vacina.getId_cordeiro());
            stmt.setInt(2, vacina.getN_brinco());
            stmt.setDate(3, new java.sql.Date(vacina.getData_vacina().getTime()));
            stmt.setString(4, vacina.getNome_vacina());
            stmt.executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    @Override
    public void UpDateDinamico(int n_brinco, Map<String, Object> fieldsToUpdate) {
        if (fieldsToUpdate == null || fieldsToUpdate.isEmpty()) {
            System.out.println("Nenhum campo para atualizar.");
            return;
        }

        // Construção da query dinâmica
        StringBuilder query = new StringBuilder("UPDATE T_Vacina SET ");
        fieldsToUpdate.forEach((key, value) -> query.append(key).append("=?, "));
        query.delete(query.length() - 2, query.length()); // Remove a última vírgula
        query.append(" WHERE n_brinco=?");

        try {
            Connection conn = ConexaoBancoDados.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query.toString());

            int index = 1;

            // Adiciona os valores dos campos a atualizar
            for (Object value : fieldsToUpdate.values()) {
                stmt.setObject(index++, value); // Define os valores dinamicamente
            }

            // Adiciona o identificador (n_brinco)
            stmt.setInt(index, n_brinco);

            // Executa a query
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Registro atualizado com sucesso!");
            } else {
                System.out.println("Nenhum registro encontrado para atualizar.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public List<Vacina> GetByBrincoV(int n_brinco) {

        List<Vacina> vacinas = new ArrayList<>();

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "SELECT * FROM T_Vacina WHERE n_brinco = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, n_brinco);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    int brinco = rs.getInt("n_brinco");
                    Date data_manejo = rs.getDate("data_manejo");
                    String nome_vacina = rs.getString("nome_vacina");

                    Vacina vacina = new Vacina(brinco, data_manejo, nome_vacina);
                    vacinas.add(vacina);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return vacinas;
    }


    @Override
    public void removerPorBrinco(int n_brinco) {

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "DELTE FROM T_Vacina WHERE n_brinco=? ";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, n_brinco);

            stmt.close();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public List<Vacina> GetByMaeBrinco(int mae_brinco) {return List.of();}
    public List<Vacina> GetByBrincoP(int n_brinco) {return List.of();}
    public List<Vacina> GetByBrincoM(int n_brinco) {return List.of();}

}

//método de update individual
//
//         try {
//Connection conn = ConexaoBancoDados.getConnection();
//String query = "UPDATE T_Vacina SET n_brinco=?, data_vacina=?, nome_vacina=? WHERE n_brinco=?";
//PreparedStatement stmt = conn.prepareStatement(query);
//
//            stmt.setInt(1, vacina.getN_brinco());
//        stmt.setDate(2, new java.sql.Date(vacina.getData_vacina().getTime()));
//        stmt.setString(3, vacina.getNome_vacina());
//        stmt.executeUpdate();
//
//            conn.close();
//            stmt.close();
//        }catch (SQLException e) {
//        e.printStackTrace();
//        }