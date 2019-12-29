package vn.myclass.core.commom.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sun.misc.ExtensionInstallationException;

public class HibernateUtil {
    // class tạo đối tượng session factory de tao những session
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();
    private static SessionFactory buildSessionFactory()
    {
        // create sessionFactory from hibernate.cfg.xml
        try {
            return new Configuration().configure().buildSessionFactory();
        }catch (Throwable e)
        {
            System.out.println("Initial session factory fail");
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory()
    {
        return SESSION_FACTORY;
    }
}
