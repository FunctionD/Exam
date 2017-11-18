package com.lanqiao.exam.vo;

import java.util.Date;

/**
 * 试题表(填空题，简答题，编程题)
 */
public class FspQuestions {
    private Integer id;
    private String question; // 题干(not null)
    private String stdAnswer; // 标准答案
    private Integer questionType; // 考题类型：4.填空，5.简答，6.编程题
    private Integer techCateId; // 考题知识点分类
    private Date pubDate; // 出题时间（默认值sysdate）
    private String descrpt; // 考题说明信息

    public FspQuestions() {
    }

    public FspQuestions(Integer id, String question, String stdAnswer, Integer questionType, Integer techCateId, Date pubDate, String descrpt) {
        this.id = id;
        this.question = question;
        this.stdAnswer = stdAnswer;
        this.questionType = questionType;
        this.techCateId = techCateId;
        this.pubDate = pubDate;
        this.descrpt = descrpt;
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

    public String getStdAnswer() {
        return stdAnswer;
    }

    public void setStdAnswer(String stdAnswer) {
        this.stdAnswer = stdAnswer;
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

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getDescrpt() {
        return descrpt;
    }

    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt;
    }

    @Override
    public String toString() {
        return "FspQuestions{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", stdAnswer='" + stdAnswer + '\'' +
                ", questionType=" + questionType +
                ", techCateId=" + techCateId +
                ", pubDate=" + pubDate +
                ", descrpt='" + descrpt + '\'' +
                '}';
    }

}
