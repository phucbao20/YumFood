package UI.UI;

import org.testng.annotations.Test;

import DAO.LoaiHangHoaDAO;
import DAO.SanPhamDAO;
import Entity.LoaiHangHoa;
import Entity.NhanVien;
import Entity.SanPham;
import UI.Product;
import Utils.Auth;
import Utils.SheetDataProvider;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.swing.DefaultComboBoxModel;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class SanPhamJDiaLogTest {

	private SheetDataProvider sheetData;
	private File file;
	private volatile Product sanpham;
	private volatile SanPhamDAO spDAO;
	private volatile SanPham sp;

	@DataProvider(name = "delete_invalidProduct")
	public Object[][] data_deleteProductInValid() throws EncryptedDocumentException, InvalidFormatException, IOException {
		return sheetData.getData("product", "create_invalid", 2);
	}

	@Test(dataProvider = "delete_invalidProduct" ,alwaysRun = true, priority = 6)
	public void test_deleteProductInValid(String maSP) 
	{
		try {
			sanpham.txtmasanpham.setText(maSP);
			sanpham.kbtnXoa.doClick();
		} catch (Exception e) {
			throw new IllegalArgumentException("Dữ liệu nhập vào sai");
		}
	}
	
	@DataProvider(name = "delete_validProduct")
	public Object[][] data_deleteProductValid() throws EncryptedDocumentException, InvalidFormatException, IOException {
		return sheetData.getData("product", "create_valid", 2);
	}

	@Test(dataProvider = "delete_validProduct" ,alwaysRun = true, priority = 5)
	public void test_deleteProductValid(String maSP) 
	{
		try {
			sanpham.txtmasanpham.setText(maSP);
			sanpham.kbtnXoa.doClick();
		} catch (Exception e) {
			throw new IllegalArgumentException("Dữ liệu nhập vào sai");
		}
	}
	
	
	
	
	
	
	@DataProvider(name = "update_invalidProduct")
	public Object[][] data_updateProductInValid() throws EncryptedDocumentException, InvalidFormatException, IOException {
		return sheetData.getData("product", "create_invalid", 6);
	}

	@Test(dataProvider = "update_invalidProduct" ,alwaysRun = true, priority = 4)
	public void test_updateProductInValid(String maSP, String tenSP, String Gia, String moTa, String Hinh, String maLoai) 
	{
		try {
			sanpham.txtmasanpham.setText(maSP);
			sanpham.txttensanpham.setText(tenSP);
			sanpham.txtgia.setText(Gia);
			sanpham.txtMoTa.setText(moTa);
			sanpham.lblhinhanh.setText(Hinh);
			sanpham.cboLoaiHang.setSelectedIndex(Integer.parseInt(maLoai));
			sanpham.kbtnSua.doClick();
		} catch (Exception e) {
			throw new IllegalArgumentException("Dữ liệu nhập vào sai");
		}
	}
	
	@DataProvider(name = "update_validProduct")
	public Object[][] data_updateProductValid() throws EncryptedDocumentException, InvalidFormatException, IOException {
		return sheetData.getData("product", "create_valid", 6);
	}

	@Test(dataProvider = "update_validProduct" ,alwaysRun = true, priority = 3)
	public void test_updateProductValid(String maSP, String tenSP, String Gia, String moTa, String Hinh, String maLoai) 
	{
		try {
			sanpham.txtmasanpham.setText(maSP);
			sanpham.txttensanpham.setText(tenSP);
			sanpham.txtgia.setText(Gia);
			sanpham.txtMoTa.setText(moTa);
			sanpham.lblhinhanh.setText(Hinh);
			sanpham.cboLoaiHang.setSelectedIndex(Integer.parseInt(maLoai));
			sanpham.kbtnSua.doClick();
		} catch (Exception e) {
			throw new IllegalArgumentException("Dữ liệu nhập vào sai");
		}
	}
	
	
	

	@DataProvider(name = "create_invalidProduct")
	public Object[][] data_createProductInValid() throws EncryptedDocumentException, InvalidFormatException, IOException {
		return sheetData.getData("product", "create_invalid", 6);
	}

	@Test(dataProvider = "create_invalidProduct" ,alwaysRun = true, priority = 2)
	public void test_createProductInValid(String maSP, String tenSP, String Gia, String moTa, String Hinh, String maLoai) 
	{
		try {
			sanpham.txtmasanpham.setText(maSP);
			sanpham.txttensanpham.setText(tenSP);
			sanpham.txtgia.setText(Gia);
			sanpham.txtMoTa.setText(moTa);
			sanpham.lblhinhanh.setText(Hinh);
			sanpham.cboLoaiHang.setSelectedIndex(Integer.parseInt(maLoai));
			sanpham.kbtnAdd.doClick();
		} catch (Exception e) {
			throw new IllegalArgumentException("Dữ liệu nhập vào sai");
		}
	}
	
	@DataProvider(name = "create_validProduct")
	public Object[][] data_createProductValid() throws EncryptedDocumentException, InvalidFormatException, IOException {
		return sheetData.getData("product", "create_valid", 6);
	}

	@Test(dataProvider = "create_validProduct" ,alwaysRun = true, priority = 1)
	public void test_createProductValid(String maSP, String tenSP, String Gia, String moTa, String Hinh, String maLoai) 
	{
		try {
			sanpham.txtmasanpham.setText(maSP);
			sanpham.txttensanpham.setText(tenSP);
			sanpham.txtgia.setText(Gia);
			sanpham.txtMoTa.setText(moTa);
//			sanpham.lblhinhanh.setToolTipText(Hinh);
			sanpham.lblhinhanh.setText(Hinh);
			sanpham.cboLoaiHang.setSelectedIndex(Integer.parseInt(maLoai));
			sanpham.kbtnAdd.doClick();
		} catch (Exception e) {
			throw new IllegalArgumentException("Dữ liệu nhập vào sai");
		}
	}
	@BeforeMethod
	public void createJDialog() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				sanpham = new Product(null, false);
				spDAO = new SanPhamDAO();
				Auth.nv = new NhanVien("PS0123", "1234", "aa","aa",  "aa", false,  "aa", false);
				fillCombobox_LHH();
				sanpham.setVisible(true);
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
	public void disposeJDialog() {
		if (sanpham != null)
		{
			Auth.nv = null;
//			sanpham.getForm() = null;
			spDAO = null;
			sanpham.dispose();
			
		}
	}
	public void fillCombobox_LHH() {
		LoaiHangHoaDAO LhhDao = new LoaiHangHoaDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) sanpham.cboLoaiHang.getModel();
        model.removeAllElements();
        List<LoaiHangHoa> list = LhhDao.selectAll();
        for (LoaiHangHoa lhh : list) {
            model.addElement(lhh.getTen_HangHoa());
        }
    }
	@BeforeTest
	public void createJFrame() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		file = new File(System.getProperty("user.dir")+"//TestASM.xls");
		sheetData = new SheetDataProvider(";", file);
	}

}
