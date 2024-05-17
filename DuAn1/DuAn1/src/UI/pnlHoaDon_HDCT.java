package UI;

import DAO.HoaDonChiTietDAO;
import DAO.HoaDonDAO;
import DAO.LoaiGiamGiaDAO;
import DAO.SanPhamDAO;
import Entity.HoaDon;
import Entity.HoaDonChiTiet;
import Entity.LoaiGiamGia;
import Entity.NhanVien;
import Entity.SanPham;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XDate;
import Utils.XImage;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class pnlHoaDon_HDCT extends javax.swing.JPanel {

    public pnlHoaDon_HDCT() {
        initComponents();
        initialize();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChiTietHoaDon = new com.k33ptoo.components.KGradientPanel();
        tabsHoaDon = new javax.swing.JTabbedPane();
        pnlHoaDonChiTiet1 = new javax.swing.JPanel();
        lblMaHD1 = new javax.swing.JLabel();
        txtMahd1 = new javax.swing.JTextField();
        lblhotenKH1 = new javax.swing.JLabel();
        txtHotenKH1 = new javax.swing.JTextField();
        lblsdtKH1 = new javax.swing.JLabel();
        txtsdtKH1 = new javax.swing.JTextField();
        lblHotenNV1 = new javax.swing.JLabel();
        txtHotenNV1 = new javax.swing.JTextField();
        lblSdtNV1 = new javax.swing.JLabel();
        txtsdtNV1 = new javax.swing.JTextField();
        pnlDSSPHD1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldsspHd1 = new javax.swing.JTable();
        lblTongTien = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        lblGiamGia = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        lblGhiChu_GG = new javax.swing.JLabel();
        txtGhiChu_GG = new javax.swing.JTextField();
        lblTongtienThanhtoan = new javax.swing.JLabel();
        txtTongTienThanhToan = new javax.swing.JTextField();
        lblKhachDua = new javax.swing.JLabel();
        txtKhachDua = new javax.swing.JTextField();
        lblTraLai = new javax.swing.JLabel();
        txtTraLai = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        pnlSanPham = new javax.swing.JPanel();
        lblHinhAnh = new javax.swing.JLabel();
        lblTenSanPham = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        lblGia = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        lblGhiChu = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnThemSP = new com.k33ptoo.components.KButton();
        btnFirstSP = new com.k33ptoo.components.KButton();
        btnPrevSP = new com.k33ptoo.components.KButton();
        btnNextSP = new com.k33ptoo.components.KButton();
        btnLastSP = new com.k33ptoo.components.KButton();
        pnlDSSP = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbldssp = new javax.swing.JTable();
        lblNgayXuatHD = new javax.swing.JLabel();
        txtDateTime = new com.github.lgooddatepicker.components.DateTimePicker();
        btnXoaHDCT = new com.k33ptoo.components.KButton();
        btnXuatHoaDon = new com.k33ptoo.components.KButton();
        pnlHoaDon = new javax.swing.JPanel();
        pnlDSHD = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        lblhotenKH_HD = new javax.swing.JLabel();
        txtHotenKH_HD = new javax.swing.JTextField();
        lblsdtKH_HD = new javax.swing.JLabel();
        txtsdtKH_HD = new javax.swing.JTextField();
        lblNgaytao_HD = new javax.swing.JLabel();
        txtNgayTao_HD = new javax.swing.JTextField();
        btnThem_HD = new javax.swing.JButton();
        btnFirst_HD = new javax.swing.JButton();
        btnPrev_HD = new javax.swing.JButton();
        btnNext_HD = new javax.swing.JButton();
        btnLast_HD = new javax.swing.JButton();
        btnXoa_HD = new javax.swing.JButton();
        btnSua_HD = new javax.swing.JButton();
        btnMoi_HD = new javax.swing.JButton();

        pnlChiTietHoaDon.setkEndColor(new Color(222,244,222,200));
        pnlChiTietHoaDon.setkStartColor(new Color(255,255,255,200));

        tabsHoaDon.setPreferredSize(new java.awt.Dimension(200, 100));

        pnlHoaDonChiTiet1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMaHD1.setText("Ma Hoa Don : ");
        lblMaHD1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtMahd1.setEnabled(false);

        lblhotenKH1.setText("Ho va ten Khach Hang       :");
        lblhotenKH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblsdtKH1.setText("So dien thoai Khach Hang :");
        lblsdtKH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblHotenNV1.setText("Ho va ten Nhan Vien          :");
        lblHotenNV1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtHotenNV1.setEnabled(false);

        lblSdtNV1.setText("So dien thoai Nhan Vien    :");
        lblSdtNV1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtsdtNV1.setEnabled(false);

        pnlDSSPHD1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sach San pham trong hoa don"));

        tbldsspHd1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Ten San Pham", "So Luong", "Gia", "Thanh Tien", "Ghi Chu"
            }
        ));
        tbldsspHd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbldsspHd1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbldsspHd1);

        javax.swing.GroupLayout pnlDSSPHD1Layout = new javax.swing.GroupLayout(pnlDSSPHD1);
        pnlDSSPHD1.setLayout(pnlDSSPHD1Layout);
        pnlDSSPHD1Layout.setHorizontalGroup(
            pnlDSSPHD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlDSSPHD1Layout.setVerticalGroup(
            pnlDSSPHD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );

        lblTongTien.setText("Tong Tien                     :");
        lblTongTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblGiamGia.setText("Giam gia                       :");
        lblGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtGiamGia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblGhiChu_GG.setText("Ghi Chu                         :");
        lblGhiChu_GG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtGhiChu_GG.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblTongtienThanhtoan.setText("Tong Tien Thanh Toan  :");
        lblTongtienThanhtoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTongTienThanhToan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblKhachDua.setText("Khach Dua                    :");
        lblKhachDua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtKhachDua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtKhachDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKhachDuaActionPerformed(evt);
            }
        });

        lblTraLai.setText("Tra Lai                           :");
        lblTraLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTraLai.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder("San Pham"));

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTenSanPham.setText("Ten San Pham");

        txtTenSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenSanPhamKeyReleased(evt);
            }
        });

        lblSoLuong.setText("So Luong");

        lblGia.setText("Gia");

        lblGhiChu.setText("Ghi chu");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane3.setViewportView(txtGhiChu);

        btnThemSP.setText("Them");
        btnThemSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnFirstSP.setText("|<");
        btnFirstSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirstSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstSPActionPerformed(evt);
            }
        });

        btnPrevSP.setText("<<");
        btnPrevSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevSPActionPerformed(evt);
            }
        });

        btnNextSP.setText(">>");
        btnNextSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSPActionPerformed(evt);
            }
        });

        btnLastSP.setText(">|");
        btnLastSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFirstSP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevSP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextSP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLastSP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addComponent(lblTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addComponent(lblTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirstSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDSSP.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sach San Pham"));

        tbldssp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Ten San Pham", "Gia"
            }
        ));
        tbldssp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldsspMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbldssp);

        javax.swing.GroupLayout pnlDSSPLayout = new javax.swing.GroupLayout(pnlDSSP);
        pnlDSSP.setLayout(pnlDSSPLayout);
        pnlDSSPLayout.setHorizontalGroup(
            pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSSPLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDSSPLayout.setVerticalGroup(
            pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSSPLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        lblNgayXuatHD.setText("Ngay Xuat Hoa Don       :");
        lblNgayXuatHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnXoaHDCT.setText("Xoa");
        btnXoaHDCT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaHDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHDCTActionPerformed(evt);
            }
        });

        btnXuatHoaDon.setText("Xuat Hoa Don");
        btnXuatHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHoaDonChiTiet1Layout = new javax.swing.GroupLayout(pnlHoaDonChiTiet1);
        pnlHoaDonChiTiet1.setLayout(pnlHoaDonChiTiet1Layout);
        pnlHoaDonChiTiet1Layout.setHorizontalGroup(
            pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                        .addComponent(lblhotenKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                .addComponent(lblMaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMahd1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(txtHotenKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDSSPHD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblsdtKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHotenNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSdtNV1))
                                        .addGap(143, 143, 143)
                                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtsdtKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHotenNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtsdtNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnXoaHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                                    .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lblGhiChu_GG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblTongtienThanhtoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblKhachDua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblTraLai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtTongTienThanhToan)
                                                        .addComponent(txtGhiChu_GG, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(8, 8, 8))
                                    .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jSeparator3)
                                        .addGap(230, 230, 230)))))
                        .addGap(10, 10, 10)))
                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblNgayXuatHD)
                        .addGap(26, 26, 26)
                        .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonChiTiet1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnlSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlDSSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95))))
        );
        pnlHoaDonChiTiet1Layout.setVerticalGroup(
            pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMahd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNgayXuatHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblhotenKH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHotenKH1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblsdtKH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsdtKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHotenNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHotenNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSdtNV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsdtNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDSSPHD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTongTien)
                                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGiamGia)
                                    .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnXoaHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGhiChu_GG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGhiChu_GG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTienThanhToan)
                            .addComponent(lblTongtienThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonChiTiet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHoaDonChiTiet1Layout.createSequentialGroup()
                        .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlDSSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        tabsHoaDon.addTab("Hoa Don Chi Tiet", pnlHoaDonChiTiet1);

        pnlDSHD.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sach Hoa Don"));
        pnlDSHD.setPreferredSize(new java.awt.Dimension(1200, 411));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ma Hoa Don", "Ten Khach Hang", "Sdt Khach Hang", "Ngay Tao", "Tong Tien", "Ma Nhan Vien"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblHoaDon);

        javax.swing.GroupLayout pnlDSHDLayout = new javax.swing.GroupLayout(pnlDSHD);
        pnlDSHD.setLayout(pnlDSHDLayout);
        pnlDSHDLayout.setHorizontalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5))
        );
        pnlDSHDLayout.setVerticalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSHDLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        lblhotenKH_HD.setText("Ho va ten Khach Hang       :");
        lblhotenKH_HD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblsdtKH_HD.setText("So dien thoai Khach Hang  :");
        lblsdtKH_HD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblNgaytao_HD.setText("Ngay Tao Hoa Don            :");
        lblNgaytao_HD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnThem_HD.setText("Them");
        btnThem_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_HDActionPerformed(evt);
            }
        });

        btnFirst_HD.setText("|<");
        btnFirst_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_HDActionPerformed(evt);
            }
        });

        btnPrev_HD.setText("<<");
        btnPrev_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrev_HDActionPerformed(evt);
            }
        });

        btnNext_HD.setText(">>");
        btnNext_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_HDActionPerformed(evt);
            }
        });

        btnLast_HD.setText(">|");
        btnLast_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_HDActionPerformed(evt);
            }
        });

        btnXoa_HD.setText("Xoa");
        btnXoa_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_HDActionPerformed(evt);
            }
        });

        btnSua_HD.setText("Sua");
        btnSua_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_HDActionPerformed(evt);
            }
        });

        btnMoi_HD.setText("Moi");
        btnMoi_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoi_HDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addComponent(btnThem_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnXoa_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSua_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMoi_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(btnFirst_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnPrev_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnNext_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnLast_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblsdtKH_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblhotenKH_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgaytao_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(233, 233, 233)
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtsdtKH_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHotenKH_HD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNgayTao_HD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(240, 240, 240))
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlDSHD, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHotenKH_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhotenKH_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsdtKH_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsdtKH_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayTao_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgaytao_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnFirst_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnPrev_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnNext_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnLast_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnXoa_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnSua_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnMoi_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        tabsHoaDon.addTab("Danh Sach Hoa Don", pnlHoaDon);

        javax.swing.GroupLayout pnlChiTietHoaDonLayout = new javax.swing.GroupLayout(pnlChiTietHoaDon);
        pnlChiTietHoaDon.setLayout(pnlChiTietHoaDonLayout);
        pnlChiTietHoaDonLayout.setHorizontalGroup(
            pnlChiTietHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChiTietHoaDonLayout.createSequentialGroup()
                .addComponent(tabsHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlChiTietHoaDonLayout.setVerticalGroup(
            pnlChiTietHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChiTietHoaDonLayout.createSequentialGroup()
                .addComponent(tabsHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1287, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlChiTietHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlChiTietHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbldsspHd1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldsspHd1MousePressed
        // TODO add your handling code here:
        row_hdct = tbldsspHd1.getSelectedRow();
        //        System.out.println(evt.getClickCount());
        if (evt.getClickCount() == 2) {
            update_hdct_soluong();
        }
    }//GEN-LAST:event_tbldsspHd1MousePressed

    private void txtKhachDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKhachDuaActionPerformed
        // TODO add your handling code here:
        checkThanhToan();
    }//GEN-LAST:event_txtKhachDuaActionPerformed

    private void txtTenSanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenSanPhamKeyReleased
        // TODO add your handling code here:
        find_sp();
    }//GEN-LAST:event_txtTenSanPhamKeyReleased

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        // TODO add your handling code here:
        insert_HDCT();
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnFirstSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstSPActionPerformed
        // TODO add your handling code here:
        First_SP();
    }//GEN-LAST:event_btnFirstSPActionPerformed

    private void btnPrevSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevSPActionPerformed
        // TODO add your handling code here:
        Prev_SP();
    }//GEN-LAST:event_btnPrevSPActionPerformed

    private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
        // TODO add your handling code here:
        Next_SP();
    }//GEN-LAST:event_btnNextSPActionPerformed

    private void btnLastSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastSPActionPerformed
        // TODO add your handling code here:
        Last_SP();
    }//GEN-LAST:event_btnLastSPActionPerformed

    private void tbldsspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldsspMouseClicked
        // TODO add your handling code here:

        row_sp = tbldssp.getSelectedRow();
        clickTableSP();
    }//GEN-LAST:event_tbldsspMouseClicked

    private void btnXoaHDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHDCTActionPerformed
        // TODO add your handling code here:
        delete_SP_HDCT();
    }//GEN-LAST:event_btnXoaHDCTActionPerformed

    private void btnXuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHoaDonActionPerformed
        // TODO add your handling code here:
        XuatHoaDon();
    }//GEN-LAST:event_btnXuatHoaDonActionPerformed

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        // TODO add your handling code here:
        time.stop();
        row_hd = tblHoaDon.getSelectedRow();
        //        System.out.println(row_hd);
        ClickTableHD();
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnThem_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_HDActionPerformed
        // TODO add your handling code here:
        insert_hoadon();
    }//GEN-LAST:event_btnThem_HDActionPerformed

    private void btnFirst_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_HDActionPerformed
        // TODO add your handling code here:
        First_HD();
    }//GEN-LAST:event_btnFirst_HDActionPerformed

    private void btnPrev_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrev_HDActionPerformed
        // TODO add your handling code here:
        Prev_HD();
    }//GEN-LAST:event_btnPrev_HDActionPerformed

    private void btnNext_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_HDActionPerformed
        // TODO add your handling code here:
        Next_HD();
    }//GEN-LAST:event_btnNext_HDActionPerformed

    private void btnLast_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_HDActionPerformed
        Last_HD();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLast_HDActionPerformed

    private void btnXoa_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_HDActionPerformed
        // TODO add your handling code here:
        delete_hd();
        resetForm_HD();
        time.start();
    }//GEN-LAST:event_btnXoa_HDActionPerformed

    private void btnSua_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_HDActionPerformed
        update_hd();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSua_HDActionPerformed

    private void btnMoi_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoi_HDActionPerformed
        // TODO add your handling code here:
        resetForm_HD();
        time.start();
    }//GEN-LAST:event_btnMoi_HDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnFirstSP;
    private javax.swing.JButton btnFirst_HD;
    private com.k33ptoo.components.KButton btnLastSP;
    private javax.swing.JButton btnLast_HD;
    private javax.swing.JButton btnMoi_HD;
    private com.k33ptoo.components.KButton btnNextSP;
    private javax.swing.JButton btnNext_HD;
    private com.k33ptoo.components.KButton btnPrevSP;
    private javax.swing.JButton btnPrev_HD;
    private javax.swing.JButton btnSua_HD;
    private com.k33ptoo.components.KButton btnThemSP;
    private javax.swing.JButton btnThem_HD;
    private com.k33ptoo.components.KButton btnXoaHDCT;
    private javax.swing.JButton btnXoa_HD;
    private com.k33ptoo.components.KButton btnXuatHoaDon;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblGhiChu_GG;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JLabel lblHotenNV1;
    private javax.swing.JLabel lblKhachDua;
    private javax.swing.JLabel lblMaHD1;
    private javax.swing.JLabel lblNgayXuatHD;
    private javax.swing.JLabel lblNgaytao_HD;
    private javax.swing.JLabel lblSdtNV1;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblTongtienThanhtoan;
    private javax.swing.JLabel lblTraLai;
    private javax.swing.JLabel lblhotenKH1;
    private javax.swing.JLabel lblhotenKH_HD;
    private javax.swing.JLabel lblsdtKH1;
    private javax.swing.JLabel lblsdtKH_HD;
    private com.k33ptoo.components.KGradientPanel pnlChiTietHoaDon;
    private javax.swing.JPanel pnlDSHD;
    private javax.swing.JPanel pnlDSSP;
    private javax.swing.JPanel pnlDSSPHD1;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlHoaDonChiTiet1;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JTabbedPane tabsHoaDon;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tbldssp;
    private javax.swing.JTable tbldsspHd1;
    private com.github.lgooddatepicker.components.DateTimePicker txtDateTime;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtGhiChu_GG;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtHotenKH1;
    private javax.swing.JTextField txtHotenKH_HD;
    private javax.swing.JTextField txtHotenNV1;
    private javax.swing.JTextField txtKhachDua;
    private javax.swing.JTextField txtMahd1;
    private javax.swing.JTextField txtNgayTao_HD;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTongTienThanhToan;
    private javax.swing.JTextField txtTraLai;
    private javax.swing.JTextField txtsdtKH1;
    private javax.swing.JTextField txtsdtKH_HD;
    private javax.swing.JTextField txtsdtNV1;
    // End of variables declaration//GEN-END:variables
