package com.hxzy.pojo;

public class TbManager {
    private Integer id;

    private String account;

    private String password;

    private String managerlevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getManagerlevel() {
        return managerlevel;
    }

    public void setManagerlevel(String managerlevel) {
        this.managerlevel = managerlevel == null ? null : managerlevel.trim();
    }
}