package com.zzw.usermanage.domain;


import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @description:
 * @version: 1.0
 * @author: x.x@hand-china.com
 * @date: 2019/2/21
 */
@Entity
@Table(name = "user_basic_data")
public class User extends BaseDomain{

    @Column(name = "user_number")
    private Long userNumber;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    public Long getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Long userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNumber=" + userNumber +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", datalag=" + datalag +
                ", versionNumber=" + versionNumber +
                ", createdDate=" + createdDate +
                ", createdBy=" + createdBy +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", lastUpdatedBy=" + lastUpdatedBy +
                '}';
    }
}
