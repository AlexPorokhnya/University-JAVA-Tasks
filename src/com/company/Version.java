package com.company;

public class Version{
    private String createdBy;
    private String modifiedBy;

    public Version(String createdBy, String modifiedBy) throws VersionException {
        this.createdBy = createdBy;
        if(createdBy == null || createdBy == ""){
            throw new VersionException("Creator cannot be null!");
        }
        this.modifiedBy = modifiedBy;
        if(modifiedBy == null || modifiedBy == ""){
            throw new VersionException("Modifier cannot be null!");
        }

    }




    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
