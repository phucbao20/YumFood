package DAO_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.fail;

import java.sql.SQLTransactionRollbackException;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DAO.SanPhamDAO;
import Entity.SanPham;

public class SanPhamDAOTest
{
	private SanPhamDAO dao;
	private SanPham sanpham;
	@BeforeClass
	public void beforeClass()
	{
		dao = new SanPhamDAO();
	}
	
	@BeforeMethod
	public void setUp()
	{
		sanpham = new SanPham();
	}
	
	@AfterMethod
	public void tearDown()
	{
		sanpham = null;
	}
	
	@AfterClass
	public void afterClass()
	{
		dao = null;
	}
	
	@Test
	public void Test_SanPham_Insert_True()
	{
		try {
			String maSP = "BT06";
			sanpham = new SanPham(maSP,"Bánh chán trộn", 10000, "Chán thì không trộn", "test.png",2);
			dao.insert(sanpham);
			sanpham = dao.SelectByID(maSP);
			AssertJUnit.assertEquals(sanpham.getMaSP(), maSP);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void Test_SanPham_Insert_False()
	{
		try {
			sanpham = new SanPham();
			if(sanpham.getMaSP().isEmpty())
			{
				throw new NullPointerException("Mã sản phẩm không được để trống");
			}
			else if(sanpham.getTenSP().isEmpty())
			{
				throw new NullPointerException("Tên sản phẩm không được để trống");
			}
			else if(sanpham.getGia() == 0)
			{
				throw new NullPointerException("Giá sản phẩm không được để trống");
			}
			else if(sanpham.getHinh().isEmpty())
			{
				throw new NullPointerException("Hình ảnh sản phẩm không được để trống");
			}
			else if(sanpham.getmaLoai() == 0)
			{
				throw new NullPointerException("Mã loại sản phẩm không được để trống");
			}
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void Test_SanPham_Delete_True()
	{
		String maSP = "BT05";
		sanpham = dao.SelectByID(maSP);
		if(sanpham != null)
		{
			try {
				dao.delete(maSP);
				assertNull(dao.SelectByID(maSP));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Test(expectedExceptions = NullPointerException.class)
	public void Test_SanPham_Delete_False()
	{
		String maSP = "BT000";
		sanpham = dao.SelectByID(maSP);
		if(sanpham == null)
		{
			throw new NullPointerException("Mã sản phẩm không tồn tại");
		}
	}

	@Test
	public void Test_SanPham_Update_True()
	{
		String maSP = "BT04";
		sanpham = dao.SelectByID(maSP);
		if(sanpham != null)
		{
			try {
				String tenSP = "Bánh hết chán trộn";
				double giaSP = 10000;
				String moTa = "Không có mô tả gì hết á";
				String hinhAnh = "test.png";
				int maLoai = 1;
				sanpham = new SanPham(maSP, tenSP, giaSP, moTa, hinhAnh, maLoai);
				dao.update(sanpham);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("Cập nhật dữ liệu thất bại");
			}
		}
	}
	@Test
	public void Test_SanPham_Update_False()
	{
		String maSP = "BT04";
		sanpham = dao.SelectByID(maSP);
		if(sanpham != null)
		{
			try {
				sanpham = new SanPham(maSP,"",0,"","",0);
				dao.update(sanpham);
				fail("Cập nhật dữ liệu thất bại");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Test
	public void Test_SanPham_Select()
	{
		try 
		{
			List<SanPham> list = dao.selectAll();
			if(list == null)
			fail("Truy suất thất bại !!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
