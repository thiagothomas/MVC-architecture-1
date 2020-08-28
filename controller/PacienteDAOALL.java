package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.PacienteALL;

public class PacienteDAOALL {

    private final Connection con;
    private PreparedStatement cmd;
    
    public PacienteDAOALL(){
        this.con = ConexaoBD.Conectar();
    }
  
 //metodo Inserir    
    public int inserir(PacienteALL p){
           try{
                String sql = "insert into paciente (nome, peso, altura) values (?, ?, ?);";

                cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                cmd.setString(1, p.getNome());
                cmd.setFloat(2, p.getPeso());
                cmd.setFloat(3, p.getAltura());

                if (cmd.executeUpdate() > 0){
                    ResultSet rs = cmd.getGeneratedKeys();
                    return (rs.next()) ? rs.getInt(1): -1;
                }else{
                    return -1;
                }
           }        
        catch (SQLException e){
            System.out.println("ERRO SQL: " + e.getMessage());
            return -1;
        }  
        finally{
            ConexaoBD.Desconectar(con);
        }     
    }   

//Metodo Listar
    public List<PacienteALL> listar(){
        try{
            String sql = "select * from paciente order by id";
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            
            List<PacienteALL> lista = new ArrayList<>();
            while(rs.next()){
                
                PacienteALL p = new PacienteALL();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPeso(rs.getFloat("peso"));
                p.setAltura(rs.getFloat("altura"));
                
                lista.add(p);
            }
            return lista;
        }
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }   
        finally{
            ConexaoBD.Desconectar(con);
        }  
    }
    
//Metodo Listar por Nome
    public List<PacienteALL> pesquisarPorNome(String nome){
        try{
            String sql = "select * from paciente where nome like ? order by nome;";
            cmd = con.prepareStatement(sql);
            cmd.setString(1, "%" + nome + "%");
            
            ResultSet rs = cmd.executeQuery();
            List<PacienteALL> lista = new ArrayList<>();
            
            while(rs.next()){
                PacienteALL p = new PacienteALL();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPeso(rs.getFloat("peso")); 
                p.setAltura(rs.getFloat("altura"));
                
                lista.add(p);
            }
            return (List<PacienteALL>) lista;
        }
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }
        finally{
            ConexaoBD.Desconectar(con);
        }
    }  
   
//Metodo Deletar
    public int deletar(PacienteALL p){
        try{
            String sql = "delete from paciente where id = ?";
            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, p.getId());
            cmd.execute();
//            System.out.println("Ecluido com sucesso !");
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }
//        catch (HeadlessException | SQLException e){
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }
        finally{
            ConexaoBD.Desconectar(con);
        }
        return 0;
    }
  
//Metodo Update  
    public int atualizar(PacienteALL p){
        try{
            //String SQL - Banco Dados + declaração das Variaveis
            String sql = "update paciente set nome=?, peso=?, altura=? where id=?;";
            cmd = con.prepareStatement(sql);
            cmd.setString(1, p.getNome());
            cmd.setFloat(2, p.getPeso());
            cmd.setFloat(3, p.getAltura());
            cmd.setInt(4, p.getId());
            // bloco if , para executar a String e retornar
                if (cmd.executeUpdate() > 0){
                    return p.getId();
                }
                    else{
                        return -1;
                    }
        }
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }
        finally{
            ConexaoBD.Desconectar(con);
        }
    }
     
}//fim da classe















