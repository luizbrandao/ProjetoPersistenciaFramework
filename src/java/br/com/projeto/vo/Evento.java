/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author luiz
 */
@Entity
@Table(name = "evento")
@SequenceGenerator(initialValue=1, name="seq_eventos", sequenceName="seq_eventos")
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_eventos")
    private int idEvento;
    private String nome_evento;
    private String descricao_evento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_inicial_evento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_final_evento;
    private Boolean evento_aberto;

    /**
     * @return the idEvento
     */
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * @param idEvento the idEvento to set
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * @return the nome_evento
     */
    public String getNome_evento() {
        return nome_evento;
    }

    /**
     * @param nome_evento the nome_evento to set
     */
    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    /**
     * @return the descricao_evento
     */
    public String getDescricao_evento() {
        return descricao_evento;
    }

    /**
     * @param descricao_evento the descricao_evento to set
     */
    public void setDescricao_evento(String descricao_evento) {
        this.descricao_evento = descricao_evento;
    }

    /**
     * @return the data_inicial_evento
     */
    public Date getData_inicial_evento() {
        return data_inicial_evento;
    }

    /**
     * @param data_inicial_evento the data_inicial_evento to set
     */
    public void setData_inicial_evento(Date data_inicial_evento) {
        this.data_inicial_evento = data_inicial_evento;
    }

    /**
     * @return the data_final_evento
     */
    public Date getData_final_evento() {
        return data_final_evento;
    }

    /**
     * @param data_final_evento the data_final_evento to set
     */
    public void setData_final_evento(Date data_final_evento) {
        this.data_final_evento = data_final_evento;
    }

    /**
     * @return the evento_aberto
     */
    public Boolean getEvento_aberto() {
        return evento_aberto;
    }

    /**
     * @param evento_aberto the evento_aberto to set
     */
    public void setEvento_aberto(Boolean evento_aberto) {
        this.evento_aberto = evento_aberto;
    }
    
}
