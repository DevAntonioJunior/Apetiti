
package br.apetit.Apetiti_01.model;


import br.apetit.Apetiti_01.enity.PacienteDTO;
import br.apetit.Apetiti_01.model.DadosConexao; 
import java.sql.Connection;
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
        PreparedStatement ps = conexao.prepareCall("");
        }catch (SQLException ex){
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex); 
        
        }
        
    }
    
    

        
}
