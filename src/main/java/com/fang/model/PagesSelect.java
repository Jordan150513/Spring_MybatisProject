package com.fang.model;

/**
 * Created by qiaodandan on 2017/4/24.
 */
public class PagesSelect {

    private Integer pageNO;
    private Integer pageSize;
    private Integer count;

    private Integer fromIndex;
    private Integer toIndex;

    public Integer getPageNO() {
        return pageNO;
    }

    public Integer getPageSize() {
        return pageSize;
    }


    public void setPageNO(Integer pageNO) {
        this.pageNO = pageNO;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;

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

        this.fromIndex = fromIndex;

    }

    public Integer getToIndex() {
        return toIndex;
    }

    public void setToIndex(Integer toIndex) {

        this.toIndex = toIndex;
    }
}
