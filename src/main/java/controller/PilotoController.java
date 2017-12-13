package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Implementacoes.PilotoHibernate;
import model.Piloto;


@ManagedBean
@SessionScoped
public class PilotoController {
    private PilotoHibernate pilotoHibernate;
    private Piloto cadPiloto;
    private Piloto selectedPiloto;

    public PilotoController() {
        this.pilotoHibernate = new PilotoHibernate();
        this.cadPiloto = new Piloto();
    }
    
    public String cadastrar(){
        this.pilotoHibernate.cadastrar(this.cadPiloto);
        
        this.cadPiloto = new Piloto();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piloto cadastrado com sucesso!"));
        
        return "index.xhtml";
        
    }
    
    
    public String alterar(){
        this.pilotoHibernate.alterar(this.selectedPiloto);
        
        this.cadPiloto = new Piloto();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piloto alterado com sucesso!"));
        
        return "index.xhtml";
        
    }
    
    
    public String deletar(){
        this.pilotoHibernate.deletar(this.selectedPiloto);
        
        this.cadPiloto = new Piloto();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piloto deletado com sucesso!"));
        
        return "index.xhtml";
        
    }
    
    
    public String recuperar(){
        this.pilotoHibernate.recuperar(this.selectedPiloto.getId());
        
        this.cadPiloto = new Piloto();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piloto recuperado com sucesso!"));
        
        return "index.xhtml";
        
    }
    
    public String recuperarTodos(){
        this.pilotoHibernate.recuperarTodos();
        
        this.cadPiloto = new Piloto();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(" Todos Pilotos recuperados com sucesso!"));
        
        return "index.xhtml";
        
    }

    public Piloto getCadPiloto() {
        return cadPiloto;
    }

    public void setCadPiloto(Piloto cadPiloto) {
        this.cadPiloto = cadPiloto;
    }

    public Piloto getSelectedPiloto() {
        return selectedPiloto;
    }

    public void setSelectedPiloto(Piloto selectedPiloto) {
        this.selectedPiloto = selectedPiloto;
    }
    
    
}
