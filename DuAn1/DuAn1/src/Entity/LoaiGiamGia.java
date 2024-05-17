
package Entity;

import java.util.Date;


public class LoaiGiamGia 
{
    private String MaGG;
    private String TenCT;
    private Date ngayBD;
    private Date ngayKT;
    private int giaTri;

    public String getMaGG() {
        return MaGG;
    }

    public void setMaGG(String MaGG) {
        this.MaGG = MaGG;
    }

    public String getTenCT() {
        return TenCT;
    }

    public void setTenCT(String TenCT) {
        this.TenCT = TenCT;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public LoaiGiamGia() {
    }

    public LoaiGiamGia(String MaGG, String TenCT, Date ngayBD, Date ngayKT, int giaTri) {
        this.MaGG = MaGG;
        this.TenCT = TenCT;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.giaTri = giaTri;
    }


    
}
