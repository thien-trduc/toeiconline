package vn.myclass.core.web.command;

import java.util.List;

public class AbstractCommand<T> {
    // lop cha chứa các thuộc tính chung
    protected T pojo; // plain old java object, lop java bean thuan, private property, chi co phuong thuc getter va setter
    // pojo là class ko extend hoac implement tu mot tg nao ca tru (implement seriliable)
    private String crudaction;// chứa tên phương thức (insert update delete)
    private List<T> listResult;// tra ve cho tg display table
    private String tableId = "tableList";// get id cua tg display table sinh ra
    private int maxPageItems = 5;// tong so trang cua display tag
    private int totalItems = 0;// tong so item trong display table
    private int firstItem = 0;// vi tri cua item trang muon phan trang
    private String sortExpression;
    private String sortDirection;
    private String[] checkList;// luu id cua item trong display table
    private String messageResponse;// tra ve thong bao
    private int page = 1;
    private String urlType;
    private int totalPages;

    public String getCrudaction() {
        return crudaction;
    }

    public void setCrudaction(String crudaction) {
        this.crudaction = crudaction;
    }
    public T getPojo() {
        return pojo;
    }

    public void setPojo(T pojo) {
        this.pojo = pojo;
    }
}
