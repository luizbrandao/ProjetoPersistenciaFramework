/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;


import br.com.projeto.vo.Empresa;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class EmpresaDAOImp implements EmpresaDAO {

    @Override
    public void save(Empresa empresa) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(empresa);
        t.commit();
    }

    @Override
    public Empresa getEmpresa(Long id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (Empresa) session.load(Empresa.class, id);
    }

    @Override
    public List<Empresa> list() {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return session.createQuery("from Empresa").list();
    }

    @Override
    public void remove(Empresa empresa) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.delete(empresa);
        t.commit();
    }

    @Override
    public void update(Empresa empresa) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.update(empresa);
        t.commit();
    }
    
}
