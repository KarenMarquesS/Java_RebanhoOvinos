package org.example.Repositorio;

import org.example.InfraEstrutura.ConexaoBancoDados;
import org.example.Modelo.Peso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class PesoRepositorio implements RepositorioBase <Peso>{
    @Override
    public void Adicionar(Peso peso) {

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "INSERT INTO T_Peso (id_cordeiro, n_brinco, peso_15_dias, peso_20_dias, peso_30_dias, " +
                    "peso_40_dias, peso_50_dias, peso_60_dias, peso_90_dias) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, peso.getId_cordeiro());
            stmt.setInt(2, peso.getN_brinco());
            stmt.setDouble(3, peso.getPeso_15_dias());
            stmt.setDouble(4, peso.getPeso_20_dias());
            stmt.setDouble(5, peso.getPeso_30_dias());
            stmt.setDouble(6, peso.getPeso_40_dias());
            stmt.setDouble(7, peso.getPeso_50_dias());
            stmt.setDouble(8, peso.getPeso_60_dias());
            stmt.setDouble(9, peso.getPeso_90_dias());
            stmt.executeUpdate();

            System.out.println("Peso inserido com sucesso!");
        } catch(SQLException e){
            System.err.println("Erro ao inserir registro: " + e.getMessage());
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
        StringBuilder query = new StringBuilder("UPDATE T_Peso SET ");
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

    public List<Peso> GetByBrincoP(int n_brinco) {

        List<Peso> pesos = new ArrayList<>();

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "SELECT * FROM T_Peso WHERE n_brinco = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, n_brinco);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    double peso_15_dias = rs.getDouble("peso_15_dias");
                    double peso_20_dias = rs.getDouble("peso_20_dias");
                    double peso_30_dias = rs.getDouble("peso_30_dias");
                    double peso_40_dias = rs.getDouble("peso_40_dias");
                    double peso_50_dias = rs.getDouble("peso_50_dias");
                    double peso_60_dias = rs.getDouble("peso_60_dias");
                    double peso_90_dias = rs.getDouble("peso_90_dias");

                    Peso peso = new Peso(peso_15_dias, peso_20_dias, peso_30_dias, peso_40_dias, peso_50_dias,
                            peso_60_dias, peso_90_dias);
                    pesos.add(peso);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return pesos;
    }


    @Override
    public void removerPorBrinco(int n_brinco) {

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "DELTE FROM T_Peso WHERE n_brinco=? ";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, n_brinco);

            stmt.close();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }


    public List<Peso> GetByBrincoV(int n_brinco) {return List.of();}
    public List<Peso> GetByBrincoM(int n_brinco) {return List.of();}
    public List<Peso> GetByMaeBrinco(int mae_brinco) {return List.of();}

}

// método de update individual

//try{
//Connection conn = ConexaoBancoDados.getConnection();
//String query = "UPDATE T_Peso SET peso_15_dias=?, peso_20_dias=?, peso_30_dias=?, " +
//        "peso_40_dias=?, peso_50_dias=?, peso_60_dias=?, peso_90_dias=? WHERE n_brinco=?";
//PreparedStatement stmt = conn.prepareStatement(query);
//
//            stmt.setDouble(1, peso.getPeso_15_dias());
//        stmt.setDouble(2, peso.getPeso_20_dias());
//        stmt.setDouble(3, peso.getPeso_30_dias());
//        stmt.setDouble(4, peso.getPeso_40_dias());
//        stmt.setDouble(5, peso.getPeso_50_dias());
//        stmt.setDouble(6, peso.getPeso_60_dias());
//        stmt.setDouble(7, peso.getPeso_90_dias());
//        stmt.executeUpdate();
//
//            conn.close();
//            stmt.close();
//
//        } catch (SQLException e){
//        e.printStackTrace();
//        }