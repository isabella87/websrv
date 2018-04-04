package com.module.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Myuser")
public class Myuser
{
    @Id
    @SequenceGenerator(name="sequenceGenerator", sequenceName="USERID")
    @GeneratedValue(generator="sequenceGenerator",strategy=GenerationType.SEQUENCE)
    @Column(name = "id", unique = true, nullable = false, precision = 22, scale = 0)
    private int id;
    private String username;
    private String password;


    //集合属性，保留该对象关联的所有女朋友
   /* private List<String> girlFriend  = new ArrayList<String>();

    public List<String> getGirlFriend()
    {
         return  girlFriend;
    }
    public void setGirlFriend()
    {
        this.girlFriend = girlFriend;
    }*/


    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
