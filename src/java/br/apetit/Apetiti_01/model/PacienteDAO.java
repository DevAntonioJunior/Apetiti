
package br.apetit.Apetiti_01.model;


import br.apetit.Apetiti_01.enity.PacienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO {
    public void salvar(PacienteDTO paciente)
    {
        try{
        Connection conexao = DadosConexao.Conectar();
        PreparedStatement ps = conexao.prepareCall("INSERT INTO TB_pacinete('Id_paciente,'nome','dtnascimento','sexo','CPF','Endereco','Bairro','Cidade','Complemento','Login','Senha','Email') VALUES('?','?','?','?','?','?','?','?','?','?','?','?')");
        ps.setString(1, paciente.getNome());
         ps.setString(2, paciente.getSexo());
        
        
        }catch (SQLException ex){
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex); 
        
        }
        
    }
    
    

        
}
