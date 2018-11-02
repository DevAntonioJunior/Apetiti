package br.apetit.Apetiti_01.controller;


import javax.faces.bean.ManagedBean; 
import javax.faces.bean.SessionScoped;




@SessionScoped 
@ManagedBean  
public class PessoaBean {
    
    private String Nome;
    private int Dtnascimento; 
    private String sexo;
    private int Cpf; 
    private String Endereco; 
    private String Complemento; 
    private String Bairro; 
    private String Cidade; 
    private String mensagem;

    
    
    public void Saudacao()
    {
        mensagem = "Ola," + Nome; 
    }
    
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
    
}
