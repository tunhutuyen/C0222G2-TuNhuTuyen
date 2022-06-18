package com.myself.model;

public class Save {
    private String language;
    private int pageSize;
    private boolean enable;
    private String signature;

    public Save() {
    }

    public Save(String language, int pageSize, boolean enable, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.enable = enable;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
