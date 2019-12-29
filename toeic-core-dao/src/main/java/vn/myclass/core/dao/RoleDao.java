package vn.myclass.core.dao;

import vn.myclass.core.data.dao.GenericDao;
import vn.myclass.core.persistence.enity.RoleEntity;

public interface RoleDao extends GenericDao<Integer, RoleEntity> {
    // chứa những phương thức hoạt động của lớp RoleEntity
    // kế thừa từ interface genericDao
}
