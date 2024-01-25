package com.company;

public class Article extends Version{
    private String title;
    private String content;
    private Comment[] comArr = new Comment[50];

    public Article(String createdBy, String modifiedBy, String title, String content) throws ArticleException, VersionException {
        super(createdBy, modifiedBy);
        this.title = title;
        if(title == null || title == ""){
            throw new ArticleException("Title cannot be null!");
        }
        this.content = content;
        if(content == null || content == ""){
            throw new ArticleException("Content cannot be null!");
        }
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Comment[] getComArr() {
        return comArr;
    }

    public void setComArr(Comment[] comArr) {
        this.comArr = comArr;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
