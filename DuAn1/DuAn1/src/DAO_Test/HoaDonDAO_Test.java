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

import DAO.HoaDonDAO;
import Entity.HoaDon;

public class HoaDonDAO_Test {

	private HoaDonDAO hoadonDao;
	private HoaDon hoadon;
	private HoaDon hoadonFullField;

	@BeforeClass
	public void beforeClass() {
		hoadonDao = new HoaDonDAO();
		hoadon = new HoaDon();
	}

	@AfterClass
	public void afterClass() {

	}

	@BeforeMethod
	public void setUp() {
		hoadonDao = new HoaDonDAO();
		hoadon = new HoaDon(2035, "Nguyễn Văn B", "0123456789", new Date(), 0, "PS002", null);
	}

	@AfterMethod
	public void tearDown() {
		hoadonDao = null;
		hoadon = null;
	}

	@Test
	public void TestInsert_Pass() {
		try {
			System.out.println(hoadonFullField.getMaHD());
	//		hoadon.setMaHD(3001);
			hoadonDao.insert(hoadon);
//			hoadon = hoadonDao.SelectByID(2035);
//	System.out.println(hoadon.getMaHD());
			assertEquals(hoadon.getMaHD(), 2035);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_NullAll_Fail() {
		try {
			hoadon = new HoaDon();
			hoadonDao.insert(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_NullDate_Fail() {
		try {
			hoadon.setNgayTao(null);
			hoadonDao.insert(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_NullMaNV_Fail() {
		try {
			hoadon.setMaNV(null);
			hoadonDao.insert(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_NullHoTen_Fail() {
		try {
			hoadon.setTenKH(null);
			hoadonDao.insert(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestUpdate_All_Pass() {
		try {
			hoadon =  new HoaDon(2044, "Nguyễn Văn C", "44120241", new Date(), 10, "PS003", null);
			hoadonDao.update(hoadon);
			hoadon = hoadonDao.SelectByID(2044);
//	System.out.println(hoadon.getMaHD());
			assertEquals(hoadon.getMaHD(), 2044);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestUpdate_TenKH_Pass() {
		try {
			hoadon.setTenKH("Lê Thị B");
			hoadonDao.update(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestUpdate_MaNV_Pass() {
		try {
			hoadon.setMaNV("PS005");
			hoadonDao.update(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestUpdate_dienThoai_Pass() {
		try {
			hoadon.setSDT_KH("011924421");;
			hoadonDao.update(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestUpdate_NgayTao_Pass() {
		try {
			hoadon.setNgayTao(new Date());;
			hoadonDao.update(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestUpdate_GiamGia_Pass() {
		try {
			hoadon.setGiatrigg(5);;
			hoadonDao.update(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestUpdate_GhiChu_Pass() {
		try {
			hoadon.setGhiChu("Lễ Noel");;
			hoadonDao.update(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestUpdate_NullTenKhachHang_Fail() {
		try {
			hoadon.setTenKH(null);
			hoadonDao.update(hoadon);
			hoadon = hoadonDao.SelectByID(2044);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestUpdate_NullMaNV_Fail() {

		hoadon.setMaNV(null);
		hoadonDao.update(hoadon);
		hoadon = hoadonDao.SelectByID(2044);

	}

	

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestInsert_NullTenKhachHang_Fail() {
		try {
			hoadon.setTenKH(null);
			hoadonDao.insert(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void TestUpdate_NullNgayTao_Fail() {
		hoadon.setNgayTao(null);
		hoadonDao.update(hoadon);
		hoadon = hoadonDao.SelectByID(2044);

	}

	@Test
	public void TestDelete_Pass() {
		try {
//			hoadon.setTenKH(null);
			hoadonDao.insert(hoadon);
			hoadonDao.delete(hoadon.getMaHD());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestDelete_Fail() {
		try {
//			hoadon.setTenKH(null);
			hoadon.setMaHD(0);
			hoadonDao.delete(hoadon.getMaHD());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestSelecte_All_Pass() {
		try {
			List<HoaDon> list = hoadonDao.selectAll();
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelecte_All_Fail() {
		try {
			List<HoaDon> list = hoadonDao.selectAll();
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestDanhSachHoaDon_Pass() {
		try {
			List<Object[]> list = hoadonDao.getDANHSACH_HOADON();
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestDanhSachHoaDon_Fail() {
		try {
			List<Object[]> list = hoadonDao.getDANHSACH_HOADON();
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestSelect_ByID_Pass() {
		try {
			hoadon =hoadonDao.SelectByID(2023);
			assertNotNull(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_ByID_Fail() {
		try {
			hoadon =hoadonDao.SelectByID(2023);
			assertNull(hoadon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestSelect_BySQL_Pass() {
	    String SQL_SELECTBYID = "SELECT * FROM HOADON WHERE MAHD = ?";

		try {
			List<HoaDon> list = hoadonDao.selectBySQL(SQL_SELECTBYID,hoadon.getMaHD());
			assertNotNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expectedExceptions = { SQLServerException.class })
	public void TestSelect_BySQL_Fail() {
	    String SQL_SELECTBYID = "SELECT * FROM HOADON WHERE MAHD = ?";
		try {
			List<HoaDon> list = hoadonDao.selectBySQL(SQL_SELECTBYID,hoadon.getMaHD());
			assertNull(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
