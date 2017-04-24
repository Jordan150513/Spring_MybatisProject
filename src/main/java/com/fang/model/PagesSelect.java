package com.fang.model;

/**
 * Created by qiaodandan on 2017/4/24.
 */
public class PagesSelect {

    private Integer pageNO;
    private Integer pageSize;
    private Integer count;

    private Integer pageCount;

    private Integer fromIndex;
    private Integer toIndex;

    public Integer getPageNO() {
        return pageNO;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageNO(Integer pageNO) {
        this.pageNO = pageNO;
        if (this.pageSize!=null){
            this.fromIndex = (this.pageNO-1)*pageCount;
            this.toIndex = this.pageNO*this.pageCount;
        }
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        if (this.pageNO!=null){
            this.fromIndex = (this.pageNO-1)*pageCount;
            this.toIndex = this.pageNO*this.pageCount;
        }

    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFromIndex() {
        return fromIndex;
    }

    public void setFromIndex(Integer fromIndex) {
//        if (this.pageNO!=null && this.pageSize!=null){
//            this.fromIndex = (this.pageNO-1)*pageCount;
//        }
        this.fromIndex = fromIndex;

    }

    public Integer getToIndex() {
        return toIndex;
    }

    public void setToIndex(Integer toIndex) {
//        if (this.pageSize!=null && this.pageNO!=null){
//            this.toIndex = this.pageNO*this.pageCount;
//        }

        this.toIndex = toIndex;
    }
}
