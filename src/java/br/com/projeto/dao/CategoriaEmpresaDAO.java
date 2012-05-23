/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.CategoriaEmpresa;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface CategoriaEmpresaDAO {
    void save(CategoriaEmpresa categoria);
    CategoriaEmpresa getCategoriaEmpresa(int id);
    List<CategoriaEmpresa> list();
    void remove(CategoriaEmpresa categoria);
    void update(CategoriaEmpresa categoria);
}
