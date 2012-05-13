/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Local;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class LocalDAOImp implements LocalDAO{

    @Override
    public void save(Local locais) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(locais);
        t.commit();
    }

    @Override
    public Local getEmpresa(Long id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (Local) session.load(Local.class, id);
    }

    @Override
    public List<Local> list() {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return session.createQuery("from Local").list();
    }

    @Override
    public void remove(Local locais) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.delete(locais);
        t.commit();
    }

    @Override
    public void update(Local locais) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.update(locais);
        t.commit();
    }   
}