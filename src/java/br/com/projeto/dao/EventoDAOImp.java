/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Evento;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class EventoDAOImp implements EventoDAO{

    @Override
    public void save(Evento eventos) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(eventos);
        t.commit();
    }

    @Override
    public Evento getEvento(int id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (Evento) session.load(Evento.class, id);
    }

    @Override
    public List<Evento> list() {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return session.createQuery("from Evento").list();
    }

    @Override
    public void remove(Evento eventos) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.delete(eventos);
        t.commit();
    }

    @Override
    public void update(Evento eventos) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.update(eventos);
        t.commit();
    }   
}