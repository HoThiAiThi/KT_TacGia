package com.example.kt_tacgia;

public class TacGia {
    private int hinhAnh;
    private String ten;
    private String moTa;
    private String sao;

    public TacGia() {
    }

    public TacGia(int hinhAnh, String ten, String moTa, String sao) {
        this.hinhAnh = hinhAnh;
        this.ten = ten;
        this.moTa = moTa;
        this.sao = sao;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }
}

