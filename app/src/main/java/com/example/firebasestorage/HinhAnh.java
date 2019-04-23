package com.example.firebasestorage;

public class HinhAnh {
    private String tenHinh;
    private String urlHinh;

    public HinhAnh(String tenHinh, String urlHinh) {
        this.tenHinh = tenHinh;
        this.urlHinh = urlHinh;
    }

    public HinhAnh() {
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getUrlHinh() {
        return urlHinh;
    }

    public void setUrlHinh(String urlHinh) {
        this.urlHinh = urlHinh;
    }
}
