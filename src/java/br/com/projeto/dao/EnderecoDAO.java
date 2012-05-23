/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Endereco;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface EnderecoDAO {
    void save(Endereco endereco);
    Endereco getEndereco(int id);
    List<Endereco> list();
    void remove(Endereco endereco);
    void update(Endereco endereco);
}
