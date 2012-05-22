/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author luiz
 */
@Entity
@Table(name="endereco")
@SequenceGenerator(initialValue=1, name="seq_endereco", sequenceName="seq_endereco")
public class Endereco implements Serializable {
   
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_endereco")
    private int idEndereco;
    private String logradouro;

    /**
     * @return the idEndereco
     */
    public int getIdEndereco() {
        return idEndereco;
    }

    /**
     * @param idEndereco the idEndereco to set
     */
    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
}
