package Entity_Test;

import org.testng.annotations.Test;

import Entity.LoaiGiamGia;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoaiGiamGiaTest {
	LoaiGiamGia lgg;
  @BeforeClass
  public void beforeClass() {
	  lgg = new LoaiGiamGia("TET2024", "Tết 2024", new Date(), new Date(), 5);
  }

  @AfterClass
  public void afterClass() {
	  lgg = null;
  }


  @Test
  public void LoaiGiamGiaTest() {
	  LoaiGiamGia lgg1 = new LoaiGiamGia();
  }

  @Test
  public void LoaiGiamGiaTestStringStringDateDateint() {
	  LoaiGiamGia lgg2 = new LoaiGiamGia("30/4 - 1/5", "Lễ 30/4 - 1/5", new Date(), new Date(), 3);
  }

  @Test
  public void getGiaTriTest() {
	  assertEquals(5, lgg.getGiaTri());
  }

  @Test
  public void getMaGGTest() {
	  assertEquals("TET2024", lgg.getMaGG());
  }

  @Test
  public void getNgayBDTest() {
	Assert.assertTrue(new Date().getTime() - lgg.getNgayBD().getTime() < 100);
  }

  @Test
  public void getNgayKTTest() {
	  Assert.assertTrue(new Date().getTime() - lgg.getNgayKT().getTime() < 100);
  }

  @Test
  public void getTenCTTest() {
	  assertEquals("Tết 2024", lgg.getTenCT());
  }

  @Test
  public void setGiaTriTest() {
	  lgg.setGiaTri(4);
	  assertEquals(4, lgg.getGiaTri());
  }

  @Test
  public void setMaGGTest() {
	  lgg.setMaGG("GTHV2024");
	  assertEquals("GTHV2024", lgg.getMaGG());
  }

  @Test
  public void setNgayBDTest() {
//	  String date_s = "25-10-2004 00:00:00.0"; 
//	  SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
//	  Date date = dt.parse(date_s); 
//	  SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
	  lgg.setNgayBD(new Date());
	  Assert.assertTrue(new Date().getTime() - lgg.getNgayBD().getTime() < 100);
  }

  @Test
  public void setNgayKTTest() {
	  lgg.setNgayKT(new Date());
	  Assert.assertTrue(new Date().getTime() - lgg.getNgayKT().getTime() < 100);
  }

  @Test
  public void setTenCTTest() {
	  lgg.setTenCT("Lễ 30-4 và 1-5");
	  assertEquals("Lễ 30-4 và 1-5", lgg.getTenCT());
  }
}
