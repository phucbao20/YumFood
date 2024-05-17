package Entity_Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Entity.NhanVien;

public class NhanVienTest {
	NhanVien nv;

	@BeforeClass
	public void init() {
		nv = new NhanVien("PS001", "12345", "BBPP", "123467987", "abc@gmail.com", true, "asd2123", true);
	}

	@Test
	public void NhanVienContructorTest() {
		// TODO Auto-generated constructor stub
		NhanVien nv = new NhanVien();
	}
	
	@Test
	public void NhanVienContructorFullFieldTest() {
		// TODO Auto-generated constructor stub
		NhanVien nv = new NhanVien("PS001", "12345", "BBPP", "123467987", "abc@gmail.com", true, "asd2123", true);
	}
	
	//Get
	@Test
	public void getDiaChiTest() {
		assertEquals("asd2123", nv.getDiaChi());
	}

	@Test
	public void getEmailTest() {
		assertEquals("abc@gmail.com", nv.getEmail());
	}

	@Test
	public void getHoTenTest() {
		assertEquals("BBPP", nv.getHoTen());
	}

	@Test
	public void getMaNVTest() {
		assertEquals("PS001", nv.getMaNV());
	}

	@Test
	public void getMatKhauTest() {
		assertEquals("12345", nv.getMatKhau());
	}

	@Test
	public void getSDTTest() {
		assertEquals("123467987", nv.getSDT());
	}

	@Test
	public void isGioiTinhTest() {
		assertEquals(true, nv.isGioiTinh());
	}

	@Test
	public void isVaiTroTest() {
		assertEquals(true, nv.isVaiTro());
	}
	
	
	
	//Set
	@Test
	public void setDiaChiTest() {
		nv.setDiaChi("hoangchodien");
		assertEquals("hoangchodien", nv.getDiaChi());
	}
	
	@Test
	public void setEmailTest() {
		nv.setEmail("lnpbao@gmail.com");	
		assertEquals("lnpbao@gmail.com", nv.getEmail());
	}

	@Test
	public void setHoTenTest() {
		nv.setHoTen("Bao");
		assertEquals("Bao", nv.getHoTen());
	}

	@Test
	public void setMaNVTest() {
		nv.setMaNV("PS002");
		assertEquals("PS002", nv.getMaNV());
	}

	@Test
	public void setMatKhauTest() {
		nv.setMatKhau("lnpbao");
		assertEquals("lnpbao", nv.getMatKhau());
	}

	@Test
	public void setSDTTest() {
		nv.setSDT("12345678");
		assertEquals("12345678", nv.getSDT());
	}

	@Test
	public void setGioiTinhTest() {
		nv.setGioiTinh(true);
		assertEquals(true, nv.isGioiTinh());
	}

	@Test
	public void setVaiTroTest() {
		nv.setVaiTro(false);
		assertEquals(false, nv.isVaiTro());
	}
	
	
}
