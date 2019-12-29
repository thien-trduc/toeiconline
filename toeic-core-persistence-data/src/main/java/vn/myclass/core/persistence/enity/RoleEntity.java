package vn.myclass.core.persistence.enity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @Column(name = "roleid")
    private int roleId;

    @Column(name = "name")
    private String name;

    //mapp với biến role khai báo ở bien user de tao lien ket 1 - n
    //fetch type co 2 kieu la lazy va eager
    //eager : lay role len kem theo  toan bo du lieu user cua role do
    //lazy : lay role kem theo danh sach user nhung chi dem ra khi truy suat danh sach user
    @OneToMany(mappedBy = "roleEntity",fetch = FetchType.LAZY)
    private List<UserEntity> userEntityList;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserEntity> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<UserEntity> userEntityList) {
        this.userEntityList = userEntityList;
    }
}
