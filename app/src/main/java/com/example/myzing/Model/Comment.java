package com.example.myzing.Model;

public class Comment {
    private int id;
    private String contentComent;
    private String timeComment;

    public Comment() {
    }

    public Comment(int id, String contentComent, String timeComment) {
        this.id = id;
        this.contentComent = contentComent;
        this.timeComment = timeComment;
    }

    public Comment(String contentComent, String timeComment) {
        this.contentComent = contentComent;
        this.timeComment = timeComment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContentComent() {
        return contentComent;
    }

    public void setContentComent(String contentComent) {
        this.contentComent = contentComent;
    }

    public String getTimeComment() {
        return timeComment;
    }

    public void setTimeComment(String timeComment) {
        this.timeComment = timeComment;
    }
}
