
package UI;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import Utils.Auth;
import Utils.MsgBox;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class DoiMatKhauJDiaLog extends javax.swing.JDialog {


	
    public DoiMatKhauJDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        jLabel2.requestFocus();
//        TextSDT();
        TextPassCu();
        TextPassNew();
        this.setTitle("YUMFOOD - ĐỔI MẬT KHẨU");
    }

    

    public com.k33ptoo.components.KButton getkButton2() {
		return kButton2;
	}



	public void setkButton2(com.k33ptoo.components.KButton kButton2) {
		this.kButton2 = kButton2;
	}



	public javax.swing.JPasswordField getTxtPass() {
		return txtPass;
	}



	public void setTxtPass(javax.swing.JPasswordField txtPass) {
		this.txtPass = txtPass;
	}



	public javax.swing.JPasswordField getTxtPassNew1() {
		return txtPassNew1;
	}



	public void setTxtPassNew1(javax.swing.JPasswordField txtPassNew1) {
		this.txtPassNew1 = txtPassNew1;
	}



	public javax.swing.JPasswordField getTxtPassNew2() {
		return txtPassNew2;
	}



	public void setTxtPassNew2(javax.swing.JPasswordField txtPassNew2) {
		this.txtPassNew2 = txtPassNew2;
	}



	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtPassNew1 = new javax.swing.JPasswordField();
        txtPassNew2 = new javax.swing.JPasswordField();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("YumFood - Đổi mật khẩu");
        setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new Color(81,246,155,200));
        kGradientPanel1.setkStartColor(new Color(222,244,222,200));

        kGradientPanel2.setkEndColor(new Color(255,255,255,200));
        kGradientPanel2.setkStartColor(new Color(222,244,222,200));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new Color(0,140,23,200));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đổi Mật Khẩu");

        txtPass.setBackground(new Color(0,0,0,0)
        );
        txtPass.setText("Nhập mật khẩu cũ");
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtPass.setEchoChar('\u0000');

        txtPassNew1.setBackground(new Color(0,0,0,0));
        txtPassNew1.setText("Nhập mật khẩu mới");
        txtPassNew1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtPassNew1.setEchoChar('\u0000');

        txtPassNew2.setBackground(new Color(0,0,0,0));
        txtPassNew2.setText("Xác nhận mật khẩu mới");
        txtPassNew2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtPassNew2.setEchoChar('\u0000');

        kButton1.setText("Thoát");
        kButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        kButton1.setkEndColor(new java.awt.Color(0, 153, 153));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton1.setkSelectedColor(new java.awt.Color(0, 153, 153));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Lưu  thay đổi");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton2.setkSelectedColor(new java.awt.Color(0, 153, 153));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassNew2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassNew1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        kGradientPanel3.setkEndColor(new Color(255,255,255,200));
        kGradientPanel3.setkStartColor(new java.awt.Color(51, 255, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/store.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        Thoat();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_kButton2ActionPerformed

    NhanVienDAO nvDAO = new NhanVienDAO();

    public void TextPassCu() {
        txtPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPass.getText().equals("Nhập mật khẩu cũ")) {
                    txtPass.setEchoChar('\u2022');
                    txtPass.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPass.getText().isEmpty()) {
                    txtPass.setEchoChar('\u0000');
                    txtPass.setText("Nhập mật khẩu cũ");
                }
            }

        });
    }

    public void TextPassNew() {
        txtPassNew1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPassNew1.getText().equals("Nhập mật khẩu mới")) {
                    txtPassNew1.setEchoChar('\u2022');
                    txtPassNew1.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPassNew1.getText().isEmpty()) {
                    txtPassNew1.setEchoChar('\u0000');
                    txtPassNew1.setText("Nhập mật khẩu mới");
                }
            }

        });
        txtPassNew2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPassNew2.getText().equals("Xác nhận mật khẩu mới")) {
                    txtPassNew2.setEchoChar('\u2022');
                    txtPassNew2.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPassNew2.getText().isEmpty()) {
                    txtPassNew2.setEchoChar('\u0000');
                    txtPassNew2.setText("Xác nhận mật khẩu mới");
                }
            }

        });
    }

    public int Validate() {
        int check = 0;
        String mk = String.valueOf(txtPass.getPassword());
        String mk1 = String.valueOf(txtPassNew1.getPassword());
        String mk2 = String.valueOf(txtPassNew2.getPassword());
        if (mk.equals("Nhập mật khẩu cũ")) {
            txtPass.setBackground(Color.yellow);
            MsgBox.alert(this, "Mật khẩu cũ đang trống");
        } else if (!mk.isEmpty()) {
            txtPass.setBackground(Color.white);
            check++;
        }

        if (mk1.equals("Nhập mật khẩu mới")) {
            txtPassNew1.setBackground(Color.yellow);
            MsgBox.alert(this, "Mật khẩu mới đang trống");
        } else {
            txtPassNew1.setBackground(Color.white);
            check++;
        }
        if (mk2.equals("Xác nhận mật khẩu mới")) {
            txtPassNew2.setBackground(Color.yellow);
            MsgBox.alert(this, "Xác nhận mật khẩu đang rỗng");
        } else {
            if (!mk1.equals(mk2)) {
                MsgBox.alert(this, "Xác nhận mật khẩu không chính xác");
                txtPassNew2.setBackground(Color.yellow);
            } else {
                txtPassNew2.setBackground(Color.white);
                check++;
            }
        }
        return check;
    }

    public void Reset() {
        jLabel1.requestFocus();
        TextPassCu();
        TextPassNew();
    }

    public void Thoat() {
        this.dispose();
    }

    public void Update() {
        if (Validate() == 3) {
            Auth.nv.setMatKhau(String.valueOf(txtPassNew2.getPassword()));
            nvDAO.UpdateMatKhau(Auth.nv);
            MsgBox.alert(this, "Đổi mật khẩu thành công");
            Reset();
        }
    }

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
            java.util.logging.Logger.getLogger(DoiMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhauJDiaLog dialog = new DoiMatKhauJDiaLog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassNew1;
    private javax.swing.JPasswordField txtPassNew2;
    // End of variables declaration//GEN-END:variables
}
