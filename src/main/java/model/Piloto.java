package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Adrielly Sales
 */
@Entity
public class Piloto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_piloto;
        @Column(length = 50)
    	private String nome;
        @Column(length = 11)
	private String cpf;
        @Column
	private String endereco;
        @Column
	private Date dataNasc;
        @Column
        private String status;
        @OneToOne
        @JoinColumn(name ="cod_moto",referencedColumnName ="id_moto")
        private Moto moto;
        
        public Piloto(){
            
        }

    public Piloto( String nome, 
            String cpf, String endereco, Date dataNasc, String status, Moto moto) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.status = status;
        this.moto = moto;
    }

   

    public int getId() {
        return id_piloto;
    }

    public void setId(int id) {
        this.id_piloto = id_piloto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
       
    
}
