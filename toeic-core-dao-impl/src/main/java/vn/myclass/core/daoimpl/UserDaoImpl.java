package vn.myclass.core.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import vn.myclass.core.commom.utils.HibernateUtil;
import vn.myclass.core.dao.UserDao;
import vn.myclass.core.data.daoimpl.AbstractDao;
import vn.myclass.core.persistence.enity.UserEntity;

public class UserDaoImpl extends AbstractDao<Integer, UserEntity> implements UserDao {
//    public UserEntity isUserExist(String name, String password) {
//        UserEntity entity = new UserEntity();
//        Transaction transaction = null;
//        // tạo đối tượng session
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        try {
//            // bắt đầu một phiên giao dịch (session) thong qua transaction
//            transaction = session.beginTransaction();
//            //HQL
//            StringBuilder sql =  new StringBuilder("FROM ");
//            sql.append("UserEntity");
//            sql.append(" WHERE name = :name AND password = :password");
//            Query query = session.createQuery(sql.toString());
//            query.setParameter("name",name);
//            query.setParameter("password",password);
//            entity =(UserEntity) query.uniqueResult();
//
//            //
//            transaction.commit();
//        }catch (HibernateException e)
//        {
//            transaction.rollback();
//            throw e;
//        }finally {
//            session.close();
//        }
//        return entity;
//    }
//
//    public UserEntity findRoleByUser(String name, String password) {
//        UserEntity entity = new UserEntity();
//        Transaction transaction = null;
//        // tạo đối tượng session
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        try {
//            // bắt đầu một phiên giao dịch (session) thong qua transaction
//            transaction = session.beginTransaction();
//            //HQL
//            StringBuilder sql =  new StringBuilder("FROM ");
//            sql.append("UserEntity");
//            sql.append(" WHERE name = :name AND password = :password");
//            Query query = session.createQuery(sql.toString());
//            query.setParameter("name",name);
//            query.setParameter("password",password);
//            entity =(UserEntity) query.uniqueResult();
//
//            //
//            transaction.commit();
//        }catch (HibernateException e)
//        {
//            transaction.rollback();
//            throw e;
//        }finally {
//            session.close();
//        }
//        return entity;
//    }

    public UserEntity findUserByUsernameAndPassword(String name, String password) {
        UserEntity entity = new UserEntity();
        Transaction transaction = null;
        // tạo đối tượng session
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            // bắt đầu một phiên giao dịch (session) thong qua transaction
            transaction = session.beginTransaction();
            //HQL
            StringBuilder sql =  new StringBuilder("FROM ");
            sql.append("UserEntity");
            sql.append(" WHERE name = :name AND password = :password");
            Query query = session.createQuery(sql.toString());
            query.setParameter("name",name);
            query.setParameter("password",password);
            entity =(UserEntity) query.uniqueResult();

            //
            transaction.commit();
        }catch (HibernateException e)
        {
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return entity;
    }
}
