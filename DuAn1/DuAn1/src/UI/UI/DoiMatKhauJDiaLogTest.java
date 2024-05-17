package UI.UI;

import org.testng.annotations.Test;

import Entity.NhanVien;
import UI.DangNhapJDiaLog;
import UI.DoiMatKhauJDiaLog;
import Utils.Auth;
import Utils.SheetDataProvider;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DoiMatKhauJDiaLogTest {
	private SheetDataProvider sheetData;
	private File file;
	private volatile DoiMatKhauJDiaLog doimatkhauJDialog;

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
			java.util.logging.Logger.getLogger(DoiMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DoiMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DoiMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DoiMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		file = new File(System.getProperty("user.dir") + "//TestASM.xls");
		sheetData = new SheetDataProvider(";", file);
	}

	@BeforeMethod
	public void createDiaLog() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				doimatkhauJDialog = new DoiMatKhauJDiaLog(null, true);
				doimatkhauJDialog.setVisible(true);
			}
		});
		Auth.nv = new NhanVien("PS006", "1234", "Lê Nguyễn Phúc Bảo", "2141242", "baolnpps30114", true, "An giang", true);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void removeDialog() {
		if (doimatkhauJDialog != null) {
			Auth.nv = null;
			doimatkhauJDialog.dispose();
		}
	}

	@DataProvider(name = "ValidLoginData")
	public Object[][] validLoginData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("ui_DMK", "ValidLoginUI", 3);
	}
	

	@Test(dataProvider = "ValidLoginData" ,alwaysRun = true, priority = 1)
	public void loginTestPassed(String pass, String password, String password1) {
		doimatkhauJDialog.getTxtPass().setText(pass);
		doimatkhauJDialog.getTxtPassNew1().setText(password);
		doimatkhauJDialog.getTxtPassNew2().setText(password1);
		doimatkhauJDialog.getkButton2().doClick();
		AssertJUnit.assertNotNull("Đổi mật khẩu thành công", Auth.nv);
	}
	
	
	@DataProvider(name = "InvalidLoginData")
	public Object[][] InvalidLoginData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("ui_DMK", "InvalidLoginUI", 3);
	}
	

	@Test(dataProvider = "InvalidLoginData" ,alwaysRun = true, priority = 2)
	public void loginTestFailed(String pass, String password, String password1) {
		doimatkhauJDialog.getTxtPass().setText(pass);
		doimatkhauJDialog.getTxtPassNew1().setText(password);
		doimatkhauJDialog.getTxtPassNew2().setText(password1);
		doimatkhauJDialog.getkButton2().doClick();
		AssertJUnit.assertNotNull("Đăng nhập không thành công", Auth.nv);
	}
}
