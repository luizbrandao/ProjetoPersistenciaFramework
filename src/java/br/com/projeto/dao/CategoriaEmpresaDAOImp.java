/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.CategoriaEmpresa;
import br.com.projeto.vo.Empresa;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class CategoriaEmpresaDAOImp implements CategoriaEmpresaDAO {

    @Override
    public void save(CategoriaEmpresa categoria) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(categoria);
        t.commit();
    }

    @Override
    public CategoriaEmpresa getCategoriaEmpresa(int id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (CategoriaEmpresa) session.load(CategoriaEmpresa.class, id);
    }

    @Override
    public List<CategoriaEmpresa> list() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(CategoriaEmpresa categoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(CategoriaEmpresa categoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }   
}