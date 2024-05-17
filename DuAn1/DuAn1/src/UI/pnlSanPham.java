package UI;

import DAO.LoaiHangHoaDAO;
import DAO.SanPhamDAO;
import Entity.LoaiHangHoa;
import Entity.SanPham;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XImage;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class pnlSanPham extends javax.swing.JPanel {

    public pnlSanPham() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        tabs = new javax.swing.JTabbedPane();
        pnlSanPham = new javax.swing.JPanel();
        lblhinhanh = new javax.swing.JLabel();
        kbtnChonAnh = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        kbtnAdd = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        kbtnXoa = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        kbtnMoi = new com.k33ptoo.components.KButton();
        jLabel5 = new javax.swing.JLabel();
        kbtnSua = new com.k33ptoo.components.KButton();
        txtmasanpham = new javax.swing.JTextField();
        kbtnfirst = new com.k33ptoo.components.KButton();
        txttensanpham = new javax.swing.JTextField();
        kbtnBack = new com.k33ptoo.components.KButton();
        txtgia = new javax.swing.JTextField();
        kbtnNext = new com.k33ptoo.components.KButton();
        kbtnLast = new com.k33ptoo.components.KButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        cboLoaiHang = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        pnlDanhsach = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        pnlLoaiHang = new javax.swing.JPanel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtLoaiHang = new javax.swing.JTextField();
        kbtnAdd1 = new com.k33ptoo.components.KButton();
        kbtnSua1 = new com.k33ptoo.components.KButton();
        kbtnXoa1 = new com.k33ptoo.components.KButton();
        kbtnLast1 = new com.k33ptoo.components.KButton();
        kbtnfirst1 = new com.k33ptoo.components.KButton();
        kbtnBack1 = new com.k33ptoo.components.KButton();
        kbtnNext1 = new com.k33ptoo.components.KButton();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiHang = new javax.swing.JTable();

        kGradientPanel4.setkEndColor(new Color(81,246,155,200));
        kGradientPanel4.setkStartColor(new Color(222,244,222,200));

        lblhinhanh.setBackground(new java.awt.Color(255, 255, 255));
        lblhinhanh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        kbtnChonAnh.setText("Chọn Ảnh");
        kbtnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnChonAnhActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Sản Phẩm:");

        kbtnAdd.setText("Thêm");
        kbtnAdd.setkBackGroundColor(new java.awt.Color(0, 153, 0));
        kbtnAdd.setkHoverForeGround(new java.awt.Color(51, 255, 0));
        kbtnAdd.setkHoverStartColor(new java.awt.Color(0, 204, 0));
        kbtnAdd.setkSelectedColor(new java.awt.Color(153, 255, 153));
        kbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnAddActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên Sản Phẩm:");

        kbtnXoa.setText("Xóa");
        kbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnXoaActionPerformed(evt);
            }
        });

        jLabel4.setText("Giá:");

        kbtnMoi.setText("Mới");
        kbtnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnMoiActionPerformed(evt);
            }
        });

        jLabel5.setText("Mô Tả:");

        kbtnSua.setText("Sửa");
        kbtnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnSuaActionPerformed(evt);
            }
        });

        kbtnfirst.setText("<|");
        kbtnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnfirstActionPerformed(evt);
            }
        });

        kbtnBack.setText("<<");
        kbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnBackActionPerformed(evt);
            }
        });

        kbtnNext.setText(">>");
        kbtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnNextActionPerformed(evt);
            }
        });

        kbtnLast.setText("|>");
        kbtnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnLastActionPerformed(evt);
            }
        });

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane3.setViewportView(txtMoTa);

        cboLoaiHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Loai hang:");

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtgia)
                                    .addComponent(txttensanpham)
                                    .addComponent(jScrollPane3)
                                    .addComponent(txtmasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14))
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kbtnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kbtnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(kbtnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                        .addComponent(lblhinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel4))
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5))
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kbtnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabs.addTab("Sản Phẩm", pnlSanPham);

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá", "Mô Tả"
            }
        ));
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTable);

        javax.swing.GroupLayout pnlDanhsachLayout = new javax.swing.GroupLayout(pnlDanhsach);
        pnlDanhsach.setLayout(pnlDanhsachLayout);
        pnlDanhsachLayout.setHorizontalGroup(
            pnlDanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhsachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhsachLayout.setVerticalGroup(
            pnlDanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhsachLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Danh Sách", pnlDanhsach);

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 51, 51));
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 102, 102));

        jLabel6.setText("ID");

        jLabel7.setText("Tên Loại Hàng");

        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        kbtnAdd1.setText("Thêm");
        kbtnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnAdd1ActionPerformed(evt);
            }
        });

        kbtnSua1.setText("Sửa");
        kbtnSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnSua1ActionPerformed(evt);
            }
        });

        kbtnXoa1.setText("Xóa");
        kbtnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnXoa1ActionPerformed(evt);
            }
        });

        kbtnLast1.setText("|>");
        kbtnLast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnLast1ActionPerformed(evt);
            }
        });

        kbtnfirst1.setText("<|");
        kbtnfirst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnfirst1ActionPerformed(evt);
            }
        });

        kbtnBack1.setText("<<");
        kbtnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnBack1ActionPerformed(evt);
            }
        });

        kbtnNext1.setText(">>");
        kbtnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnNext1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kbtnAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(kbtnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(kbtnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(kbtnfirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(kbtnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(kbtnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(kbtnLast1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(kbtnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbtnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnfirst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnLast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        tblLoaiHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Tên Hàng"
            }
        ));
        tblLoaiHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiHang);

        javax.swing.GroupLayout pnlLoaiHangLayout = new javax.swing.GroupLayout(pnlLoaiHang);
        pnlLoaiHang.setLayout(pnlLoaiHangLayout);
        pnlLoaiHangLayout.setHorizontalGroup(
            pnlLoaiHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoaiHangLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLoaiHangLayout.setVerticalGroup(
            pnlLoaiHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoaiHangLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlLoaiHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabs.addTab("Loại Hàng", pnlLoaiHang);

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, Short.MAX_VALUE)
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
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
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kbtnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnChonAnhActionPerformed
        chonAnh();// TODO add your handling code here:
    }//GEN-LAST:event_kbtnChonAnhActionPerformed

    private void kbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnAddActionPerformed
        Add();        // TODO add your handling code here:
    }//GEN-LAST:event_kbtnAddActionPerformed

    private void kbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnXoaActionPerformed
        Delete();   // TODO add your handling code here:
    }//GEN-LAST:event_kbtnXoaActionPerformed

    private void kbtnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnMoiActionPerformed
        clearForm();        // TODO add your handling code here:
    }//GEN-LAST:event_kbtnMoiActionPerformed

    private void kbtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnSuaActionPerformed
        Update();        // TODO add your handling code here:
    }//GEN-LAST:event_kbtnSuaActionPerformed

    private void kbtnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnfirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_kbtnfirstActionPerformed

    private void kbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnBackActionPerformed
        prev();// TODO add your handling code here:
    }//GEN-LAST:event_kbtnBackActionPerformed

    private void kbtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnNextActionPerformed
        next();// TODO add your handling code here:
    }//GEN-LAST:event_kbtnNextActionPerformed

    private void kbtnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_kbtnLastActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
        index = tblTable.getSelectedRow();
        clicked();
    }//GEN-LAST:event_tblTableMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void kbtnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnAdd1ActionPerformed
        // TODO add your handling code here:
        Them_LH();
    }//GEN-LAST:event_kbtnAdd1ActionPerformed

    private void kbtnSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnSua1ActionPerformed
        // TODO add your handling code here:
        Sua_LH();
    }//GEN-LAST:event_kbtnSua1ActionPerformed

    private void kbtnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnXoa1ActionPerformed
        // TODO add your handling code here:
        Xoa_LH();
    }//GEN-LAST:event_kbtnXoa1ActionPerformed

    private void kbtnLast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnLast1ActionPerformed
        // TODO add your handling code here:
        End_LH();
    }//GEN-LAST:event_kbtnLast1ActionPerformed

    private void kbtnfirst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnfirst1ActionPerformed
        // TODO add your handling code here:
        Firts_LH();
    }//GEN-LAST:event_kbtnfirst1ActionPerformed

    private void kbtnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnBack1ActionPerformed
        // TODO add your handling code here:
        Prev_LH();
    }//GEN-LAST:event_kbtnBack1ActionPerformed

    private void kbtnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnNext1ActionPerformed
        // TODO add your handling code here:
        Next_LH();
    }//GEN-LAST:event_kbtnNext1ActionPerformed

    private void tblLoaiHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiHangMouseClicked
        // TODO add your handling code here:
        index_LH = tblLoaiHang.getSelectedRow();
        fillToForm_LH();
    }//GEN-LAST:event_tblLoaiHangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboLoaiHang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    private com.k33ptoo.components.KButton kbtnAdd;
    private com.k33ptoo.components.KButton kbtnAdd1;
    private com.k33ptoo.components.KButton kbtnBack;
    private com.k33ptoo.components.KButton kbtnBack1;
    private com.k33ptoo.components.KButton kbtnChonAnh;
    private com.k33ptoo.components.KButton kbtnLast;
    private com.k33ptoo.components.KButton kbtnLast1;
    private com.k33ptoo.components.KButton kbtnMoi;
    private com.k33ptoo.components.KButton kbtnNext;
    private com.k33ptoo.components.KButton kbtnNext1;
    private com.k33ptoo.components.KButton kbtnSua;
    private com.k33ptoo.components.KButton kbtnSua1;
    private com.k33ptoo.components.KButton kbtnXoa;
    private com.k33ptoo.components.KButton kbtnXoa1;
    private com.k33ptoo.components.KButton kbtnfirst;
    private com.k33ptoo.components.KButton kbtnfirst1;
    private javax.swing.JLabel lblhinhanh;
    private javax.swing.JPanel pnlDanhsach;
    private javax.swing.JPanel pnlLoaiHang;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblLoaiHang;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLoaiHang;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txtmasanpham;
    private javax.swing.JTextField txttensanpham;
    // End of variables declaration//GEN-END:variables

    SanPhamDAO spDAO = new SanPhamDAO();
    int index = -1;

    private void init() {
        fillToTable();
//        kbtnSua.setEnabled(false);
//        kbtnXoa.setEnabled(false);
        fillToTable_LH();
        fillCombobox_LHH();
        updateStatus();
    }

    private void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
        model.setRowCount(0);
        List<Entity.SanPham> list = spDAO.selectAll();
        for (Entity.SanPham sp : list) {
            model.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getGia(), sp.getMoTa()});
        }
        tblTable.setModel(model);
    }

    private void setForm(Entity.SanPham sp) {
        LoaiHangHoa lhh = LhhDao.SelectByID(sp.getmaLoai());
        txtmasanpham.setText(sp.getMaSP());
        txttensanpham.setText(sp.getTenSP());
        txtgia.setText(String.valueOf(sp.getGia()));
        txtMoTa.setText(sp.getMoTa());
        if (sp.getHinh() != null) {
            lblhinhanh.setToolTipText(sp.getHinh());
            srcImage = String.valueOf(XImage.read(sp.getHinh()));
            img(srcImage);
            lblhinhanh.setIcon(icon);
            System.out.println(sp.getHinh());
        }else{
            lblhinhanh.setIcon(null);
        }
        if (lhh != null) {
            cboLoaiHang.setSelectedItem(lhh.getTen_HangHoa());
        } else {
            cboLoaiHang.setSelectedIndex(0);
        }
    }
    ImageIcon icon;
    String srcImage;

    public void img(String path) {
        ImageIcon ii = new ImageIcon(path);
        Image im = ii.getImage().getScaledInstance(lblhinhanh.getWidth(), lblhinhanh.getHeight(), java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(im);
    }

    private SanPham getForm() {
        LoaiHangHoa lhh = LhhDao.Select_By_Name((String) cboLoaiHang.getSelectedItem());
        SanPham sp = new SanPham();
        sp.setMaSP(txtmasanpham.getText());
        sp.setTenSP(txttensanpham.getText());
        sp.setGia(Double.parseDouble(txtgia.getText()));
        sp.setMoTa(txtMoTa.getText());
        sp.setHinh(lblhinhanh.getToolTipText());
        sp.setmaLoai(lhh.getID());
        return sp;
    }

    public void clicked() {
        String maSP = (String) tblTable.getValueAt(index, 0);
        SanPham list = spDAO.SelectByID(maSP);
        setForm(list);
        txtmasanpham.setEnabled(false);
//        kbtnAdd.setEnabled(false);
        updateStatus();
    }

    private void clearForm() {
        SanPham sp = new SanPham();
        setForm(sp);
        index = -1;
        txtmasanpham.setEnabled(true);
        updateStatus();
    }

    private void chonAnh() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // Lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName());
            lblhinhanh.setIcon(icon);
            lblhinhanh.setToolTipText(file.getName()); // giữ tên hình trong tooltip
        }
    }

    public boolean Validate() {
        if (txtmasanpham.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Mã SP");
            return false;
        } else if (txttensanpham.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Tên SP");
            return false;
        } else if (txtgia.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Giá");
            return false;
        } else if (txtMoTa.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Mô Tả");
            return false;
        }

        return true;
    }

    private void updateStatus() {
        boolean edit = (this.index >= 0);
        boolean first = (this.index == 0);
        boolean last = (this.index == tblTable.getRowCount() - 1);

        // trạng thái form
        kbtnAdd.setEnabled(!edit);
        kbtnSua.setEnabled(edit);
        kbtnXoa.setEnabled(edit);

        // trạng thái điều hướng
        kbtnfirst.setEnabled(edit && !first);
        kbtnBack.setEnabled(edit && !first);
        kbtnNext.setEnabled(edit && !last);
        kbtnLast.setEnabled(edit && !last);
    }

    private void Add() {
        if (Auth.nv != null) {
            if (Validate()) {
                try {
                    Entity.SanPham cd = getForm();
                    spDAO.insert(cd);
                    updateStatus();
                    MsgBox.alert(this, "Thêm thành công");
                    fillToTable();
                    clearForm();
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "Thêm thất bại");
                }
            }
        } else {
            MsgBox.alert(this, "Ban chua dang nhap");

        }

    }

    private void Delete() {
        if (Auth.nv != null) {
            if (Auth.isManager()) {
                if (MsgBox.confirm(this, "Bạn có muốn xóa sản phẩm này không ?")) {
                    try {
                        spDAO.delete(txtmasanpham.getText());
                        clearForm();
                        fillToTable();
                        MsgBox.alert(this, "Xóa thành công");
                    } catch (Exception e) {
                        e.printStackTrace();
                        MsgBox.alert(this, "Xóa thất bại");
                    }
                }
            } else {
                MsgBox.alert(this, "Ban khong co quyen xoa san pham");
            }
        }else{
            MsgBox.alert(this, "Ban chua dang nhap");
        }

    }

    private void Update() {
        if (Auth.nv != null) {
            if (MsgBox.confirm(this, "Bạn có muốn cập nhật sản phẩm này ?")) {
                try {
                    Entity.SanPham sp = getForm();
                    LoaiHangHoa lhh = LhhDao.Select_By_Name(String.valueOf(cboLoaiHang.getSelectedItem()));
                    sp.setmaLoai(lhh.getID());
                    spDAO.update(sp);
                    fillToTable();
                    updateStatus();
                    MsgBox.alert(this, "Cập nhật thành công");
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "Cập nhật thất bại");
                }
            }
        } else {
            MsgBox.alert(this, "Ban chua dang nhap");
        }

    }

    private void edit() {
        String MaSP = (String) tblTable.getValueAt(this.index, 0);
        SanPham sp = spDAO.SelectByID(MaSP);
        setForm(sp);
        tabs.setSelectedIndex(0);
        updateStatus();
    }

    private void first() {
        index = 0;
        tblTable.setRowSelectionInterval(index, index);
        clicked();
    }

    private void prev() {
        if (index > 0) {
            index--;
            tblTable.setRowSelectionInterval(index, index);
            clicked();
        }

    }

    private void next() {
        if (index < tblTable.getRowCount() - 1) {
            index++;
            tblTable.setRowSelectionInterval(index, index);
            clicked();
        }
    }

    private void last() {
        index = tblTable.getRowCount() - 1;
        tblTable.setRowSelectionInterval(index, index);
        clicked();
    }

    private void themMoi() {
        setForm(new Entity.SanPham());
        txtmasanpham.requestFocus();

    }
    LoaiHangHoaDAO LhhDao = new LoaiHangHoaDAO();
    int index_LH;

    public void fillCombobox_LHH() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiHang.getModel();
        model.removeAllElements();
        List<LoaiHangHoa> list = LhhDao.selectAll();
        for (LoaiHangHoa lhh : list) {
            model.addElement(lhh.getTen_HangHoa());
        }
    }

    public void fillToTable_LH() {
        List<LoaiHangHoa> list = LhhDao.selectAll();
        DefaultTableModel model = (DefaultTableModel) tblLoaiHang.getModel();
        model.setRowCount(0);

        for (LoaiHangHoa lhh : list) {
            model.addRow(new Object[]{lhh.getID(), lhh.getTen_HangHoa()});
        }
        tblLoaiHang.setModel(model);
    }

    public void fillToForm_LH() {
        int ID = (int) tblLoaiHang.getValueAt(index_LH, 0);
        LoaiHangHoa list = LhhDao.SelectByID(ID);
        setForm_LH(list);
    }

    public LoaiHangHoa getForm_LH() {
        LoaiHangHoa Lhh = new LoaiHangHoa();
        Lhh.setTen_HangHoa(txtLoaiHang.getText());
        return Lhh;
    }

    public void setForm_LH(LoaiHangHoa Lhh) {
        txtID.setText(String.valueOf(Lhh.getID()));
        txtLoaiHang.setText(String.valueOf(Lhh.getTen_HangHoa()));
    }

    public void Them_LH() {
        LoaiHangHoa Lhh = getForm_LH();
        try {
            LhhDao.insert(Lhh);
            MsgBox.alert(this, "Them Thanh Cong");
            fillToTable_LH();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Sua_LH() {
        LoaiHangHoa Lhh = getForm_LH();
        try {
            LhhDao.update(Lhh);
            MsgBox.alert(this, "Sua Thanh Cong");
            fillToTable_LH();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Xoa_LH() {

        try {
            LhhDao.delete(Integer.valueOf(txtID.getText()));
            MsgBox.alert(this, "Xoa Thanh Cong");
            fillToTable_LH();
        } catch (Exception e) {
        }
    }

    public void edit_LH() {
        int ID = (int) tblLoaiHang.getValueAt(index_LH, 0);
        LoaiHangHoa Lhh = LhhDao.SelectByID(ID);
        setForm_LH(Lhh);
    }

    public void Firts_LH() {
        index = 0;
        tblLoaiHang.setRowSelectionInterval(index_LH, index_LH);
        edit_LH();
    }

    public void Prev_LH() {
        index_LH = tblLoaiHang.getSelectedRow();
        if (index_LH > 0) {
            edit_LH();
            tblLoaiHang.setRowSelectionInterval(index_LH, index_LH);
        }
    }

    public void Next_LH() {
        if (index_LH > tblLoaiHang.getRowCount() - 1) {
            index_LH++;
            tblLoaiHang.setRowSelectionInterval(index_LH, index_LH);
            edit_LH();
        }
    }

    public void End_LH() {
        index_LH = tblLoaiHang.getRowCount() - 1;
        tblLoaiHang.setRowSelectionInterval(index_LH, index_LH);
        edit_LH();
    }

}
