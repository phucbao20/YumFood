package UI.UI;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


import UI.DangNhapJDiaLog;
import Utils.Auth;
import Utils.SheetDataProvider;
import Utils.TestUiUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertNotNull;

//import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class DangNhapJDiaLogTest {
	private SheetDataProvider sheetData;
	private File file;
	private volatile DangNhapJDiaLog dangNhapJDialog ;

	@BeforeTest
	public void openMainFrame() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
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
		file = new File(System.getProperty("user.dir")+"//TestASM.xls");
		sheetData = new SheetDataProvider(";", file);
	}

	@BeforeMethod
	public void createDiaLog() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				dangNhapJDialog = new DangNhapJDiaLog(null, true);
				dangNhapJDialog.setVisible(true);
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
	public void removeDialog() {
		if (dangNhapJDialog != null) {
			Auth.nv = null;
			dangNhapJDialog.dispose();
		}
	}
	
	@DataProvider(name = "ValidLoginData")
	public Object[][] validLoginData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("ui", "ValidLoginUI", 2);
	}
	

	@Test(dataProvider = "ValidLoginData" ,alwaysRun = true, priority = 1)
	public void loginTestPassed(String username, String password) {
		dangNhapJDialog.getTxttendangnhap().setText(username);
		dangNhapJDialog.getTxtPass().setText(password);
		dangNhapJDialog.getBtnDangNhap().doClick();
		AssertJUnit.assertNotNull("Đăng nhập thành công", Auth.nv);
	}
	
	
	@DataProvider(name = "InvalidLoginData")
	public Object[][] InvalidLoginData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("ui", "InvalidLoginUI", 2);
	}
	

	@Test(dataProvider = "InvalidLoginData" ,alwaysRun = true, priority = 2)
	public void loginTestFailed(String username, String password) {
		dangNhapJDialog.getTxttendangnhap().setText(username);
		dangNhapJDialog.getTxtPass().setText(password);
		dangNhapJDialog.getBtnDangNhap().doClick();
		AssertJUnit.assertNotNull("Đăng nhập không thành công", Auth.nv);
	}
}
