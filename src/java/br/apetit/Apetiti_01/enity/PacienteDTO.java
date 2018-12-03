package br.apetit.Apetiti_01.enity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;


@ManagedBean 
@SessionScoped

public class PacienteDTO {
    private Integer Idpaciente ; 
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
    private String Dieta; 
    private String Cidade; 
    private Date Agconsulta; 
    private double peso; 
    private String altura;
    

    public PacienteDTO(){};
    
    public PacienteDTO(Integer Idpaciente ){
     this.Idpaciente = Idpaciente; 
    }; 
    
    
    public PacienteDTO( int Idpaciente, String Nome, Date Dtnascimento, String sexo, String Cpf, String Endereco, String Cep ,String Bairro,String Cidade,String Telefone, String Login,String Senha,String Email ){

    
        this.Idpaciente = Idpaciente;
        this.Nome = Nome; 
        this.sexo = sexo; 
        this.Endereco = Endereco; 
        this.Email = Email; 
        this.Telefone = Telefone; 
        this.Dtnascimento = Dtnascimento; 
        this.Bairro = Bairro; 
        this.Cidade = Cidade; 
        this.Cpf = Cpf; 
        this.Cep = Cep; 
        this.Login = Login; 
        this.Senha = Senha;     
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

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
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

    public void setIdpaciente(int Idpaciente) {
        this.Idpaciente = Idpaciente;
    }

    public Date getAgconsulta() {
        return Agconsulta;
    }

    public void setAgconsulta(Date Agconsulta) {
        this.Agconsulta = Agconsulta;
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

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
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
    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
        
    }    


    public String getDieta() {
        return Dieta;
    }
     
    public void setDieta(String Dieta) {
        this.Dieta = Dieta;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.Idpaciente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PacienteDTO other = (PacienteDTO) obj;
        if (!Objects.equals(this.Idpaciente, other.Idpaciente)) {
            return false;
        }
        return true;
    }
   
}
     
    
    


     

