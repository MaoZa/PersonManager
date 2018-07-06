package com.hxzy.pojo;

import java.io.Serializable;

public class TbDepartment{

	private Integer id;

    private String dtName;

    private String dtCreatetime;

    private String dtBz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDtName() {
        return dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName == null ? null : dtName.trim();
    }

    public String getDtCreatetime() {
        return dtCreatetime;
    }

    public void setDtCreatetime(String dtCreatetime) {
        this.dtCreatetime = dtCreatetime == null ? null : dtCreatetime.trim();
    }

    public String getDtBz() {
        return dtBz;
    }

    public void setDtBz(String dtBz) {
        this.dtBz = dtBz == null ? null : dtBz.trim();
    }
}