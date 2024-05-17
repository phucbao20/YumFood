package DAO_Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.fail;
import java.util.List;
import org.testng.annotations.Test;
import DAO.LoaiHangHoaDAO;
import Entity.LoaiHangHoa;

public class LoaiHangHoaDAOTest {
	LoaiHangHoaDAO lhhDAO = new LoaiHangHoaDAO();
	LoaiHangHoa lhh;


	@Test
	public void insertTest() {
		try {
			lhh = new LoaiHangHoa(1, "Test");
			lhhDAO.insert(lhh);
			lhh = lhhDAO.SelectByID(1);
			assertEquals(lhh.getID(), 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void deleteTest() {
		int ID = 1;
		lhh = lhhDAO.SelectByID(ID);
		if (ID != 0) {
			try {
				lhhDAO.delete(ID);
				assertNull(lhhDAO.SelectByID(ID));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void selectAllTest() {
		try {
			List<LoaiHangHoa> list = lhhDAO.selectAll();
			if (list == null) {
				fail("false nha bé");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 @Test
	  public void updateTest() {
	    int ID = 1;
	    lhh = lhhDAO.SelectByID(ID);
	    if(ID != 0) {
	    	try {
				String ten_HangHoa = "Bánh Gấu";
				lhh = new LoaiHangHoa(ID, ten_HangHoa);
				lhhDAO.update(lhh);
			} catch (Exception e) {
				e.printStackTrace();			
			}
	    }
	  }
 
}
