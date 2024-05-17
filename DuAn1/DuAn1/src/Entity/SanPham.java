
package Entity;


public class SanPham {
    private String maSP;
    private String tenSP;
    private double Gia;
    private String moTa;
    private String Hinh;
    private int maLoai;

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public int getmaLoai() {
        return maLoai;
    }

    public void setmaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double Gia, String moTa, String Hinh, int maLoai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.Gia = Gia;
        this.moTa = moTa;
        this.Hinh = Hinh;
        this.maLoai = maLoai;
    }


}
