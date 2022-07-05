package com.yscq.monster.bean;

import java.io.Serializable;
import java.util.Date;

public class Boss implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String position;//boss位置
    private Date killTime;//击杀时间
    private Integer freshTime;//刷新间隔（分钟）
    private Date rebornTime;//复活时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getKillTime() {
        return killTime;
    }

    public void setKillTime(Date killTime) {
        this.killTime = killTime;
    }

    public Integer getFreshTime() {
        return freshTime;
    }

    public void setFreshTime(Integer freshTime) {
        this.freshTime = freshTime;
    }

    public Date getRebornTime() {
        return rebornTime;
    }

    public void setRebornTime(Date rebornTime) {
        this.rebornTime = rebornTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
