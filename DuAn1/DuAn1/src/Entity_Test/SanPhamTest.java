package Entity_Test;

import org.testng.annotations.Test;

import Entity.SanPham;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class SanPhamTest {
	SanPham sp;
  @BeforeClass
  public void beforeClass() {
	  sp = new SanPham("BA01", "Bánh su kem", 10000, "aloalo", "alo.jsp", 1);
  }

  @AfterClass
  public void afterClass() {
	  sp = null;
  }


  @Test
  public void SanPhamTest() {
	  SanPham sp1 = new SanPham();
  }

  @Test
  public void SanPhamTestStringStringdoubleStringStringint() {
	  SanPham sp2 = new SanPham("CG01", "Chân gà", 20000, "aloalo", "changa.jsp", 2);
  }

  @Test
  public void getGiaTest() {
	  assertEquals(10000, sp.getGia(), Double.MIN_VALUE);
  }

  @Test
  public void getHinhTest() {
	  assertEquals("alo.jsp", sp.getHinh());
  }

  @Test
  public void getMaSPTest() {
	  assertEquals("BA01", sp.getMaSP());
  }

  @Test
  public void getMoTaTest() {
	  assertEquals("aloalo", sp.getMoTa());
  }

  @Test
  public void getTenSPTest() {
	  assertEquals("Bánh su kem", sp.getTenSP());
  }

  @Test
  public void getmaLoaiTest() {
	  assertEquals(1, sp.getmaLoai());
  }

  @Test
  public void setGiaTest() {
	  sp.setGia(30000);
	  assertEquals(30000, sp.getGia(), Double.MIN_VALUE);
  }

  @Test
  public void setHinhTest() {
	  sp.setHinh("test.jsp");
	  assertEquals("test.jsp", sp.getHinh());
  }

  @Test
  public void setMaSPTest() {
	  sp.setMaSP("CG02");
	  assertEquals("CG02", sp.getMaSP());
  }

  @Test
  public void setMoTaTest() {
	  sp.setMoTa("aloalo");
	  assertEquals("aloalo", sp.getMoTa());
  }

  @Test
  public void setTenSPTest() {
	  sp.setTenSP("Bánh chán");
	  assertEquals("Bánh chán", sp.getTenSP());
  }

  @Test
  public void setmaLoaiTest() {
	  sp.setmaLoai(10);
	  assertEquals(10, sp.getmaLoai());
  }
}
