/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Empresa;
import java.util.List;

/**
 *
 * @author luiz
 */
public interface EmpresaDAO {
    void save(Empresa empresa);
    Empresa getEmpresa(int id);
    List<Empresa> list();
    void remove(Empresa empresa);
    void update(Empresa empresa);
}
