package Entity_Test;

import org.testng.annotations.Test;

import Entity.HoaDon;

import org.testng.annotations.BeforeClass;

//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.testng.annotations.AfterClass;

public class HoaDonTest {
	HoaDon hd;
  @BeforeClass
  public void beforeClass() {
	  
	  hd = new HoaDon(1, "Bao", "1234567891", new Date(), 10, "PS01", "aloalo");
  }

  @AfterClass
  public void afterClass() {
	  hd= null;
  }
  @Test
  public void HoaDonTest() {
   HoaDon hd = new HoaDon();
  }

  @Test
  public void getGhiChuTest() {
    assertEquals("aloalo", hd.getGhiChu());
  }

  @Test
  public void getGiatriggTest() {
    assertEquals(10, hd.getGiatrigg());
  }

  @Test
  public void getMaHDTest() {
   assertEquals(1, hd.getMaHD());
  }

  @Test
  public void getMaNVTest() {
	  assertEquals("PS01", hd.getMaNV());
  }

  @Test
  public void getNgayTaoTest() {
	  assertTrue(new Date().getTime() - hd.getNgayTao().getTime() < 100);
  }

  @Test
  public void getSDT_KHTest() {
    assertEquals("1234567891", hd.getSDT_KH());
  }

  @Test
  public void getTenKHTest() {
    assertEquals("Bao", hd.getTenKH());
  }

  
  
  @Test
  public void setGhiChuTest() {
	  hd.setGhiChu("baobao");
	  assertEquals("baobao", hd.getGhiChu());
  }

  @Test
  public void setGiatriggTest() {
	  hd.setGiatrigg(20);
	  assertEquals(20, hd.getGiatrigg());
  }

  @Test
  public void setMaHDTest() {
    hd.setMaHD(2);
    assertEquals(2, hd.getMaHD());
    
  }

  @Test
  public void setMaNVTest() {
    hd.setMaNV("PS1123");
    assertEquals("PS1123", hd.getMaNV());
  }

  @Test
  public void setNgayTaoTest() {
    hd.setNgayTao(new Date());
    assertTrue(new Date().getTime() - hd.getNgayTao().getTime() < 100);
  }

  @Test
  public void setSDT_KHTest() {
	  hd.setSDT_KH("123456789");
	  assertEquals("123456789", hd.getSDT_KH());
  }

  @Test
  public void setTenKHTest() {
	  hd.setTenKH("Huy");
	  assertEquals("Huy", hd.getTenKH());
  }
}
