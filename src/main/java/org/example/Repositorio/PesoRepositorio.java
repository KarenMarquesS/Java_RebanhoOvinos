package org.example.Repositorio;

import org.example.InfraEstrutura.ConexaoBancoDados;
import org.example.Modelo.Peso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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
    public void UpDate(Peso peso) {

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "UPDATE T_Peso SET peso_15_dias=?, peso_20_dias=?, peso_30_dias=?, " +
                    "peso_40_dias=?, peso_50_dias=?, peso_60_dias=?, peso_90_dias=? WHERE n_brinco=?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setDouble(1, peso.getPeso_15_dias());
            stmt.setDouble(2, peso.getPeso_20_dias());
            stmt.setDouble(3, peso.getPeso_30_dias());
            stmt.setDouble(4, peso.getPeso_40_dias());
            stmt.setDouble(5, peso.getPeso_50_dias());
            stmt.setDouble(6, peso.getPeso_60_dias());
            stmt.setDouble(7, peso.getPeso_90_dias());
            stmt.executeUpdate();

            conn.close();
            stmt.close();

        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Peso> GetByBrinco(int n_brinco) {

        List<Peso> peso = new ArrayList<>();

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

                    peso = List.of(new Peso(peso_15_dias, peso_20_dias, peso_30_dias, peso_40_dias, peso_50_dias,
                            peso_60_dias, peso_90_dias));
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return peso;
    }

    @Override
    public List<Peso> GetByMaeBrinco(int mae_brinco) {
        return List.of();
    }


    @Override
    public void Delete(int n_brinco) {

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

}
