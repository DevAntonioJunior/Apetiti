package br.apetit.Apetiti_01.model;

import br.apetit.Apetiti_01.enity.NutricionistaDTO;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NutricionistaDAO {
    
    public void Salvar_nutri (NutricionistaDTO nutricionista)
    {
        try{
            Connection conexao = DadosConexao.Conectar();
            PreparedStatement ps = conexao.prepareCall("INSERT INTO TB_Nutricionista('IdNutricionista','nome','dtnascimento','sexo','Cpf','Email','Telefone','Endereco','Formacao','Login','senha','Bairro','Cidade','Complemento')");
            ps.setString(1,nutricionista.getNome());
            ps.setDate(2,new Date(nutricionista.getDtnascimento().getTime())); 
            ps.setString(3, nutricionista.getSexo()); 
            ps.setString(4, nutricionista.getCpf()); 
            ps.setString(5, nutricionista.getEmail()); 
            ps.setString(6, nutricionista.getTelefone()); 
            ps.setString(7, nutricionista.getEndereco()); 
            ps.setString(8, nutricionista.getFormacao()); 
            ps.setString(9, nutricionista.getLogin());
            ps.setString(10, nutricionista.getSenha()); 
            ps.setString(11, nutricionista.getBairro());
            ps.setString(12, nutricionista.getCep());
            ps.setString(13, nutricionista.getCidade());
            ps.setString(14, nutricionista.getComplemento());
            ps.execute(); 
            DadosConexao.fechaConexaoBd();
           
        
         } catch (SQLException ex) {
            Logger.getLogger(NutricionistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void Editar_nutri(NutricionistaDTO nutricionista)
    {
        try { 
            Connection conexao = DadosConexao.Conectar();
            PreparedStatement ps = conexao.prepareCall("UPDATE TB_Nutricionista SET 'IdNutricionista=?','nome=?','dtnascimento=?','sexo=?','Cpf=?','Email=?','Telefone=?','Endereco=?','Formacao=?','Login=?','senha=?','Bairro=?','Cidade=?','Complemento=?')");
            ps.setInt(15, nutricionista.getIdNutricionista());
            ps.setString(1,nutricionista.getNome());
            ps.setDate(2,new Date(nutricionista.getDtnascimento().getTime()));
            ps.setString(3, nutricionista.getSexo());
            ps.setString(4, nutricionista.getCpf());
            ps.setString(5, nutricionista.getEmail());
            ps.setString(6, nutricionista.getTelefone());
            ps.setString(7, nutricionista.getEndereco());
            ps.setString(8, nutricionista.getFormacao()); 
            ps.setString(9, nutricionista.getLogin());
            ps.setString(10, nutricionista.getSenha()); 
            ps.setString(11, nutricionista.getBairro());
            ps.setString(12, nutricionista.getCep());
            ps.setString(13, nutricionista.getCidade());
            ps.setString(14, nutricionista.getComplemento());
            ps.execute(); 
            DadosConexao.fechaConexaoBd();
        } catch (SQLException ex) {
            Logger.getLogger(NutricionistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
    }
    
    public void deletar_nutri(int IdNutricionista)
    {
        try {
            Connection conexao = DadosConexao.Conectar(); 
            PreparedStatement ps = conexao.prepareStatement("Delete from Tb_nutricionista where IdNutricionista=?");
            ps.setInt(1, IdNutricionista);
            ps.execute(); 
            DadosConexao.fechaConexaoBd();
        }catch(SQLException ex){
            Logger.getLogger(NutricionistaDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
    }
    
    public List<NutricionistaDTO> buscar_nutri(){
        
        try {
            Connection conexao = DadosConexao.Conectar();
            PreparedStatement ps = conexao.prepareStatement("Select * from Tb_Nutricionista");
            ResultSet resultset = ps.executeQuery();
            List<NutricionistaDTO> nutricionistas = new ArrayList();
            while(resultset.next()){
                NutricionistaDTO nutricionista = new NutricionistaDTO(); 
                nutricionista.setIdNutricionista(resultset.getInt("ID"));
                nutricionista.setNome(resultset.getString("Nome"));
                nutricionista.setFormacao(resultset.getString("Formacao"));
                nutricionista.setSexo(resultset.getString("Sexo"));
                nutricionista.setTelefone(resultset.getString("Telefone")); 
                nutricionista.setCRN(resultset.getString("CRN"));
                nutricionistas.add(nutricionista); 
            }
            return nutricionistas; 
               
                        
                        
        } catch (SQLException ex) {
            Logger.getLogger(NutricionistaDAO.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
       
        }
}