package br.com.projeto.vo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "locais")
@SequenceGenerator(initialValue=1, name="seq_locais", sequenceName="seq_locais")
public class Local implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_locais")
    private int idLocal;
    private String enderecoLocal;
    private int capacidadeTotal;
    private Boolean aceitaReserva;

    @OneToOne(fetch=FetchType.EAGER)
    private Empresa idEmpresa;
    /**
     * @return the idLocal
     */
    public int getIdLocal() {
        return idLocal;
    }

    /**
     * @param idLocal the idLocal to set
     */
    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    /**
     * @return the enderecoLocal
     */
    public String getEnderecoLocal() {
        return enderecoLocal;
    }

    /**
     * @param enderecoLocal the enderecoLocal to set
     */
    public void setEnderecoLocal(String enderecoLocal) {
        this.enderecoLocal = enderecoLocal;
    }

    /**
     * @return the capacidadeTotal
     */
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    /**
     * @param capacidadeTotal the capacidadeTotal to set
     */
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    /**
     * @return the aceitaReserva
     */
    public Boolean getAceitaReserva() {
        return aceitaReserva;
    }

    /**
     * @param aceitaReserva the aceitaReserva to set
     */
    public void setAceitaReserva(Boolean aceitaReserva) {
        this.aceitaReserva = aceitaReserva;
    }
}