package UI;

import DAO.LoaiGiamGiaDAO;
import Entity.LoaiGiamGia;
import Utils.ExportEx;
import Utils.MsgBox;
import Utils.XDate;
import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class pnlGiamGia extends javax.swing.JPanel {

    public pnlGiamGia() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVoucher = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNameVoucher = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStartDay = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        txtEndDay = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        btnDelete = new com.k33ptoo.components.KButton();
        btnUpdate = new com.k33ptoo.components.KButton();
        btnAdd = new com.k33ptoo.components.KButton();
        lblTitle1 = new javax.swing.JLabel();
        btnNew = new com.k33ptoo.components.KButton();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        btnEnd = new com.k33ptoo.components.KButton();
        btnFirst = new com.k33ptoo.components.KButton();
        btnNext = new com.k33ptoo.components.KButton();
        btnPrev = new com.k33ptoo.components.KButton();
        btnExport = new com.k33ptoo.components.KButton();

        kGradientPanel4.setkEndColor(new Color(81,246,155,200));
        kGradientPanel4.setkStartColor(new Color(222,244,222,200));

        kGradientPanel5.setkEndColor(new Color(255,255,255,200));
        kGradientPanel5.setkStartColor(new Color(222,244,222,200));

        jLabel2.setText("Mã giảm giá");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtVoucher.setPreferredSize(new java.awt.Dimension(64, 35));

        jLabel3.setText("Tên chương trình");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setText("Ngày bắt đầu");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setText("Ngày kết thúc");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setText("Giá trị");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnDelete.setText("Xóa");
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnDelete.setkEndColor(new java.awt.Color(0, 153, 153));
        btnDelete.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnDelete.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnDelete.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnDelete.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnDelete.setMaximumSize(new java.awt.Dimension(100, 100));
        btnDelete.setMinimumSize(new java.awt.Dimension(100, 100));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnUpdate.setkEndColor(new java.awt.Color(0, 153, 153));
        btnUpdate.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnUpdate.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnUpdate.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnUpdate.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnUpdate.setMaximumSize(new java.awt.Dimension(100, 100));
        btnUpdate.setMinimumSize(new java.awt.Dimension(100, 100));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnAdd.setkEndColor(new java.awt.Color(0, 153, 153));
        btnAdd.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnAdd.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAdd.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnAdd.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnAdd.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAdd.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblTitle1.setText("GIẢM GIÁ");
        lblTitle1.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        lblTitle1.setForeground(new Color(10,140,23,200));

        btnNew.setText("Mới");
        btnNew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNew.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnNew.setkEndColor(new java.awt.Color(0, 153, 153));
        btnNew.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnNew.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnNew.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnNew.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnNew.setMaximumSize(new java.awt.Dimension(100, 100));
        btnNew.setMinimumSize(new java.awt.Dimension(100, 100));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel5Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameVoucher, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStartDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEndDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValue, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblTitle1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(txtVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(txtNameVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(txtStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(txtEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel6.setkEndColor(new Color(255,255,255,200));
        kGradientPanel6.setkStartColor(new Color(222,244,222,200));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã giảm giá", "Tên chương trình", "Ngày bắt đầu", "Ngày kết thúc", "Giá trị"
            }
        ));
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        btnEnd.setText(">|");
        btnEnd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnd.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnEnd.setkEndColor(new java.awt.Color(0, 153, 153));
        btnEnd.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnEnd.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEnd.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnEnd.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnEnd.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEnd.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirst.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnFirst.setkEndColor(new java.awt.Color(0, 153, 153));
        btnFirst.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnFirst.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnFirst.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnFirst.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnFirst.setMaximumSize(new java.awt.Dimension(100, 100));
        btnFirst.setMinimumSize(new java.awt.Dimension(100, 100));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnNext.setkEndColor(new java.awt.Color(0, 153, 153));
        btnNext.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnNext.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnNext.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnNext.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnNext.setMaximumSize(new java.awt.Dimension(100, 100));
        btnNext.setMinimumSize(new java.awt.Dimension(100, 100));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnPrev.setkEndColor(new java.awt.Color(0, 153, 153));
        btnPrev.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnPrev.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnPrev.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnPrev.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnPrev.setMaximumSize(new java.awt.Dimension(100, 100));
        btnPrev.setMinimumSize(new java.awt.Dimension(100, 100));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnExport.setText("Xuất file Excel");
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnExport.setkEndColor(new java.awt.Color(0, 153, 153));
        btnExport.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btnExport.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnExport.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        btnExport.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btnExport.setMaximumSize(new java.awt.Dimension(100, 100));
        btnExport.setMinimumSize(new java.awt.Dimension(100, 100));
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1297, Short.MAX_VALUE)
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Remove();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Add();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
        clicked();
    }//GEN-LAST:event_tblTableMouseClicked

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        // TODO add your handling code here:\
        Last();
    }//GEN-LAST:event_btnEndActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        First();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        Next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        Prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        exporttEx();
    }//GEN-LAST:event_btnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAdd;
    private com.k33ptoo.components.KButton btnDelete;
    private com.k33ptoo.components.KButton btnEnd;
    private com.k33ptoo.components.KButton btnExport;
    private com.k33ptoo.components.KButton btnFirst;
    private com.k33ptoo.components.KButton btnNew;
    private com.k33ptoo.components.KButton btnNext;
    private com.k33ptoo.components.KButton btnPrev;
    private com.k33ptoo.components.KButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTable tblTable;
    private com.github.lgooddatepicker.components.DatePicker txtEndDay;
    private javax.swing.JTextField txtNameVoucher;
    private com.github.lgooddatepicker.components.DatePicker txtStartDay;
    private javax.swing.JTextField txtValue;
    private javax.swing.JTextField txtVoucher;
    // End of variables declaration//GEN-END:variables

    LoaiGiamGiaDAO LGG_DAO = new LoaiGiamGiaDAO();
    int index = -1;

    public void init() {
        fillToTable();

    }

    public void fillToTable() {
        System.out.println("FillToTable");
        DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
        model.setRowCount(0);
        List<LoaiGiamGia> list = LGG_DAO.selectAll();
        if (list != null) {
            for (LoaiGiamGia loai : list) {
                model.addRow(new Object[]{loai.getMaGG(), loai.getTenCT(), loai.getNgayBD(), loai.getNgayKT(), loai.getGiaTri() + "%"});
            }
            tblTable.setModel(model);
        }
    }

    public void setForm(LoaiGiamGia loai) {
        txtVoucher.setText(loai.getMaGG());
        txtNameVoucher.setText(loai.getTenCT());
        if (loai.getNgayBD() == null && loai.getNgayKT() == null) {
            txtStartDay.setDate(null);
            txtEndDay.setDate(null);
        } else {
            txtStartDay.setDate(new java.sql.Date(loai.getNgayBD().getTime()).toLocalDate());
            txtEndDay.setDate(new java.sql.Date(loai.getNgayKT().getTime()).toLocalDate());
        }
        txtValue.setText(String.valueOf(loai.getGiaTri()));
    }

    public LoaiGiamGia getForm() {
        LoaiGiamGia loai = new LoaiGiamGia();
        loai.setMaGG(txtVoucher.getText());
        loai.setTenCT(txtNameVoucher.getText());
        loai.setNgayBD(XDate.toDate(XDate.toString(java.sql.Date.valueOf(txtStartDay.getDate()), "dd-MM-yyyy"), "dd-MM-yyyy"));
        loai.setNgayKT(XDate.toDate(XDate.toString(java.sql.Date.valueOf(txtEndDay.getDate()), "dd-MM-yyyy"), "dd-MM-yyyy"));
        loai.setGiaTri(Integer.parseInt(txtValue.getText()));
        return loai;
    }

    public void clicked() {
        index = tblTable.getSelectedRow();
        String maGG = (String) tblTable.getValueAt(index, 0);
        LoaiGiamGia list = LGG_DAO.SelectByID(maGG);
        setForm(list);
        txtVoucher.setEnabled(false);
        btnAdd.setEnabled(false);
    }

    public void clearForm() {
        setForm(new LoaiGiamGia());
        btnAdd.setEnabled(true);
        txtVoucher.setEnabled(true);

    }

    public void Add() {
        if (Validate()) {
            LoaiGiamGia loai = getForm();
            try {

                LGG_DAO.insert(loai);
                fillToTable();
                clearForm();
                MsgBox.alert(this, "Thêm thành công !!");

            } catch (Exception e) {
                System.out.println("ERROR: ADD");
                MsgBox.alert(this, "Thêm thất bại !!");
                e.printStackTrace();
            }
        }
    }

    public void Remove() {
        if (txtVoucher.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập Mã Giảm Giá");
            return;
        }
        String maGG = txtVoucher.getText();
        try {
            if (LGG_DAO.SelectByID(maGG) == null) {
                MsgBox.alert(this, "Mã giảm giá không tồn tại !!");
                txtVoucher.requestFocus();
                return;
            } else {
                LGG_DAO.delete(maGG);
                fillToTable();
                clearForm();
                MsgBox.alert(this, "Xóa thành công !!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Xóa thất bại !!");
        }
    }

    public void Update() {
        if (Validate()) {
            LoaiGiamGia loai = getForm();
            try {
                LGG_DAO.update(loai);
                fillToTable();
                clearForm();
                MsgBox.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                System.out.println("ERROR: UPDATE");
                e.printStackTrace();
                MsgBox.alert(this, "Cập nhật thất bại");
            }
        }
    }

    public void edit() {
        String maGG = String.valueOf(tblTable.getValueAt(index, 0));
        LoaiGiamGia loai = LGG_DAO.SelectByID(maGG);
        setForm(loai);
    }

    public void First() {
        index = 0;
        tblTable.setRowSelectionInterval(index, index);
        edit();
    }

    public void Prev() {
        index = tblTable.getSelectedRow();
        if (index > 0) {
            index--;
            tblTable.setRowSelectionInterval(index, index);
            edit();
        }
    }

    public void Next() {
        index = tblTable.getSelectedRow();
        if (index < tblTable.getRowCount() - 1) {
            index++;
            tblTable.setRowSelectionInterval(index, index);
            edit();
        }
    }

    public void Last() {
        index = tblTable.getRowCount() - 1;
        tblTable.setRowSelectionInterval(index, index);
        edit();
    }

    public void exporttEx() {
        Map<String, Object[]> studentData = new HashMap<>();
        studentData.put(
                "1",
                new Object[]{"Mã giảm giá", "Tên chương trình", "Ngày bất đầu", "Ngày kết thúc", "Giá trị"
                }
        );
        List<LoaiGiamGia> list = LGG_DAO.selectAll();
        for (int i = 0; i < list.size(); i++) {
            studentData.put(
                    // STT của hàng (i)
                    String.valueOf(i + 2),
                    // nội dung
                    new Object[]{list.get(i).getMaGG(),
                        list.get(i).getTenCT(),
                        list.get(i).getNgayBD(),
                        list.get(i).getNgayKT(),
                        list.get(i).getGiaTri(),}
            );
        }
        File path = new File("DANH SACH GIAM GIA");
        ExportEx.exportExcel(studentData, path, "Giảm giá");
        MsgBox.alert(this, "Xuất file thành công !!");
    }

    public boolean Validate() {
        if (txtVoucher.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Mã Giảm Giá");
            return false;
        } else if (txtVoucher.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Tên Chương Trình");
            return false;
        } else if (txtStartDay.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Ngày Kết Thúc");
            return false;
        } else if (txtEndDay.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Ngày Kết Thúc");
            return false;
        } else if (!txtValue.getText().matches("(?=.*[0-9])[0-9]+")) {
            MsgBox.alert(this, "Vui lòng kiểm tra lại Giá trị");
            return false;
        }
        return true;
    }
}
