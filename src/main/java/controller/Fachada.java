package controller;

import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import model.Corrida;
import model.Implementacoes.CorridaHibernate;
import model.Implementacoes.MotoHibernate;
import model.Implementacoes.PassageiroHibernate;
import model.Implementacoes.PilotoHibernate;
import model.Moto;
import model.Passageiro;
import model.Piloto;

@ManagedBean
@SessionScoped
public class Fachada {

    private static Fachada myself = null;   
     
    private CorridaHibernate corridaH = null;
    private MotoHibernate motoH = null;
    private PassageiroHibernate passageiroH = null;
    private PilotoHibernate pilotoH = null;

    public Fachada() {
        this.corridaH = new CorridaHibernate();
        this.motoH = new MotoHibernate();
        this.passageiroH = new PassageiroHibernate();
        this.pilotoH = new PilotoHibernate();
    }
    
    public String inserirCorrida(Corrida corrida){
        this.corridaH.cadastrar(corrida);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Corrida cadastrada com sucesso!"));
        
        return "apresentaCorrida.xhtml";
    
    }
    
    public String alterarCorrida(Corrida corrida){
        this.corridaH.alterar(corrida);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Corrida alterada com sucesso!"));
        
        return "apresentaCorrida.xhtml";
    }
    
    public Corrida recuperarCorrida(int codigo){
        return this.corridaH.recuperar(codigo);
       
    }
    
    public String deletarCorrida(Corrida corrida){
        this.corridaH.deletar(corrida);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Corrida deletada com sucesso!"));
    
        return "apresentaCorrida.xhtml";
    }
    
    public List<Corrida> recuperarTodasCorridas(Corrida corrida){
        return this.corridaH.recuperarTodos();
        
    }
    
    
    
    
    
    
    public String inserirMoto(Moto moto){
        this.motoH.cadastrar(moto);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Moto cadastrada com sucesso!"));
        
        return "apresentaMoto.xhtml";
    }
   
    public String alterarMoto(Moto moto){
        this.motoH.alterar(moto);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Moto aterada com sucesso"));
    
    return "apresentaMoto.xhtml";
    }
    
    public Moto recuperarMoto(int codigo){
        return this.motoH.recuperar(codigo);
    }
    
    public String deletarMoto(Moto moto){
        this.motoH.deletar(moto);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Moto deletada com sucesso!"));

        return "apresentaMoto.xhtml";
    }

    public List<Moto> recuperarTodasMotos(Moto moto){
        return this.motoH.recuperarTodos();
        
    }
    
    
    
    
    
    public String inserirPassageiro(Passageiro passageiro){
        this.passageiroH.cadastrar(passageiro);
   
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Passageiro cadastrado com sucesso"));
        
        return "apresentaPassageiro.xhtml";
    }
    
    public String alterarPassageiro(Passageiro passageiro){
        this.passageiroH.cadastrar(passageiro);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Passageiro alterado com sucesso"));
    
        return "apresentaPassageiro.xhtml";
    }
    
    public Passageiro recuperarPassageiro(int codigo){
        return this.passageiroH.recuperar(codigo);
    }
    
    public String deletarPassageiro(Passageiro passageiro){
        this.passageiroH.deletar(passageiro);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Passageiro deletado com sucesso!"));
    
        return "apresentaPassageiro.xhtml";
    }
    
    public List<Passageiro> recuperarTodosPassageiros(Passageiro passageiro){
        return this.passageiroH.recuperarTodos();
    }

    
    
    
    
    public String inserirPiloto(Piloto piloto){
        this.pilotoH.cadastrar(piloto);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piloto cadastrado com sucesso!"));
    
        return "apresentaPiloto.xhtml";
    }
    
    public String alterarPiloto(Piloto piloto){
        this.pilotoH.alterar(piloto);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piloto alterado com sucesso!"));
    
        return "apresentaPiloto.xhtml";
            
    }
    
    public Piloto recuperarPiloto(int codigo) {
        return this.recuperarPiloto(codigo);
        
    }   
    
    public String deletarPiloto(Piloto piloto){
        this.pilotoH.deletar(piloto);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piloto deletado com sucesso!"));
    
        return "apresentaPiloto.xhtml";
    }
    
    public List<Piloto> recuperarTodosPilotos(Piloto piloto){
        return this.pilotoH.recuperarTodos();
    }
}
