package util;

//import livraria.LivroController;
import br.com.projeto.dao.EmpresaController;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionFactoryUtil {

    private static org.hibernate.SessionFactory sessionFactory;

    private SessionFactoryUtil() {
    }

    static {
        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    }

    public static SessionFactory getInstance() {
        return sessionFactory;
    }

    public Session openSession() {
        return sessionFactory.openSession();
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public static void close() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
        sessionFactory = null;
    }

    public static void main(String[] args) {
        Session s = SessionFactoryUtil.getInstance().openSession();
//                System.out.println(new EmpresaController().getListaEmpresa().getRowCount());
//		Endereco e = new Endereco();
//		e.setBairro("dasdas");
//		e.setRua("dasdas");
//		Transaction t = s.beginTransaction();
//		s.save(e);
//		t.commit();
    }
}
