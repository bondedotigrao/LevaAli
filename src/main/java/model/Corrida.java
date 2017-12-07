package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class  Corrida {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;
@OneToOne
@JoinColumn(name = "cod_passageiro", referencedColumnName = "id_passageiro")
private Passageiro passageiro;
@OneToOne
@JoinColumn(name = "cod_piloto",referencedColumnName = "id_piloto")
private Piloto piloto;
@OneToOne 
@JoinColumn(name = "cod_moto", referencedColumnName = "id_moto")
private Moto moto;
@Column
private double valor;

       
public Corrida(){
    
}

    public Corrida(Passageiro passageiro, Piloto piloto, Moto moto, double valor) {
        this.passageiro = passageiro;
        this.piloto = piloto;
        this.moto = moto;
        this.valor = valor;
       
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



}
