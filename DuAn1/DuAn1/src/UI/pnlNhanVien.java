package UI;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pnlNhanVien extends javax.swing.JPanel {

    public pnlNhanVien() {
        initComponents();
        initialze();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        cboVaiTro = new javax.swing.JComboBox<>();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        txtHoTen = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        btnThemMoi = new com.k33ptoo.components.KButton();
        btnThemNV = new com.k33ptoo.components.KButton();
        btnCapNhatNV = new com.k33ptoo.components.KButton();
        btnXoaNV = new com.k33ptoo.components.KButton();
        jLabel116 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQLNV = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnPrev = new com.k33ptoo.components.KButton();
        btnFirst = new com.k33ptoo.components.KButton();
        btnLast = new com.k33ptoo.components.KButton();
        btnNext = new com.k33ptoo.components.KButton();

        kGradientPanel4.setkEndColor(new Color(255,255,255,200)
        );
        kGradientPanel4.setkStartColor(new Color(222,244,222,200));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        kGradientPanel5.setToolTipText("");
        kGradientPanel5.setkEndColor(new Color(255,255,255,200));
        kGradientPanel5.setkStartColor(new Color(222,244,222,200)
        );

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel109.setText("Mã nhân viên: ");

        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel110.setText("Họ tên:");

        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel111.setText("Giới tính:");

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel112.setText("Email:");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel113.setText("SĐT:");

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel114.setText("Mật Khẩu:");

        jLabel115.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel115.setText("Vai trò: ");

        cboVaiTro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý" }));
        cboVaiTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboVaiTrojComboBox1ActionPerformed(evt);
            }
        });

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTtxtHoTenActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailtxtHoTenActionPerformed(evt);
            }
        });

        rdoNu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdoNu.setText("Nữ");

        rdoNam.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTentxtHoTenActionPerformed(evt);
            }
        });

        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVtxtHoTenActionPerformed(evt);
            }
        });

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane16.setViewportView(txtDiaChi);

        btnThemMoi.setText("Thêm mới");
        btnThemMoi.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnThemMoi.setkEndColor(new java.awt.Color(0, 153, 153));
        btnThemMoi.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnThemMoi.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnThemMoi.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnThemMoi.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnThemNV.setText("Thêm nhân viên");
        btnThemNV.setkEndColor(new java.awt.Color(0, 153, 153));
        btnThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNVActionPerformed(evt);
            }
        });

        btnCapNhatNV.setText("Cập nhật thông tin");
        btnCapNhatNV.setkEndColor(new java.awt.Color(0, 153, 153));
        btnCapNhatNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatNVActionPerformed(evt);
            }
        });

        btnXoaNV.setText("Xóa Nhân Viên");
        btnXoaNV.setkEndColor(new java.awt.Color(0, 153, 153));
        btnXoaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNVActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel116.setText("Địa chỉ:");

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112)
                            .addComponent(jLabel113)
                            .addComponent(jLabel114)
                            .addComponent(jLabel115)
                            .addComponent(jLabel116))))
                .addGap(138, 138, 138)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCapNhatNV, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(rdoNam)
                        .addGap(100, 100, 100)
                        .addComponent(rdoNu))
                    .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(jScrollPane16)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel111)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel110)))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel113)))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Nhân viên", jPanel1);

        kGradientPanel6.setkEndColor(new Color(255,255,255,200)
        );
        kGradientPanel6.setkStartColor(new Color(222,244,222,200));

        tblQLNV.setBackground(new java.awt.Color(204, 204, 204));
        tblQLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Nhân Viên", "Họ tên", "Email", "Vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLNV.setMaximumSize(new java.awt.Dimension(750, 450));
        tblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLNVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQLNV);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rewind-button (1).png"))); // NOI18N
        btnPrev.setkHoverForeGround(new java.awt.Color(0, 102, 102));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/previous.png"))); // NOI18N
        btnFirst.setkHoverForeGround(new java.awt.Color(0, 102, 102));
        btnFirst.setkHoverStartColor(new java.awt.Color(204, 255, 255));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next1.png"))); // NOI18N
        btnLast.setkHoverForeGround(new java.awt.Color(0, 102, 102));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next-button.png"))); // NOI18N
        btnNext.setkHoverForeGround(new java.awt.Color(0, 102, 102));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnPrev, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách nhân viên", jPanel2);

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addComponent(tabs)
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
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

    private void cboVaiTrojComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboVaiTrojComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboVaiTrojComboBox1ActionPerformed

    private void txtSDTtxtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTtxtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTtxtHoTenActionPerformed

    private void txtEmailtxtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailtxtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailtxtHoTenActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void txtHoTentxtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTentxtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTentxtHoTenActionPerformed

    private void txtMaNVtxtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVtxtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVtxtHoTenActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        this.themMoi();
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNVActionPerformed
        // TODO add your handling code here:
        this.addNhanVien();
    }//GEN-LAST:event_btnThemNVActionPerformed

    private void btnCapNhatNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatNVActionPerformed
        this.updateNV();
    }//GEN-LAST:event_btnCapNhatNVActionPerformed

    private void btnXoaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNVActionPerformed
        this.deleteNV();
    }//GEN-LAST:event_btnXoaNVActionPerformed

    private void tblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLNVMouseClicked
        clicked();
    }//GEN-LAST:event_tblQLNVMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String name = getName();
        //        nh.SelectByName(name);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SearchById();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCapNhatNV;
    private com.k33ptoo.components.KButton btnFirst;
    private com.k33ptoo.components.KButton btnLast;
    private com.k33ptoo.components.KButton btnNext;
    private com.k33ptoo.components.KButton btnPrev;
    private javax.swing.JButton btnSearch;
    private com.k33ptoo.components.KButton btnThemMoi;
    private com.k33ptoo.components.KButton btnThemNV;
    private com.k33ptoo.components.KButton btnXoaNV;
    private javax.swing.JComboBox<String> cboVaiTro;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO NV_dao = new NhanVienDAO();
    int index = -1;

    private void initialze() {
        this.fillDataToTable();
    }

