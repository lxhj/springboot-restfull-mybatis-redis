package com.solo.springcloud.commons.entities;




import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @ClassName $ {NAME}
 * @Author $ {USER}
 **/

public class User implements Serializable {


    private long id;
    private String username;
    private String password;
    private Timestamp create_time;
    private String create_user_ip;
    private boolean active ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user_ip() {
        return create_user_ip;
    }

    public void setCreate_user_ip(String create_user_ip) {
        this.create_user_ip = create_user_ip;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
