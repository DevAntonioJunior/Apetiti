package br.apetit.Apetiti_01.controller;

import br.apetit.Apetiti_01.enity.PacienteDTO;
import br.apetit.Apetiti_01.model.PacienteDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name="pacienteController")
@SessionScoped
public class PacienteController {
    
      PacienteDTO paciente = new PacienteDTO();
      List<PacienteDTO> pacientes = new ArrayList<>();
      PacienteDAO pacientedao = new PacienteDAO();
      
     public PacienteController(){} 
   
      public String AutenticaLogin() {
        if (paciente.getLogin()!= null) {
            Integer logar  = pacientedao.LogarnoSistema(paciente.getLogin(), paciente.getSenha()); 
            switch (logar) {
                case 1:
                    
                    return "Vai_PacientePrincipal";
                case 0:
                   FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Paciente Inativo!", "Pacinete Inativo!"));  
                    return null;
                default:
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario ou senha invalido!", "Usuario ous senha invalido!"));  
                    return null;
                }
             }
        return null; 
        }        
        
   
        
       public void SalvarPaciente()throws ClassNotFoundException, SQLException{
    
        //pacientes.add(paciente);
        pacientedao.salvar(paciente);
        paciente = new PacienteDTO(); 
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Paciente cadastrado com sucesso!", "Pacinete cadastrado com sucesso!"));  
        
        }
       
       public void excluir(){
         pacientes.remove(paciente); 
         paciente = new PacienteDTO(); 
                 
       }
       public void Editar(){
       pacientedao.Editar(paciente);
      
       
       }
       public void pesquisar(){
           pacientes= pacientedao.buscar();
       
       }
         
    public PacienteDTO getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }


    public void setPacintes(List<PacienteDTO> pacientes) {
        this.pacientes = pacientes;
    }

  

    public List<PacienteDTO> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<PacienteDTO> pacientes) {
        this.pacientes = pacientes;
    }
   
}
