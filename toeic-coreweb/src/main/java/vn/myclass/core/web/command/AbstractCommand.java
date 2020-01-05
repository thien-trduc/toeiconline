package vn.myclass.core.web.command;

import java.util.List;

public class AbstractCommand<T> {
    // lop cha chứa các thuộc tính chung
    protected T pojo; // plain old java object, lop java bean thuan, private property, chi co phuong thuc getter va setter
    // pojo là class ko extend hoac implement tu mot tg nao ca tru (implement seriliable)
    private String crudaction;// chứa tên phương thức (insert update delete)
    private List<T> listResult;// tra ve danh sach cho tg display table
    private String tableId = "tableList";// get id cua tg display table sinh ra
    private int maxPageItems = 5;// tong so item hien thi trong 1 trang
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

    public List<T> getListResult() {
        return listResult;
    }

    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public int getMaxPageItems() {
        return maxPageItems;
    }

    public void setMaxPageItems(int maxPageItems) {
        this.maxPageItems = maxPageItems;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(int firstItem) {
        this.firstItem = firstItem;
    }

    public String getSortExpression() {
        return sortExpression;
    }

    public void setSortExpression(String sortExpression) {
        this.sortExpression = sortExpression;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public String[] getCheckList() {
        return checkList;
    }

    public void setCheckList(String[] checkList) {
        this.checkList = checkList;
    }

    public String getMessageResponse() {
        return messageResponse;
    }

    public void setMessageResponse(String messageResponse) {
        this.messageResponse = messageResponse;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
