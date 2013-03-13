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
@Table(name = "categoriaempresa")
@SequenceGenerator(initialValue = 1, name = "seq_categoria", sequenceName = "seq_categoria")
public class CategoriaEmpresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_categoria")
    private int idCategoria;
    private String Categoria;
}
