/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package duan1_qlbantrasua.Views;

import duan1_qlbantrasua.DomainModels.DanhMucSP;
import duan1_qlbantrasua.DomainModels.HinhAnh;
import duan1_qlbantrasua.DomainModels.SanPham;
import duan1_qlbantrasua.DomainModels.Size;
import duan1_qlbantrasua.Services.DanhMucService;
import duan1_qlbantrasua.Services.HinhAnhService;
import duan1_qlbantrasua.Services.SanPhamService;
import duan1_qlbantrasua.Services.SizeService;
import duan1_qlbantrasua.Services.impl.DanhMucServiceImpl;
import duan1_qlbantrasua.Services.impl.HinhAnhServiceImpl;
import duan1_qlbantrasua.Services.impl.SanPhamServiceImpl;
import duan1_qlbantrasua.Services.impl.SizeServiceImpl;
import duan1_qlbantrasua.ViewModels.SanPhamViewModel;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TrungVD
 */
public class SanPhamView extends javax.swing.JPanel {

    private SanPhamService qLSP;
    private SizeService qLSize;
    private DanhMucService qLDanhMuc;
    private ArrayList<SanPham> listSanPham;
    private DefaultTableModel dtmSanPham;
    private DefaultComboBoxModel dcbmSize;
    private DefaultComboBoxModel dcbmDanhMuc;
    private HinhAnhService qLHinhAnh;
    private String duongDanAnh = "C:\\Users\\TrungVD\\OneDrive\\MyPC\\TrungVDPD21738_SOF2041_JDBC1\\DuAn1QuanLyBanTraSua\\DuAn1_QLBanTraSua\\src\\duan1_qlbantrasua\\Views\\image\\tra_dua_null_1.png";

