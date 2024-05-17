
package Entity;


public class LoaiHangHoa {
    private int ID;
    private String ten_HangHoa;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen_HangHoa() {
        return ten_HangHoa;
    }

    public void setTen_HangHoa(String ten_HangHoa) {
        this.ten_HangHoa = ten_HangHoa;
    }

    public LoaiHangHoa() {
    }

    public LoaiHangHoa(int ID, String ten_HangHoa) {
        this.ID = ID;
        this.ten_HangHoa = ten_HangHoa;
    }
    
}
