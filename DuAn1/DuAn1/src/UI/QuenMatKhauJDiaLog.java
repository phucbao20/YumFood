/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import Utils.Auth;
import Utils.MsgBox;
import Utils.gmail;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author PHUCBAO
 */
public class QuenMatKhauJDiaLog extends javax.swing.JDialog {

    NhanVienDAO nvDAO = new NhanVienDAO();
    public String generatedString = RandomStringUtils.random(7, true, true);
    String regexPattern = "[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
//    public String str = generatedString;

    /**
     * Creates new form QuenMatKhau
     */
    public QuenMatKhauJDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Form1();
        Form2();
        Form3();
        setTitle("YUMFOOD - ĐỔI MẬT KHẨU");
    }

    void requestFocus1() {
        jTabbedPane1.requestFocus();
    }

    void getMaXN() {
        new Thread() {
            @Override
            public void run() {
                gmail.send(txtEmail.getText(), "Admin", generatedString);
            }
        }.start();
    }

    public void Form1() {

        txtEmail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtEmail.getText().equals("Nhập Email")) {
                    txtEmail.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtEmail.getText().isEmpty()) {
                    txtEmail.setText("Nhập Email");
                }
            }

        });

    }

    public void Form2() {
//        jLabel3.requestFocus(false);
        Auth.vetificationCode = generatedString;
        txtMaXT.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {

                if (txtMaXT.getText().equals("Nhập mã xác thực")) {
                    txtMaXT.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtMaXT.getText().isEmpty()) {
                    txtMaXT.setText("Nhập mã xác thực");
                }
            }
        });

    }

    public void Form3() {

        txtMaNV.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtMaNV.getText().equals("Nhập mã nhân viên")) {
                    txtMaNV.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtMaNV.getText().isEmpty()) {
                    txtMaNV.setText("Nhập mã nhân viên");
                }
            }
        });
        txtPassNew.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPassNew.getText().equals("Nhập mật khẩu mới")) {
                    txtPassNew.setEchoChar('\u2022');
                    txtPassNew.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPassNew.getText().isEmpty()) {
                    txtPassNew.setEchoChar('\u0000');
                    txtPassNew.setText("Nhập mật khẩu mới");
                }
            }

        });
        txtPassNew2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPassNew2.getText().equals("Xác nhận mật khẩu")) {
                    txtPassNew2.setEchoChar('\u2022');
                    txtPassNew2.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPassNew2.getText().isEmpty()) {
                    txtPassNew2.setEchoChar('\u0000');
                    txtPassNew2.setText("Xác nhận mật khẩu");
                }
            }

        });
    }

    int Validate1() {
        int check = 0;
        requestFocus1();
        if (txtEmail.getText().equals("Nhập Email")) {
            txtEmail.setBackground(Color.yellow);
            MsgBox.alert(this, "Email của bạn đang rỗng");
            return check;
        } else {
            txtEmail.setBackground(Color.white);
            check++;
        }
        if (patternMatches(txtEmail.getText(), regexPattern) == false) {
            txtEmail.setBackground(Color.yellow);
            MsgBox.alert(this, "Email của bạn ko đúng định dạng");
        } else {
            txtEmail.setBackground(Color.white);
            check++;
        }
        return check;
    }

    public void Check() {
        if (txtMaXT.getText().equals("Nhập mã xác thực")) {
            txtMaXT.setBackground(Color.yellow);
            MsgBox.alert(this, "Mã xác thực của bạn đang rỗng");
        }
        if (txtMaXT.getText().equals(Auth.vetificationCode)) {
//            this.dispose();

            jTabbedPane1.setSelectedIndex(2);
            requestFocus1();
//            new QuenMatKhau3JDiaLog(null, true).setVisible(true);

        } else {
            System.out.println(Auth.vetificationCode);
            MsgBox.alert(this, "Mã xác thực không đúng");
            txtMaXT.setBackground(Color.yellow);
        }
    }

    public int Validate3() {
        int check = 0;
        String mk1 = String.valueOf(txtPassNew.getPassword());
        String mk2 = String.valueOf(txtPassNew2.getPassword());
        if (txtMaNV.getText().equals("Nhập mã nhân viên")) {
            txtMaNV.setBackground(Color.yellow);
            MsgBox.alert(this, "Mã nhân viên đang rỗng");
        } else {
            txtMaNV.setBackground(Color.white);
            check++;
        }
        if (mk1.equals("Nhập mật khẩu mới")) {
            txtPassNew.setBackground(Color.yellow);
            MsgBox.alert(this, "Mật khẩu mới đang rỗng");
        } else {
            txtPassNew.setBackground(Color.white);
            check++;
        }
        if (mk2.equals("Xác nhận mật khẩu mới")) {
            txtPassNew2.setBackground(Color.yellow);
            MsgBox.alert(this, "Xác nhận mật khẩu mới đang rỗng");
        } else {
            if (!mk2.equals(mk1)) {
                txtPassNew2.setBackground(Color.yellow);
                MsgBox.alert(this, "Xác nhận mật khẩu mới không trùng khớp");
            } else {
                txtPassNew2.setBackground(Color.white);
                check++;
            }
        }
        return check;
    }

    public void Reset() {
        jLabel1.requestFocus();
        Form3();
    }

    public void Update() {
        try {
            NhanVien nv = nvDAO.SelectByID(txtMaNV.getText());
            nv.setMatKhau(String.valueOf(txtPassNew2.getPassword()));
            nvDAO.UpdateMatKhau(nv);
            MsgBox.alert(this, "Thay đổi mật khẩu thành công");
        } catch (Exception ex) {
            MsgBox.alert(this, "Thay đổi mật khẩu thất bại");
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * uo WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaXT = new javax.swing.JTextField();
        kButton2 = new com.k33ptoo.components.KButton();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        txtPassNew = new javax.swing.JPasswordField();
        txtPassNew2 = new javax.swing.JPasswordField();
        txtMaNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel7 = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();

        kGradientPanel2.setkEndColor(new Color(255,255,255,200));
        kGradientPanel2.setkStartColor(new Color(255,255,255,200));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new Color(81,246,155,200));
        kGradientPanel1.setkStartColor(new Color(222,244,222,200));

        kGradientPanel3.setkEndColor(new Color(255,255,255,200));
        kGradientPanel3.setkStartColor(new Color(222,244,222,200));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel4.setkEndColor(new Color(255,255,255,200));
        kGradientPanel4.setkStartColor(new Color(222,244,222,200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(0,140,23,200));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quên mật khẩu");

        txtEmail.setBackground(new Color(0,0,0,0));
        txtEmail.setText("Nhập Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtEmail.setCaretPosition(0);

        kButton1.setText("Tiếp theo");
        kButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(0, 153, 153));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmail)
                .addContainerGap())
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", kGradientPanel4);

        kGradientPanel5.setkEndColor(new Color(255,255,255,200));
        kGradientPanel5.setkStartColor(new Color(222,244,222,200));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new Color(0,140,23,200));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quên mật khẩu");

        txtMaXT.setBackground(new Color(0,0,0,0));
        txtMaXT.setText("Nhập mã xác thực");
        txtMaXT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtMaXT.setVerifyInputWhenFocusTarget(false);

        kButton2.setText("Tiếp theo");
        kButton2.setkBackGroundColor(new java.awt.Color(0, 153, 153));
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

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaXT)
                .addContainerGap())
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(txtMaXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", kGradientPanel5);

        kGradientPanel6.setkEndColor(new Color(255,255,255,200));
        kGradientPanel6.setkStartColor(new Color(222,244,222,200));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new Color(0,140,23,200));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quên mật khẩu");

        kButton3.setText("Lưu thay đổi");
        kButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        kButton3.setkEndColor(new java.awt.Color(0, 153, 153));
        kButton3.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton3.setkSelectedColor(new java.awt.Color(0, 153, 153));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        txtPassNew.setBackground(new Color(0,0,0,0));
        txtPassNew.setText("Nhập mật khẩu mới");
        txtPassNew.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtPassNew.setEchoChar('\u0000');
        txtPassNew.setFocusCycleRoot(true);

        txtPassNew2.setBackground(new Color(0,0,0,0));
        txtPassNew2.setText("Xác nhận mật khẩu");
        txtPassNew2.setToolTipText("");
        txtPassNew2.setActionCommand("<Not Set>");
        txtPassNew2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtPassNew2.setEchoChar('\u0000');

        txtMaNV.setBackground(new Color(0,0,0,0));
        txtMaNV.setText("Nhập mã nhân viên");
        txtMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(81,246,155,200)));
        txtMaNV.setPreferredSize(new java.awt.Dimension(64, 18));

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPassNew))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPassNew2))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPassNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("tab3", kGradientPanel6);

        kGradientPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -34, 295, 332));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reset-password.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        kGradientPanel7.setkEndColor(new Color(255,255,255,200));
        kGradientPanel7.setkStartColor(new java.awt.Color(51, 255, 51));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/store.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        if (Validate1() == 2) {
            getMaXN();
            jTabbedPane1.setSelectedIndex(1);

            requestFocus();

        }


    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        Check();
        requestFocus1();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        if (Validate3() == 3) {
            Update();
            Reset();
            this.dispose();
            new DangNhapJDiaLog(null, true).setVisible(true);
        }
    }//GEN-LAST:event_kButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(QuenMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuenMatKhauJDiaLog dialog = new QuenMatKhauJDiaLog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel7;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaXT;
    private javax.swing.JPasswordField txtPassNew;
    private javax.swing.JPasswordField txtPassNew2;
    // End of variables declaration//GEN-END:variables
}
