package com.ohgiraffers.section04.dto;

import java.util.Date;
import java.util.PrimitiveIterator;

public class UserDTO {
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;
    private int age;

    // 필기. 기본생성자 명시적으로 작성
    public UserDTO() {
    }

    public UserDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;

    }

    /* 필기.
        매개변수 있는 생성자는 선택사항이다.
        필요에 따라 만들지만 일반적으로 가장 많이 사용되는 생성자는
        모든 필드를 초기화 하는 생성자이다.
     */
    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

//    // 만약 다른 생성자를 추가하고 싶다?
//
//    public UserDTO(String id, String pwd, String name, Date enrollDate, int age) {
//        this(id, pwd, name, enrollDate);
//        this.age = age;
//    }

    /* 필기.
        설정자(setter) / 접근자 (getter)
        모든 필드에 대해 각 설정자와 접근자를 작성하며 접근제한 범위는 public 으로 설정한다.
     */

    // alt + ins
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getInfo() {

        return "User DTO : /id = " + id + "/ /pwd = " + pwd + "/ /name = " + name + "/ /enrollDate = " + enrollDate + "/";
    }
}
