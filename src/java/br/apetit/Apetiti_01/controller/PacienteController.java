package br.apetit.Apetiti_01.controller;

import br.apetit.Apetiti_01.enity.PacienteDTO;
import br.apetit.Apetiti_01.model.PacienteDAO;
import java.util.List;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class PacienteController {
    
    private PacienteDTO paciente = new PacienteDTO();
    private List<PacienteDTO> pacientes = new ArrayList<>();
    private PacienteDAO pacientedao = new PacienteDAO(); 
    
    
       public void AutenticaPaciente(){
      
       
       }
       public void adicionar(){
    
        pacientes.add(paciente); 
        new PacienteDAO().salvar(paciente);
        paciente = new PacienteDTO(); 
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