    public SanPhamView() {
        initComponents();
        this.qLSP = new SanPhamServiceImpl();
        this.qLSize = new SizeServiceImpl();
        this.qLHinhAnh = new HinhAnhServiceImpl();
        this.qLDanhMuc = new DanhMucServiceImpl();
        this.listSanPham = qLSP.getListSanPhamDB();
        rdoConKinhDoanh.setSelected(true);
        tblSanPham.setRowHeight(60);
        loadData(qLSP.getListView());
        loadCBBSize(qLSize.getListSizeKinhDoanh());
        loadCBBDanhMuc(qLDanhMuc.getListDanhMucSPKinhDoanhDB());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMoTa = new javax.swing.JTextArea();
        cbbDanhMuc = new javax.swing.JComboBox<>();
        cbbSize = new javax.swing.JComboBox<>();
        lblIDSanPham = new javax.swing.JLabel();
        rdoNgungBan = new javax.swing.JRadioButton();
        rdoConKinhDoanh = new javax.swing.JRadioButton();
        lblAnh = new javax.swing.JLabel();
        lblMaSanPham = new javax.swing.JLabel();
        btnAddSize = new javax.swing.JButton();
        btnAddDanhMuc = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        btnClearFrom = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        txtTimKiemSP = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 204, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Quản Lý Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Thông Tin Chi Tiết Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/addImg.png"))); // NOI18N
        jButton1.setText("Thêm Ảnh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Sản Phẩm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên Sản Phẩm:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Size:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Đơn Giá:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Danh Mục:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mô Tả:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Trạng Thái:");

        txaMoTa.setColumns(20);
        txaMoTa.setRows(5);
        jScrollPane2.setViewportView(txaMoTa);

        cbbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSizeActionPerformed(evt);
            }
        });

        lblIDSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblIDSanPham.setText("ID Sản Phẩm");

        buttonGroup1.add(rdoNgungBan);
        rdoNgungBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNgungBan.setForeground(new java.awt.Color(255, 255, 255));
        rdoNgungBan.setText("Ngừng Bán");

        buttonGroup1.add(rdoConKinhDoanh);
        rdoConKinhDoanh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoConKinhDoanh.setForeground(new java.awt.Color(255, 255, 255));
        rdoConKinhDoanh.setText("Còn Kinh Doanh");

        lblAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/image/tra_dua_null_1.png"))); // NOI18N
        lblAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblMaSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblMaSanPham.setText("Mã Sản Phẩm");

        btnAddSize.setBackground(new java.awt.Color(102, 204, 255));
        btnAddSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/add-button.png"))); // NOI18N
        btnAddSize.setBorder(null);
        btnAddSize.setBorderPainted(false);
        btnAddSize.setContentAreaFilled(false);
        btnAddSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSizeActionPerformed(evt);
            }
        });

        btnAddDanhMuc.setBackground(new java.awt.Color(102, 204, 255));
        btnAddDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/add-button.png"))); // NOI18N
        btnAddDanhMuc.setBorder(null);
        btnAddDanhMuc.setBorderPainted(false);
        btnAddDanhMuc.setContentAreaFilled(false);
        btnAddDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDanhMucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddSize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(17, 55, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoConKinhDoanh)
                        .addGap(13, 13, 13)
                        .addComponent(rdoNgungBan))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIDSanPham)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddDanhMuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMaSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTenSP)))
                                    .addComponent(jLabel8))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDonGia)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(rdoConKinhDoanh)
                            .addComponent(rdoNgungBan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 20, 30));

        btnThemSP.setBackground(new java.awt.Color(153, 255, 255));
        btnThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/addSP.png"))); // NOI18N
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });
        jPanel4.add(btnThemSP);

        btnSuaSP.setBackground(new java.awt.Color(153, 255, 255));
        btnSuaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/updateSP.png"))); // NOI18N
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });
        jPanel4.add(btnSuaSP);

        btnXoaSP.setBackground(new java.awt.Color(153, 255, 255));
        btnXoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/deleteSP.png"))); // NOI18N
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoaSP);

        btnClearFrom.setBackground(new java.awt.Color(153, 255, 255));
        btnClearFrom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_qlbantrasua/Views/icon/resetSP.png"))); // NOI18N
        btnClearFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFromActionPerformed(evt);
            }
        });
        jPanel4.add(btnClearFrom);

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Bảng Chi Tiết Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Đơn Giá", "Mô Tả", "Danh Mục", "Hình Ảnh", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(0).setMinWidth(40);
            tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblSanPham.getColumnModel().getColumn(0).setMaxWidth(40);
            tblSanPham.getColumnModel().getColumn(1).setMinWidth(80);
            tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(5);
            tblSanPham.getColumnModel().getColumn(1).setMaxWidth(80);
            tblSanPham.getColumnModel().getColumn(2).setMinWidth(100);
            tblSanPham.getColumnModel().getColumn(3).setMinWidth(70);
            tblSanPham.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblSanPham.getColumnModel().getColumn(3).setMaxWidth(70);
            tblSanPham.getColumnModel().getColumn(6).setMaxWidth(70);
            tblSanPham.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
        );

        txtTimKiemSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemSPKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?");
        SanPham sanPhamThem = getDataSanPhamNew();
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, qLSP.themSanPham(sanPhamThem));
            HinhAnh hinhAnh = new HinhAnh(qLSP.timSanPhamTheoMa(sanPhamThem.getMa()), txtTenSP.getText(), duongDanAnh);
            System.out.println(duongDanAnh);
            qLHinhAnh.themHinhAnh(hinhAnh);
            clearForm();
            listSanPham = qLSP.getListSanPhamDB();
            loadData(qLSP.getListView());
        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        int row = tblSanPham.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn một dòng để xóa!");
            return;
        }
        String idSP = lblIDSanPham.getText();
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, qLSP.xoaSanPham(idSP));
            clearForm();
            listSanPham = qLSP.getListSanPhamDB();
            loadData(qLSP.getListView());
        }
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        int row = tblSanPham.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn một dòng để sửa!");
            return;
        }
        SanPham sanPhamSua = getFormData();
        String id = lblIDSanPham.getText();
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?");
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, qLSP.updateSanPham(sanPhamSua, id));
            System.out.println(duongDanAnh);
            HinhAnh hinhAnh = new HinhAnh(qLSP.timSanPhamTheoMa(sanPhamSua.getMa()), txtTenSP.getText(), duongDanAnh);
            qLHinhAnh.updateHinhAnh(hinhAnh, id);
            clearForm();
            listSanPham = qLSP.getListSanPhamDB();
            loadData(qLSP.getListView());
        }

    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void btnClearFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFromActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearFromActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        int index = tblSanPham.getSelectedRow();
