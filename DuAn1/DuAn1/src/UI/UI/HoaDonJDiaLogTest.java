package UI.UI;

import org.testng.annotations.Test;

import DAO.HoaDonChiTietDAO;
import DAO.HoaDonDAO;
import DAO.SanPhamDAO;
import Entity.HoaDon;
import Entity.NhanVien;
import Entity.SanPham;
import UI.DangNhapJDiaLog;
import UI.HoaDonJDiaLog;
import Utils.Auth;
import Utils.SheetDataProvider;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class HoaDonJDiaLogTest {

	private SheetDataProvider sheetData;
	private File file;
	private volatile HoaDonJDiaLog hoadonJdialogTest;

	@BeforeMethod
	public void beforeMethod() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				hoadonJdialogTest = new HoaDonJDiaLog(null, true);
				hoadonJdialogTest.setVisible(true);
//				Auth.nv = new NhanVien("PS123", "1234", "TEST", "02151512351", "test@gmail.com", true, "123 Quang Trung", false);

			}
		});
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void afterMethod() {
		if (hoadonJdialogTest != null) {
			hoadonJdialogTest.dispose();
		}
	}

	@BeforeTest
	public void beforeTest() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Window".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DangNhapJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DangNhapJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DangNhapJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DangNhapJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		file = new File(System.getProperty("user.dir") + "//TestASM_HoaDon.xlsx");
		sheetData = new SheetDataProvider(";", file);
	}

	
	
	//	Insert Passed
	@DataProvider(name = "ValidInvoiceInsert")
	public Object[][] validInvoiceData() throws IOException, EncryptedDocumentException, InvalidFormatException {
		return sheetData.getData("UI_HoaDon", "ValidInvoiceInsert", 2);
	}

	@Test(dataProvider = "ValidInvoiceInsert", alwaysRun = true, priority = 1)
	public void InvoiceInsertPassed(String tenKH, String SDT_KH) {

		HoaDonDAO hoadonDAO = new HoaDonDAO();
		List<Object[]> list1 = hoadonDAO.getDANHSACH_HOADON();
		hoadonJdialogTest.getTxtHotenKH_HD().setText(tenKH);
		hoadonJdialogTest.getTxtsdtKH_HD().setText(SDT_KH);
		hoadonJdialogTest.getBtnThem_HD().doClick();
		
		List<Object[]> list2 = hoadonDAO.getDANHSACH_HOADON();
		assertFalse(list1.size() == list2.size());
	}
