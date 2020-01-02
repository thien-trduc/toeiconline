package vn.myclass.core.utlis;

import vn.myclass.core.dto.RoleDTO;
import vn.myclass.core.persistence.enity.RoleEntity;

public class RoleBeanUtil {
    // phuong thức do du lieu tu entity vao dto
    public static RoleDTO entity2Dto(RoleEntity entity)
    {
        RoleDTO dto = new RoleDTO();
        dto.setRoleId(entity.getRoleId());
        dto.setName(entity.getName());
        return dto;
    }
    // phuong thức do du lieu tu dto vao entity
    public static RoleEntity dto2Entity(RoleDTO dto)
    {
        RoleEntity entity = new RoleEntity();
        entity.setRoleId(dto.getRoleId());
        entity.setName(dto.getName());
        return entity;
    }
}
