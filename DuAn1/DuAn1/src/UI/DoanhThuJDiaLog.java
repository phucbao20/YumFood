package UI;

import DAO.ThongKeDAO;
import Entity.NhanVien;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XDate;
import Utils.exportFile;
import Utils.gmail;
import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
//import com.sun.source.doctree.AuthorTree;
import java.awt.Color;
import java.io.File;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
//import javax.swing.event.AncestorEvent;

public class DoanhThuJDiaLog extends javax.swing.JDialog {

    Map<String, Object[]> studentData
            = new TreeMap<String, Object[]>();

    public DoanhThuJDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

//        daStart.addDateChangeListener(new DateChangeListener() {
//            @Override
//            public void dateChanged(DateChangeEvent dce) {
//                Auth.date1 = daStart.getDate();
//                if (Auth.date2 != null) {
//                    initDoanhThuTong();
//                }
//            }
//        });
//        daEnd.addDateChangeListener(new DateChangeListener() {
//            @Override
//            public void dateChanged(DateChangeEvent dce) {
//                Auth.date2 = daEnd.getDate();
//                if (Auth.date1 != null) {
//                    initDoanhThuTong();
//                }
//            }
//        });
        Auth.nv = new NhanVien("PS006", "1", "Bao", "1", "1", true, "1", true);

