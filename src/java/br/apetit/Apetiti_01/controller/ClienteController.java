package br.apetit.Apetiti_01.controller;

import br.apetit.Apetiti_01.enity.ClienteDTO;
import java.util.List;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class ClienteController {
    
    private ClienteDTO cliente = new ClienteDTO();
    private List<ClienteDTO> clientes = new ArrayList<ClienteDTO>(); 
    
       public void adicionar(){
    
        clientes.add(cliente); 
        cliente = new ClienteDTO(); 
    }
       public void excluir(){
         clientes.remove(cliente); 
         cliente = new ClienteDTO(); 
                 
       }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<ClienteDTO> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteDTO> clientes) {
        this.clientes = clientes;
    }
    

    
}
