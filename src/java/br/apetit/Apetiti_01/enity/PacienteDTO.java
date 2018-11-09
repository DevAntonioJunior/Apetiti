package br.apetit.Apetiti_01.enity;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;


@ManagedBean 
public class PacienteDTO {
    private int Idpaciente; 
    private String Nome;
    private Date Dtnascimento; 
    private String sexo;
    private int Cpf; 
    private String Endereco; 
    private String Complemento; 
    private String Bairro; 
    private String Cidade;
    private Date Agconsulta; 
    private String Login; 
    private String senha;
    private String Email; 
    

    public PacienteDTO(){};
    
    public PacienteDTO(int Idpaciente ){
     this.Idpaciente = Idpaciente; 
    }; 
    
    
    public PacienteDTO( int Idpaciente, String Nome, Date Dtnascimento, String sexo, int Cpf, String Endereco ,String Bairro,String Cidade, String Complemento, String Login,String senha,String email ){
    
        this.Idpaciente = Idpaciente;
        this.Nome = Nome; 
        this.sexo = sexo; 
        this.Endereco = Endereco; 
        this.Dtnascimento = Dtnascimento; 
        this.Bairro = Bairro; 
        this.Cidade = Cidade; 
        this.Cpf = Cpf; 
        this.Complemento = Complemento; 
        this.Login = Login; 
        this.senha = senha; 
        this.Email = Email; 
        
    };
    
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

    public int getIdpaciente() {
        return Idpaciente;
    }

    public void setIdnome(int Idnome) {
        this.Idpaciente = Idpaciente;
    }

    public Date getAgconsulta() {
        return Agconsulta;
    }

    public void setAgconsulta(Date Agconsulta) {
        this.Agconsulta = Agconsulta;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     
        public void onDateSelect(SelectEvent event) {
    
             FacesContext facesContext = FacesContext.getCurrentInstance();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                     facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }
   
    
}
