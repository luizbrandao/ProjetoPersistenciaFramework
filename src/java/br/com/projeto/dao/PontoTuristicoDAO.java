/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.PontoTuristico;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface PontoTuristicoDAO {
    void save(PontoTuristico ponto);
    PontoTuristico getPontoTuristico(int id);
    List<PontoTuristico> list();
    void remove(PontoTuristico ponto);
    void update(PontoTuristico ponto);
}