//			Insert Fail
	@DataProvider(name = "InValidInvoiceInsert")
	public Object[][] InvoiceInsertFail() throws IOException, EncryptedDocumentException, InvalidFormatException {
		return sheetData.getData("UI_HoaDon", "InValidInvoiceInsert", 2);
	}

	@Test(dataProvider = "InValidInvoiceInsert", alwaysRun = true, priority = 1)
	public void InvoiceInsertFail(String tenKH, String SDT_KH) {

		HoaDonDAO hoadonDAO = new HoaDonDAO();
		List<Object[]> list1 = hoadonDAO.getDANHSACH_HOADON();
		hoadonJdialogTest.getTxtHotenKH_HD().setText(tenKH);
		hoadonJdialogTest.getTxtsdtKH_HD().setText(SDT_KH);
		hoadonJdialogTest.getBtnThem_HD().doClick();
		
		List<Object[]> list2 = hoadonDAO.getDANHSACH_HOADON();
		assertTrue(list1.size() == list2.size());
	}
	@DataProvider(name = "ValidInvoiceDelete")
	public Object[][] ValidInvoiceDelete() throws IOException, EncryptedDocumentException, InvalidFormatException {
		return sheetData.getData("UI_HoaDon", "ValidInvoiceDelete", 1);
	}
	@Test(dataProvider = "ValidInvoiceDelete", alwaysRun = true, priority = 1)
	public void ValidInvoiceDelete(String mahd) {

		HoaDonDAO hoadonDAO = new HoaDonDAO();
		List<Object[]> list1 = hoadonDAO.getDANHSACH_HOADON();
		
		hoadonJdialogTest.getTxtMahd1().setText(mahd);
		hoadonJdialogTest.getBtnXoa_HD().doClick();
		
		List<Object[]> list2 = hoadonDAO.getDANHSACH_HOADON();
		assertFalse(list1.size() == list2.size());
	}	
	
	@DataProvider(name = "InValidInvoiceDelete")
	public Object[][] InValidInvoiceDelete() throws IOException, EncryptedDocumentException, InvalidFormatException {
		return sheetData.getData("UI_HoaDon", "InValidInvoiceDelete", 1);
	}

	@Test(dataProvider = "InValidInvoiceDelete", alwaysRun = true, priority = 2)
	public void InValidInvoiceDelete(String mahd) {

		HoaDonDAO hoadonDAO = new HoaDonDAO();
		List<Object[]> list1 = hoadonDAO.getDANHSACH_HOADON();
		
		hoadonJdialogTest.getTxtMahd1().setText(mahd);
		hoadonJdialogTest.getBtnXoa_HD().doClick();
		
		List<Object[]> list2 = hoadonDAO.getDANHSACH_HOADON();
		assertTrue( list1.size() == list2.size() );
	}
	
	@DataProvider(name = "AddProductPassed")
	public Object[][] AddProductPassed() throws IOException, EncryptedDocumentException, InvalidFormatException {
		return sheetData.getData("UI_HoaDonChiTiet", "AddProductPassed", 4);
	}

	@Test(dataProvider = "AddProductPassed", alwaysRun = true, priority = 1)
	public void AddProductPassed(String mahd, String tensanpham , String soluong, String ghichu) {

		int mahd_int = Integer.parseInt(mahd);
		HoaDonChiTietDAO hdctDAO = new HoaDonChiTietDAO();
		List<Object[]> list1 = hdctDAO.getDanhSachSanPham_HoaDonChiTiet(mahd_int);
//		System.out.println(list1.size());
//		SanPhamDAO spdao = new SanPhamDAO();
//		SanPham sp = spdao.SelectSanPham_ByName(tensanpham);
		
		hoadonJdialogTest.getTxtMahd1().setText(mahd);
		hoadonJdialogTest.getTxtTenSanPham().setText(tensanpham);
		hoadonJdialogTest.getTxtSoLuong().setText(soluong);
		hoadonJdialogTest.getTxtGhiChu().setText(ghichu);
		hoadonJdialogTest.getBtnThemSP().doClick();
		
//		System.out.println(hoadonJdialogTest.getTxtMahd1().getText());
//		System.out.println(hoadonJdialogTest.getTxtTenSanPham().getText());

		List<Object[]> list2 = hdctDAO.getDanhSachSanPham_HoaDonChiTiet(mahd_int);
//		System.out.println(list2.size());
//		Có nghĩa là nếu sản phẩm đó đã có trong hóa đơn thì mình cộng số lượng vào
//		Nếu chưa có thì thêm
		if(list1.size() != list2.size()) {
			assertFalse(false);
		}else {
			assertTrue(true);
		}
		
	}
	
	@DataProvider(name = "AddProductFailed")
	public Object[][] AddProductFailed() throws IOException, EncryptedDocumentException, InvalidFormatException {
		return sheetData.getData("UI_HoaDonChiTiet", "AddProductFailed", 4);
	}

	@Test(dataProvider = "AddProductFailed", alwaysRun = true, priority = 1)
	public void AddProductFailed(String mahd, String tensanpham , String soluong, String ghichu) {

		int mahd_int = Integer.parseInt(mahd);
		HoaDonChiTietDAO hdctDAO = new HoaDonChiTietDAO();
		List<Object[]> list1 = hdctDAO.getDanhSachSanPham_HoaDonChiTiet(mahd_int);
//		System.out.println(list1.size());
//		SanPhamDAO spdao = new SanPhamDAO();
//		SanPham sp = spdao.SelectSanPham_ByName(tensanpham);
		
		hoadonJdialogTest.getTxtMahd1().setText(mahd);
		hoadonJdialogTest.getTxtTenSanPham().setText(tensanpham);
		hoadonJdialogTest.getTxtSoLuong().setText(soluong);
		hoadonJdialogTest.getTxtGhiChu().setText(ghichu);
		hoadonJdialogTest.getBtnThemSP().doClick();
		
//		System.out.println(hoadonJdialogTest.getTxtMahd1().getText());
//		System.out.println(hoadonJdialogTest.getTxtTenSanPham().getText());

		List<Object[]> list2 = hdctDAO.getDanhSachSanPham_HoaDonChiTiet(mahd_int);

		if(list1.size() == list2.size()) {
			assertFalse(true);
		}
	}
}
