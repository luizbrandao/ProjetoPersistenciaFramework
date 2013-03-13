package br.com.projeto.vo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "permissao")
@SequenceGenerator(initialValue = 1, name = "seq_permissao", sequenceName = "seq_permissao")
public class Permissao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_permissao")
    private int idPermissao;
    private String descPermissao;

    /**
     * @return the idPermissao
     */
    public int getIdPermissao() {
        return idPermissao;
    }

    /**
     * @param idPermissao the idPermissao to set
     */
    public void setIdPermissao(int idPermissao) {
        this.idPermissao = idPermissao;
    }

    /**
     * @return the descPermissao
     */
    public String getDescPermissao() {
        return descPermissao;
    }

    /**
     * @param descPermissao the descPermissao to set
     */
    public void setDescPermissao(String descPermissao) {
        this.descPermissao = descPermissao;
    }
}