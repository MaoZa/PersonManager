package com.hxzy.pojo;

import java.io.Serializable;

public class TbCj{

	private Integer id;

    private String cjTitle;

    private String cjType;

    private String cjMoney;

    private String cjTime;

    private String cjContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCjTitle() {
        return cjTitle;
    }

    public void setCjTitle(String cjTitle) {
        this.cjTitle = cjTitle == null ? null : cjTitle.trim();
    }

    public String getCjType() {
        return cjType;
    }

    public void setCjType(String cjType) {
        this.cjType = cjType == null ? null : cjType.trim();
    }

    public String getCjMoney() {
        return cjMoney;
    }

    public void setCjMoney(String cjMoney) {
        this.cjMoney = cjMoney == null ? null : cjMoney.trim();
    }

    public String getCjTime() {
        return cjTime;
    }

    public void setCjTime(String cjTime) {
        this.cjTime = cjTime == null ? null : cjTime.trim();
    }

    public String getCjContent() {
        return cjContent;
    }

    public void setCjContent(String cjContent) {
        this.cjContent = cjContent == null ? null : cjContent.trim();
    }
}