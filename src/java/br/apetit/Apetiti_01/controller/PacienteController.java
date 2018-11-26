package br.apetit.Apetiti_01.controller;

import br.apetit.Apetiti_01.enity.PacienteDTO;
import br.apetit.Apetiti_01.model.PacienteDAO;
import java.util.List;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class PacienteController {
    
    private PacienteDTO paciente = new PacienteDTO();
    private List<PacienteDTO> pacientes = new ArrayList<>();
    private PacienteDAO pacientedao = new PacienteDAO(); 
    
    
    
    
    
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
        
        
       public void SalvarPaciente(){
    
        pacientes.add(paciente); 
        new PacienteDAO().salvar(paciente);
        paciente = new PacienteDTO();  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Paciente cadastrado com sucesso!", "Pacinete cadastrado com sucesso!"));  
        }
       
       public void excluir(){
         pacientes.remove(paciente); 
         paciente = new PacienteDTO(); 
                 
       }
       public void Editar(){
       pacientedao.Editar(paciente);
       pacientes = null; 
       
       }
       public void pesquisar(){
           pacientes = pacientedao.buscar();
       
       }
         
    public PacienteDTO getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }

    public List<PacienteDTO> getClientes() {
        return pacientes;
    }

    public void setPacintes(List<PacienteDTO> pacientes) {
        this.pacientes = pacientes;
    }

    private Object pacientedao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
