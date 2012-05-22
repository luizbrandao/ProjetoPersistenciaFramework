/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.vo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author luiz
 */
@Entity
@Table(name="pontoturistico")
@SequenceGenerator(initialValue=1, name="seq_pontoturistico", sequenceName="seq_pontoturistico")
public class PontoTuristico implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_pontoturistico")
    private int idPontoTuristico;
    private String nome;
    private Boolean aberto_visita;
    @OneToMany(fetch=FetchType.EAGER)
    private Endereco idEndereco;

    public int getIdPontoTuristico() {
        return idPontoTuristico;
    }

    public void setIdPontoTuristico(int idPontoTuristico) {
        this.idPontoTuristico = idPontoTuristico;
    }
    
}
