package UI;

import Utils.Auth;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainYumFood extends javax.swing.JFrame {

    public MainYumFood() {
        initComponents();
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        lblMain = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblBill = new javax.swing.JLabel();
        lblRevenue = new javax.swing.JLabel();
        lblStaff = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblGiamGia = new javax.swing.JLabel();
        lblInfor = new javax.swing.JLabel();
        lblInfor1 = new javax.swing.JLabel();
        pnMenuBar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();
        btnDoiMatKhau = new com.k33ptoo.components.KButton();
        btnDangXuat = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        pnlDoanhThu1 = new UI.pnlDoanhThu();
        pnlGiamGia1 = new UI.pnlGiamGia();
        pnlSanPham2 = new UI.pnlSanPham();
        pnlNhanVien2 = new UI.pnlNhanVien();
        pnlHoaDon_HDCT1 = new UI.pnlHoaDon_HDCT();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new Color(222,244,222,200));
        kGradientPanel1.setkStartColor(new Color(81,246,155,200));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1487, 761));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new Color(255,255,255,200));
        kGradientPanel2.setkStartColor(new Color(222,244,222,200));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        lblTitle.setForeground(new Color(10,140,23,200));
        lblTitle.setText("QUẢN LÝ CỬA HÀNG YUMFOOD");
        kGradientPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/store.png"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        kGradientPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 6, -1, 52));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 1290, 70));

        kGradientPanel3.setkEndColor(new Color(222,244,222,200));
        kGradientPanel3.setkStartColor(new Color(255,255,255,200));

        lblMain.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        lblMain.setText("Trang chủ");
        lblMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMouseClicked(evt);
            }
        });

        lblProduct.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/gift.png"))); // NOI18N
        lblProduct.setText("Sản phẩm");
        lblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductMouseClicked(evt);
            }
        });

        lblBill.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblBill.setForeground(new Color(0,140,23,200));
        lblBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill.png"))); // NOI18N
        lblBill.setText("Hóa đơn");
        lblBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBillMouseClicked(evt);
            }
        });

        lblRevenue.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblRevenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/earning.png"))); // NOI18N
        lblRevenue.setText("Doanh Thu");
        lblRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRevenueMouseClicked(evt);
            }
        });

        lblStaff.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/people.png"))); // NOI18N
        lblStaff.setText("Nhân viên");
        lblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStaffMouseClicked(evt);
            }
        });

        lblGiamGia.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/discount.png"))); // NOI18N
        lblGiamGia.setText("Giảm giá");
        lblGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGiamGiaMouseClicked(evt);
            }
        });

        lblInfor.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblInfor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/light-bulb.png"))); // NOI18N
        lblInfor.setText("Giới thiệu");
        lblInfor.setMaximumSize(new java.awt.Dimension(104, 28));
        lblInfor.setMinimumSize(new java.awt.Dimension(104, 28));
        lblInfor.setPreferredSize(new java.awt.Dimension(104, 28));
        lblInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInforMouseClicked(evt);
            }
        });

        lblInfor1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblInfor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/question.png"))); // NOI18N
        lblInfor1.setText("Trợ giúp");
        lblInfor1.setMaximumSize(new java.awt.Dimension(104, 28));
        lblInfor1.setMinimumSize(new java.awt.Dimension(104, 28));
        lblInfor1.setPreferredSize(new java.awt.Dimension(104, 28));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBill, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInfor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblInfor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblBill, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfor1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, -1, 685));

        pnMenuBar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/man.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        lblTenNhanVien.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblTenNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenNhanVien.setText("Tấn Hiếu");

        btnDoiMatKhau.setText("Doi mat khau");
        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        btnDangXuat.setText("Dang Xuat");
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuBarLayout = new javax.swing.GroupLayout(pnMenuBar);
        pnMenuBar.setLayout(pnMenuBarLayout);
        pnMenuBarLayout.setHorizontalGroup(
            pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuBarLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnMenuBarLayout.createSequentialGroup()
                .addGroup(pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuBarLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(lblTenNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuBarLayout.setVerticalGroup(
            pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblTenNhanVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        kGradientPanel1.add(pnMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1484, 0, -1, 755));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/nen8.png"))); // NOI18N
        jTabbedPane1.addTab("tab1", jLabel2);
        jTabbedPane1.addTab("tab2", pnlDoanhThu1);
        jTabbedPane1.addTab("tab3", pnlGiamGia1);
        jTabbedPane1.addTab("tab4", pnlSanPham2);
        jTabbedPane1.addTab("tab5", pnlNhanVien2);
        jTabbedPane1.addTab("tab6", pnlHoaDon_HDCT1);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -35, 1290, 720));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (4).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1417, 22, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMouseClicked
        // TODO add your handling code here:
        open_TrangChu();

    }//GEN-LAST:event_lblMainMouseClicked

    private void lblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductMouseClicked
        // TODO add your handling code here:
        open_SanPham();

    }//GEN-LAST:event_lblProductMouseClicked

    private void lblBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillMouseClicked
        // TODO add your handling code here:
        open_Hoadon();

    }//GEN-LAST:event_lblBillMouseClicked

    private void lblRevenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRevenueMouseClicked
        // TODO add your handling code here:
        open_DoanhThu();

    }//GEN-LAST:event_lblRevenueMouseClicked

    private void lblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStaffMouseClicked
        // TODO add your handling code here:
        open_NhanVien();

    }//GEN-LAST:event_lblStaffMouseClicked

    private void lblGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGiamGiaMouseClicked
        // TODO add your handling code here:
        open_Giamgia();

    }//GEN-LAST:event_lblGiamGiaMouseClicked

    private void lblInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInforMouseClicked
        // TODO add your handling code here:
        open_GioiThieu();
    }//GEN-LAST:event_lblInforMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        close();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        open();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:
        change_Password();
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        // TODO add your handling code here:
        open_TrangChu();
    }//GEN-LAST:event_lblLogoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainYumFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainYumFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainYumFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainYumFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainYumFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnDangXuat;
    private com.k33ptoo.components.KButton btnDoiMatKhau;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblBill;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblInfor;
    private javax.swing.JLabel lblInfor1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblRevenue;
    private javax.swing.JLabel lblStaff;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnMenuBar;
    private UI.pnlDoanhThu pnlDoanhThu1;
    private UI.pnlGiamGia pnlGiamGia1;
    private UI.pnlHoaDon_HDCT pnlHoaDon_HDCT1;
    private UI.pnlNhanVien pnlNhanVien2;
    private UI.pnlSanPham pnlSanPham2;
    // End of variables declaration//GEN-END:variables

    void open() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (pnMenuBar.getBounds().width < 360) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            pnMenuBar.setBounds(pnMenuBar.getBounds().x - 1, pnMenuBar.getBounds().y, pnMenuBar.getBounds().width + 1, pnMenuBar.getBounds().height);
                        }
                    });
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        }).start();
    }

    void close() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (pnMenuBar.getBounds().width > 0) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            pnMenuBar.setBounds(pnMenuBar.getBounds().x + 1, pnMenuBar.getBounds().y, pnMenuBar.getBounds().width - 1, pnMenuBar.getBounds().height);
                        }
                    });
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        }).start();
    }

    private void open_GioiThieu() {
        new GioiThieuJDiaLog(this, true).setVisible(true);
    }

    private void open_Hoadon() {
        jTabbedPane1.setSelectedIndex(5);
        color_HoaDon();
    }

    private void open_Giamgia() {
        jTabbedPane1.setSelectedIndex(2);
        color_GiamGia();
    }

    private void open_NhanVien() {
        jTabbedPane1.setSelectedIndex(4);
        color_NhanVien();
    }

    private void open_SanPham() {
        jTabbedPane1.setSelectedIndex(3);
        color_SanPham();
    }

    private void open_DoanhThu() {
        jTabbedPane1.setSelectedIndex(1);
        color_DoanhThu();
    }

    private void open_TrangChu() {
        color_TrangChu();
        jTabbedPane1.setSelectedIndex(0);
    }

    private void logout() {
//        this.dispose();
//        Auth.clear();
        Auth.isLogout();
        this.dispose();
        if (!Auth.isLogin()) {
            new MainYumFood().setVisible(true);
        }
    }

    private void change_Password() {
        new DoiMatKhauJDiaLog(this, true).setVisible(true);
    }

    private void color_TrangChu() {
        lblBill.setForeground(Color.BLACK);
        lblStaff.setForeground(Color.BLACK);
        lblProduct.setForeground(Color.BLACK);
        lblRevenue.setForeground(Color.BLACK);
        lblGiamGia.setForeground(Color.BLACK);
        lblMain.setForeground(new Color(0, 140, 23, 200));
    }

    private void color_NhanVien() {
        lblBill.setForeground(Color.BLACK);
        lblStaff.setForeground(new Color(0, 140, 23, 200));
        lblProduct.setForeground(Color.BLACK);
        lblRevenue.setForeground(Color.BLACK);
        lblGiamGia.setForeground(Color.BLACK);
        lblMain.setForeground(Color.BLACK);
    }

    private void color_SanPham() {
        lblBill.setForeground(Color.BLACK);
        lblStaff.setForeground(Color.BLACK);
        lblProduct.setForeground(new Color(0, 140, 23, 200));
        lblRevenue.setForeground(Color.BLACK);
        lblGiamGia.setForeground(Color.BLACK);
        lblMain.setForeground(Color.BLACK);
    }

    private void color_HoaDon() {
        lblBill.setForeground(new Color(0, 140, 23, 200));
        lblStaff.setForeground(Color.BLACK);
        lblProduct.setForeground(Color.BLACK);
        lblRevenue.setForeground(Color.BLACK);
        lblGiamGia.setForeground(Color.BLACK);
        lblMain.setForeground(Color.BLACK);
    }

    private void color_DoanhThu() {
        lblBill.setForeground(Color.BLACK);
        lblStaff.setForeground(Color.BLACK);
        lblProduct.setForeground(Color.BLACK);
        lblRevenue.setForeground(new Color(0, 140, 23, 200));
        lblGiamGia.setForeground(Color.BLACK);
        lblMain.setForeground(Color.BLACK);
    }

    private void color_GiamGia() {
        lblBill.setForeground(Color.BLACK);
        lblStaff.setForeground(Color.BLACK);
        lblProduct.setForeground(Color.BLACK);
        lblRevenue.setForeground(Color.BLACK);
        lblGiamGia.setForeground(new Color(0, 140, 23, 200));
        lblMain.setForeground(Color.BLACK);
    }

    private void init() {
        this.setTitle("YUMFOOD - CỬA HÀNG BÁN THỨC ĂN NHANH");
        this.setLocationRelativeTo(null);
        color_TrangChu();
        if (!Auth.logout) {
            new ChaoJDialog(this, true).setVisible(true);
        }
        new DangNhapJDiaLog(this, true).setVisible(true);
        if (Auth.nv != null) {
            lblTenNhanVien.setText(Auth.nv.getHoTen());
        }else{
            lblTenNhanVien.setText("Ban Chua Dang Nhap");
        }

    }
}
