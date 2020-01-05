package vn.myclass.api.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import vn.myclass.core.dao.UserDao;
import vn.myclass.core.daoimpl.UserDaoImpl;
import vn.myclass.core.persistence.enity.UserEntity;

public class LoginTest {
    private final Logger log = Logger.getLogger(this.getClass());
//    @Test
//    public void checkIsUserExist()
//    {
//        String name = "truong tung lam";
//        String password = "123456";
//        UserDao userDao = new UserDaoImpl();
//        UserEntity entity = userDao.isUserExist(name,password);
//        if(entity!=null)
//        {
//            log.error("login success");
//        }else
//        {
//            log.error("login fail");
//        }
//    }
//    @Test
//    public void checkFindRoleByUser()
//    {
//        String name = "truong tung lam";
//        String password = "123456";
//        UserDao userDao = new UserDaoImpl();
//        UserEntity entity = userDao.findRoleByUser(name,password);
//        log.error(entity.getRoleEntity().getRoleId()+"-"+entity.getRoleEntity().getName());
//    }

}
