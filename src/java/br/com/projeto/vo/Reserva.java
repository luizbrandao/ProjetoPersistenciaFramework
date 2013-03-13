package br.com.projeto.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "reserva")
@SequenceGenerator(initialValue = 1, name = "seq_reserva", sequenceName = "seq_reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_reserva")
    private int idReserva;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataReserva;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataValidade;
    private Boolean pagamento;
    private Double valorReserva;
    @OneToOne(fetch = FetchType.EAGER)
    private Usuario idUsuario;
    @OneToOne(fetch = FetchType.EAGER)
    private Empresa idEmpresa;

    /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * @return the dataReserva
     */
    public Date getDataReserva() {
        return dataReserva;
    }

    /**
     * @param dataReserva the dataReserva to set
     */
    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    /**
     * @return the dataValidade
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the pagamento
     */
    public Boolean getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(Boolean pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * @return the valorReserva
     */
    public Double getValorReserva() {
        return valorReserva;
    }

    /**
     * @param valorReserva the valorReserva to set
     */
    public void setValorReserva(Double valorReserva) {
        this.valorReserva = valorReserva;
    }
}