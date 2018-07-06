package com.hxzy.pojo;

public class TbInvitejob {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private String born;

    private String job;

    private String specialty;

    private String experience;

    private String teachschool;

    private String afterschool;

    private String tel;

    private String address;

    private String createtime;

    private Integer isstock;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born == null ? null : born.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getTeachschool() {
        return teachschool;
    }

    public void setTeachschool(String teachschool) {
        this.teachschool = teachschool == null ? null : teachschool.trim();
    }

    public String getAfterschool() {
        return afterschool;
    }

    public void setAfterschool(String afterschool) {
        this.afterschool = afterschool == null ? null : afterschool.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Integer getIsstock() {
        return isstock;
    }

    public void setIsstock(Integer isstock) {
        this.isstock = isstock;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}