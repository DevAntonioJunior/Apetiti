package br.apetit.Apetiti_01.controller;
import br.apetit.Apetiti_01.enity.NutricionistaDTO;
import br.apetit.Apetiti_01.model.NutricionistaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped

public class NutricionistaController {
    
    private NutricionistaDTO nutricionista = new NutricionistaDTO(); 
    private List<NutricionistaDTO> nutricionistas = new ArrayList<>();
    private NutricionistaDAO nutricionistadao = new NutricionistaDAO(); 
    
    
    
    
    
     public String AutenticaLogin() {
        if (nutricionista.getLogin()!= null) {
            Integer logar  = nutricionistadao.LogarnoSistema(nutricionista.getLogin(), nutricionista.getSenha()); 
            switch (logar) {
                case 1:
                    
                    return "Vai_NutricionistaPrincipal";
                case 0:
                   FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Nutricionista Inativo!", "Nutricionista Inativo!"));  
                    return null;
                default:
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Login ou senha invalido!", "Login ou senha invalido!"));  
                    return null;
                }
             }
        return null; 
        }        
    
    
    
    
    
    public void Salvar_nutricionista(){
            
        nutricionistas.add(nutricionista);
        new NutricionistaDAO().Salvar_nutri(nutricionista);
        nutricionista = new NutricionistaDTO(); 
      }
    
    public void Editar_nutri(){
        nutricionistadao.Editar_nutri(nutricionista);
        nutricionistas=null; 
        
    }
    
    public void Buscar_nutri(){
    nutricionistas = nutricionistadao.buscar_nutri(); 
        
    }
    
    public void AutenticaUSuario(){
    
        
    }

    public NutricionistaDTO getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(NutricionistaDTO nutricionista) {
        this.nutricionista = nutricionista;
    }

    public List<NutricionistaDTO> getNutricionistas() {
        return nutricionistas;
    }

    public void setNutricionistas(List<NutricionistaDTO> nutricionistas) {
        this.nutricionistas = nutricionistas;
    }

    

}
