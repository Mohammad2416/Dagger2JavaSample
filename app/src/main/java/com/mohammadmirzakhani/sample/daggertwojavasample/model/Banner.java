
package com.mohammadmirzakhani.sample.daggertwojavasample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Banner {

    @SerializedName("content")
    @Expose
    private List<Content> content = null;
    @SerializedName("totalElements")
    @Expose
    private int totalElements;
    @SerializedName("totalPages")
    @Expose
    private int totalPages;
    @SerializedName("last")
    @Expose
    private boolean last;
    @SerializedName("size")
    @Expose
    private int size;
    @SerializedName("number")
    @Expose
    private int number;
    @SerializedName("numberOfElements")
    @Expose
    private int numberOfElements;
    @SerializedName("sort")
    @Expose
    private Object sort;
    @SerializedName("first")
    @Expose
    private boolean first;

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

}
