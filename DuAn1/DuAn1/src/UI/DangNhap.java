/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import Utils.Auth;
import Utils.MsgBox;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFrame;


public class DangNhap extends javax.swing.JDialog {

    public DangNhap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        lblHinhAnh = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        lblDangNhap = new javax.swing.JLabel();
        lblQuenMatkhau = new javax.swing.JLabel();
        lblThoat = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnDangNhap = new com.k33ptoo.components.KButton();
        txttendangnhap = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        kGradientPanel2.setkEndColor(new Color(81,246,155,200));
        kGradientPanel2.setkStartColor(new Color(222,244,222,200));

        lblHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.jpg"))); // NOI18N
        lblHinhAnh.setText(" ");

        kGradientPanel3.setkEndColor(new Color(255,255,255,200));
        kGradientPanel3.setkStartColor(new Color(222,244,222,200));

        lblDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDangNhap.setForeground(new Color(0,140,23,200));
        lblDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangNhap.setText("Đăng nhập");

        lblQuenMatkhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuenMatkhau.setText("Quên mật khẩu");
        lblQuenMatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatkhauMouseClicked(evt);
            }
        });

        lblThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThoat.setText("Thoát");
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });

        txtPass.setBackground(new Color(0,0,0,0));
        txtPass.setText("Nhap mat khau");
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtPass.setEchoChar('\u0000');

        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.setkBackGroundColor(new java.awt.Color(0, 255, 0));
        btnDangNhap.setkHoverForeGround(new java.awt.Color(0, 255, 0));
        btnDangNhap.setkHoverStartColor(new java.awt.Color(51, 153, 0));
        btnDangNhap.setkSelectedColor(new java.awt.Color(204, 255, 204));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        txttendangnhap.setBackground(new Color(0,0,0,0));
        txttendangnhap.setText("Nhập MANV");
        txttendangnhap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQuenMatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(txttendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblQuenMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblQuenMatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatkhauMouseClicked
        // TODO add your handling code here:
        open_QuenMatKhau();
    }//GEN-LAST:event_lblQuenMatkhauMouseClicked

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        // TODO add your handling code here:
        Close();
    }//GEN-LAST:event_lblThoatMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        Login(); // TODO add your handling code here:
    }//GEN-LAST:event_btnDangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhap dialog = new DangNhap(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnDangNhap;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JLabel lblQuenMatkhau;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txttendangnhap;
    // End of variables declaration//GEN-END:variables
    NhanVienDAO dao = new NhanVienDAO();

    public void init() {
        this.setLocationRelativeTo(null);
        TextName();
        TextPass();
        this.setTitle("YUMFOOD - ĐĂNG NHẬP");
    }

    private void Login() {
        try {
            String userName = String.valueOf(txttendangnhap.getText());
            System.out.println(userName);
            String passWord = String.valueOf(txtPass.getPassword());
            System.out.println(passWord);
            NhanVien nv = dao.SelectByID(userName);
            System.out.println("0");
            if (nv == null) {
                MsgBox.alert(this, "Khong ton tai nhan vien nay");
            } else if (!passWord.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "Sai mật khẩu");
            } else {
                MsgBox.alert(this, "Dang Nhap Thanh Cong");
                Auth.nv = nv;
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Logout() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc ứng dụng ?")) {
            System.exit(0);
        }
    }

    public int Validate() {
        int check = 0;
        String mk = String.valueOf(txttendangnhap.getText());
        String mk1 = String.valueOf(txtPass.getPassword());

        if (mk.equals("Nhập Tên đăng nhập")) {
            txttendangnhap.setBackground(Color.yellow);
            MsgBox.alert(this, "Tên đăng nhập trống");
        } else if (!mk.isEmpty()) {
            txttendangnhap.setBackground(Color.white);
            check++;
        }

        if (mk1.equals("Nhập mật khau")) {
            txtPass.setBackground(Color.yellow);
            MsgBox.alert(this, "Mật khẩu đang trống");
        } else {
            txtPass.setBackground(Color.white);
            check++;
        }
        return check;
    }

    public void TextName() {

        txttendangnhap.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txttendangnhap.getText().equals("Nhập MANV")) {
                    txttendangnhap.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txttendangnhap.getText().isEmpty()) {
                    txttendangnhap.setText("Nhập MANV");
                }
            }

        });
    }

    public void TextPass() {
        txtPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPass.getText().equals("Nhap mat khau")) {
                    txtPass.setEchoChar('\u2022');
                    txtPass.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPass.getText().isEmpty()) {
                    txtPass.setEchoChar('\u0000');
                    txtPass.setText("Nhap mat khau");
                }
            }

        });
    }

    private void open_QuenMatKhau() {
        this.dispose();
        new QuenMatKhauJDiaLog(new JFrame(), true).setVisible(true);
    }

    private void Close() {
        System.exit(0);
    }
}
