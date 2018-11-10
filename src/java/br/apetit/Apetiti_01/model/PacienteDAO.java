
package br.apetit.Apetiti_01.model;


import br.apetit.Apetiti_01.enity.PacienteDTO;
import br.apetit.Apetiti_01.model.DadosConexao; 
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO {
    public void salvar(PacienteDTO paciente)
    {
        try{
        Connection conexao = DadosConexao.Conectar();
        PreparedStatement ps = conexao.prepareCall("INSERT INTO TB_paciente('id_nome','nome','sexo','dtnascimento','Cpf','Email','Telefone','endereco','Cep','Bairro','Cidade','Login','Senha')");
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
    
    

        
}
