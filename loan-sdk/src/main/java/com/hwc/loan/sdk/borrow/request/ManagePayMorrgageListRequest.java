package com.hwc.loan.sdk.borrow.request;

import java.util.*;
import java.math.*;
import com.hwc.base.sdk.core.RequestBase;
import com.hwc.loan.sdk.borrow.response.ManagePayMorrgageListResponse;

public class ManagePayMorrgageListRequest extends RequestBase<ManagePayMorrgageListResponse> {

    public static final String METHOD = "/manage/pay/morrgage/list";

    private String name;
    private String state;
    private String type;
    private String scenes;
    private String order_no;
    private String mobile;
    private Date start;
    private Date end;
    private String borrow_type;
    private int page;
    private int pageSize;

    public ManagePayMorrgageListRequest() {
        super(METHOD);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setScenes(String scenes) {
        this.scenes = scenes;
    }

    public String getScenes() {
        return this.scenes;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getOrder_no() {
        return this.order_no;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getStart() {
        return this.start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getEnd() {
        return this.end;
    }

    public void setBorrow_type(String borrow_type) {
        this.borrow_type = borrow_type;
    }

    public String getBorrow_type() {
        return this.borrow_type;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return this.page;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

} 