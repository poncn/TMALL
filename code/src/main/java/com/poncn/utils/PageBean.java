package com.poncn.utils;

import java.util.List;

public class PageBean<T> {
    List<T> list; //页面内容
    private int pageNumber; //当前页
    private int pageSize; //页面条数
    private int pageCount; //总条数
    private int pageTotal; //总页数
    private int index = getIndex(); //索引

    //定义构造
    public PageBean(int pageNumber, int pageSize) {
        super();
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    //获取数据索引
    public int getIndex() {
        return (pageNumber - 1) * pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageTotal() {
        return (int) Math.ceil(pageCount * 1.0 / pageSize);
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }
}