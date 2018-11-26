package br.apetit.Apetiti_01.model;


import java.sql.Connection; 
import java.sql.DriverManager; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException; 



public class DadosConexao {
    
    
        private static Connection conexaoBD;
        private static final String URL_CONEXAO = "jdbc://mysql://localhost:3306/bd_apetit"; 
        private static final String USUARIO ="root"; 
        private static final String SENHA ="root"; 
        public static final Connection Conectar(){    //  metodo para a brir a conexao com o banco de dados
           if(conexaoBD == null){
               try{
                   Class.forName("com.mysql.jdbc.Driver"); 
                    conexaoBD = DriverManager.getConnection(URL_CONEXAO,USUARIO,SENHA);  
                   } catch(SQLException ex){
                           Logger.getLogger(DadosConexao.class.getName()).log(Level.SEVERE, null, ex);
                   } catch (ClassNotFoundException ex) {
                           Logger.getLogger(DadosConexao.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
            }
           return conexaoBD;   
        }
        public static void fechaConexaoBd(){  // metodo para fechar  a conexao com o banco de dados 
                if(conexaoBD != null){
                    try{
                        conexaoBD.close(); 
                        conexaoBD = null; 
                        
                    }catch(SQLException ex){
                        Logger.getLogger(DadosConexao.class.getName()).log(Level.SEVERE, null, ex);
                }
    
    
            }
        }
}

