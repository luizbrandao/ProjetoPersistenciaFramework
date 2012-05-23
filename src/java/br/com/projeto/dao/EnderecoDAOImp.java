/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Endereco;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class EnderecoDAOImp implements EnderecoDAO{

    @Override
    public void save(Endereco endereco) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(endereco);
        t.commit();
    }

    @Override
    public Endereco getEndereco(int id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (Endereco) session.load(Endereco.class, id);
    }

    @Override
    public List<Endereco> list() {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return session.createQuery("from Endereco").list();
    }

    @Override
    public void remove(Endereco endereco) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.delete(endereco);
        t.commit();
    }

    @Override
    public void update(Endereco endereco) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.update(endereco);
        t.commit();
    }
    
}
