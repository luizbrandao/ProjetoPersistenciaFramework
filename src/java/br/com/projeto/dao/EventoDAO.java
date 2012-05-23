/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;


import br.com.projeto.vo.Evento;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface EventoDAO {
    void save(Evento eventos);
    Evento getEvento(int id);
    List<Evento> list();
    void remove(Evento eventos);
    void update(Evento eventos);
}
