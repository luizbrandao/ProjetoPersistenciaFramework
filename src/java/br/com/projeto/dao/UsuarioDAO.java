/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Usuario;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface UsuarioDAO {

    void save(Usuario usuario);

    Usuario getUsuario(Long id);

    List<Usuario> list();

    void remove(Usuario usuario);

    void update(Usuario usuario);
}
