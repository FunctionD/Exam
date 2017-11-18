package com.lanqiao.exam.vo;

import java.util.Date;

/**
 * 考卷表
 */
public class Examination {
    private String examNo; // 考试编号系统生成（考点简称+YYYYMMDD+班级号）
    private Integer userId; // 出题老师的编号
    private Date examDate; // 考试时间
    private String singleId; // 所有单选题答题的题号，逗号分隔 1,2,5,9,
    private String multipleId; // 所有多选题答题的题号，逗号分隔
    private String trueFalseId; // 所有判断题答题的题号，逗号分隔
    // 以下几题为主观题，不能系统打分
    private String fillInGapsId; // 所有填空题答题的题号，逗号分隔
    private String simpleAnswerId; // 所有简答题答题的题号，逗号分隔
    private String programId; // 所有编程题答题的题号，逗号分隔
    private String descript;
    private Integer validFlag; // 试卷有效状态标识：1.有效，0|空.无效

    public Examination() {
    }

    public Examination(String examNo, Integer userId, Date examDate, String singleId, String multipleId,
                       String trueFalseId, String fillInGapsId, String simpleAnswerId, String programId,
                       String descript, Integer validFlag) {
        this.examNo = examNo;
        this.userId = userId;
        this.examDate = examDate;
        this.singleId = singleId;
        this.multipleId = multipleId;
        this.trueFalseId = trueFalseId;
        this.fillInGapsId = fillInGapsId;
        this.simpleAnswerId = simpleAnswerId;
        this.programId = programId;
        this.descript = descript;
        this.validFlag = validFlag;
    }

    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public String getSingleId() {
        return singleId;
    }

    public void setSingleId(String singleId) {
        this.singleId = singleId;
    }

    public String getMultipleId() {
        return multipleId;
    }

    public void setMultipleId(String multipleId) {
        this.multipleId = multipleId;
    }

    public String getTrueFalseId() {
        return trueFalseId;
    }

    public void setTrueFalseId(String trueFalseId) {
        this.trueFalseId = trueFalseId;
    }

    public String getFillInGapsId() {
        return fillInGapsId;
    }

    public void setFillInGapsId(String fillInGapsId) {
        this.fillInGapsId = fillInGapsId;
    }

    public String getSimpleAnswerId() {
        return simpleAnswerId;
    }

    public void setSimpleAnswerId(String simpleAnswerId) {
        this.simpleAnswerId = simpleAnswerId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "examNo='" + examNo + '\'' +
                ", userId=" + userId +
                ", examDate=" + examDate +
                ", singleId='" + singleId + '\'' +
                ", multipleId='" + multipleId + '\'' +
                ", trueFalseId='" + trueFalseId + '\'' +
                ", fillInGapsId='" + fillInGapsId + '\'' +
                ", simpleAnswerId='" + simpleAnswerId + '\'' +
                ", programId='" + programId + '\'' +
                ", descript='" + descript + '\'' +
                ", validFlag=" + validFlag +
                '}';
    }

}