//        listSanPham = qLSP.getListSanPhamDB();
        SanPham sanPham = listSanPham.get(index);
        lblIDSanPham.setText(sanPham.getId());
        lblMaSanPham.setText(sanPham.getMa());
        txtTenSP.setText(sanPham.getTen());
        cbbSize.setSelectedItem(sanPham.getSize());
        txtDonGia.setText(String.valueOf(sanPham.getGia()));
        cbbDanhMuc.setSelectedItem(sanPham.getDanhMucSP());
        txaMoTa.setText(sanPham.getMoTa());
        rdoConKinhDoanh.setSelected(sanPham.getTrangThai() == 0 ? true : false);
        rdoNgungBan.setSelected(sanPham.getTrangThai() == 1 ? true : false);
        duongDanAnh = tblSanPham.getValueAt(index, 6).toString();
        ImageIcon img = resizeImage(duongDanAnh);
        lblAnh.setIcon(img);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void txtTimKiemSPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemSPKeyPressed
        ArrayList<SanPhamViewModel> listTimOut = qLSP.timKiem(txtTimKiemSP.getText());
        listSanPham = qLSP.timThongTinSanPhamQuanLy(txtTimKiemSP.getText());
        loadData(listTimOut);
    }//GEN-LAST:event_txtTimKiemSPKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser("C:\\Users\\TrungVD\\OneDrive\\MyPC\\TrungVDPD21738_SOF2041_JDBC1\\DuAn1QuanLyBanTraSua\\DuAn1_QLBanTraSua\\src\\duan1_qlbantrasua\\Views\\image\\tra_dua_null_1.png");
            fileChooser.setDialogTitle("Chọn ảnh");
            fileChooser.showOpenDialog(null);
            File ftenAnh = fileChooser.getSelectedFile();
            if (ftenAnh != null) {
                duongDanAnh = ftenAnh.getAbsolutePath();
                lblAnh.setIcon(resizeImage(String.valueOf(duongDanAnh)));
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ảnh");
                return;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn ảnh");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSizeActionPerformed

    private void btnAddSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSizeActionPerformed
        ThemNhanhSizeView themSize = new ThemNhanhSizeView(new MainFormView(), true);
        themSize.setVisible(true);
        cbbSize.removeAllItems();
        loadCBBSize(qLSize.getListSizeKinhDoanh());
    }//GEN-LAST:event_btnAddSizeActionPerformed

    private void btnAddDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDanhMucActionPerformed
        ThemNhanhDanhMucSPView themDanhMuc = new ThemNhanhDanhMucSPView(new MainFormView(), true);
        themDanhMuc.setVisible(true);
        cbbDanhMuc.removeAllItems();
        loadCBBDanhMuc(qLDanhMuc.getListDanhMucSPKinhDoanhDB());
    }//GEN-LAST:event_btnAddDanhMucActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDanhMuc;
    private javax.swing.JButton btnAddSize;
    private javax.swing.JButton btnClearFrom;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbDanhMuc;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblIDSanPham;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JRadioButton rdoConKinhDoanh;
    private javax.swing.JRadioButton rdoNgungBan;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextArea txaMoTa;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiemSP;
    // End of variables declaration//GEN-END:variables

    private void loadData(ArrayList<SanPhamViewModel> listView) {
        dtmSanPham = (DefaultTableModel) tblSanPham.getModel();
        dtmSanPham.setRowCount(0);
        int sTT = 1;
        for (SanPhamViewModel sanPhamViewModel : listView) {
            dtmSanPham.addRow(new Object[]{
                sTT++,
                sanPhamViewModel.getMaSanPham(),
                sanPhamViewModel.getTenSanPham(),
                sanPhamViewModel.getDonGia(),
                sanPhamViewModel.getMoTa(),
                sanPhamViewModel.getTenDanhMuc(),
                sanPhamViewModel.getDuongDanAnh(),
                sanPhamViewModel.getTrangThai() == 0 ? "Còn bán" : "Ngừng kinh doanh"
            });
        }
        tblSanPham.getTableHeader().setReorderingAllowed(false);
        tblSanPham.getColumnModel().getColumn(6).setCellRenderer(new ImageRender());
    }
    
    private class ImageRender extends DefaultTableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            String photoName = value.toString();
            ImageIcon img = setSizeImgTable(value.toString());
            setIcon(img);
            return this;
        }
        
    }
    private ImageIcon setSizeImgTable(String imagePath) {
        ImageIcon myImage = new ImageIcon(imagePath);
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void clearForm() {
        lblIDSanPham.setText("");
        lblMaSanPham.setText("");
        txtTenSP.setText("");
        txtDonGia.setText("");
        cbbSize.setSelectedIndex(0);
        cbbDanhMuc.setSelectedIndex(0);
        txaMoTa.setText("");
        rdoConKinhDoanh.setSelected(true);
        duongDanAnh = "C:\\Users\\TrungVD\\OneDrive\\MyPC\\TrungVDPD21738_SOF2041_JDBC1\\DuAn1QuanLyBanTraSua\\DuAn1_QLBanTraSua\\src\\duan1_qlbantrasua\\Views\\image\\tra_dua_null_1.png";
        ImageIcon img = resizeImage(duongDanAnh);
        lblAnh.setIcon(img);
    }

    private void loadCBBSize(ArrayList<Size> listSizeDB) {
        dcbmSize = (DefaultComboBoxModel) cbbSize.getModel();
        for (Size size : listSizeDB) {
            dcbmSize.addElement(size);
        }
    }

    private void loadCBBDanhMuc(ArrayList<DanhMucSP> listDanhMucSPDB) {
        dcbmDanhMuc = (DefaultComboBoxModel) cbbDanhMuc.getModel();
        for (DanhMucSP danhMucSP : listDanhMucSPDB) {
            dcbmDanhMuc.addElement(danhMucSP);
        }
    }

    private SanPham getDataSanPhamNew() {
        Size size = (Size) cbbSize.getSelectedItem();
        DanhMucSP danhMucSP = (DanhMucSP) cbbDanhMuc.getSelectedItem();
        int viTri = qLSP.getListAllSanPhamDB().size() + 1;
        String maSP = "SP" + String.valueOf(viTri);
        double giaSP;
        try {
            giaSP = Double.parseDouble(txtDonGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đơn giá phải là số");
            e.printStackTrace();
        }
        return new SanPham(
                maSP,
                txtTenSP.getText(),
                Double.parseDouble(txtDonGia.getText()),
                txaMoTa.getText(),
                rdoConKinhDoanh.isSelected() ? 0 : 1,
                size,
                danhMucSP
        );
    }

    private ImageIcon resizeImage(String imagePath) {
        ImageIcon myImage = new ImageIcon(imagePath);
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(130, 161, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private SanPham getFormData() {
        Size size = (Size) cbbSize.getSelectedItem();
        DanhMucSP danhMucSP = (DanhMucSP) cbbDanhMuc.getSelectedItem();
        return new SanPham(
                lblMaSanPham.getText(),
                txtTenSP.getText(),
                Double.parseDouble(txtDonGia.getText()),
                txaMoTa.getText(),
                rdoConKinhDoanh.isSelected() ? 0 : 1,
                size,
                danhMucSP
        );
    }
}
