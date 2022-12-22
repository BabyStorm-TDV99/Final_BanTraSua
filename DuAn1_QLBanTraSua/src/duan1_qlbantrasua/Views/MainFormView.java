/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package duan1_qlbantrasua.Views;

import duan1_qlbantrasua.DomainModels.NhanVien;
import duan1_qlbantrasua.ViewModels.SanPhamOption;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author TrungVD
 */
public class MainFormView extends javax.swing.JFrame {
    NhanVien nhanVienDangNhapThanhCong = null;
    public MainFormView() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(this.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTenNVLogin = new javax.swing.JLabel();
        lblChucVuNVLogin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnBanHangMenu = new javax.swing.JButton();
        btnSanPhamMenu = new javax.swing.JButton();
        btnHoaDonMenu = new javax.swing.JButton();
        btnKhuyenMaiMenu = new javax.swing.JButton();
        btnThongKeMenu = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanelRun = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ và tên:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Chức vụ:");

        lblTenNVLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenNVLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNVLogin.setText("Tên");

        lblChucVuNVLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblChucVuNVLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblChucVuNVLogin.setText("Chức vụ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenNVLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChucVuNVLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNVLogin)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChucVuNVLogin)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DashBoard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(5, 1, 0, 20));

        btnBanHangMenu.setBackground(new java.awt.Color(102, 204, 255));
        btnBanHangMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBanHangMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnBanHangMenu.setText("Bán Hàng");
        btnBanHangMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnBanHangMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangMenuActionPerformed(evt);
            }
        });
        jPanel4.add(btnBanHangMenu);

        btnSanPhamMenu.setBackground(new java.awt.Color(102, 204, 255));
        btnSanPhamMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSanPhamMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnSanPhamMenu.setText("Sản Phẩm");
        btnSanPhamMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnSanPhamMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamMenuActionPerformed(evt);
            }
        });
        jPanel4.add(btnSanPhamMenu);

        btnHoaDonMenu.setBackground(new java.awt.Color(102, 204, 255));
        btnHoaDonMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHoaDonMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnHoaDonMenu.setText("Hóa Đơn");
        btnHoaDonMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnHoaDonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonMenuActionPerformed(evt);
            }
        });
        jPanel4.add(btnHoaDonMenu);

        btnKhuyenMaiMenu.setBackground(new java.awt.Color(102, 204, 255));
        btnKhuyenMaiMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKhuyenMaiMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnKhuyenMaiMenu.setText("Khuyến Mãi");
        btnKhuyenMaiMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnKhuyenMaiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenMaiMenuActionPerformed(evt);
            }
        });
        jPanel4.add(btnKhuyenMaiMenu);

        btnThongKeMenu.setBackground(new java.awt.Color(102, 204, 255));
        btnThongKeMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnThongKeMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKeMenu.setText("Thống Kê");
        btnThongKeMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnThongKeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeMenuActionPerformed(evt);
            }
        });
        jPanel4.add(btnThongKeMenu);

        btnHome.setBackground(new java.awt.Color(102, 204, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/logoMilkTea.png"))); // NOI18N
        btnHome.setAlignmentY(0.0F);
        btnHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setBorderPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRun.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phần Mềm Bán Trà Sữa");

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));
        jPanel6.setLayout(new java.awt.GridLayout(2, 3, 30, 40));

        jButton3.setBackground(new java.awt.Color(102, 204, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/sell2.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);

        jButton13.setBackground(new java.awt.Color(102, 204, 255));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/management.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13);

        jButton14.setBackground(new java.awt.Color(102, 204, 255));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/milktea2.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14);

        jButton15.setBackground(new java.awt.Color(102, 204, 255));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/staff3.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15);

        jButton16.setBackground(new java.awt.Color(102, 204, 255));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/sale2.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton16);

        jButton17.setBackground(new java.awt.Color(102, 204, 255));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/thongke2.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton17);

        javax.swing.GroupLayout jPanelRunLayout = new javax.swing.GroupLayout(jPanelRun);
        jPanelRun.setLayout(jPanelRunLayout);
        jPanelRunLayout.setHorizontalGroup(
            jPanelRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRunLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(jPanelRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRunLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRunLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(338, 338, 338))))
        );
        jPanelRunLayout.setVerticalGroup(
            jPanelRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanelRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBanHangMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangMenuActionPerformed
        MainBanHangView banHang = new MainBanHangView();
        NhanVien nhanVienBH = nhanVienDangNhapThanhCong;
        jPanelRun.removeAll();
        banHang.editData(nhanVienBH);
        System.out.println(nhanVienBH.getId());
        jPanelRun.add(banHang);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_btnBanHangMenuActionPerformed

    private void btnHoaDonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonMenuActionPerformed
        HoaDonView hoaDonView = new HoaDonView();
        jPanelRun.removeAll();
        jPanelRun.add(hoaDonView);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
        
    }//GEN-LAST:event_btnHoaDonMenuActionPerformed

    private void btnSanPhamMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamMenuActionPerformed
        SanPhamView sanPhamView = new SanPhamView();
        jPanelRun.removeAll();
        jPanelRun.add(sanPhamView);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_btnSanPhamMenuActionPerformed

    private void btnKhuyenMaiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenMaiMenuActionPerformed
        KhuyenMaiView khuyenMaiView = new KhuyenMaiView();
        jPanelRun.removeAll();
        jPanelRun.add(khuyenMaiView);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_btnKhuyenMaiMenuActionPerformed

    private void btnThongKeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeMenuActionPerformed
        QuanLyDoanhSo quanLyDoanhSo = new QuanLyDoanhSo();
        jPanelRun.removeAll();
        jPanelRun.add(quanLyDoanhSo);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_btnThongKeMenuActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        NhanVienView nhanVienView = new NhanVienView();
        jPanelRun.removeAll();
        jPanelRun.add(nhanVienView);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainBanHangView banHang = new MainBanHangView();
        NhanVien nhanVienBH = nhanVienDangNhapThanhCong;
        jPanelRun.removeAll();
        banHang.editData(nhanVienBH);
        System.out.println(nhanVienBH.getId());
        jPanelRun.add(banHang);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        QuanLyView quanLyView = new QuanLyView();
        jPanelRun.removeAll();
        jPanelRun.add(quanLyView);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        SanPhamView sanPhamView = new SanPhamView();
        jPanelRun.removeAll();
        jPanelRun.add(sanPhamView);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        KhuyenMaiView khuyenMaiView = new KhuyenMaiView();
        jPanelRun.removeAll();
        jPanelRun.add(khuyenMaiView);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        QuanLyDoanhSo quanLyDoanhSo = new QuanLyDoanhSo();
        jPanelRun.removeAll();
        jPanelRun.add(quanLyDoanhSo);
        jPanelRun.setLayout(new FlowLayout());
        this.pack();
        jPanelRun.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        NhanVien nhanVienBH = nhanVienDangNhapThanhCong;
        MainFormView main = new MainFormView();
        main.setDataNhanVien(nhanVienBH);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(MainFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHangMenu;
    private javax.swing.JButton btnHoaDonMenu;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnKhuyenMaiMenu;
    private javax.swing.JButton btnSanPhamMenu;
    private javax.swing.JButton btnThongKeMenu;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelRun;
    private javax.swing.JLabel lblChucVuNVLogin;
    private javax.swing.JLabel lblTenNVLogin;
    // End of variables declaration//GEN-END:variables

    void setDataNhanVien(NhanVien nhanVienLogin) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setId(nhanVienLogin.getId());
        nhanVien.setHoVaTen(nhanVienLogin.getHoVaTen());
        nhanVien.setMa(nhanVienLogin.getMa());
        nhanVien.setChucVu(nhanVienLogin.getChucVu());
        nhanVienDangNhapThanhCong = nhanVien;
        lblTenNVLogin.setText(nhanVienDangNhapThanhCong.getHoVaTen());
        lblChucVuNVLogin.setText(nhanVienLogin.getChucVu().getTen());
    }

//    void setData(SanPhamOption sanPhamOption) {
//        SanPhamOption sanPhamOption1 = sanPhamOption;
////        System.err.println(sanPhamOption1.getTenSP());;
//        BanHangView banHangView = new BanHangView();
////        banHangView.setEditData(sanPhamOption1);
//        jPanelRun.removeAll();
//        jPanelRun.add(banHangView);
//        jPanelRun.setLayout(new FlowLayout());
//        this.pack();
//        jPanelRun.setVisible(true);
//    }
}
