package com.ec.demo.model;


import com.ec.utils.JsonResult;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


/**
 * User: chaocui200783
 * Date: 14-10-23
 * Time: 上午11:04
 */
@Entity
@Table(name = "t_user")
public class Demo implements Serializable {

    public interface DemoView {};

    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String username;
    private String password;

    @JsonView(JsonResult.JsonResultView.class)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonView(JsonResult.JsonResultView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(JsonResult.JsonResultView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
