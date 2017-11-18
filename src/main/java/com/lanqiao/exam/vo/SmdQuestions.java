package com.lanqiao.exam.vo;

import java.util.Date;

/**
 * 试题表
 * （s：单选题，m：多选题，d：判断题）
 */
public class SmdQuestions {
    private Integer id;
    private String question; // 题干（not null）
    private String correct; // 考题答题（"T"或"F"，not null）
    private Integer questionType; // 考题类型（1.单选  2.多选  3.判断，not null）
    private Integer techCateId; // 考题知识点分类
    private String descrpt; // 考题说明信息
    private Date pubDate; // 出题时间(默认值sysdate)

    public SmdQuestions() {
    }

    public SmdQuestions(Integer id, String question, String correct, Integer questionType, Integer techCateId, String descrpt, Date pubDate) {
        this.id = id;
        this.question = question;
        this.correct = correct;
        this.questionType = questionType;
        this.techCateId = techCateId;
        this.descrpt = descrpt;
        this.pubDate = pubDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Integer getTechCateId() {
        return techCateId;
    }

    public void setTechCateId(Integer techCateId) {
        this.techCateId = techCateId;
    }

    public String getDescrpt() {
        return descrpt;
    }

    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "SmdQuestions{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", correct='" + correct + '\'' +
                ", questionType=" + questionType +
                ", techCateId=" + techCateId +
                ", descrpt='" + descrpt + '\'' +
                ", pubDate=" + pubDate +
                '}';
    }

}
