package UI;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class TestPDF {

    public static void main(String[] args) {
        // 1 : create file pdf
        // 2 : create document Object
        // 3 : get PDF writer instance
        // 4 : open document
        // 5 : add content 
        // 6 : close document 
        try {
            String file_name = "D:\\FPT Polytechnic\\Fall2023\\PRO1041 - DuAn1\\DanhSachHoaDon\\HD2.pdf";
            Document dc = new Document();
            PdfWriter.getInstance(dc, new FileOutputStream(file_name));
            dc.open();

            Paragraph pg = new Paragraph();
            pg.setAlignment(Element.ALIGN_CENTER);

            Font font = new Font();
            font.setSize(16); // kich thuoc chu : 16
            font.setStyle(Font.BOLD); // in dam
            font.setColor(BaseColor.RED); // mau` do
            // Chunk la` dai dien cho Paragraph co dinh dang van bang : mau` sac, kich thuoc,...
            Chunk chunk = new Chunk("YUM FOOD\n\n", font);
            pg.add(chunk);
            dc.add(pg);

            Paragraph paragraph = new Paragraph();

            Font font1 = new Font();
            font1.setSize(12);

            Font font2 = new Font();
            font2.setSize(12);

            Chunk chunk1 = new Chunk("Ma HD : ", font1);
            Chunk chunk2 = new Chunk("Ngay Tao : " + " 2023-12-11 12:24:21", font2);

            paragraph.add(chunk1);
            // Thêm khoảng trắng giữa hai Chunk để chúng ở cách xa nhau
            paragraph.add(new Phrase(new Chunk("                             ")));
            paragraph.add(chunk2);

            // Đặt căn lề để chunk1 ở bên trái, chunk2 ở bên phải
            paragraph.setAlignment(Element.ALIGN_LEFT | Element.ALIGN_RIGHT);

            dc.add(paragraph);
//            Paragraph text = new Paragraph();
//            Chunk mahd = new Chunk("Hoa Don : 1");
//            Chunk ngaytao = new Chunk("Ngay tao : 1");
//
//            // Thêm khoảng trắng giữa hai Chunk để chúng ở cách xa nhau
//            text.add(mahd);
//            text.add(new Phrase(new Chunk("                  ")));
//            text.add(ngaytao);
//            text.setAlignment(Element.ALIGN_LEFT | Element.ALIGN_RIGHT);
//            dc.add(text);
            dc.add(new Paragraph(""));
            // add Table 1 : 
            PdfPTable table_1 = new PdfPTable(2);
            table_1.setWidthPercentage(100);
            table_1.getDefaultCell().setBorder(0);
            table_1.setHeaderRows(1); // dong` tieu de la` 1 dong`

            table_1.addCell("Ho ten KH :");
            table_1.addCell("Nguyen Van A");
            table_1.addCell("SDT KH :");
            table_1.addCell("0215152");
            table_1.addCell("Ho ten NV :");
            table_1.addCell("TRAN VAN A ");
            table_1.addCell("SDT NV :");
            table_1.addCell("05451223313 \n\n");

            dc.add(table_1);

            // add Table : 
            PdfPTable pt = new PdfPTable(5); // so columns name 
            pt.setWidthPercentage(100); // tỷ lệ chiều rộng của bảng so với trang là 100%
            pt.getDefaultCell().setBorder(0); // Loai bo duong vien cua bang
//            pt.setSpacingBefore(15f);
//            pt.setSpacingAfter(10f);

            // set do rong cho cot 
            float[] columns_with = {10f, 35f, 15f, 15f, 15f}; // tinh theo pham tram
            pt.setWidths(columns_with);

            PdfPCell c1 = new PdfPCell(new Phrase("STT")); // tieu de cot
            c1.setBorder(0);// Loai bo duong vien cua bang
//            c1.setHorizontalAlignment(Element.ALIGN_CENTER); // can giua~ cot
            pt.addCell(c1);

            PdfPCell c2 = new PdfPCell(new Phrase("San Pham"));
            c2.setBorder(0);// Loai bo duong vien cua bang
            pt.addCell(c2);

            PdfPCell c3 = new PdfPCell(new Phrase("So Luong"));
            c3.setBorder(0);// Loai bo duong vien cua bang
            pt.addCell(c3);

            PdfPCell c4 = new PdfPCell(new Phrase("Gia"));
            c4.setBorder(0);// Loai bo duong vien cua bang
            pt.addCell(c4);

            PdfPCell c5 = new PdfPCell(new Phrase("Thanh tien"));
            c5.setBorder(0);// Loai bo duong vien cua bang
            pt.addCell(c5);
            pt.setHeaderRows(1);
            // vi` co 2 cot : nen 2 dòng dau tien vao` 1 hàng
            // neu thieu thi` khong hien thi bang 
            pt.addCell("1");
            pt.addCell("2");
            pt.addCell("3");
            pt.addCell("20000 vnd");
            pt.addCell("100000 vnd");
            PdfPCell mergecell = new PdfPCell(new Paragraph("Hello World"));
            mergecell.setColspan(5);
            mergecell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            mergecell.setBorder(0);
            pt.addCell(mergecell);

            pt.addCell("1");
            pt.addCell("2");
            pt.addCell("3");
            pt.addCell("4");
            pt.addCell("5");
            pt.addCell("1");
            pt.addCell("2");
            pt.addCell("3");
            pt.addCell("4");
            pt.addCell("5");
            dc.add(pt);

            // add image pdf : 
//            dc.add(Image.getInstance("D:\\FPT Polytechnic\\Fall2023\\PRO1041 - DuAn1\\Duan1\\DuAn1\\logos\\banhbaokimsa.png"));
            // 
            dc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
