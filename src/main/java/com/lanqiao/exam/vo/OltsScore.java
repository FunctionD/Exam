package com.lanqiao.exam.vo;

import java.util.Date;

/**
 * 成绩表
 */
public class OltsScore {
    private Integer id;
    private Double score; // （单选+多选+判断）的分数
    private Date testDate; // 考试时间
    private String descrpt; // 说明信息
    private Integer userId; // 学生ID
    private String examNo; // 考试编号
    private Double fspScore; // 主观题（简答、编程）的分数

    public OltsScore() {
    }

    public OltsScore(Integer id, Double score, Date testDate, String descrpt, Integer userId, String examNo, Double fspScore) {
        this.id = id;
        this.score = score;
        this.testDate = testDate;
        this.descrpt = descrpt;
        this.userId = userId;
        this.examNo = examNo;
        this.fspScore = fspScore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getDescrpt() {
        return descrpt;
    }

    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo;
    }

    public Double getFspScore() {
        return fspScore;
    }

    public void setFspScore(Double fspScore) {
        this.fspScore = fspScore;
    }

    @Override
    public String toString() {
        return "OltsScore{" +
                "id=" + id +
                ", score=" + score +
                ", testDate=" + testDate +
                ", descrpt='" + descrpt + '\'' +
                ", userId=" + userId +
                ", examNo='" + examNo + '\'' +
                ", fspScore=" + fspScore +
                '}';
    }

}
