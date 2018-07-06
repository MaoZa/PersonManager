package com.hxzy.pojo;

import java.io.Serializable;

public class TbEmployee{

	private Integer id;

    private String emSerialnumber;

    private String emName;

    private String emSex;

    private Integer emAge;

    private String emIdcard;

    private String emBorn;

    private String emNation;

    private String emMarriage;

    private String emVisage;

    private String emAncestralhome;

    private String emTel;

    private String emAddress;

    private String emAfterschool;

    private String emSpeciality;

    private String emCulture;

    private String emStartime;

    private Integer emDepartmentid;

    private String emTypework;

    private String emCreatime;

    private String emCreatename;

    private String emBz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmSerialnumber() {
        return emSerialnumber;
    }

    public void setEmSerialnumber(String emSerialnumber) {
        this.emSerialnumber = emSerialnumber == null ? null : emSerialnumber.trim();
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName == null ? null : emName.trim();
    }

    public String getEmSex() {
        return emSex;
    }

    public void setEmSex(String emSex) {
        this.emSex = emSex == null ? null : emSex.trim();
    }

    public Integer getEmAge() {
        return emAge;
    }

    public void setEmAge(Integer emAge) {
        this.emAge = emAge;
    }

    public String getEmIdcard() {
        return emIdcard;
    }

    public void setEmIdcard(String emIdcard) {
        this.emIdcard = emIdcard == null ? null : emIdcard.trim();
    }

    public String getEmBorn() {
        return emBorn;
    }

    public void setEmBorn(String emBorn) {
        this.emBorn = emBorn == null ? null : emBorn.trim();
    }

    public String getEmNation() {
        return emNation;
    }

    public void setEmNation(String emNation) {
        this.emNation = emNation == null ? null : emNation.trim();
    }

    public String getEmMarriage() {
        return emMarriage;
    }

    public void setEmMarriage(String emMarriage) {
        this.emMarriage = emMarriage == null ? null : emMarriage.trim();
    }

    public String getEmVisage() {
        return emVisage;
    }

    public void setEmVisage(String emVisage) {
        this.emVisage = emVisage == null ? null : emVisage.trim();
    }

    public String getEmAncestralhome() {
        return emAncestralhome;
    }

    public void setEmAncestralhome(String emAncestralhome) {
        this.emAncestralhome = emAncestralhome == null ? null : emAncestralhome.trim();
    }

    public String getEmTel() {
        return emTel;
    }

    public void setEmTel(String emTel) {
        this.emTel = emTel == null ? null : emTel.trim();
    }

    public String getEmAddress() {
        return emAddress;
    }

    public void setEmAddress(String emAddress) {
        this.emAddress = emAddress == null ? null : emAddress.trim();
    }

    public String getEmAfterschool() {
        return emAfterschool;
    }

    public void setEmAfterschool(String emAfterschool) {
        this.emAfterschool = emAfterschool == null ? null : emAfterschool.trim();
    }

    public String getEmSpeciality() {
        return emSpeciality;
    }

    public void setEmSpeciality(String emSpeciality) {
        this.emSpeciality = emSpeciality == null ? null : emSpeciality.trim();
    }

    public String getEmCulture() {
        return emCulture;
    }

    public void setEmCulture(String emCulture) {
        this.emCulture = emCulture == null ? null : emCulture.trim();
    }

    public String getEmStartime() {
        return emStartime;
    }

    public void setEmStartime(String emStartime) {
        this.emStartime = emStartime == null ? null : emStartime.trim();
    }

    public Integer getEmDepartmentid() {
        return emDepartmentid;
    }

    public void setEmDepartmentid(Integer emDepartmentid) {
        this.emDepartmentid = emDepartmentid;
    }

    public String getEmTypework() {
        return emTypework;
    }

    public void setEmTypework(String emTypework) {
        this.emTypework = emTypework == null ? null : emTypework.trim();
    }

    public String getEmCreatime() {
        return emCreatime;
    }

    public void setEmCreatime(String emCreatime) {
        this.emCreatime = emCreatime == null ? null : emCreatime.trim();
    }

    public String getEmCreatename() {
        return emCreatename;
    }

    public void setEmCreatename(String emCreatename) {
        this.emCreatename = emCreatename == null ? null : emCreatename.trim();
    }

    public String getEmBz() {
        return emBz;
    }

    public void setEmBz(String emBz) {
        this.emBz = emBz == null ? null : emBz.trim();
    }

	@Override
	public String toString() {
		return "TbEmployee [id=" + id + ", emSerialnumber=" + emSerialnumber + ", emName=" + emName + ", emSex=" + emSex
				+ ", emAge=" + emAge + ", emIdcard=" + emIdcard + ", emBorn=" + emBorn + ", emNation=" + emNation
				+ ", emMarriage=" + emMarriage + ", emVisage=" + emVisage + ", emAncestralhome=" + emAncestralhome
				+ ", emTel=" + emTel + ", emAddress=" + emAddress + ", emAfterschool=" + emAfterschool
				+ ", emSpeciality=" + emSpeciality + ", emCulture=" + emCulture + ", emStartime=" + emStartime
				+ ", emDepartmentid=" + emDepartmentid + ", emTypework=" + emTypework + ", emCreatime=" + emCreatime
				+ ", emCreatename=" + emCreatename + ", emBz=" + emBz + "]";
	}
    
}