//   
    private void fillDataToTable() {
        List<NhanVien> list = NV_dao.selectAll();
        this.showListOnTable(list);
    }

    private void showListOnTable(List<NhanVien> list) {
        DefaultTableModel tbmodel = (DefaultTableModel) tblQLNV.getModel();
        tbmodel.setRowCount(0);
        int stt = 1;
        for (NhanVien nv : list) {
//            System.out.println(nv.getMaNV());
            Object[] row = {stt, nv.getMaNV(), nv.getHoTen(), nv.getEmail(), nv.isVaiTro() ? "Quản lý" : "Nhân viên"
                + ""};
            tbmodel.addRow(row);
            stt++;
        }
    }

//    private NhanVien getEntityFromSelectedRow() {
//        int rowIndex = tblQLNV.getSelectedRow();
//        int colIndex = 0;
//        String id = (String) tblQLNV.getValueAt(rowIndex, colIndex);
//        NhanVien entity = NV_dao.SelectByID(id);
//        return entity;
//    }
    void setEntityToForm(NhanVien entity) {
        txtMaNV.setText(entity.getMaNV());
        txtHoTen.setText(entity.getHoTen());
        boolean gt = entity.isGioiTinh();
        if (gt == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtEmail.setText(entity.getEmail());
        txtSDT.setText(entity.getSDT());
        txtDiaChi.setText(entity.getDiaChi());
        txtMatKhau.setText(entity.getMatKhau());
        cboVaiTro.setSelectedIndex(1);
        cboVaiTro.setSelectedIndex(entity.isVaiTro() ? 1 : 0);
    }

    NhanVien getEntityFromForm() {
        NhanVien entity = new NhanVien();
        entity.setMaNV(txtMaNV.getText());
        entity.setHoTen(txtHoTen.getText());
        boolean gioiTinh = rdoNam.isSelected();
        entity.setGioiTinh(gioiTinh);
        entity.setEmail(txtEmail.getText());
        entity.setSDT(txtSDT.getText());
        entity.setDiaChi(txtDiaChi.getText());
        entity.setMatKhau(String.valueOf(txtMatKhau.getPassword()));
        entity.setVaiTro(cboVaiTro.getSelectedIndex() == 1);
        return entity;
    }

    private void clicked() {
        index = tblQLNV.getSelectedRow();
        String nv = (String) tblQLNV.getValueAt(index, 1);
        NhanVien list = NV_dao.SelectByID(nv);
        setEntityToForm(list);
//        tabs.setSelectedIndex(0);
    }

    private void SearchById() {
        String id = txtSearch.getText();
        NhanVien list = NV_dao.SelectByID(id);
        if (txtSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên");
            txtSearch.requestFocus();
        }
        if (list != null) {
            DefaultTableModel tbmodel = (DefaultTableModel) tblQLNV.getModel();
            tbmodel.setRowCount(0);
            int stt = 1;
            Object[] row = {stt, list.getMaNV(), list.getHoTen(), list.getEmail(), list.isVaiTro() ? "Quản lý" : "Nhân viên"
                + ""};
            tbmodel.addRow(row);
            stt++;
        }

    }

    public boolean Validate() {
        if (txtMaNV.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên");
            txtMaNV.requestFocus();
            return false;
        } else if (txtHoTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên nhân viên");
            txtHoTen.requestFocus();
            return false;
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email ");
            txtEmail.requestFocus();
            return false;
        } else if (!txtEmail.getText().matches("^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$")) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ");
            txtEmail.requestFocus();
            return false;
        } else if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập SDT");
            txtSDT.requestFocus();
            return false;
        } else if (txtSDT.getText().matches("0\\d{9,10}")) {
            JOptionPane.showMessageDialog(this, "SDT gom 9 den 10 so");
            txtSDT.requestFocus();
            return false;
        } else if (txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ");
            txtDiaChi.requestFocus();
            return false;
        } else if (String.valueOf(txtMatKhau.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
            txtMatKhau.requestFocus();
            return false;
        } else if (new String(txtMatKhau.getPassword()).length() > 15) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không quá 15 ký tự");
            txtSDT.requestFocus();
            return false;
        }
        return true;
    }

    private void themMoi() {
        setEntityToForm(new NhanVien());
        btnThemMoi.setEnabled(true);
        txtMaNV.requestFocus();
    }

    private void addNhanVien() {
        if (Validate()) {
            try {
                NhanVien nv = getEntityFromForm();
                NV_dao.insert(nv);
                fillDataToTable();
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại");
                e.printStackTrace();
            }
        }
    }

    private void updateNV() {
        if (Validate()) {
            try {
                NhanVien nv = getEntityFromForm();
                NV_dao.update(nv);
                fillDataToTable();
                JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "cập nhật nhân viên thất bại");
                e.printStackTrace();
            }
        }

    }

    private void deleteNV() {
        if (Validate()) {
            try {
                String maNV = txtMaNV.getText();
                NV_dao.delete(maNV);
                fillDataToTable();
                themMoi();
                JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Xóa nhân viên thất bại");
                e.printStackTrace();
            }
        }

    }

    private void first() {
        index = 0;
        tblQLNV.setRowSelectionInterval(index, index);
        clicked();
    }

    private void prev() {
        index = tblQLNV.getSelectedRow();
        if (index > 0) {
            index--;
            tblQLNV.setRowSelectionInterval(index, index);
            clicked();
        }

    }

    private void next() {
        index = tblQLNV.getSelectedRow();
        if (index < tblQLNV.getRowCount() - 1) {
            index++;
            tblQLNV.setRowSelectionInterval(index, index);
            clicked();
        }
    }

    private void last() {
        index = tblQLNV.getRowCount() - 1;
        tblQLNV.setRowSelectionInterval(index, index);
        clicked();
    }
}
