package DAO_Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.util.Date;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import DAO.HoaDonChiTietDAO;
import DAO.HoaDonDAO;
import Entity.HoaDon;
import Entity.HoaDonChiTiet;

public class HoaDonChiTietDAO_Test {
	private HoaDonChiTietDAO hoadonchitietDAO;
	private HoaDonChiTiet hoadonchitiet;

	@BeforeClass
	public void beforeClass() {
		hoadonchitietDAO = new HoaDonChiTietDAO();
		hoadonchitiet = new HoaDonChiTiet();
	}

	@AfterClass
	public void afterClass() {

	}

	@BeforeMethod
	public void setUp() {
		hoadonchitietDAO = new HoaDonChiTietDAO();
		hoadonchitiet = new HoaDonChiTiet(2076, 2035, "BT02", 3, 20000, null);
	}

	@AfterMethod
	public void tearDown() {
		hoadonchitietDAO = null;
		hoadonchitiet = null;
	}

	@Test
	public void TestInsert_All_Pass() {
		try {
			HoaDonChiTiet hdct = hoadonchitietDAO.selectby_MaHD_MASP(hoadonchitiet.getMaHD(), hoadonchitiet.getMaSP());
			hoadonchitiet.setGhiChu(null);
			if (hdct != null) {
				if (hdct.getMaHD() == hoadonchitiet.getMaHD()) {
					if (hdct.getMaSP().equals(hoadonchitiet.getMaSP())) {
//                        HoaDonChiTiet hdct_sp = getFormHoaDonChiTiet();
						hdct.setSoLuong(hdct.getSoLuong() + hoadonchitiet.getSoLuong());
						hoadonchitietDAO.update_SoLuong_SanPham(hdct);
					}
				}
			} else {
				hoadonchitietDAO.insert(hoadonchitiet);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	@Test
	public void TestInsert_NullGhiChu_Pass() {
		try {
			HoaDonChiTiet hdct = hoadonchitietDAO.selectby_MaHD_MASP(hoadonchitiet.getMaHD(), hoadonchitiet.getMaSP());
			hoadonchitiet.setGhiChu(null);
			if (hdct != null) {
				if (hdct.getMaHD() == hoadonchitiet.getMaHD()) {
					if (hdct.getMaSP().equals(hoadonchitiet.getMaSP())) {
						hdct.setSoLuong(hdct.getSoLuong() + hoadonchitiet.getSoLuong());
						hoadonchitietDAO.update_SoLuong_SanPham(hdct);
					}
				}
			} else {
				hoadonchitietDAO.insert(hoadonchitiet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_All_Fail() {
		try {
			hoadonchitiet = new HoaDonChiTiet();
			hoadonchitietDAO.insert(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();

			// TODO: handle exception
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_NullMaHD_Fail() {
		try {
			hoadonchitiet.setMaHD(0);
			;
			hoadonchitietDAO.insert(hoadonchitiet);
//			assertEquals(hoadonchitiet.getMaHDCT(), 2076);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_NullMaSP_Fail() {
		try {
			hoadonchitiet.setMaSP(null);
			;
			hoadonchitietDAO.insert(hoadonchitiet);
//			assertEquals(hoadonchitiet.getMaHDCT(), 2076);
		} catch (Exception e) {
			e.printStackTrace();

			// TODO: handle exception
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_soluong_Fail() {
		try {
			hoadonchitiet.setSoLuong(0);
			;
			hoadonchitietDAO.insert(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();

			// TODO: handle exception
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_Gia_Fail() {
		try {
			hoadonchitiet.setSoLuong(0);
			hoadonchitietDAO.insert(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestUpdate_ALL_Pass() {
		try {
			hoadonchitiet = new HoaDonChiTiet(2076, 2035, "BT02", 3, 20000, null);
			hoadonchitietDAO.update(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestUpdate_MAHD_Pass() {
		try {
			hoadonchitiet.setMaHD(2011);
			hoadonchitietDAO.update(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestUpdate_MaSP_Pass() {
		try {
			hoadonchitiet.setMaSP("CE02");
			hoadonchitietDAO.update(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@Test
	public void TestUpdate_Soluong_Pass() {
		try {
			hoadonchitiet.setSoLuong(5);
			hoadonchitietDAO.update(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@Test
	public void TestUpdate_GhiChu_Pass() {
		try {
			hoadonchitiet.setGhiChu("Ít đá");
			hoadonchitietDAO.update(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestUpdate_ALL_Fail() {
		try {
			hoadonchitiet = null;
			hoadonchitietDAO.update(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestUpdate_MaSP_Fail() {
		try {
			hoadonchitiet.setMaSP(null);
			hoadonchitietDAO.update(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestDelete_Pass() {
		try {
			HoaDonChiTiet hdct = hoadonchitietDAO.selectby_MaHD_MASP(hoadonchitiet.getMaHD(), hoadonchitiet.getMaSP());
			hoadonchitiet.setGhiChu(null);
			if (hdct != null) {
				if (hdct.getMaHD() == hoadonchitiet.getMaHD()) {
					if (hdct.getMaSP().equals(hoadonchitiet.getMaSP())) {
//                        HoaDonChiTiet hdct_sp = getFormHoaDonChiTiet();
						hdct.setSoLuong(hdct.getSoLuong() + hoadonchitiet.getSoLuong());
						hoadonchitietDAO.update_SoLuong_SanPham(hdct);
					}
				}
			} else {
				hoadonchitietDAO.insert(hoadonchitiet);
			}
			hoadonchitietDAO.delete(hoadonchitiet.getMaHDCT());
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Test
	public void TestSelecte_All_Pass() {
		try {
			List<HoaDonChiTiet> list = hoadonchitietDAO.selectAll();
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelecte_All_Fail() {
		try {
			List<HoaDonChiTiet> list = hoadonchitietDAO.selectAll();
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestSelecte_ByID_Pass() {
		try {
			hoadonchitiet = hoadonchitietDAO.SelectByID(hoadonchitiet.getMaHD());
			assertNotNull(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelecte_ByID_Fail() {
		try {
			hoadonchitiet = hoadonchitietDAO.SelectByID(hoadonchitiet.getMaHD());
			assertNull(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestSelect_BySQL_Pass() {
	    String SQL_SELECTBY_MAHD = "SELECT * FROM HOADONCHITIET WHERE MAHD = ?";

		try {
			List<HoaDonChiTiet> list = hoadonchitietDAO.selectBySQL(SQL_SELECTBY_MAHD,hoadonchitiet.getMaHD());
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_BySQL_Fail() {
	    String SQL_SELECTBY_MAHD = "SELECT * FROM HOADONCHITIET WHERE MAHD = ?";
		try {
			List<HoaDonChiTiet> list = hoadonchitietDAO.selectBySQL(SQL_SELECTBY_MAHD, hoadonchitiet.getMaHD());
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestSelect_getDanhSachSanPham_HoaDonChiTiet_Pass() {

		try {
			List<Object[]> list = hoadonchitietDAO.getDanhSachSanPham_HoaDonChiTiet(hoadonchitiet.getMaHD());
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_getDanhSachSanPham_HoaDonChiTiet_Fail() {
		try {
			List<Object[]> list = hoadonchitietDAO.getDanhSachSanPham_HoaDonChiTiet(hoadonchitiet.getMaHD());
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestSelect_getTHONGTIN_KHACHHANG_NHANVIEN_Pass() {

		try {
			List<Object[]> list = hoadonchitietDAO.getTHONGTIN_KHACHHANG_NHANVIEN(hoadonchitiet.getMaHD());
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_getTHONGTIN_KHACHHANG_NHANVIEN_Fail() {
		try {
			List<Object[]> list = hoadonchitietDAO.getDanhSachSanPham_HoaDonChiTiet(hoadonchitiet.getMaHD());
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestSelect_getThanhToan_Pass() {

		try {
			List<Object[]> list = hoadonchitietDAO.getThanhToan(hoadonchitiet.getMaHD());
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_getThanhToan_Fail() {
		try {
			List<Object[]> list = hoadonchitietDAO.getThanhToan(hoadonchitiet.getMaHD());
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestSelect_getTien_ThanhToan_Pass() {

		try {
			List<Object[]> list = hoadonchitietDAO.getTien_ThanhToan(hoadonchitiet.getMaHD(), 200000);
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_getTien_ThanhToan_Fail() {
		try {
			List<Object[]> list = hoadonchitietDAO.getTien_ThanhToan(hoadonchitiet.getMaHD(), 200000);
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestSelect_selectby_MaHD_MASP_Pass() {

		try {
			hoadonchitietDAO.insert(hoadonchitiet);
			hoadonchitiet = hoadonchitietDAO.selectby_MaHD_MASP(hoadonchitiet.getMaHD(), hoadonchitiet.getMaSP());
			assertNotNull(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_selectby_MaHD_MASP_Fail() {
		try {
			hoadonchitiet = hoadonchitietDAO.selectby_MaHD_MASP(hoadonchitiet.getMaHD(), hoadonchitiet.getMaSP());
			assertNull(hoadonchitiet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestSelect_delete_mahd_Pass() {

		try {
			hoadonchitietDAO.delete_mahd(hoadonchitiet.getMaHD());
			assertNull(hoadonchitietDAO.SelectByID(hoadonchitiet.getMaHD()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_delete_mahd_Fail() {
		try {
			hoadonchitietDAO.delete_mahd(hoadonchitiet.getMaHD());
			assertNotNull(hoadonchitietDAO.SelectByID(hoadonchitiet.getMaHD()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestSelect_update_SoLuong_SanPham_Pass() {

		try {
			hoadonchitietDAO.update_SoLuong_SanPham(hoadonchitiet);
			assertNotNull(hoadonchitietDAO.SelectByID(hoadonchitiet.getMaHD()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_update_SoLuong_SanPham_Fail() {
		try {
			hoadonchitietDAO.update_SoLuong_SanPham(hoadonchitiet);
			assertNull(hoadonchitietDAO.SelectByID(hoadonchitiet.getMaHD()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
