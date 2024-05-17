package Utils;

import Entity.NhanVien;
import java.time.LocalDate;

public class Auth {

    public static NhanVien nv = null;

    // Đăng xuất thì xóa mã nhân viên đã đăng nhập
    public static void clear() {
        Auth.nv = null;
    }

    public static boolean logout = false;

    public static void isLogout() {
        Auth.nv = null;
        logout = true;
    }

    // Kiểm tra xem đăng nhập chưa
    public static boolean isLogin() {
        return Auth.nv != null;
    }

    // kiểm tra xem phải quản lý không
    public static boolean isManager() {
        return Auth.isLogin() && Auth.nv.isVaiTro();
    }

    public static LocalDate date1 = null;
    public static LocalDate date2 = null;
    public static String vetificationCode = null;
}
