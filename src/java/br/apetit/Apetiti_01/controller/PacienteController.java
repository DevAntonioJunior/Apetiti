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
    
    
       public String LogarPaciente(String Login, String senha ){
           if(Login.equals(Login)&& (senha.equals(Login)))
           {
               return "Vai_PacientePrincipal"; 
               
               
            } else {
               return "Vai_LoginNutricionista";
        }
      
       
       }
       public void adicionar(){
    
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
    

    
}
