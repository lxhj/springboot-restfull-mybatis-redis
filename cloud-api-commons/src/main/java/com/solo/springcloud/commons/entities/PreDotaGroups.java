package com.solo.springcloud.commons.entities;

import java.io.Serializable;

public class PreDotaGroups implements Serializable {
    private Integer id;

    private String groupname;

    private Boolean active;

    private Integer season;

    private Integer groupid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
}
