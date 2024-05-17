package Utils;

import java.io.File;

import javax.swing.JComponent;
import javax.swing.JDialog;

import org.apache.xmlbeans.impl.jam.JComment;

import UI.DangNhapJDiaLog;
import Utils.SheetDataProvider;

public class TestUiUtil {
	private SheetDataProvider sheetData;
	private File file;
	private volatile JComponent jcRoot;	
	private volatile JDialog jdRoot;	
	
	public JComponent getJcRoot() {
		return jcRoot;
	}
	
	public void setJcRoot(JComponent jcRoot) {
		this.jcRoot = jcRoot;
	}


	public JDialog getJdRoot() {
		return jdRoot;
	}


	public void setJdRoot(JDialog jdRoot) {
		this.jdRoot = jdRoot;
	}


	public SheetDataProvider getSheetData() {
		return sheetData;
	}


	public void setSheetData(SheetDataProvider sheetData) {
		this.sheetData = sheetData;
	}


	public TestUiUtil() {
		super();
	}


	public void setUpUiTest() {
//		try {
//			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					javax.swing.UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} catch (ClassNotFoundException ex) {
//			java.util.logging.Logger.getLogger(DangNhapJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
//					null, ex);
//		} catch (InstantiationException ex) {
//			java.util.logging.Logger.getLogger(DangNhapJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
//					null, ex);
//		} catch (IllegalAccessException ex) {
//			java.util.logging.Logger.getLogger(DangNhapJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
//					null, ex);
//		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
//			java.util.logging.Logger.getLogger(DangNhapJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE,
//					null, ex);
//		}
		this.file = new File(System.getProperty("user.dir")+"//TestASM.xls");
		this.sheetData = new SheetDataProvider(";", file);
	}
	
	
	public void initUi(JComponent jc) {
		this.jcRoot = jc;
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				jcRoot.setVisible(true);
			}
		});
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void initUi(JDialog jd) {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				jdRoot = jd;
				jdRoot.setVisible(true);
			}
		});
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
