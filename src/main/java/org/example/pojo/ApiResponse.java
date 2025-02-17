package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.List;

public class ApiResponse {

    @JsonProperty
    private int page;
    @JsonProperty
    private int per_page;
    @JsonProperty
    private int total;
    @JsonProperty
    private int total_pages;
    @JsonProperty
    private List<UserResponse> data;
    @JsonProperty
    private SupportData support;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<UserResponse> getData() {
        return data;
    }

    public void setData(List<UserResponse> data) {
        this.data = data;
    }

    public SupportData getSupport() {
        return support;
    }

    public void setSupport(SupportData support) {
        this.support = support;
    }
}
