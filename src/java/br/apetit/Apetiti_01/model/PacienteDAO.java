
package br.apetit.Apetiti_01.model;


import br.apetit.Apetiti_01.enity.PacienteDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO {
    
    private Connection conexaoBD; 
    
    
    public void salvar(PacienteDTO paciente) 
    {
        
        try{
           
        conexaoBD = DadosConexao.Conectar();
        PreparedStatement ps = conexaoBD.prepareStatement("INSERT INTO paciente ('nome_paciente','cpf','dtnascimento','sexo','login','senha',nome_rua,cidade,email,num_celular)VALUES (?,?,?,?, ?, ?, ?,?,?,?,?,?,?)");
        ps.setString(1, paciente.getNome());
        ps.setString(2, paciente.getSexo());
        ps.setDate(3, new java.sql.Date(paciente.getDtnascimento().getTime()));
        ps.setString(4, paciente.getCpf());
        ps.setString(5, paciente.getEmail());
        ps.setString(6, paciente.getTelefone());
        ps.setString(7, paciente.getEndereco());
        ps.setString(8, paciente.getCep());
        ps.setString(9,paciente.getBairro());
        ps.setString(10, paciente.getCidade());
        ps.setString(11, paciente.getLogin());
        ps.setString(12, paciente.getSenha());
        ps.execute();  
        DadosConexao.fechaConexaoBd();
        }catch (SQLException ex){
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex); 
        
        }
    }
   
        
       public void  Editar(PacienteDTO paciente) 
     {
        try{
        
       
        Connection conexao = DadosConexao.Conectar();
        PreparedStatement ps = conexao.prepareCall("UPDATE tb_paciente set 'nome_paciente=?','cpf=?','dtnascimento=?','sexo=?','login=?','senha=?','altura=?','peso=?','email=?','login=?','senha=?' where id_paciente=?");
        ps.setInt(13, paciente.getIdpaciente()); 
        ps.setString(1, paciente.getNome());
        ps.setString(2, paciente.getSexo());
        ps.setDate(3, new Date(paciente.getDtnascimento().getTime()));
        ps.setString(4, paciente.getCpf());
        ps.setString(5, paciente.getEmail());
        ps.setString(6, paciente.getTelefone());
        ps.setString(7, paciente.getEndereco());
        ps.setString(8, paciente.getCep());
        ps.setString(9,paciente.getBairro());
        ps.setString(10, paciente.getCidade());
        ps.setString(11, paciente.getLogin());
        ps.setString(12, paciente.getSenha());
        ps.execute(); 
        DadosConexao.fechaConexaoBd();
        
        }catch (SQLException ex){
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex); 
        
        }
    }
     
       public void deletar(int Idpaciente)
       {
        try {
            Connection conexao = DadosConexao.Conectar();
            PreparedStatement ps = conexao.prepareStatement("delete from tb_paciente where id = ?");
            ps.setInt(1, Idpaciente); 
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                             
      }
       
       public List<PacienteDTO> buscar(){
           try{
               Connection conexao = DadosConexao.Conectar();
               PreparedStatement ps = conexao.prepareStatement("Select * from Tb_paciente"); 
               ResultSet resultSet = ps.executeQuery();
               List<PacienteDTO> pacientes = new ArrayList<>(); 
               while(resultSet.next()){
                   PacienteDTO paciente = new PacienteDTO(); 
                   paciente.setIdpaciente(resultSet.getInt("ID"));
                   paciente.setNome(resultSet.getString("Nome")); 
                   paciente.setDieta(resultSet.getString("Dieta"));
                   paciente.setTelefone(resultSet.getString("Telefone"));
                   pacientes.add(paciente);
                   }
                     return pacientes; 
           } catch (SQLException ex) {
               Logger.getLogger(PacienteDAO.class.getName());
               return null; 
           }     
           } 
      public Integer LogarnoSistema (String Login ,String senha) 
      {
          try{
           Connection conexao = DadosConexao.Conectar(); 
           PreparedStatement ps = conexao.prepareStatement("Select login,senha from tb_paciente where  login=? senha=?");
           ps.setString(1, Login);
           ps.setString(2, senha);
           ResultSet resultset = ps.executeQuery(); 
            if( resultset.next()){
             return resultset.getInt("ativo");    
           }
            }catch (SQLException ex){
          }
      return -1; 
      }
          
          
       
   }
                 
          
               
               
  
