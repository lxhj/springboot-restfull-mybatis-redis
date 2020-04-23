package com.solo.springcloud.commons.entities;

import java.io.Serializable;

public class UserProfile implements Serializable {

    private Integer id;

    private Integer uid;

    private String avatar;

    private Long qq;

    private String team;

    private Integer groupid;

    private Long telphone;

    private String city;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Long getTelphone() {
        return telphone;
    }

    public void setTelphone(Long telphone) {
        this.telphone = telphone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
