package DAO_Test;

import static org.testng.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import Utils.JDBC;

public class NhanVienDAOTest {

	private NhanVienDAO nvDAO;
	private NhanVien nv;
	private NhanVien nvFullField;

	@BeforeClass
	public void beforeClass() {
		nvDAO = new NhanVienDAO();
		nv = new NhanVien();

	}

	@BeforeMethod
	public void setUp() {
		nvFullField = new NhanVien("PS126", "123456", "Huy Tinh", "0789546523", "nguyenhuy@gmail.com", false,
				"An Giang", false);
	}

	@AfterClass
	public void tearDown() {
		nvDAO = null;
		nv = null;
	}

	@AfterMethod
	public void afterClass() {
	}

	@Test
	public void SelectByIDTest_Passed() throws Exception {
		NhanVien nvSelectByID = nvDAO.SelectByID("PS001");
		assertEquals(nvSelectByID.getMaNV(), "PS001");
	}

	@Test
	public void SelectByIDTest_Failed() throws Exception {
		NhanVien nvSelectByID = nvDAO.SelectByID("PS1235");
		assertEquals(nvSelectByID, null);
	}

	@Test
	public void selectAllTest_Passed() throws Exception {
		List<NhanVien> listNhanVien = nvDAO.selectAll();
	}

	@Test
	public void insertTest_Passed() throws Exception {
		nvDAO.delete(nvFullField.getMaNV());
		nvDAO.insert(nvFullField);
	}

	@Test(expectedExceptions = { SQLException.class })
	public void insertTest_NullAll_Failed() throws Exception {
		nvDAO.insert(nv);
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void insertTest_NullNVID_Failed() throws Exception {
		nvFullField.setMaNV(null);
		nvDAO.insert(nvFullField);
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void insertTest_NullNVHoTen_Failed() throws Exception {
		nvFullField.setHoTen(null);
		nvDAO.insert(nvFullField);
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void insertTest_NullNVMatKhau_Failed() throws Exception {
		nvFullField.setMatKhau(null);
		nvDAO.insert(nvFullField);
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void insertTest_NullNVSoDienThoai_Failed() throws Exception {
		nvFullField.setSDT(null);
		nvDAO.insert(nvFullField);
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void insertTest_NullNVEmail_Failed() throws Exception {
		nvFullField.setEmail(null);
		nvDAO.insert(nvFullField);
	}

	@Test
	public void insertTest_NullNVDiaChi_Failed() throws Exception {
		nvFullField.setDiaChi(null);
		nvDAO.insert(nvFullField);
	}

	@Test
	public void deleteTest_Passed() throws Exception {
		nvDAO.delete(nvFullField.getMaNV());
	}

	@Test
	public void updateTest_Passed() throws Exception {
		nvDAO.update(nvFullField);
	}

	@Test
	public void updateTest_NullNVID_Failed() throws Exception {
		nvFullField.setMaNV(null);
		nvDAO.update(nvFullField);
	}

	@Test(expectedExceptions = { SQLServerException.class })
	public void updateTest_NullNVHoTen_Failed() throws Exception {
		nvFullField.setHoTen(null);
		nvDAO.update(nvFullField);
	}

	@Test
	public void updateTest_NullNVSDT_Passed() throws Exception {
		nvFullField.setSDT(null);
		nvDAO.update(nvFullField);
	}

	@Test
	public void updateTest_NullNVEmail_Passed() throws Exception {
		nvFullField.setEmail(null);
		nvDAO.update(nvFullField);
	}

	@Test
	public void updateTest_NullNVDiaChi_Passed() throws Exception {
		nvFullField.setDiaChi(null);
		nvDAO.update(nvFullField);
	}

}
