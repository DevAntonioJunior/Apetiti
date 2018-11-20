package br.apetit.Apetiti_01.enity;

import java.util.Date;


public class NutricionistaDTO {
    
    private PacienteDTO paciente; 
    private int IdNutricionista; 
    private String Nome;
    private Date Dtnascimento; 
    private String sexo;
    private String Cpf; 
    private String Email; 
    private String Telefone; 
    private String Endereco; 
    private String Cep; 
    private String Complemento; 
    private String Bairro; 
    private String Login; 
    private String Senha; 
    private String Cidade; 
    private Date consultaAg;
    private String Formacao; 
    private String CRN; 
    


    public NutricionistaDTO(){};
    
    public NutricionistaDTO(int IdNutricionista)
 {
   this.IdNutricionista = IdNutricionista;
 }
    
    
    public NutricionistaDTO( int IdNutricionista,String Nome ,Date Dtnascimento ,String sexo, String Cpf ,String Email,String Telefone ,String Endereco ,String Cep ,String Complemento,String Bairro ,String Login ,String Senha ,String Cidade,Date consultaAg ,String Formacao){
    
        this.IdNutricionista = IdNutricionista; 
        this.Nome = Nome; 
        this.Endereco = Endereco; 
        this.Bairro = Bairro; 
        this.Cep = Bairro; 
        this.Complemento = Complemento; 
        this.Email = Email; 
        this.Cpf = Cpf; 
        this.Formacao = Formacao; 
        this.consultaAg = consultaAg; 
        this.Telefone = Telefone; 
        this.Login = Login; 
        this.Senha = Senha; 
        this.Dtnascimento = Dtnascimento; 
        this.sexo = sexo; 
    }

    public PacienteDTO getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }

    public int getIdNutricionista() {
        return IdNutricionista;
    }

    public void setIdNutricionista(int IdNutricionista) {
        this.IdNutricionista = IdNutricionista;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getDtnascimento() {
        return Dtnascimento;
    }

    public void setDtnascimento(Date Dtnascimento) {
        this.Dtnascimento = Dtnascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
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

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public Date getConsultaAg() {
        return consultaAg;
    }

    public void setConsultaAg(Date consultaAg) {
        this.consultaAg = consultaAg;
    }

    public String getFormacao() {
        return Formacao;
    }

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public String getCRN() {
        return CRN;
    }

    public void setCRN(String CRN) {
        this.CRN = CRN;
    }
    
}

