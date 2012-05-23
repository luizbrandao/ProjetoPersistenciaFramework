/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Permissao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class PermissaoDAOImp implements PermissaoDAO {

    @Override
    public void save(Permissao permissao) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(permissao);
        t.commit();
    }

    @Override
    public Permissao getPermissao(int id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (Permissao) session.load(Permissao.class, id);
    }

    @Override
    public List<Permissao> list() {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return session.createQuery("from Permissao").list();
    }

    @Override
    public void remove(Permissao permissao) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.delete(permissao);
        t.commit();
    }

    @Override
    public void update(Permissao permissao) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.update(permissao);
        t.commit();
    }
    
}
