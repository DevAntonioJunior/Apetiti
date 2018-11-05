package br.apetit.Apetiti_01.enity;


import javax.faces.bean.ManagedBean; 
import javax.faces.bean.SessionScoped;






public class ClienteDTO {
    private int Idnome; 
    private String Nome;
    private int Dtnascimento; 
    private String sexo;
    private int Cpf; 
    private String Endereco; 
    private String Complemento; 
    private String Bairro; 
    private String Cidade; 
    

    public ClienteDTO(){};
    
    public ClienteDTO(int Idnome ){
     this.Idnome = Idnome; 
    }; 
    
    
    public ClienteDTO( int Idnome, String Nome, int Dtnascimento, String sexo, int Cpf, String Endereco ,String Bairro,String Cidade, String Complemento ){
    
        this.Idnome = Idnome;
        this.Nome = Nome; 
        this.sexo = sexo; 
        this.Endereco = Endereco; 
        this.Dtnascimento = Dtnascimento; 
        this.Bairro = Bairro; 
        this.Cidade = Cidade; 
        this.Cpf = Cpf; 
        this.Complemento = Complemento; 
    };
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getDtnascimento() {
        return Dtnascimento;
    }

    public void setDtnascimento(int Dtnascimento) {
        this.Dtnascimento = Dtnascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public int getIdnome() {
        return Idnome;
    }

    public void setIdnome(int Idnome) {
        this.Idnome = Idnome;
    }

   
    
}
