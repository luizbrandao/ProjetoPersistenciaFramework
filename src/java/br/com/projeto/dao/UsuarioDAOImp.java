/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Usuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

/**
 *
 * @author luiz
 */
public class UsuarioDAOImp implements UsuarioDAO {
    public void save(Usuario empresa) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.save(empresa);
        t.commit();
    }

    @Override
    public Usuario getUsuario(Long id) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return (Usuario) session.load(Usuario.class, id);
    }

    @Override
    public List<Usuario> list() {
        Session session = SessionFactoryUtil.getInstance().openSession();
        return session.createQuery("from Usuario").list();
    }

    @Override
    public void remove(Usuario usuario) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.delete(usuario);
        t.commit();
    }

    @Override
    public void update(Usuario usuario) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();
        session.update(usuario);
        t.commit();
    }
}
