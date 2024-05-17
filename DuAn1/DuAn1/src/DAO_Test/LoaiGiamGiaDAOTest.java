package DAO_Test;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.fail;

import java.sql.Date;
import java.util.List;

import DAO.LoaiGiamGiaDAO;
import Entity.LoaiGiamGia;

public class LoaiGiamGiaDAOTest {
	LoaiGiamGia lgg;
	LoaiGiamGiaDAO lggDAO = new LoaiGiamGiaDAO();
	
  @Test
  public void deleteTest() {
	String MaGG = "BR012";
    lgg = lggDAO.SelectByID(MaGG);
    if(MaGG != null) {
    	try {
  		  lggDAO.delete(MaGG);
  		  assertNull(lggDAO.SelectByID(MaGG));
  	} catch (Exception e) {
  		// TODO: handle exception
  		e.printStackTrace();
  	}
    }
  }

  @Test
  public void insertTest() {
	  try {
		  Date ngayBD = new Date(2024, 14, 12);
		  Date ngayKT = new Date(2024, 14, 12);
		  lgg = new LoaiGiamGia("BR012","Hà Tấn Hiếu", ngayBD, ngayKT, 20000 );
		  lggDAO.insert(lgg);
		  lgg = lggDAO.SelectByID("BR012");
		  assertEquals(lgg.getMaGG(), "BR012");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
  }

  @Test
  public void selectAllTest() {
	  try {
		List<LoaiGiamGia> list = lggDAO.selectAll();
		if(list == null) {
			fail("truy xuất thất bại");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
  }

  @Test
  public void updateTest() {
    String MaGG = "BR012";
    lgg = lggDAO.SelectByID(MaGG);
    if(lgg != null) {
    	try {
			String TenCT = "Phan Xuan Mai";
			Date ngayBD = new Date(2024, 06, 19);
			Date ngayKT = new Date(2024, 9, 04);
			int giaTri = 30000;
			lgg = new LoaiGiamGia(MaGG, TenCT, ngayBD, ngayKT, giaTri);
			lggDAO.update(lgg);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
  }
}
