import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Test {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        Archivio arc1 = new Archivio();
        arc1.setId(1);

        CD cd1 = new CD();
        cd1.setId(1);
        cd1.setGenre("Rock");
        cd1.setArchive(arc1);

        session.save(arc1);
        session.save(cd1);

        tx.commit();
    }
}
