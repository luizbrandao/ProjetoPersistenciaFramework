/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Reserva;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class ReservaDAOImp implements ReservaDAO{

    @Override
    public void save(Reserva reserva) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(reserva);
        t.commit();
    }

    @Override
    public Reserva getReserva(int id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (Reserva) session.load(Reserva.class, id);
    }

    @Override
    public List<Reserva> list() {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return session.createQuery("from Reserva").list();
    }

    @Override
    public void remove(Reserva reserva) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.delete(reserva);
        t.commit();
    }

    @Override
    public void update(Reserva reserva) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.update(reserva);
        t.commit();
    }
    
}
