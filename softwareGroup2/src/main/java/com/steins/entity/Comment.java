package com.steins.entity;

/**
 * @author Sunny
 * comment_id
 * store_id
 * comment_content
 * comment_date
 * comment_uname
 * comment_img
 * comment_toux
 * comment_score
 */
public class Comment {
    private Integer commentId;
    private Integer storeId;
    private String commentContent;
    private String commentDate;
    private String commentUname;
    private String commentImg;
    private String commentToux;
    private String commentScore;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", storeId=" + storeId +
                ", commentContent='" + commentContent + '\'' +
                ", commentDate='" + commentDate + '\'' +
                ", commentUname='" + commentUname + '\'' +
                ", commentImg='" + commentImg + '\'' +
                ", commentToux='" + commentToux + '\'' +
                ", commentScore='" + commentScore + '\'' +
                '}';
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentUname() {
        return commentUname;
    }

    public void setCommentUname(String commentUname) {
        this.commentUname = commentUname;
    }

    public String getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg;
    }

    public String getCommentToux() {
        return commentToux;
    }

    public void setCommentToux(String commentToux) {
        this.commentToux = commentToux;
    }

    public String getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(String commentScore) {
        this.commentScore = commentScore;
    }
}