        lblNgayHienTai.setText(XDate.toString(new Date(), "yyyy-MM-dd"));
        studentData.put(
                "1",
                new Object[]{"STT", "Tên San Phâm", "Gia", "So Luong", "Giam Gia", "Thanh Tien"}
        );
    }

    public void initDoanhThuTong() {
        fillToTableDoanhThuTong();
        FillDoanhThuTheoKhoang();
        FillSPBanChayTheoKhoang();
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
        jLabel1 = new javax.swing.JLabel();
        lblInfor = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        tabsDoanhThu = new javax.swing.JTabbedPane();
        pnlDoanhThuNgayHienTai = new javax.swing.JPanel();
        lblNgay = new javax.swing.JLabel();
        lblNgayHienTai = new javax.swing.JLabel();
        pTongSo = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        lblTongDT = new javax.swing.JLabel();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        lblTongHD = new javax.swing.JLabel();
        kGradientPanel7 = new com.k33ptoo.components.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        pnlQuanLyDoanhThu = new javax.swing.JPanel();
        daStart = new com.github.lgooddatepicker.components.DatePicker();
        daEnd = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDTTong = new javax.swing.JTable();
        pTongSo1 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        lblTongDT1 = new javax.swing.JLabel();
        kGradientPanel8 = new com.k33ptoo.components.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        lblTongHD1 = new javax.swing.JLabel();
        kGradientPanel9 = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        pnlSanPhamBanChay = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setkEndColor(new Color(222,244,222,200));
        kGradientPanel1.setkStartColor(new Color(81,246,155,200));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1487, 761));

        kGradientPanel2.setkEndColor(new Color(255,255,255,200));
        kGradientPanel2.setkStartColor(new Color(222,244,222,200));

        lblTitle.setText("QUẢN LÝ CỬA HÀNG YUMFOOD");
        lblTitle.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        lblTitle.setForeground(new Color(10,140,23,200));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/store.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblLogo)
                .addGap(472, 472, 472)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        kGradientPanel3.setkEndColor(new Color(222,244,222,200));
        kGradientPanel3.setkStartColor(new Color(255,255,255,200));

        lblMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        lblMain.setText("Trang chủ");
        lblMain.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblMain.setForeground(new Color(0,140,23,200));
        lblMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMouseClicked(evt);
            }
        });

        lblProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/gift.png"))); // NOI18N
        lblProduct.setText("Sản phẩm");
        lblProduct.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductMouseClicked(evt);
            }
        });

        lblBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill.png"))); // NOI18N
        lblBill.setText("Hóa đơn");
        lblBill.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBillMouseClicked(evt);
            }
        });

        lblRevenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/earning.png"))); // NOI18N
        lblRevenue.setText("Doanh Thu");
        lblRevenue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRevenue.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblRevenue.setForeground(new Color(0,140,23,200));

        lblStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/people.png"))); // NOI18N
        lblStaff.setText("Nhân viên");
        lblStaff.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStaffMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/discount.png"))); // NOI18N
        jLabel1.setText("Giảm giá");
        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        lblInfor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/light-bulb.png"))); // NOI18N
        lblInfor.setText("Giới thiệu");
        lblInfor.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblInfor.setMaximumSize(new java.awt.Dimension(104, 28));
        lblInfor.setMinimumSize(new java.awt.Dimension(104, 28));
        lblInfor.setPreferredSize(new java.awt.Dimension(104, 28));
        lblInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInforMouseClicked(evt);
            }
        });

        lblHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/question.png"))); // NOI18N
        lblHelp.setText("Trợ giúp");
        lblHelp.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblHelp.setRequestFocusEnabled(false);
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHelpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(lblMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRevenue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblHelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInfor, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblBill, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        kGradientPanel5.setkEndColor(new Color(222,244,222,200));
        kGradientPanel5.setkStartColor(new Color(255,255,255,200));

        tabsDoanhThu.setPreferredSize(new java.awt.Dimension(200, 100));

        pnlDoanhThuNgayHienTai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNgay.setText("Ngay : ");
        lblNgay.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        lblNgayHienTai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNgayHienTai.setForeground(new Color(0,140,23,200));

        pTongSo.setkEndColor(new Color(0,0,255,200));
        pTongSo.setkStartColor(new Color(255,0,255,200));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/financial-statement.png"))); // NOI18N
        jLabel4.setText("Tổng doanh thu");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        lblTongDT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongDT.setText("0");
        lblTongDT.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTongDT.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pTongSoLayout = new javax.swing.GroupLayout(pTongSo);
        pTongSo.setLayout(pTongSoLayout);
        pTongSoLayout.setHorizontalGroup(
            pTongSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
            .addComponent(lblTongDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pTongSoLayout.setVerticalGroup(
            pTongSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTongSoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lblTongDT)
                .addGap(21, 21, 21))
        );

        kGradientPanel6.setkEndColor(new Color(0,0,255,200));
        kGradientPanel6.setkStartColor(new Color(255,0,255,200));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/invoice.png"))); // NOI18N
        jLabel5.setText("Tổng số hóa đơn");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        lblTongHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongHD.setText("0");
        lblTongHD.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTongHD.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
            .addComponent(lblTongHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblTongHD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel7.setkEndColor(new Color(0,0,255,200));
        kGradientPanel7.setkStartColor(new Color(255,0,255,200));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/packaging.png"))); // NOI18N
        jLabel6.setText("Sản phẩm bán chạy");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("name");
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "TÊN SẢN PHẨM", "GIÁ", "SỐ LƯỢNG", "GIẢM GIÁ", "THÀNH TIỀN"
            }
        ));
        jScrollPane1.setViewportView(tblTable);

        kButton2.setText("GỬI MAIL BÁO CÁO");
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

        kButton3.setText("XUẤT FILE EXCEL");
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

        javax.swing.GroupLayout pnlDoanhThuNgayHienTaiLayout = new javax.swing.GroupLayout(pnlDoanhThuNgayHienTai);
        pnlDoanhThuNgayHienTai.setLayout(pnlDoanhThuNgayHienTaiLayout);
        pnlDoanhThuNgayHienTaiLayout.setHorizontalGroup(
            pnlDoanhThuNgayHienTaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuNgayHienTaiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNgayHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDoanhThuNgayHienTaiLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlDoanhThuNgayHienTaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDoanhThuNgayHienTaiLayout.createSequentialGroup()
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDoanhThuNgayHienTaiLayout.createSequentialGroup()
                        .addGroup(pnlDoanhThuNgayHienTaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(pnlDoanhThuNgayHienTaiLayout.createSequentialGroup()
                                .addComponent(pTongSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)
                                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        pnlDoanhThuNgayHienTaiLayout.setVerticalGroup(
            pnlDoanhThuNgayHienTaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuNgayHienTaiLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlDoanhThuNgayHienTaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNgayHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDoanhThuNgayHienTaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTongSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDoanhThuNgayHienTaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        tabsDoanhThu.addTab("Doanh Thu Ngay Hien Tai", pnlDoanhThuNgayHienTai);

        daStart.addDateChangeListener(new DateChangeListener() {
            @Override
            public void dateChanged(DateChangeEvent dce) {
                Auth.date1 = daStart.getDate();
                if (Auth.date2 != null) {
                    initDoanhThuTong();
                }
            }
        });

        daEnd.addDateChangeListener(new DateChangeListener() {
            @Override
            public void dateChanged(DateChangeEvent dce) {
                Auth.date2 = daEnd.getDate();
                if (Auth.date1 != null) {
                    initDoanhThuTong();
                }
            }
        });

        jLabel2.setText("Từ ngày:");

        jLabel3.setText("Đến ngày:");

        kButton4.setText("BIỂU ĐỒ");
        kButton4.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        kButton4.setkEndColor(new java.awt.Color(0, 153, 153));
        kButton4.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton4.setkSelectedColor(new java.awt.Color(0, 153, 153));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        kButton5.setText("XUẤT FILE EXCEL");
        kButton5.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        kButton5.setkEndColor(new java.awt.Color(0, 153, 153));
        kButton5.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton5.setkSelectedColor(new java.awt.Color(0, 153, 153));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

        tblDTTong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "TÊN SẢN PHẨM", "GIÁ", "GIẢM GIÁ", "SỐ LƯỢNG", "THÀNH TIỀN"
            }
        ));
        jScrollPane3.setViewportView(tblDTTong);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/financial-statement.png"))); // NOI18N
        jLabel7.setText("Tổng doanh thu");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        lblTongDT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongDT1.setText("0");
        lblTongDT1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTongDT1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pTongSo1Layout = new javax.swing.GroupLayout(pTongSo1);
        pTongSo1.setLayout(pTongSo1Layout);
        pTongSo1Layout.setHorizontalGroup(
            pTongSo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
            .addComponent(lblTongDT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pTongSo1Layout.setVerticalGroup(
            pTongSo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTongSo1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTongDT1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/invoice.png"))); // NOI18N
        jLabel8.setText("Tổng số hóa đơn");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        lblTongHD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongHD1.setText("0");
        lblTongHD1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTongHD1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
            .addComponent(lblTongHD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTongHD1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/packaging.png"))); // NOI18N
        jLabel9.setText("Sản phẩm bán chạy");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName1.setText("name");
        lblName1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
            .addComponent(lblName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlQuanLyDoanhThuLayout = new javax.swing.GroupLayout(pnlQuanLyDoanhThu);
        pnlQuanLyDoanhThu.setLayout(pnlQuanLyDoanhThuLayout);
        pnlQuanLyDoanhThuLayout.setHorizontalGroup(
            pnlQuanLyDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuanLyDoanhThuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlQuanLyDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlQuanLyDoanhThuLayout.createSequentialGroup()
                        .addComponent(pTongSo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuanLyDoanhThuLayout.createSequentialGroup()
                        .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuanLyDoanhThuLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daStart, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlQuanLyDoanhThuLayout.setVerticalGroup(
            pnlQuanLyDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuanLyDoanhThuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlQuanLyDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(pnlQuanLyDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTongSo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnlQuanLyDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tabsDoanhThu.addTab("Quan Ly Doanh Thu", pnlQuanLyDoanhThu);

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên loại hàng", "Tên sản phẩm", "Số lượng", "Giá bán", "Thành tiền"
            }
        ));
        jScrollPane2.setViewportView(tblSP);

        javax.swing.GroupLayout pnlSanPhamBanChayLayout = new javax.swing.GroupLayout(pnlSanPhamBanChay);
        pnlSanPhamBanChay.setLayout(pnlSanPhamBanChayLayout);
        pnlSanPhamBanChayLayout.setHorizontalGroup(
            pnlSanPhamBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamBanChayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSanPhamBanChayLayout.setVerticalGroup(
            pnlSanPhamBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamBanChayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsDoanhThu.addTab("San Pham Ban Chay", pnlSanPhamBanChay);

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addComponent(tabsDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

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

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        //send mail ko can chon file
//        File file = exportExecl.exportExcelBySendingEmail(studentData, "Doanh thu");
//        gmail.sendReport("baolnpps30114@fpt.edu.vn", "Staff: " + Auth.nv.getHoTen(), file);
//        file.delete();
        //send mail can chon file
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
        if (jf != null) {
            gmail.sendReport("baolnpps30114@fpt.edu.vn", "Staff: " + Auth.nv.getHoTen(), jf.getSelectedFile());
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
//        new test().setVisible(true);S
        if (tblDTTong.getValueAt(0, 0) == null) {
            MsgBox.alert(this, "Vui lòng chọn ngày!");
        } else {
            new BieuDoJDiaLog(new javax.swing.JFrame(), true).setVisible(true);
        }

    }//GEN-LAST:event_kButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fillToTableDoanhThuNgay();

        FillDoanhThu();
        FillSPBanChay();
        FillSPBanChayNhat();
    }//GEN-LAST:event_formWindowOpened

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
        if (jf != null) {
            System.out.println(jf.getSelectedFile());
            exportFile.exportExcel(studentData, jf.getSelectedFile(), "Doang thu theo ngay");
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
        if (tblDTTong.getValueAt(0, 0) == null) {
            MsgBox.alert(this, "Vui lòng chọn ngày!");

        } else {
            JFileChooser jf = new JFileChooser();
            jf.showOpenDialog(null);
            if (jf != null) {
                System.out.println(jf.getSelectedFile());
                exportFile.exportExcel(studentData, jf.getSelectedFile(), "Quan ly doanh thu");
            }
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    private void lblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductMouseClicked
        // TODO add your handling code here:
        open_SanPham();
    }//GEN-LAST:event_lblProductMouseClicked

    private void lblBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillMouseClicked
        // TODO add your handling code here:
        open_HoaDon();
    }//GEN-LAST:event_lblBillMouseClicked

    private void lblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStaffMouseClicked
        // TODO add your handling code here:
        open_NhanVien();
    }//GEN-LAST:event_lblStaffMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        open_GiamGia();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInforMouseClicked
        // TODO add your handling code here:
        open_GioiThieu();
    }//GEN-LAST:event_lblInforMouseClicked

    private void lblHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpMouseClicked
        // TODO add your handling code here:
        open_TroGiup();
    }//GEN-LAST:event_lblHelpMouseClicked

    private void lblMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMouseClicked
        // TODO add your handling code here:
        open_Trangchu();
    }//GEN-LAST:event_lblMainMouseClicked

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoanhThuJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoanhThuJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoanhThuJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoanhThuJDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoanhThuJDiaLog dialog = new DoanhThuJDiaLog(new javax.swing.JFrame(), true);
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
    private com.github.lgooddatepicker.components.DatePicker daEnd;
    private com.github.lgooddatepicker.components.DatePicker daStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel7;
    private com.k33ptoo.components.KGradientPanel kGradientPanel8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel lblBill;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblInfor;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblNgayHienTai;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblRevenue;
    private javax.swing.JLabel lblStaff;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTongDT;
    private javax.swing.JLabel lblTongDT1;
    private javax.swing.JLabel lblTongHD;
    private javax.swing.JLabel lblTongHD1;
    private com.k33ptoo.components.KGradientPanel pTongSo;
    private com.k33ptoo.components.KGradientPanel pTongSo1;
    private javax.swing.JPanel pnlDoanhThuNgayHienTai;
    private javax.swing.JPanel pnlQuanLyDoanhThu;
    private javax.swing.JPanel pnlSanPhamBanChay;
    private javax.swing.JTabbedPane tabsDoanhThu;
    private javax.swing.JTable tblDTTong;
    private javax.swing.JTable tblSP;
    private javax.swing.JTable tblTable;
    // End of variables declaration//GEN-END:variables
    ThongKeDAO tkDAO = new ThongKeDAO();

    public void fillToTableDoanhThuNgay() {
        DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkDAO.getDoanhThuTheoNgay((java.util.Date) XDate.toDate(lblNgayHienTai.getText(), "yyyy-MM-dd"));
        int count = 0;
        for (Object[] obj : list) {
            model.addRow(obj);
            studentData.put(String.valueOf(count + 2), obj);
            count++;
        }
        tblTable.setModel(model);
    }

    public void FillDoanhThu() {
        List<Object[]> list = tkDAO.getTongDoanhThu_NGAYHIENTAI(XDate.toDate(lblNgayHienTai.getText(), "yyyy-MM-dd"));
        if (list.size() != 0) {
            Object[] row = list.get(0);
            String checkDT = String.valueOf(row[0]);
            if (checkDT.equals("") || checkDT.equals("null")) {
                lblTongDT.setText("0");
                lblTongHD.setText(String.valueOf(row[1]));
            } else {
                lblTongDT.setText(String.valueOf(row[0]) + " " + "VND");
                lblTongHD.setText(String.valueOf(row[1]));
            }
        }

    }

    public void FillSPBanChay() {
        List<Object[]> list = tkDAO.getSanPhamBanChay(XDate.toDate(lblNgayHienTai.getText(), "yyyy-MM-dd"));
        System.out.println(list.size());
        if (list.size() != 0) {
            Object[] row = list.get(0);
            lblName.setText(String.valueOf(row[1]));
        } else {
            lblName.setText("");
        }
    }

    public void fillToTableDoanhThuTong() {
        DefaultTableModel model = (DefaultTableModel) tblDTTong.getModel();
        model.setRowCount(0);
        int count = 0;
        List<Object[]> list = tkDAO.getDoanhThuTong(XDate.toDate(String.valueOf(daStart.getDate()), "yyyy-MM-dd"),
                XDate.toDate(String.valueOf(daEnd.getDate()), "yyyy-MM-dd"));
//        System.out.println(String.valueOf(daStart.getDate()));
//        System.out.println(String.valueOf(daEnd.getDate()));
        for (Object[] obj : list) {
            model.addRow(obj);
            studentData.put(String.valueOf(count + 2), obj);
            count++;
        }
        tblDTTong.setModel(model);
    }

    public void FillDoanhThuTheoKhoang() {
        List<Object[]> list = tkDAO.getTongDoanhThuTheoKhoang(XDate.toDate(String.valueOf(daStart.getDate()), "yyyy-MM-dd"),
                XDate.toDate(String.valueOf(daEnd.getDate()), "yyyy-MM-dd"));
        if (list.size() != 0) {
            Object[] row = list.get(0);
            String checkDT = String.valueOf(row[0]);
            if (checkDT.equals("") || checkDT.equals("null")) {
                lblTongDT1.setText("0");
                lblTongHD1.setText(String.valueOf(row[1]));
            } else {
                lblTongDT1.setText(String.valueOf(row[0]) + " " + "VND");
                lblTongHD1.setText(String.valueOf(row[1]));
            }
        }
//        if (list.size() != 0) {
//            Object[] rows = list.get(0);
////            System.out.println("1");
//            lblTongDT1.setText(String.valueOf(rows[1]) + " " + "VND");
//            lblTongHD1.setText(String.valueOf(rows[0]));
//
//        } else {
//            lblTongDT1.setText("0");
//            lblTongHD1.setText("0");
//        }

    }

    public void FillSPBanChayTheoKhoang() {
        List<Object[]> list = tkDAO.getDoanhThuTong(XDate.toDate(String.valueOf(daStart.getDate()), "yyyy-MM-dd"),
                XDate.toDate(String.valueOf(daEnd.getDate()), "yyyy-MM-dd"));
        if (list.size() != 0) {
            Object[] row = list.get(0);
            lblName1.setText(String.valueOf(row[1]));
        } else {
            lblName1.setText("");
        }
    }

    public void FillSPBanChayNhat() {
        DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkDAO.getSPBanChay();
        for (Object[] obj : list) {
            model.addRow(obj);
        }
        tblSP.setModel(model);
    }

    private void open_Trangchu() {
        this.dispose();
        new Main3(new JFrame(), true).setVisible(true);
    }

    private void open_SanPham() {
        this.dispose();
        new SanPhamJDiaLog(new JFrame(), true).setVisible(true);
    }

    private void open_NhanVien() {
        this.dispose();
        new NhanVienJDialog(new JFrame(), true).setVisible(true);
    }

    private void open_GiamGia() {
        this.dispose();
        new GiamGiaJDiaLog(new JFrame(), true).setVisible(true);
    }

    private void open_TroGiup() {

    }

    private void open_HoaDon() {
        this.dispose();
        new HoaDonJDiaLog(new JFrame(), true).setVisible(true);
    }

    private void DangXuat() {
        this.dispose();
        Auth.clear();
        new DangNhapJDiaLog(new JFrame(), true).setVisible(true);
    }

    private void open_GioiThieu() {

    }
}
