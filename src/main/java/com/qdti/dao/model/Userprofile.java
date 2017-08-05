package com.qdti.dao.model;

public class Userprofile {
    private Integer id;

    private Integer userid;

    private String telephone;

    private String currentcountycode;

    private String destcountycode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getCurrentcountycode() {
        return currentcountycode;
    }

    public void setCurrentcountycode(String currentcountycode) {
        this.currentcountycode = currentcountycode == null ? null : currentcountycode.trim();
    }

    public String getDestcountycode() {
        return destcountycode;
    }

    public void setDestcountycode(String destcountycode) {
        this.destcountycode = destcountycode == null ? null : destcountycode.trim();
    }
}