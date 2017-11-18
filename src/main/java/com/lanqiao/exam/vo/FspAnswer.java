package com.lanqiao.exam.vo;

/**
 * 学生答题表(填空题，简答题，编程题)
 */
public class FspAnswer {
    private Integer id;
    private String answer; // 答案
    private Integer fspId; // 填空题，简答题，编程题的题号
    private String examNo; // 考试编号
    private Integer userId; // 用户编号

    public FspAnswer() {
    }

    public FspAnswer(Integer id, String answer, Integer fspId, String examNo, Integer userId) {
        this.id = id;
        this.answer = answer;
        this.fspId = fspId;
        this.examNo = examNo;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getFspId() {
        return fspId;
    }

    public void setFspId(Integer fspId) {
        this.fspId = fspId;
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

    @Override
    public String toString() {
        return "FspAnswer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", fspId=" + fspId +
                ", examNo='" + examNo + '\'' +
                ", userId=" + userId +
                '}';
    }

}
