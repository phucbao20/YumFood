package Entity_Test;

import org.testng.annotations.Test;

import Entity.HoaDonChiTiet;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class HoaDonChiTietTest {
	HoaDonChiTiet hdct;
  @BeforeClass
  public void beforeClass() {
	  hdct = new HoaDonChiTiet(1, 2, "BA02", 10, 20000, "alo");
  }

  @AfterClass
  public void afterClass() {
	  hdct = null;
  }
  @Test
  public void HoaDonChiTietTest() {
	  HoaDonChiTiet hdct= new HoaDonChiTiet();
  }

  @Test
  public void HoaDonChiTietTestintintStringintdoubleString() {
	  hdct = new HoaDonChiTiet(1, 2, "BA02", 10, 20000, "alo");
  }

  @Test
  public void getGhiChuTest() {
	  assertEquals("alo", hdct.getGhiChu());
	  
  }

  @Test
  public void getGiaTest() {
	  assertEquals(20000, hdct.getGia(),Double.MIN_VALUE);
  }

  @Test
  public void getMaHDTest() {
	  assertEquals(2, hdct.getMaHD());
  }

  @Test
  public void getMaHDCTTest() {
	  assertEquals(1, hdct.getMaHDCT());
  }

  @Test
  public void getMaSPTest() {
	  assertEquals("BA02", hdct.getMaSP());
  }

  @Test
  public void getSoLuongTest() {
	  assertEquals(10, hdct.getSoLuong());
  }

  @Test
  public void setGhiChuTest() {
	  hdct.setGhiChu("helo");
	  assertEquals("helo", hdct.getGhiChu());
  }

  @Test
  public void setGiaTest() {
	  hdct.setGia(10000);
	  assertEquals(10000, hdct.getGia(),Double.MIN_VALUE);
  }

  @Test
  public void setMaHDTest() {
    hdct.setMaHD(3);
    assertEquals(3, hdct.getMaHD());
  }

  @Test
  public void setMaHDCTTest() {
	  hdct.setMaHDCT(5);
	  assertEquals(5, hdct.getMaHDCT());
  }

  @Test
  public void setMaSPTest() {
	  hdct.setMaSP("CG03");
	  assertEquals("CG03", hdct.getMaSP());
  }

  @Test
  public void setSoLuongTest() {
	  hdct.setSoLuong(50);
	  assertEquals(50, hdct.getSoLuong());
  }
}
