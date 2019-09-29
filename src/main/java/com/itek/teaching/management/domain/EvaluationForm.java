package com.itek.teaching.management.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @ClassName EvaluationForm
 * @description TODO
 * @author 侯少友
 * @date 2019年09月23日 15:47
 * @modifier 侯少友
 * @date 2019年09月23日 15:47
 * @Version V1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)

public class EvaluationForm implements Serializable {
    private static final long serialVersionUID = -3435065321063438586L;

    /**
     * id
     */
    private Integer id;
    /**
     * 评价题目
     */
    private String ratingItem;
    /**
     * 题目的状态，是否可用，Y表示可用，N表示不可用
     */
    private Character status;
    /**
     * 题目的创建时间
     */
    private Date createTime;
    /**
     * 题目的最后修改时间
     */
    private Date lastModifyTime;

    /**
     * 题目编号
     */
    private Integer num;
    //    @Transient

    public EvaluationForm() {
    }

    public EvaluationForm(Integer num, String ratingItem) {
        this.ratingItem = ratingItem;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRatingItem() {
        return ratingItem;
    }

    public void setRatingItem(String ratingItem) {
        this.ratingItem = ratingItem;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationForm that = (EvaluationForm) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ratingItem, that.ratingItem) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(lastModifyTime, that.lastModifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ratingItem, status, createTime, lastModifyTime);
    }

    @Override
    public String toString() {
        return "EvaluationForm{" +
                "ratingItem='" + ratingItem + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }
}
