package com.hwc.loan.sdk.borrow.domain;

import java.util.*;
import java.math.*;
import com.hwc.base.sdk.core.RequestBase;

public class SysBasecodeListDomain {

    private String cat;
    private String code;
    private String descript;
    private String sys;
    private String halt;
    private Integer seq;

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getCat() {
        return this.cat;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getDescript() {
        return this.descript;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getSys() {
        return this.sys;
    }

    public void setHalt(String halt) {
        this.halt = halt;
    }

    public String getHalt() {
        return this.halt;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getSeq() {
        return this.seq;
    }

} 