package UI.UI;

import org.testng.annotations.Test;

import UI.DangNhapJDiaLog;
import UI.GiamGiaJDiaLog;
import Utils.Auth;
import Utils.SheetDataProvider;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class GiamGiaJDiaLogCreateTest {
	private SheetDataProvider sheetData;
	private File file;
	private volatile GiamGiaJDiaLog giamgiaJDiaLog; 
	
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
		file = new File(System.getProperty("user.dir")+"//TestGGASM.xls");
		sheetData = new SheetDataProvider(";", file);
  }

  @BeforeMethod
  public void createDiaLog() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				giamgiaJDiaLog = new GiamGiaJDiaLog(null, true);
				giamgiaJDiaLog.setVisible(true);
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
		if (giamgiaJDiaLog != null) {
			Auth.nv = null;
			giamgiaJDiaLog.dispose();
		}
	}
  @DataProvider(name = "ValidGGData")
	public Object[][] validLoginData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("ui", "ValidLoginUI", 5);
	}
  
  
  
  @Test(dataProvider = "ValidGGData" ,alwaysRun = true, priority = 1)
	public void createGGPassed(String idvoucher, String nameVoucher, String startDay, String endDay, String GT) {
		giamgiaJDiaLog.getTxtVoucher().setText(idvoucher);
		giamgiaJDiaLog.getTxtNameVoucher().setText(nameVoucher);
		giamgiaJDiaLog.getTxtStartDay().setText(startDay.toString());
		giamgiaJDiaLog.getTxtEndDay().setText(endDay.toString());
		giamgiaJDiaLog.getTxtValue().setText(String.valueOf(GT));
		giamgiaJDiaLog.getBtnAdd().doClick();
		AssertJUnit.assertNotNull("Them thành công", Auth.nv);	
	}
  
  @DataProvider(name = "InvalidGGData")
	public Object[][] InvalidLoginData() throws IOException, EncryptedDocumentException, InvalidFormatException{
		return sheetData.getData("ui", "InvalidLoginUI", 5);
	}
  
  @Test(dataProvider = "InvalidGGData" ,alwaysRun = true, priority = 2)
	public void createGGFailed(String idvoucher, String nameVoucher, String startDay, String endDay, String GT) {
		giamgiaJDiaLog.getTxtVoucher().setText(idvoucher);
		giamgiaJDiaLog.getTxtNameVoucher().setText(nameVoucher);
		giamgiaJDiaLog.getTxtStartDay().setText(startDay.toString());
		giamgiaJDiaLog.getTxtEndDay().setText(endDay.toString());
		giamgiaJDiaLog.getTxtValue().setText(String.valueOf(GT));
		giamgiaJDiaLog.getBtnAdd().doClick();
		AssertJUnit.assertNotNull("Them khong thành công", Auth.nv);	
	}
  

@DataProvider(name = "deleteValidStaffData")
public Object[][] deleteValidStaffData() throws IOException, EncryptedDocumentException, InvalidFormatException{
	return sheetData.getData("ui", "ValidDeleteGGUI", 5);
}

@Test(dataProvider = "deleteValidStaffData", alwaysRun = true, priority = 3)
public void testDeleteValidStaffData(String idVoucher, String nameVoucher, String starDay, String endDay, String GT) {
	assertFalse(idVoucher.isEmpty());
}

@DataProvider(name = "deleteInvalidStaffData")
public Object[][] deleteInvalidStaffData() throws IOException, EncryptedDocumentException, InvalidFormatException{
	return sheetData.getData("ui", "InvalidDeleteGGUI", 5);
}

@Test(dataProvider = "deleteInvalidStaffData", alwaysRun = true, priority = 4)
public void testDeleteInvalidStaffData(String idVoucher, String nameVoucher, String starDay, String endDay, String GT) {
	assertTrue(idVoucher.isEmpty());
}

}
