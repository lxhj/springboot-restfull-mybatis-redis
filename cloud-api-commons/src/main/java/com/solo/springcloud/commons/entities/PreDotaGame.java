package com.solo.springcloud.commons.entities;

import java.io.Serializable;
import java.util.Date;

public class PreDotaGame implements Serializable {
    private Integer gid;

    /**
     * 游戏创建者
     */
    private String username;

    /**
     * 胜利方
     */
    private Object winer;

    /**
     * 游戏状态。wait为等待玩家加入
     * playing 游戏中
     * finish 游戏结束
     */
    private Object gamestatus;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    private Object gametype;

    private String groupName;

    /**
     * 赛季
     */
    private String season;

    private static final long serialVersionUID = 1L;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getWiner() {
        return winer;
    }

    public void setWiner(Object winer) {
        this.winer = winer;
    }

    public Object getGamestatus() {
        return gamestatus;
    }

    public void setGamestatus(Object gamestatus) {
        this.gamestatus = gamestatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Object getGametype() {
        return gametype;
    }

    public void setGametype(Object gametype) {
        this.gametype = gametype;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
