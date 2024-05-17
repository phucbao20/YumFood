package UI.UI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import UI.MainYumFood;
import UI.NhanVienJDialog;
import Utils.SheetDataProvider;

public class testNhanVienDialog {
	private SheetDataProvider sheetData;
	private File file;
	private volatile NhanVienJDialog nhanVienJDialog;

	@BeforeTest
	public void openMainFrame() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainYumFood.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainYumFood.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainYumFood.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainYumFood.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		file = new File(System.getProperty("user.dir") + "//testData.xlsx");
		sheetData = new SheetDataProvider(file);
	}

	@BeforeMethod
	public void createDialog() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				nhanVienJDialog = new NhanVienJDialog(null, true);
				nhanVienJDialog.setVisible(true);
			}
		});
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@AfterMethod()
	public void removeDialog() {
		if(nhanVienJDialog != null) {
			nhanVienJDialog.dispose();
		}
	}
	
	@DataProvider(name = "addValidStaffData")
	public Object[][] addValidStaffData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("UI", "addValidStaffData", 6);
	}
	
	@Test(dataProvider = "addValidStaffData", alwaysRun = true, priority = 1)
	public void testAddValidStaff(String id, String pass, String name, String phone, String email, String address) {
		nhanVienJDialog.getTxtMaNV().setText(id);
		nhanVienJDialog.getTxtMatKhau().setText(pass);
		nhanVienJDialog.getTxtHoTen().setText(name);
		nhanVienJDialog.getTxtSDT().setText(phone);
		nhanVienJDialog.getTxtEmail().setText(email);
		nhanVienJDialog.getRdoNam().doClick();
		nhanVienJDialog.getTxtDiaChi().setText(address);
		Assert.assertTrue(nhanVienJDialog.Validate());
	}
	
	@DataProvider(name = "addInvalidStaffData")
	public Object[][] addInvalidStaffData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("UI", "addInvalidStaffData", 6);
	}
	
	@Test(dataProvider = "addInvalidStaffData", alwaysRun = true, priority = 2)
	public void testAddInvalidStaff(String id, String pass, String name, String phone, String email, String address) {
		nhanVienJDialog.getTxtMaNV().setText(id);
		nhanVienJDialog.getTxtMatKhau().setText(pass);
		nhanVienJDialog.getTxtHoTen().setText(name);
		nhanVienJDialog.getTxtSDT().setText(phone);
		nhanVienJDialog.getTxtEmail().setText(email);
		nhanVienJDialog.getRdoNam().doClick();
		nhanVienJDialog.getTxtDiaChi().setText(address);
		Assert.assertFalse(nhanVienJDialog.Validate());
	}
	
	@DataProvider(name = "updateValidStaffData")
	public Object[][] updateValidStaffData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("UI", "updateValidStaffData", 6);
	}
	
	@Test(dataProvider = "updateValidStaffData", alwaysRun = true, priority = 3)
	public void testUpdateValidStaffData(String id, String pass, String name, String phone, String email, String address) {
		nhanVienJDialog.getTxtMaNV().setText(id);
		nhanVienJDialog.getTxtMatKhau().setText(pass);
		nhanVienJDialog.getTxtHoTen().setText(name);
		nhanVienJDialog.getTxtSDT().setText(phone);
		nhanVienJDialog.getTxtEmail().setText(email);
		nhanVienJDialog.getRdoNam().doClick();
		nhanVienJDialog.getTxtDiaChi().setText(address);
		Assert.assertTrue(nhanVienJDialog.Validate());
	}
	
	@DataProvider(name = "updateInvalidStaffData")
	public Object[][] updateInvalidStaffData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("UI", "updateInvalidStaffData", 6);
	}
	
	@Test(dataProvider = "updateInvalidStaffData", alwaysRun = true, priority = 4)
	public void testUpdateInvalidStaffData(String id, String pass, String name, String phone, String email, String address) {
		nhanVienJDialog.getTxtMaNV().setText(id);
		nhanVienJDialog.getTxtMatKhau().setText(pass);
		nhanVienJDialog.getTxtHoTen().setText(name);
		nhanVienJDialog.getTxtSDT().setText(phone);
		nhanVienJDialog.getTxtEmail().setText(email);
		nhanVienJDialog.getRdoNam().doClick();
		nhanVienJDialog.getTxtDiaChi().setText(address);
		Assert.assertFalse(nhanVienJDialog.Validate());
	}
	
	@DataProvider(name = "deleteValidStaffData")
	public Object[][] deleteValidStaffData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("UI", "deleteValidStaffData", 6);
	}
	
	@Test(dataProvider = "deleteValidStaffData", alwaysRun = true, priority = 5)
	public void testDeleteValidStaffData(String id, String pass, String name, String phone, String email, String address) {
		Assert.assertFalse(id.isEmpty());
	}
	
	@DataProvider(name = "deleteInvalidStaffData")
	public Object[][] deleteInvalidStaffData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("UI", "deleteInvalidStaffData", 6);
	}
	
	@Test(dataProvider = "deleteInvalidStaffData", alwaysRun = true, priority = 6)
	public void testDeleteInvalidStaffData(String id, String pass, String name, String phone, String email, String address) {
		Assert.assertTrue(id.isEmpty());
	}
}
