/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;


import br.com.projeto.vo.Local;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface LocalDAO {
    void save(Local locais);
    Local getEmpresa(Long id);
    List<Local> list();
    void remove(Local locais);
    void update(Local locais);
}
