package com.lanqiao.exam.vo;

import java.util.Date;

public class OltsUsers {
    private Integer id;
    private String stuNo; // 学号
    private String idCardNo; // 身份证号（not null）
    private String userName; // 用户名（not null）
    private String passWord;  // 密码（not null）
    private String mobile; // 手机
    private String homeTel; // 家庭电话
    private String homeAddr; // 家庭地址
    private String schAddr; // 学校地址
    private String qq;
    private String email;
    private Integer userType; // 用户类型（1.老师，9.管理员，空.学生）
    private String gender; // 性别（"男"或"女"）
    private Date birthday; // 出生日期
    private String nationPace; // 籍贯
    private String marjor; // 专业
    private String eduBackground; // 最高学历
    private String graduateSchool; // 毕业学院

    public OltsUsers() {
    }

    public OltsUsers(Integer id, String stuNo, String idCardNo, String userName, String passWord, String mobile,
                     String homeTel, String homeAddr, String schAddr, String qq, String email, Integer userType,
                     String gender, Date birthday, String nationPace, String marjor, String eduBackground, String graduateSchool) {
        this.id = id;
        this.stuNo = stuNo;
        this.idCardNo = idCardNo;
        this.userName = userName;
        this.passWord = passWord;
        this.mobile = mobile;
        this.homeTel = homeTel;
        this.homeAddr = homeAddr;
        this.schAddr = schAddr;
        this.qq = qq;
        this.email = email;
        this.userType = userType;
        this.gender = gender;
        this.birthday = birthday;
        this.nationPace = nationPace;
        this.marjor = marjor;
        this.eduBackground = eduBackground;
        this.graduateSchool = graduateSchool;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getSchAddr() {
        return schAddr;
    }

    public void setSchAddr(String schAddr) {
        this.schAddr = schAddr;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNationPace() {
        return nationPace;
    }

    public void setNationPace(String nationPace) {
        this.nationPace = nationPace;
    }

    public String getMarjor() {
        return marjor;
    }

    public void setMarjor(String marjor) {
        this.marjor = marjor;
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    @Override
    public String toString() {
        return "OltsUsers{" +
                "id=" + id +
                ", stuNo='" + stuNo + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", mobile='" + mobile + '\'' +
                ", homeTel='" + homeTel + '\'' +
                ", homeAddr='" + homeAddr + '\'' +
                ", schAddr='" + schAddr + '\'' +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", nationPace='" + nationPace + '\'' +
                ", marjor='" + marjor + '\'' +
                ", eduBackground='" + eduBackground + '\'' +
                ", graduateSchool='" + graduateSchool + '\'' +
                '}';
    }

}
