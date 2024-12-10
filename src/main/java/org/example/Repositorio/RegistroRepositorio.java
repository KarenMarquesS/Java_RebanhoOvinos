package org.example.Repositorio;

import org.example.InfraEstrutura.ConexaoBancoDados;
import org.example.Modelo.Registro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class RegistroRepositorio implements RepositorioBase<Registro>  {

    @Override
    public void Adicionar(Registro registro) {

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "INSERT INTO T_Registro (mae_brinco, data_nascimento, sexo, peso_nascimento, raca) " +
                    "VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, registro.getMae_brinco());
            stmt.setDate(2, new java.sql.Date(registro.getData_nascimento().getTime()));
            stmt.setString(3, registro.getSexo());
            stmt.setDouble(4, registro.getPeso_nascimento());
            stmt.setString(5, registro.getRaca());
            stmt.execute();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }


    @Override
    public void UpDate(Registro registro) {

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "UPDATE T_Registro SET id_cordeiro=?, data_nascimento=?, sexo=?, peso_nascimento=?, " +
                    "raca=? WHERE mae_brinco=?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1,registro.getId_cordeiro());
            stmt.setInt(2, registro.getMae_brinco());
            stmt.setDate(3, new java.sql.Date (registro.getData_nascimento().getTime()));
            stmt.setString(4, registro.getSexo());
            stmt.setDouble(5, registro.getPeso_nascimento());
            stmt.setString(6, registro.getRaca());
            stmt.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Registro> GetByBrinco(int n_brinco) {
        return List.of();
    }

    @Override
    public List<Registro> GetByMaeBrinco(int mae_brinco) {
        List<Registro> registro = new ArrayList<>();

        String query = "SELECT * FROM T_Registro WHERE mae_brinco = ?";

        try{
            Connection conn = ConexaoBancoDados.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, mae_brinco);

            try (ResultSet rs = stmt.executeQuery()){

                while (rs.next()){

                    Registro reg = new Registro();

                    reg.setData_nascimento(rs.getDate("data_nascimento"));
                    reg.setSexo(rs.getString("sexo"));
                    reg.setPeso_nascimento(rs.getDouble("peso_nascimento"));
                    reg.setRaca(rs.getString("raca"));

                    registro.add(reg);

                }
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return registro;
    }


    @Override
    public void Delete(int n_brinco) {
        try{
            Connection conn = ConexaoBancoDados.getConnection();
            String query = "DELTE FROM T_Registro WHERE n_brinco=? ";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, n_brinco);
            stmt.executeUpdate();

            stmt.close();
            conn.close();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

}