SanPhamDAO spdao = new SanPhamDAO();
    HoaDonDAO hddao = new HoaDonDAO();
    HoaDonChiTietDAO hdctdao = new HoaDonChiTietDAO();
    LoaiGiamGiaDAO lggdao = new LoaiGiamGiaDAO();

    ImageIcon icon;
    String srImage;

    private void initialize() {
        this.FillTableSanPham();
        this.FillTableHoaDon();
        this.fill_GiamGia();
        txtTraLai.setEnabled(false);
        NgayTao();
        updateStatus_HD();
//        Auth.nv = new NhanVien("PS003", "12345", "Tống Đinh Tiên Hoàng", "2121412", "hoangtdtps30071@fpt.edu.vn", true, "Bình Thuận", true);
    }

    Timer time;

    private void NgayTao() {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        time = new Timer(1000, (ActionEvent e) -> {
            txtNgayTao_HD.setText(XDate.toString(new Date(), "yyyy-MM-dd hh:mm:ss"));
            txtDateTime.setDateTimePermissive(new Date().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime());
        });
        time.start();
        txtDateTime.setEnabled(false);
    }

    private void FillTableSanPham() {
        DefaultTableModel model = (DefaultTableModel) tbldssp.getModel();
        model.setRowCount(0);
        String tensp = txtTenSanPham.getText();
        List<SanPham> list = spdao.SelectSanPham_ByKeyword(tensp);
        System.out.println("1");
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                SanPham sp = list.get(i);
                model.addRow(new Object[]{i + 1, sp.getTenSP(), sp.getGia() + " VND"});
            }
            tbldssp.setModel(model);
        }

    }

    private void FillTableHoaDon() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        List<Object[]> list = hddao.getDANHSACH_HOADON();
        if (list != null) {
            for (Object[] row : list) {
                model.addRow(row);
            }
            tblHoaDon.setModel(model);
        }
    }

    private void fill_GiamGia() {
        Date now = new Date();
        SimpleDateFormat.getInstance().format(now);
        // getInstance() : dd/MM/yyyy
        List<Object[]> list = lggdao.getGiamGia(now);
        if (list.size() != 0) {
            Object[] row = list.get(0);
            txtGiamGia.setText(String.valueOf(row[0]) + " %");
            txtGhiChu_GG.setText(String.valueOf(row[1]));
        }
    }

    private void setFormSP(SanPham sp) {
        txtTenSanPham.setText(sp.getTenSP());
        txtGia.setText(String.valueOf(sp.getGia()) + " VND");
        txtGhiChu.setText("");
        txtSoLuong.setText("");
        if (sp.getHinh() != null) {
//            lblHinhAnh.setToolTipText(sp.getHinh());
//            lblHinhAnh.setIcon(XImage.read(sp.getHinh()));
            srImage = String.valueOf(XImage.read(sp.getHinh()));
            img(srImage);
            lblHinhAnh.setIcon(icon);
        } else {
            lblHinhAnh.setIcon(null);
        }
    }

    private SanPham getFormSP() {
        SanPham sp = new SanPham();
        sp.setTenSP(txtTenSanPham.getText());
        sp.setHinh(lblHinhAnh.getToolTipText());
        return sp;
    }

    public void img(String path) {
        ImageIcon ii = new ImageIcon(path);
        Image im = ii.getImage().getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(im);
    }
    int row_sp = -1;
    int row_hd = -1;
    int row_hdct = -1;

    private void clickTableSP() {
        String tensp = (String) tbldssp.getValueAt(this.row_sp, 1);
        SanPham sp = spdao.SelectSanPham_ByName(tensp);
//        lblHinhAnh.setIcon(icon);
        tbldssp.setRowSelectionInterval(row_sp, row_sp);
        setFormSP(sp);
        updateStatus_SP();
    }

    private void find_sp() {
        FillTableSanPham();
    }

    private void setFormHD(HoaDon hd) {
        txtHotenKH_HD.setText(hd.getTenKH());
        txtsdtKH_HD.setText(hd.getSDT_KH());
        txtNgayTao_HD.setText(XDate.toString(hd.getNgayTao(), "yyyy-MM-dd hh:mm:ss"));
        txtMahd1.setText(String.valueOf(hd.getMaHD()));
    }

    private HoaDon getFormHD() {
        LoaiGiamGia lgg = lggdao.selectBy_tenct(txtGhiChu_GG.getText());
        HoaDon hd = new HoaDon();
        hd.setMaHD((int) tblHoaDon.getValueAt(row_hd, 0));
        hd.setTenKH(txtHotenKH_HD.getText());
        hd.setSDT_KH(txtsdtKH_HD.getText());
        hd.setNgayTao(new Date());
        if (lgg == null) {
            hd.setGiatrigg(0);
        } else {
            hd.setGiatrigg((int) lgg.getGiaTri());
        }
        hd.setMaNV(Auth.nv.getMaNV()); //
        hd.setGhiChu(txtGhiChu_GG.getText());
        return hd;
    }

    private void ClickTableHD() {
        int mahd = (int) tblHoaDon.getValueAt(row_hd, 0);
//        System.out.println(mahd);
        HoaDon hd = hddao.SelectByID(mahd);
        setFormHD(hd);
//        System.out.println(hd.getNgayTao());
        txtDateTime.setDateTimePermissive(hd.getNgayTao().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime());
        HoaDonChiTiet hdct = hdctdao.SelectByID(mahd);
        setFormHDCT(hdct);
        tblHoaDon.setRowSelectionInterval(row_hd, row_hd);
        this.updateStatus_HD();
    }

    private void setFormHDCT(HoaDonChiTiet hdct) {

        fillTableHDCT();
        Fill_Inf_KH_NV();
        fill_ThanhToan();
    }

    private HoaDonChiTiet getFormHDCT() {
        SanPham sp = spdao.SelectSanPham_ByName(txtTenSanPham.getText());
        HoaDonChiTiet hdct = new HoaDonChiTiet();
        hdct.setMaHD(Integer.parseInt(txtMahd1.getText()));
        hdct.setMaSP(sp.getMaSP());
        hdct.setGhiChu(txtGhiChu.getText());
        hdct.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        hdct.setGia(sp.getGia());
        return hdct;
    }

    public static boolean checkNumber(String str) {
        // Kiểm tra xem chuỗi chỉ chứa ký tự số hay không
        // \\d : dai dien cho 1 ki tu
        // \\d+ : dai dien cho 1 hoac nhieu ki tu
        return str.matches("\\d+");
    }

    private void update_hdct_soluong() {
        int mahd = Integer.parseInt(txtMahd1.getText());
        String namesp = (String) tbldsspHd1.getValueAt(row_hdct, 1);
        SanPham sp = spdao.SelectSanPham_ByName(namesp);
        String masp = sp.getMaSP();
        HoaDonChiTiet hdct = hdctdao.selectby_MaHD_MASP(mahd, masp);
        // nhap sl muon thay doi
        String sl = MsgBox.prompt(tbldsspHd1, "Nhap so luong ma ban muon");
        if (!sl.equals("") || !sl.isEmpty()) {
            while (!checkNumber(sl)) {
                MsgBox.alert(this, "Chi duoc nhap so");
                sl = MsgBox.prompt(tbldsspHd1, "Hay Nhap lai So luong");
            }
            tbldsspHd1.setValueAt(sl, row_hdct, 2);
            hdct.setSoLuong(Integer.parseInt(String.valueOf(tbldsspHd1.getValueAt(row_hdct, 2))));
        }

//        if (!checkSL(sl)) {
//            MsgBox.alert(this, "Chi duoc nhap so");
//            sl = MsgBox.prompt(tbldsspHd1, "Hay Nhap lai So luong");
//        } else {
//            tbldsspHd1.setValueAt(sl, row_hdct, 2);
//        }
        hdctdao.update(hdct);
        this.fillTableHDCT();
        this.fill_ThanhToan();
        this.FillTableHoaDon();
    }

    private void fillTableHDCT() {
        DefaultTableModel model = (DefaultTableModel) tbldsspHd1.getModel();
        model.setRowCount(0);
        List<Object[]> list = hdctdao.getDanhSachSanPham_HoaDonChiTiet(Integer.parseInt(txtMahd1.getText()));
        for (Object[] row : list) {
            model.addRow(row);
        }
        tbldsspHd1.setModel(model);
    }

    private void Fill_Inf_KH_NV() {
        List<Object[]> list = hdctdao.getTHONGTIN_KHACHHANG_NHANVIEN(Integer.parseInt(txtMahd1.getText()));
        if (list.size() != 0) {
            Object[] row = list.get(0);
            txtHotenKH1.setText((String) row[0]);
            txtsdtKH1.setText((String) row[1]);
            txtHotenNV1.setText((String) row[2]);
            txtsdtNV1.setText((String) row[3]);
        } else {
            txtHotenKH1.setText("");
            txtsdtKH1.setText("");
            txtHotenNV1.setText("");
            txtsdtNV1.setText("");
        }
    }

    private void fill_ThanhToan() {
        List<Object[]> list = hdctdao.getThanhToan(Integer.parseInt(txtMahd1.getText()));
        HoaDon hd = hddao.SelectByID(Integer.parseInt(txtMahd1.getText()));
        if (list.size() != 0) {
            Object[] row = list.get(0);
            txtTongTien.setText(String.valueOf(row[0]) + " VND");
            // Neu co Giam gia nhung ma khong co san pham thi` hien thi. % giam gia
            if (Double.parseDouble(String.valueOf(row[1])) >= 0) {
                txtGiamGia.setText(String.valueOf(row[1]) + " VND");
            } else {
                txtGiamGia.setText(hd.getGiatrigg() + " %");
            }
            txtGhiChu_GG.setText(String.valueOf(row[2]));
            txtTongTienThanhToan.setText(String.valueOf(row[3] + " VND"));
        } else {
            txtTongTien.setText("");
            txtGiamGia.setText("");
            txtGhiChu_GG.setText("");
            txtTongTienThanhToan.setText("");
        }
    }

    private void resetForm_HD() {
        row_hd = -1;
        row_hdct = -1;
        row_sp = -1;
        HoaDon hd = new HoaDon();
//        hd.setMaHD(0);
        setFormHD(hd);
        this.Fill_Inf_KH_NV();
        this.fill_ThanhToan();
        this.fillTableHDCT();
        this.fill_GiamGia();
        updateStatus_HD();
    }

    public void insert_hoadon() {
        if (Auth.nv != null) {
            if (checkNull_HD()) {
                HoaDon hd = getFormHD();
                hddao.insert(hd);
                FillTableHoaDon();
                MsgBox.alert(this, "Them Hoa Don Thanh Cong");
            }
        } else {
            MsgBox.alert(this, "Ban chua dang nhap");
        }

    }

    public void update_hd() {
        if (Auth.nv != null) {
            if (checkNull_HD()) {
                HoaDon hd = getFormHD();
                hddao.update(hd);
                FillTableHoaDon();
                MsgBox.alert(this, "Chinh Sua Hoa Don Thanh Cong");
            }
        } else {
            MsgBox.alert(this, "Ban chua dang nhap");
        }
    }

    public void delete_hd() {
        if (Auth.isManager()) {
            if (!txtMahd1.getText().equals("0")) {
                hdctdao.delete_mahd(Integer.parseInt(txtMahd1.getText()));
                hddao.delete(Integer.parseInt(txtMahd1.getText()));
                FillTableHoaDon();
                resetForm_HD();
                MsgBox.alert(this, "Xoa Hoa Don Thanh Cong");
            }
        } else {
            MsgBox.alert(this, "Ban khong co quyen xoa hoa don !");
        }
    }

    public boolean checkNull_HD() {
        if (txtHotenKH_HD.getText().equals("")) {
            MsgBox.alert(this, "Ban chua nhap ten Khach Hang");
            return false;
        }
        return true;
    }

    public void insert_HDCT() {
        if (Auth.nv != null) {
            if (checkNull()) {
                SanPham sp = spdao.SelectSanPham_ByName(txtTenSanPham.getText());
                int mahd = (int) tblHoaDon.getValueAt(row_hd, 0);
                String masp = sp.getMaSP();
                HoaDonChiTiet hdct = hdctdao.selectby_MaHD_MASP(mahd, masp);
                // kiem tra neu co sp nay` trong hoa don hay khong
                // neu co thi` update sl va` ghi chu
                // neu khong thi them moi
                if (hdct != null) {
                    if (hdct.getMaHD() == mahd) {
                        if (hdct.getMaSP().equals(masp)) {
                            HoaDonChiTiet hdct_sp = getFormHDCT();
                            hdct.setSoLuong(hdct_sp.getSoLuong());
                            hdctdao.update_SoLuong_SanPham(hdct);
                            fillTableHDCT();
                            fill_ThanhToan();
                            FillTableHoaDon();
                            MsgBox.alert(this, "Them San Pham Thanh Cong !!");
                        }
                    }
                } else {
                    HoaDonChiTiet hdct_1 = getFormHDCT();
                    hdctdao.insert(hdct_1);
                    fillTableHDCT();
                    fill_ThanhToan();
                    FillTableHoaDon();
                    MsgBox.alert(this, "Them San Pham Thanh Cong !!");
                }

            }
        }

    }

    public boolean checkNull() {
        if (txtMahd1.getText().equals("") || txtMahd1.getText().equals("0")) {
            MsgBox.alert(this, "Ban chua chon Hoa Don!");
            return false;
        } else if (txtTenSanPham.getText().equals("")) {
            MsgBox.alert(this, "Ban chua chon san pham");
            txtTenSanPham.requestFocus();
            return false;
        } else if (txtSoLuong.getText().equals("")) {
            MsgBox.alert(this, "Ban chua nhap So Luong");
            txtSoLuong.requestFocus();
            return false;
        }
        return true;

//         else if (txtKhachDua.getText().equals("")) {
//            MsgBox.alert(this, "Ban chua nhap so tien khach dua");
//            txtKhachDua.requestFocus();
//            return false;
//        } 
    }

    public void delete_SP_HDCT() {
        if (Auth.nv != null) {
            // Lay ten
            String tensanpham = (String) tbldsspHd1.getValueAt(row_hdct, 1);
            // Lay MAsp 
            SanPham sp = spdao.SelectSanPham_ByName(tensanpham);
            // Lay maHD
            int MaHD = (int) tblHoaDon.getValueAt(row_hd, 0);
            // neu tensanpham null
            if (tensanpham == null) {
                MsgBox.alert(this, "Ban Chua chon san Pham de xoa");
            }
            HoaDonChiTiet hdct = (HoaDonChiTiet) hdctdao.selectby_MaHD_MASP(MaHD, sp.getMaSP());
            hdctdao.delete(hdct.getMaHDCT());
            MsgBox.alert(this, "Xoa Thanh Cong !");
            fill_ThanhToan();
            fillTableHDCT();
        } else {
            MsgBox.alert(this, "Ban chua dang nhap");
        }

    }

    private void First_SP() {
        row_sp = 0;
        clickTableSP();

    }

    private void Prev_SP() {
        if (row_sp > 0) {
            row_sp--;
            clickTableSP();
        }

    }

    private void Next_SP() {
        if (row_sp < tbldssp.getRowCount() - 1) {
            row_sp++;
            clickTableSP();
        }
    }

    private void Last_SP() {
        row_sp = tbldssp.getRowCount() - 1;
        clickTableSP();
    }

    private void First_HD() {
        row_hd = 0;
        ClickTableHD();
    }

    private void Prev_HD() {
        if (row_hd > 0) {
            row_hd--;
            ClickTableHD();
        }
    }

    private void Next_HD() {
        if (row_hd < tblHoaDon.getRowCount() - 1) {
            row_hd++;
            ClickTableHD();
        }
    }

    private void Last_HD() {
        row_hd = tblHoaDon.getRowCount() - 1;
        ClickTableHD();
    }

    private void updateStatus_HD() {
        boolean edit_HD = (row_hd >= 0);
        boolean first_hd = (row_hd == 0);
        boolean last_hd = (row_hd == tblHoaDon.getRowCount() - 1);

        btnThem_HD.setEnabled(!edit_HD);
        btnXoa_HD.setEnabled(edit_HD);
        btnSua_HD.setEnabled(edit_HD);

        btnFirst_HD.setEnabled(edit_HD && !first_hd);
        btnPrev_HD.setEnabled(edit_HD && !first_hd);
        btnNext_HD.setEnabled(edit_HD && !last_hd);
        btnLast_HD.setEnabled(edit_HD && !last_hd);
    }

    private void updateStatus_SP() {
        boolean edit_SP = (row_sp >= 0);
        boolean first_SP = (row_sp == 0);
        boolean last_SP = (row_sp == tbldssp.getRowCount() - 1);

        btnFirstSP.setEnabled(edit_SP && !first_SP);
        btnPrevSP.setEnabled(edit_SP && !first_SP);
        btnNextSP.setEnabled(edit_SP && !last_SP);
        btnLastSP.setEnabled(edit_SP && !last_SP);
    }

    private void KhachDua() {
        if (!checkNumber(txtKhachDua.getText())) {
            MsgBox.alert(this, "Chỉ được nhập số !");
            txtKhachDua.requestFocus();
        } else {
            double khachdua = Double.parseDouble(txtKhachDua.getText());
            List<Object[]> list = hdctdao.getTien_ThanhToan(Integer.parseInt(txtMahd1.getText()), khachdua);
            if (list.size() != 0) {
                Object row[] = list.get(0);
                txtTraLai.setText(String.valueOf(row[3]) + " VND");
                txtKhachDua.setText(khachdua + " VND");
            }
        }
    }

    private void checkThanhToan() {
        double khachdua = Double.parseDouble(txtKhachDua.getText());
        String tongtien = txtTongTienThanhToan.getText();
        double ttien = Double.parseDouble(tongtien.substring(0, tongtien.length() - 4));
        if (khachdua < ttien) {
            MsgBox.alert(this, "So tien con thieu");
        } else {
            KhachDua();
        }
    }

    private void XuatHoaDon() {
        if (txtMahd1.getText().equals("0") || txtMahd1.getText().equals("")) {
            MsgBox.alert(this, "Ban chua chon hoa don de xuat !");
        } else if (txtKhachDua.getText().equals("0") || txtKhachDua.getText().equals("")) {
            MsgBox.alert(this, "Ban chua nhap so tien cua khach dua !");
        } else {
            if (Auth.nv != null) {
                try {
                    //
                    HoaDon hd = hddao.SelectByID(Integer.parseInt(txtMahd1.getText()));
                    // path can luu : 
                    String file_name = "DanhSachHoaDon\\HoaDon" + txtMahd1.getText() + ".pdf";
                    Document document = new Document();
                    PdfWriter.getInstance(document, new FileOutputStream(file_name));
                    document.open();
                    // Ten cua hang 
                    Paragraph pg = new Paragraph();
                    pg.setAlignment(Element.ALIGN_CENTER);

                    Font font = new Font();
                    font.setSize(20); // kich thuoc chu : 16
                    font.setStyle(Font.BOLD); // in dam
                    font.setColor(BaseColor.RED); // mau` do
                    // Chunk la` dai dien cho Paragraph co dinh dang van bang : mau` sac, kich thuoc,...
                    Chunk chunk = new Chunk("YUM FOOD\n\n", font);
                    pg.add(chunk);
                    document.add(pg);
                    // Ma Hoa Don + Ngay Tao
                    Paragraph paragraph = new Paragraph();
                    Font font1 = new Font();
                    font1.setSize(12);
                    Font font2 = new Font();
                    font2.setSize(12);
                    Chunk chunk1 = new Chunk("Ma HD : " + hd.getMaHD(), font1);
                    Chunk chunk2 = new Chunk("Ngay Tao : " + hd.getNgayTao(), font2);
                    paragraph.add(chunk1);
                    // Thêm khoảng trắng giữa hai Chunk để chúng ở cách xa nhau
                    paragraph.add(new Phrase(new Chunk("                             ")));
                    paragraph.add(chunk2);
                    // Đặt căn lề để chunk1 ở bên trái, chunk2 ở bên phải
                    paragraph.setAlignment(Element.ALIGN_LEFT | Element.ALIGN_RIGHT);
                    document.add(paragraph);
                    document.add(new Paragraph(""));
                    // Thong tin khach hang va NhanVien
                    PdfPTable inf_kh_nv = new PdfPTable(2);
                    inf_kh_nv.getDefaultCell().setBorder(0); // bo vien cua bang
                    inf_kh_nv.setHeaderRows(0); // dong` tieu de la 0  (Khong co tieu de)
                    inf_kh_nv.addCell("Ho va Ten Khach Hang     : ");
                    inf_kh_nv.addCell(hd.getTenKH());
                    inf_kh_nv.addCell("So Dien Thoai Khach Hang : ");
                    inf_kh_nv.addCell(hd.getSDT_KH());
                    inf_kh_nv.addCell("Ho va Ten Nhan Vien      : ");
                    inf_kh_nv.addCell(txtHotenNV1.getText());
                    inf_kh_nv.addCell("So Dien Thoai Nhan Vien  : ");
                    inf_kh_nv.addCell(txtsdtNV1.getText());
                    document.add(inf_kh_nv);

                    document.add(new Paragraph(""));
                    document.add(new Paragraph("*************************************************************************************************************"));
                    document.add(new Paragraph(""));
                    // Thong tin chi Tiet cac San pham:
                    int count_sp = tbldsspHd1.getRowCount();
                    PdfPTable dssp = new PdfPTable(5);
                    dssp.getDefaultCell().setBorder(0);
                    dssp.setWidthPercentage(100); // do rong cua bang? 
                    // Chinh do rong cho cot 
                    float[] columns_with = {10f, 35f, 15f, 15f, 15f};
                    dssp.setWidths(columns_with);

                    PdfPCell c1 = new PdfPCell(new Phrase("STT")); // tieu de cot
                    c1.setBorder(0);// Loai bo duong vien cua bang
                    dssp.addCell(c1);

                    PdfPCell c2 = new PdfPCell(new Phrase("San Pham"));
                    c2.setBorder(0);// Loai bo duong vien cua bang
                    dssp.addCell(c2);

                    PdfPCell c3 = new PdfPCell(new Phrase("So Luong"));
                    c3.setBorder(0);// Loai bo duong vien cua bang
                    c3.setHorizontalAlignment(Element.ALIGN_CENTER);
                    dssp.addCell(c3);

                    PdfPCell c4 = new PdfPCell(new Phrase("Gia"));
                    c4.setBorder(0);// Loai bo duong vien cua bang
                    dssp.addCell(c4);

                    PdfPCell c5 = new PdfPCell(new Phrase("Thanh tien"));
                    c5.setBorder(0);// Loai bo duong vien cua bang
                    dssp.addCell(c5);
                    dssp.setHeaderRows(1); // Hang dau tien la tieu de cua bang : STT , TSP, SL , Gia ,TT
                    for (int i = 0; i < count_sp; i++) {
                        // stt
                        dssp.addCell(String.valueOf(tbldsspHd1.getValueAt(i, 0)));
                        // tenn sp
                        dssp.addCell((String) tbldsspHd1.getValueAt(i, 1));
                        // so luong
                        PdfPCell sl = new PdfPCell(new Phrase(String.valueOf(tbldsspHd1.getValueAt(i, 2))));
                        sl.setHorizontalAlignment(Element.ALIGN_CENTER);
                        sl.setBorder(0);
                        dssp.addCell(sl);
                        // gia
                        dssp.addCell(String.valueOf(tbldsspHd1.getValueAt(i, 3)));
                        // thanh tien
                        PdfPCell thanhtien = new PdfPCell(new Phrase(String.valueOf(tbldsspHd1.getValueAt(i, 4))));
                        thanhtien.setBorder(0);
                        dssp.addCell(thanhtien);

                        String ghichu = (String) tbldsspHd1.getValueAt(i, 5);
                        if (!ghichu.equals("")) {
                            PdfPCell mergecell = new PdfPCell(new Paragraph(ghichu));
                            mergecell.setColspan(5);
                            mergecell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                            mergecell.setBorder(0);
                            dssp.addCell(mergecell);
                        }
                    }
                    document.add(dssp);

                    document.add(new Paragraph(""));
                    document.add(new Paragraph("*************************************************************************************************************"));
                    document.add(new Paragraph(""));
                    // Thong tin tong tien + Thanh toan ,.... 
                    PdfPTable Thanh_Toan = new PdfPTable(2);
                    Thanh_Toan.getDefaultCell().setBorder(0); // bo vien cua bang
                    Thanh_Toan.setHeaderRows(0); // dong` tieu de la 0  (Khong co tieu de)

                    Thanh_Toan.addCell("Tong Tien           : ");
                    PdfPCell tongtien_hd = new PdfPCell(new Phrase(txtTongTien.getText()));
                    tongtien_hd.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    tongtien_hd.setBorder(0);
                    Thanh_Toan.addCell(tongtien_hd);
                    if (!txtGhiChu_GG.getText().equals("")) {
                        Thanh_Toan.addCell("Giam Gia            : ");
                        PdfPCell gg = new PdfPCell(new Phrase(txtGiamGia.getText()));
                        gg.setHorizontalAlignment(Element.ALIGN_RIGHT);
                        gg.setBorder(0);
                        Thanh_Toan.addCell(gg);

                        Thanh_Toan.addCell("Ghi Chu             : ");
                        PdfPCell gc_gg = new PdfPCell(new Phrase(txtGhiChu_GG.getText()));
                        gc_gg.setHorizontalAlignment(Element.ALIGN_RIGHT);
                        gc_gg.setBorder(0);
                        Thanh_Toan.addCell(gc_gg);
                    }
                    Thanh_Toan.addCell("Tong Tien Thanh Toan : ");
                    PdfPCell tttt = new PdfPCell(new Phrase(txtTongTienThanhToan.getText()));
                    tttt.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    tttt.setBorder(0);
                    Thanh_Toan.addCell(tttt);

                    Thanh_Toan.addCell("Khach Dua : ");
                    PdfPCell kd = new PdfPCell(new Phrase(txtKhachDua.getText()));
                    kd.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    kd.setBorder(0);
                    Thanh_Toan.addCell(kd);

                    Thanh_Toan.addCell("Tra Lai : ");
                    PdfPCell tl = new PdfPCell(new Phrase(txtTraLai.getText()));
                    tl.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    tl.setBorder(0);
                    Thanh_Toan.addCell(tl);

                    document.add(Thanh_Toan);

                    document.add(new Paragraph(""));
                    document.add(new Paragraph("------------------------------------------------------------------------------------------------------------------------------"));
                    document.add(new Paragraph(""));
                    // cam on 
                    Paragraph camon = new Paragraph();
                    camon.setAlignment(Element.ALIGN_CENTER); // can giua~ 
                    Font font_camon = new Font();
                    font_camon.setSize(14); // kich thuoc chu : 14
                    font_camon.setStyle(Font.BOLD); // in dam

                    // Chunk la` dai dien cho Paragraph co dinh dang van bang : mau` sac, kich thuoc,...
                    Chunk chunk_camon = new Chunk("Xin Cam On Quy Khach.\n\n", font_camon);
                    camon.add(chunk_camon);
                    document.add(camon);

                    // See you again
                    Paragraph seeyouagain = new Paragraph();
                    seeyouagain.setAlignment(Element.ALIGN_CENTER); // can giua~ 
                    Font font_seeyouagain = new Font();
                    font_seeyouagain.setSize(14); // kich thuoc chu : 14
                    font_seeyouagain.setStyle(Font.BOLD); // in dam

                    Chunk chunk_seeyouagain = new Chunk("Hen Gap Lai Lan Sau.", font_seeyouagain);
                    seeyouagain.add(chunk_seeyouagain);
                    document.add(seeyouagain);

                    document.close();
                    MsgBox.alert(this, "Xuất Hóa Đơn Thành Công");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                MsgBox.alert(this, "Ban chua dang nhap !");
            }

        }
    }
}
