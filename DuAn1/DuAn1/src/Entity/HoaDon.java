
package Entity;

import java.util.Date;


public class HoaDon {
    private int maHD;
    private String tenKH;
    private String SDT_KH;
    private Date ngayTao;
    private int giatrigg;
    private String MaNV;
    private String ghiChu;

    public HoaDon(int maHD, String tenKH, String SDT_KH, Date ngayTao, int giatrigg, String MaNV, String ghiChu) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.SDT_KH = SDT_KH;
        this.ngayTao = ngayTao;
        this.giatrigg = giatrigg;
        this.MaNV = MaNV;
        this.ghiChu = ghiChu;
    }

    public HoaDon() {
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSDT_KH() {
        return SDT_KH;
    }

    public void setSDT_KH(String SDT_KH) {
        this.SDT_KH = SDT_KH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getGiatrigg() {
        return giatrigg;
    }

    public void setGiatrigg(int giatrigg) {
        this.giatrigg = giatrigg;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }


    
    
}
