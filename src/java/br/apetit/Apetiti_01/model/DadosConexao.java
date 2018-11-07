package br.apetit.Apetiti_01.model;


import java.sql.Connection; 
import java.sql.DriverManager; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException; 



public class DadosConexao {
    
    
        private static Connection conexaoBD;
        private static String url = "" ;
        public static Connection Conectar(){
           if(conexaoBD == null){
               try{
                   Class.forName("com.mysql.jdbc.Driver"); 
                    conexaoBD = DriverManager.getConnection(null); 
                   } catch(SQLException ex){
                           Logger.getLogger(DadosConexao.class.getName()).log(Level.SEVERE, null, ex);
                   } catch (ClassNotFoundException ex) {
                           Logger.getLogger(DadosConexao.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
            }
           return conexaoBD;   
        }
        public static void fechaConexaoBd(){
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

