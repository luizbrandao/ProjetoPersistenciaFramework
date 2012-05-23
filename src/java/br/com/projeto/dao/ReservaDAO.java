/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Reserva;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface ReservaDAO {
    void save(Reserva reserva);
    Reserva getReserva(int id);
    List<Reserva> list();
    void remove(Reserva reserva);
    void update(Reserva reserva);
}
