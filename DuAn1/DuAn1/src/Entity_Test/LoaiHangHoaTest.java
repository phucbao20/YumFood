package Entity_Test;

import org.testng.annotations.Test;

import Entity.LoaiHangHoa;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class LoaiHangHoaTest {
	LoaiHangHoa lhh;
  @BeforeClass
  public void beforeClass() {
	  lhh = new LoaiHangHoa(1, "Trà");
  }

  @AfterClass
  public void afterClass() {
	  lhh = null;
  }


  @Test
  public void LoaiHangHoaTest() {
	  LoaiHangHoa lhh1 = new LoaiHangHoa();
  }

  @Test
  public void LoaiHangHoaTestintString() {
	  LoaiHangHoa lhh2 = new LoaiHangHoa(3, "Mì");
  }

  @Test
  public void getIDTest() {
	  assertEquals(1, lhh.getID());
  }

  @Test
  public void getTen_HangHoaTest() {
	  assertEquals("Trà", lhh.getTen_HangHoa());
  }

  @Test
  public void setIDTest() {
	  lhh.setID(12);
	  assertEquals(12, lhh.getID());
  }

  @Test
  public void setTen_HangHoaTest() {
	  lhh.setTen_HangHoa("Bánh");;
	  assertEquals("Bánh", lhh.getTen_HangHoa());
  }
}
