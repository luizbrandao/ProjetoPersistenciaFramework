/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;


import br.com.projeto.vo.Locais;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface LocaisDAO {
    void save(Locais locais);
    Locais getEmpresa(Long id);
    List<Locais> list();
    void remove(Locais locais);
    void update(Locais locais);
}
