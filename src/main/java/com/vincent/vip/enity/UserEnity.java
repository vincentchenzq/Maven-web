package com.vincent.vip.enity;

import java.util.Date;

public class UserEnity {
     private String idUserInfo;

     private String userId;

     private String userName;

     private String password;

     private Boolean isEffective;

     private String createdBy;

     private String updatedBy;

     private Date createdDate;

     private Date updatedDate;

    public String getIdUserInfo() {
        return idUserInfo;
    }

    public void setIdUserInfo(String idUserInfo) {
        this.idUserInfo = idUserInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEffective() {
        return isEffective;
    }

    public void setEffective(Boolean effective) {
        isEffective = effective;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
