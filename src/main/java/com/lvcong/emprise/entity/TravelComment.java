package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * (TravelComment)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:06
 */
@Repository
public class TravelComment implements Serializable {
    private static final long serialVersionUID = 350669879639878107L;
    /**
     * 评论id
     */
    private Integer id;
    /**
     * 评论人id
     */
    private Integer userId;
    /**
     * 评论对象id（可以是游记，也可以是景点和旅游团）
     */
    private Integer targetId;
    /**
     * 父级评论id
     */
    private Integer parentCommentId;
    /**
     * 父级评论的userid
     */
    private Integer parentCommentUserId;
    /**
     * 被回复的评论id
     */
    private Integer replyCommentId;
    /**
     * 被回复的评论的userid
     */
    private Integer replyCommentUserId;
    /**
     * 评论等级，评论blog或者景点的是一级评论，其余都是二级评论
     */
    private Integer commentLevel;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论状态，1表示删除（逻辑删除），默认0
     */
    private Integer status;
    /**
     * 点赞数
     */
    private Integer praiseNum;
    /**
     * 是否置顶，0表示否，1表示是，默认0.
     */
    private Integer topStatus;
    /**
     * 发表评论时间
     */
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Integer parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public Integer getParentCommentUserId() {
        return parentCommentUserId;
    }

    public void setParentCommentUserId(Integer parentCommentUserId) {
        this.parentCommentUserId = parentCommentUserId;
    }

    public Integer getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(Integer replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    public Integer getReplyCommentUserId() {
        return replyCommentUserId;
    }

    public void setReplyCommentUserId(Integer replyCommentUserId) {
        this.replyCommentUserId = replyCommentUserId;
    }

    public Integer getCommentLevel() {
        return commentLevel;
    }

    public void setCommentLevel(Integer commentLevel) {
        this.commentLevel = commentLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    public Integer getTopStatus() {
        return topStatus;
    }

    public void setTopStatus(Integer topStatus) {
        this.topStatus = topStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

