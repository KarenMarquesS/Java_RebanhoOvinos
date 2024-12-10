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
    public void UpDate(Vacina vacina) {

        try {
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "UPDATE T_Vacina SET n_brinco=?, data_vacina=?, nome_vacina=? WHERE n_brinco=?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, vacina.getN_brinco());
            stmt.setDate(2, new java.sql.Date(vacina.getData_vacina().getTime()));
            stmt.setString(3, vacina.getNome_vacina());
            stmt.executeUpdate();

            conn.close();
            stmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    @Override
    public List<Vacina> GetByBrinco(int n_brinco) {

        List<Vacina> vacina = new ArrayList<>();

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

                    vacina = List.of(new Vacina(brinco, data_manejo, nome_vacina));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return vacina;
    }

    @Override
    public List<Vacina> GetByMaeBrinco(int mae_brinco) {
        return List.of();
    }

    @Override
    public void Delete(int n_brinco) {

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
}
