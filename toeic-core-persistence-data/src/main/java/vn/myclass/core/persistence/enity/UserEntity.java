package vn.myclass.core.persistence.enity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name = "user")
public class UserEntity {
    //user id la khoa chinh tu tang , nen tu dong hieu la user id
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer userId;

    // map cac thuoc tinh giong ben bang user ben sql
    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String passWord;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "createDate")
    private Timestamp createDate;

    @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
    private List<CommentEntity> commentEntityList;

    // quan hệ nhiều một, role la mot khoa ngoai cua user
    @ManyToOne
    @JoinColumn(name = "roleid")
    private RoleEntity roleEntity;

    public List<CommentEntity> getCommentEntityList() {
        return commentEntityList;
    }

    public void setCommentEntityList(List<CommentEntity> commentEntityList) {
        this.commentEntityList = commentEntityList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

}
