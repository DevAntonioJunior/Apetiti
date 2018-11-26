
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
    public void salvar(PacienteDTO paciente)
    {
        try{
        Connection conexao = DadosConexao.Conectar();
        PreparedStatement ps = conexao.prepareCall("INSERT INTO TB_paciente('id_Paciente','nome','sexo','dtnascimento','Cpf','Email','Telefone','endereco','Cep','Bairro','Cidade','Login','Senha')");
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
        
       public void  Editar(PacienteDTO paciente) 
     {
        try{
        Connection conexao = DadosConexao.Conectar();
        PreparedStatement ps = conexao.prepareCall("UPDATE TB_paciente set 'nome=?','sexo=?','dtnascimento=?','Cpf=?','Email=?','Telefone=?','endereco=?','Cep=?','Bairro=?','Cidade=?','Login=?','Senha=?' where id_Paciente=?");
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
            PreparedStatement ps = conexao.prepareStatement("delete from Tb_paciente where id = ?");
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
           PreparedStatement ps = conexao.prepareStatement("Select login,senha from Tb_paciente where  login=? senha=?");
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
                 
           
               
               
  
