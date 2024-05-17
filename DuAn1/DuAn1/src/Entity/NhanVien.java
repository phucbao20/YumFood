
package Entity;

public class NhanVien {
    private String MaNV;
    private String matKhau;
    private String hoTen;
    private String SDT;
    private String Email;
    private boolean gioiTinh;
    private String diaChi;
    private boolean vaiTro;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public NhanVien() {
    }

    public NhanVien(String MaNV, String matKhau, String hoTen, String SDT, String Email, boolean gioiTinh, String diaChi, boolean vaiTro) {
        this.MaNV = MaNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.Email = Email;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.vaiTro = vaiTro;
    }
    
}
