package com.company;

public class Comment extends Version{
    private String comm = "";

    public Comment(String createdBy, String modifiedBy, String comm) throws VersionException, CommentException {
        super(createdBy, modifiedBy);
        this.comm = comm;
        if(comm == null || comm == ""){
            throw new CommentException("Comment cannot be null!");
        }
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public String getComm() {
        return comm;
    }
}
