package com.hxzy.pojo;

public class TbTrain {
    private Integer id;

    private String tnMan;

    private String tnTitle;

    private String tnContent;

    private String tnTime;

    private String tnAddress;

    private String tnJoin;

    private String tnBz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTnMan() {
        return tnMan;
    }

    public void setTnMan(String tnMan) {
        this.tnMan = tnMan == null ? null : tnMan.trim();
    }

    public String getTnTitle() {
        return tnTitle;
    }

    public void setTnTitle(String tnTitle) {
        this.tnTitle = tnTitle == null ? null : tnTitle.trim();
    }

    public String getTnContent() {
        return tnContent;
    }

    public void setTnContent(String tnContent) {
        this.tnContent = tnContent == null ? null : tnContent.trim();
    }

    public String getTnTime() {
        return tnTime;
    }

    public void setTnTime(String tnTime) {
        this.tnTime = tnTime == null ? null : tnTime.trim();
    }

    public String getTnAddress() {
        return tnAddress;
    }

    public void setTnAddress(String tnAddress) {
        this.tnAddress = tnAddress == null ? null : tnAddress.trim();
    }

    public String getTnJoin() {
        return tnJoin;
    }

    public void setTnJoin(String tnJoin) {
        this.tnJoin = tnJoin == null ? null : tnJoin.trim();
    }

    public String getTnBz() {
        return tnBz;
    }

    public void setTnBz(String tnBz) {
        this.tnBz = tnBz == null ? null : tnBz.trim();
    }
}