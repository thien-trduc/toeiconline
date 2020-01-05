package vn.myclass.core.data.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<ID extends Serializable, T> {
    // inter face chứa những phương thức thực hiện của session(truy van) (API)
    List<T> findAll();
    T update (T entity);
    void save (T entity);
    T findById(ID var1);
    // hàm findbyProperTy trả về danh sách theo thuộc tính nên khi trả về sẽ ko có kiểu dữ liệu trả về
    // sử dụng mảng object để chứa list có kiểu là [số phần tử , danh sách trả về]
    Object[] findByProperty(String property,Object value,String sortExpression,String sortDirection,Integer offset, Integer limit );
    Integer delete(List<ID> ids);
}
