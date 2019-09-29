package com.itek.teaching.management.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author Administrator
 * @date 2019-09-12
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Schedule implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_schedule.id
     *
     * @mbggenerated
     */
    /**  */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_schedule.title
     *
     * @mbggenerated
     */
    /** 日程名称 */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_schedule.start
     *
     * @mbggenerated
     */
    /** 日程起始时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_schedule.end
     *
     * @mbggenerated
     */
    /** 结束时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_schedule
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_schedule.id
     *
     * @return the value of t_schedule.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_schedule.id
     *
     * @param id the value for t_schedule.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_schedule.title
     *
     * @return the value of t_schedule.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_schedule.title
     *
     * @param title the value for t_schedule.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_schedule.start
     *
     * @return the value of t_schedule.start
     *
     * @mbggenerated
     */
    public Date getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_schedule.start
     *
     * @param start the value for t_schedule.start
     *
     * @mbggenerated
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_schedule.end
     *
     * @return the value of t_schedule.end
     *
     * @mbggenerated
     */
    public Date getEnd() {
        return end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_schedule.end
     *
     * @param end the value for t_schedule.end
     *
     * @mbggenerated
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schedule
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Schedule other = (Schedule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getStart() == null ? other.getStart() == null : this.getStart().equals(other.getStart()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schedule
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getStart() == null) ? 0 : getStart().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schedule
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}