package com.solo.springcloud.commons.entities;

import java.io.Serializable;

public class PreDotaPlayer implements Serializable {
    private Integer pid;

    private String username;

    private Long gameId;

    private Integer qq;

    private Integer leader;

    private Integer teamid;

    private Long intergral;

    private Integer result;

    private Integer total;

    private String post;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public Integer getLeader() {
        return leader;
    }

    public void setLeader(Integer leader) {
        this.leader = leader;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Long getIntergral() {
        return intergral;
    }

    public void setIntergral(Long intergral) {
        this.intergral = intergral;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
