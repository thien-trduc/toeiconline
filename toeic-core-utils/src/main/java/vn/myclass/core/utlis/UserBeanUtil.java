package vn.myclass.core.utlis;

import vn.myclass.core.dto.UserDTO;
import vn.myclass.core.persistence.enity.UserEntity;

public class UserBeanUtil {    // class chuyển doi du lieu tu entity qua dto va nguoc lai
    public static UserDTO entiTy2Dto(UserEntity entity)
    {
        UserDTO dto = new UserDTO();
        dto.setUserId(entity.getUserId());
        dto.setName(entity.getName());
        dto.setPassWord(entity.getPassWord());
        dto.setFullName(entity.getFullName());
        dto.setCreateDate(entity.getCreateDate());
        dto.setRoleDTO(RoleBeanUtil.entity2Dto(entity.getRoleEntity()));
        return dto;
    }
    public static UserEntity dto2Entity(UserDTO dto)
    {
        UserEntity entity = new UserEntity();
        entity.setUserId(dto.getUserId());
        entity.setName(dto.getName());
        entity.setPassWord(dto.getPassWord());
        entity.setFullName(dto.getFullName());
        entity.setCreateDate(dto.getCreateDate());
        entity.setRoleEntity(RoleBeanUtil.dto2Entity(dto.getRoleDTO()));
        return entity;
    }
}
