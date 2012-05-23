/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Empresa;
import br.com.projeto.vo.PontoTuristico;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class PontoTuristicoDAOImp implements PontoTuristicoDAO{

    @Override
    public void save(PontoTuristico ponto) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(ponto);
        t.commit();
    }

    @Override
    public PontoTuristico getPontoTuristico(int id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (PontoTuristico) session.load(PontoTuristico.class, id);
    }

    @Override
    public List<PontoTuristico> list() {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return session.createQuery("from PontoTuristico").list();
    }

    @Override
    public void remove(PontoTuristico ponto) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.delete(ponto);
        t.commit();
    }

    @Override
    public void update(PontoTuristico ponto) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.update(ponto);
        t.commit();
    }
    
}
