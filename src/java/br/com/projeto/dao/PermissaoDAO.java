/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;


import br.com.projeto.vo.Permissao;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface PermissaoDAO {
    void save(Permissao permissao);
    Permissao getPermissao(int id);
    List<Permissao> list();
    void remove(Permissao permissao);
    void update(Permissao permissao);
}
