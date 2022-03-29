/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

import com.sun.glass.events.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Purchase extends javax.swing.JFrame {

    /**
     * Creates new form ExperimentPurchase
     */
    public Purchase() {
        
        initComponents();
        
        Show_Products_In_JTable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTable_Products = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt_clientName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboBox_counter = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CheckBox = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_cashBack = new javax.swing.JTextField();
        txt_operator = new javax.swing.JTextField();
        btn_buy = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_AddDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_message = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ComboBox_discount = new javax.swing.JComboBox<>();
        btn_selectProduct = new javax.swing.JButton();
        btnCancelSelectedProduct = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_netTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_cashPaid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        textArea_receipt = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        btn_backToAdminDashboard = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_clearReceipt = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sales");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(1330, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(153, 153, 153));
        txt_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_idMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_idMousePressed(evt);
            }
        });
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, -1));

        JTable_Products.setBackground(new java.awt.Color(255, 255, 153));
        JTable_Products.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 153)));
        JTable_Products.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Date Added", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Products.setSelectionBackground(new java.awt.Color(255, 102, 0));
        JTable_Products.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JTable_ProductsMouseMoved(evt);
            }
        });
        JTable_Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_ProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTable_ProductsMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(JTable_Products);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 630, 290));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Price:");

        txt_price.setEditable(false);
        txt_price.setBackground(new java.awt.Color(153, 153, 153));
        txt_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_price.setForeground(new java.awt.Color(255, 255, 255));
        txt_price.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                none(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txt_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_priceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_priceMousePressed(evt);
            }
        });
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        txt_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_priceKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(txt_price, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        txt_clientName.setBackground(new java.awt.Color(153, 153, 153));
        txt_clientName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_clientName.setForeground(new java.awt.Color(255, 255, 255));
        txt_clientName.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_clientName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_clientNameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_clientNameMousePressed(evt);
            }
        });
        txt_clientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_clientNameActionPerformed(evt);
            }
        });
        txt_clientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_clientNameKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ClientName:");

        ComboBox_counter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Counter", "Counter 1", "Counter 2", "Counter 3", "Counter 4" }));
        ComboBox_counter.setToolTipText("");
        ComboBox_counter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_counterActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Payment:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Counter:");

        CheckBox.setText("Cash Only");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Operator:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Cash Back:");

        txt_cashBack.setEditable(false);
        txt_cashBack.setBackground(new java.awt.Color(153, 153, 153));
        txt_cashBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cashBack.setForeground(new java.awt.Color(255, 255, 255));
        txt_cashBack.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_cashBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_cashBackMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cashBackMousePressed(evt);
            }
        });
        txt_cashBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cashBackActionPerformed(evt);
            }
        });
        txt_cashBack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cashBackKeyTyped(evt);
            }
        });

        txt_operator.setEditable(false);
        txt_operator.setBackground(new java.awt.Color(153, 153, 153));
        txt_operator.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_operator.setForeground(new java.awt.Color(255, 255, 255));
        txt_operator.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_operator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_operatorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_operatorMousePressed(evt);
            }
        });
        txt_operator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_operatorActionPerformed(evt);
            }
        });
        txt_operator.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_operatorKeyTyped(evt);
            }
        });

        btn_buy.setBackground(new java.awt.Color(153, 153, 153));
        btn_buy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_buy.setForeground(new java.awt.Color(255, 255, 255));
        btn_buy.setText("Buy");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Purchase:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBox_counter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txt_clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_cashBack, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_operator, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_clientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ComboBox_counter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cashBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_operator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buy)
                    .addComponent(jLabel15))
                .addGap(57, 57, 57))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 290, 300));

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Quantity:");

        txt_quantity.setEditable(false);
        txt_quantity.setBackground(new java.awt.Color(153, 153, 153));
        txt_quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_quantity.setForeground(new java.awt.Color(255, 255, 255));
        txt_quantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_quantityMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_quantityMousePressed(evt);
            }
        });
        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });
        txt_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_quantityKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txt_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 290, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        txt_name.setEditable(false);
        txt_name.setBackground(new java.awt.Color(153, 153, 153));
        txt_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nameMousePressed(evt);
            }
        });
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date:");

        txt_AddDate.setEditable(false);
        txt_AddDate.setBackground(new java.awt.Color(153, 153, 153));
        txt_AddDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_AddDate.setForeground(new java.awt.Color(255, 255, 255));
        txt_AddDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_AddDateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_AddDateMousePressed(evt);
            }
        });
        txt_AddDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AddDateActionPerformed(evt);
            }
        });
        txt_AddDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AddDateKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(txt_AddDate, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_AddDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, -1));

        jTable1.setBackground(new java.awt.Color(255, 255, 153));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date", "Quantity", "Price per Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 102, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 630, 300));

        lbl_message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_message.setForeground(new java.awt.Color(255, 153, 0));
        lbl_message.setText("No Action Performed");
        jPanel1.add(lbl_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 630, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Discount(%):");

        ComboBox_discount.setMaximumRowCount(21);
        ComboBox_discount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Discount", "0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80", "85", "90", "95" }));
        ComboBox_discount.setToolTipText("");
        ComboBox_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_discountActionPerformed(evt);
            }
        });

        btn_selectProduct.setBackground(new java.awt.Color(0, 153, 0));
        btn_selectProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_selectProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_selectProduct.setText("Select Product");
        btn_selectProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectProductActionPerformed(evt);
            }
        });

        btnCancelSelectedProduct.setBackground(new java.awt.Color(255, 0, 102));
        btnCancelSelectedProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelSelectedProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelSelectedProduct.setText("Cancel Seleted Product");
        btnCancelSelectedProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSelectedProductActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Net Total:");

        txt_netTotal.setEditable(false);
        txt_netTotal.setBackground(new java.awt.Color(153, 153, 153));
        txt_netTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_netTotal.setForeground(new java.awt.Color(255, 255, 255));
        txt_netTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_netTotal.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Cash Paid:");

        txt_cashPaid.setBackground(new java.awt.Color(153, 153, 153));
        txt_cashPaid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cashPaid.setForeground(new java.awt.Color(255, 255, 255));
        txt_cashPaid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cashPaid.setText("0");
        txt_cashPaid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_cashPaidMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cashPaidMousePressed(evt);
            }
        });
        txt_cashPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cashPaidActionPerformed(evt);
            }
        });
        txt_cashPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cashPaidKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Amount:");

        txt_amount.setEditable(false);
        txt_amount.setBackground(new java.awt.Color(153, 153, 153));
        txt_amount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_amount.setForeground(new java.awt.Color(255, 255, 255));
        txt_amount.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_amountMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_amountMousePressed(evt);
            }
        });
        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });
        txt_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_amountKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelSelectedProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_selectProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox_discount, 0, 188, Short.MAX_VALUE)
                            .addComponent(txt_netTotal)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cashPaid)
                            .addComponent(txt_amount))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_selectProduct)
                .addGap(1, 1, 1)
                .addComponent(btnCancelSelectedProduct)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_netTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cashPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 330, 220));

        textArea_receipt.setEditable(false);
        textArea_receipt.setColumns(20);
        textArea_receipt.setRows(5);
        jScrollPane4.setViewportView(textArea_receipt);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, 330, 240));

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        btn_backToAdminDashboard.setBackground(new java.awt.Color(255, 51, 255));
        btn_backToAdminDashboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_backToAdminDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_backToAdminDashboard.setText("Back To Admin's Dashboard");
        btn_backToAdminDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backToAdminDashboardActionPerformed(evt);
            }
        });

        btn_print.setBackground(new java.awt.Color(204, 102, 0));
        btn_print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_print.setForeground(new java.awt.Color(255, 255, 255));
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_clearReceipt.setBackground(new java.awt.Color(0, 153, 153));
        btn_clearReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clearReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btn_clearReceipt.setText("Clear Receipt");
        btn_clearReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearReceiptActionPerformed(evt);
            }
        });

        btn_close.setBackground(new java.awt.Color(255, 0, 0));
        btn_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_backToAdminDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clearReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_backToAdminDashboard)
                .addGap(1, 1, 1)
                .addComponent(btn_print)
                .addGap(1, 1, 1)
                .addComponent(btn_clearReceipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_close)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 260, 330, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public Connection getConnection()
    {
    Connection con = null;
    
    try {
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "abc1994");
 
    return con;
    } catch (SQLException ex) {
    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
 
    return null;
    }
    }
    
    
   //Do NOT DELETE 
    // Display Date In JTable 
    // 1. Fill ArrayList with the data
    
    public ArrayList<Item> getProductList()
    {
        ArrayList<Item> productList = new ArrayList();
        Connection con = getConnection();
        String query = "SELECT * FROM product";
            
        Statement st;
        ResultSet rs;
        
        try {         
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            Item product;
            
            while (rs.next())
            {                
                product = new Item(rs.getInt(1), rs.getString(2), Float.parseFloat(rs.getString(3)), rs.getString(4), rs.getInt(5) , rs.getBytes(6) );
                productList.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return productList;
    }
    
    
    
    //Do NOT DELETE
     // 2 - Populate the JTable
    public void Show_Products_In_JTable()
    {
        //JTable 1
        ArrayList<Item> list = getProductList();
        DefaultTableModel model = (DefaultTableModel)JTable_Products.getModel();
        
        Object[] row = new Object [6];
        
        // clear jtable content
        model.setRowCount(0);
       
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getPrice();
            row[3] = list.get(i).getDate();
            row[4] = list.get(i).getQuantity();
            model.addRow(row);
        }
        
    }

    //Do NOT DELETE
    public void ShowItem (int index)
    {
        txt_id.setText(Integer.toString(getProductList().get(index).getId()));
        txt_name.setText(getProductList().get(index).getName());
        txt_price.setText(Float.toString(getProductList().get(index).getPrice()));
        txt_quantity.setText(Integer.toString(getProductList().get(index).getQuantity()));
        txt_AddDate.setText(getProductList().get(index).getDate());
    }
    
   
    

    
    private void JTable_ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_ProductsMouseClicked

    int index;
    index = JTable_Products.getSelectedRow();
    jTable1.clearSelection();
        
    ShowItem(index);
        
    }//GEN-LAST:event_JTable_ProductsMouseClicked

    private void txt_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idMouseClicked

        
    }//GEN-LAST:event_txt_idMouseClicked

    private void txt_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idMousePressed

        
    }//GEN-LAST:event_txt_idMousePressed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed

    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped

    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameMouseClicked

    private void txt_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameMousePressed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameKeyTyped

    private void txt_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_priceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceMouseClicked

    private void txt_priceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_priceMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceMousePressed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_priceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceKeyTyped

    private void txt_AddDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_AddDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddDateMouseClicked

    private void txt_AddDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_AddDateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddDateMousePressed

    private void txt_AddDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AddDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddDateActionPerformed

    private void txt_AddDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AddDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddDateKeyTyped

    private void txt_quantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_quantityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityMouseClicked

    private void txt_quantityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_quantityMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityMousePressed

    private void txt_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityActionPerformed

    private void txt_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityKeyTyped

    private void txt_clientNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_clientNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_clientNameMouseClicked

    private void txt_clientNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_clientNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_clientNameMousePressed

    private void txt_clientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_clientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_clientNameActionPerformed

    private void txt_clientNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_clientNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_clientNameKeyTyped

    private void txt_amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_amountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amountMouseClicked

    private void txt_amountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_amountMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amountMousePressed

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amountActionPerformed

    private void txt_amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amountKeyTyped

    private void ComboBox_counterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_counterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_counterActionPerformed

    private void txt_cashPaidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cashPaidMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashPaidMouseClicked

    private void txt_cashPaidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cashPaidMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashPaidMousePressed

    private void txt_cashPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cashPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashPaidActionPerformed

    private void txt_cashPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashPaidKeyTyped

    char num = evt.getKeyChar();
     if(!Character.isDigit(num))
     {
        evt.consume();
        getToolkit().beep();
     }
        
    }//GEN-LAST:event_txt_cashPaidKeyTyped

    private void txt_cashBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cashBackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashBackMouseClicked

    private void txt_cashBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cashBackMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashBackMousePressed

    private void txt_cashBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cashBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashBackActionPerformed

    private void txt_cashBackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashBackKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashBackKeyTyped

    private void txt_operatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_operatorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_operatorMouseClicked

    private void txt_operatorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_operatorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_operatorMousePressed

    private void txt_operatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_operatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_operatorActionPerformed

    private void txt_operatorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_operatorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_operatorKeyTyped

    
    //Do NOT DELETE
    public void ClearAll(){
    
        JTable_Products.clearSelection();
        jTable1.clearSelection();
        
        txt_id.setText(null);
        txt_name.setText(null);
        txt_price.setText(null);
        txt_AddDate.setText(null);
        txt_quantity.setText(null);
    }
    
    
    private float NetTotal = 0 ;

    
    //Do NOT DELETE
    // Adds Product To The Table
    public void purchaseProduct(){
   
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();    
    
    String CnvrtNetTotal;
    
    float Tprice,total;
    
    int  uq , q1 , q2 ,indx;
    String r1 ;
    
    indx = JTable_Products.getSelectedRow();
    
    if(textArea_receipt.getText().isEmpty())
    {
    if(JTable_Products.isRowSelected(indx))
    {
        q1 = Integer.parseInt(txt_quantity.getText());
        
        if(q1 >= 1)
        {
        q1 --;

        uq = q1; // quantity = 1
        
        r1 = String.valueOf(q1);     
        
        String sql = "update record set quantity = ? where id = ? ";
        Connection con = null;
        PreparedStatement pst = null;
        
        try{
                                                                                   
            con = getConnection();
            pst = con.prepareStatement(sql);

            pst.setInt(1, uq); // update quantity
            pst.setString(2, txt_id.getText()); // fetch row of this ID

            pst.executeUpdate();
            
            Show_Products_In_JTable();
            
            txt_quantity.setText(r1);
            
            // Add product to jTable1.                                                             Because one is constant
            model.addRow(new Object [] {txt_id.getText(), txt_name.getText(), txt_AddDate.getText(), 1 , txt_price.getText() } );
            
            Tprice = Float.parseFloat(txt_price.getText());
            
            NetTotal = NetTotal + Tprice;
            float iNetTotal = NetTotal;
            CnvrtNetTotal = String.valueOf(iNetTotal);
            txt_netTotal.setText(CnvrtNetTotal);
            
            JTable_Products.clearSelection();
           
            ClearAll();
            lbl_message.setText("Product Selected !");
        }catch(Exception ex){
        
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        
        }
        
        
        }else{
        JOptionPane.showMessageDialog(null, "Item Out of Stock : " + q1);
        lbl_message.setText("Item Out of Stock : " + q1);
        }
        
    }else{
    
    lbl_message.setText("No Product Selected !");
    }
    
    }else{
    
        JOptionPane.showMessageDialog(null, "Please Clear The Receipt");
    } 
    
    }
    
    
    
    
    private void JTable_ProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_ProductsMouseEntered

        
    }//GEN-LAST:event_JTable_ProductsMouseEntered

    private void JTable_ProductsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_ProductsMouseMoved
       
        
    }//GEN-LAST:event_JTable_ProductsMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        lbl_message.setText("No Action Performed");
        evt.consume();
    }//GEN-LAST:event_formMouseClicked

    
    //Do NOT DELETE
    public void clearAll(){
    
        txt_netTotal.setText("0");
        txt_amount.setText(null);
        txt_cashBack.setText(null);
        txt_cashPaid.setText("0");
        ComboBox_discount.setSelectedIndex(0);
//        txt_discount.setText("0");
        txt_clientName.setText(null);
        ComboBox_counter.setSelectedIndex(0);
        CheckBox.setSelected(false);
    }
    
    private void btnCancelSelectedProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSelectedProductActionPerformed

       Connection con ;
       PreparedStatement pst;
       PreparedStatement pst2 ;
       ResultSet rs;
       String sql1,sql2;
       
       sql1 = "select quantity from record where id = ?";
       sql2 = "update record set quantity = ? where id = ?";
    
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
       int indx = jTable1.getSelectedRow();
       
       int  result , qtty1=0 ,qtty2 =0 ,idd ;
       float Rvalue, Ivalue;
       
       
       
       if(jTable1.isRowSelected(indx))
       {
        
        idd = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0  ).toString());
        qtty1 = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 3  ).toString());
       
       
       Rvalue = Float.parseFloat( model.getValueAt(jTable1.getSelectedRow(), 4).toString());
       Ivalue = qtty1 * Rvalue;
       NetTotal = NetTotal - Ivalue;
        
       txt_netTotal.setText(String.valueOf(NetTotal));
      
        try{
            con = getConnection();
            
            pst = con.prepareStatement(sql1);
            
            pst.setInt(1, idd);
            
            rs = pst.executeQuery();
            
            while (rs.next()){
            qtty2 = rs.getInt(1);
            }
            
            result = qtty2 + qtty1;
           
            pst2 = con.prepareStatement(sql2);
            pst2.setInt(1, result);
            pst2.setInt(2, idd);
            
            pst2.executeUpdate();
              
            
            Show_Products_In_JTable();
            
            model.removeRow(indx);
            ClearAll();
            lbl_message.setText("Product Canceled");
           }catch (Exception ex){
           
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
           }
       
       }
       else{
       
       lbl_message.setText("Please Select a Product");
       }
       
       if(jTable1.getRowCount() == 0)
       {
       JOptionPane.showMessageDialog(rootPane, "The Table is Empty !");
       lbl_message.setText("The Table is Empty !");
       clearAll();
       }
     
    }//GEN-LAST:event_btnCancelSelectedProductActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        JTable_Products.clearSelection();
               
        txt_id.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        txt_name.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        txt_AddDate.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        txt_quantity.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        txt_price.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void none(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    
    
    
   //Do NOT DELETE
    public boolean flag (){
    
        boolean  check ;
        double cashPaid = Double.parseDouble(txt_cashPaid.getText());
       
        if(checkVal())
        {
            if(txt_clientName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please Enter Client's Name");
                check = false;
            }
            else if (ComboBox_counter.getSelectedIndex() == 0 )
            {
            JOptionPane.showMessageDialog(rootPane, "Please Select a Counter");
            check = false;
            }
            else if (CheckBox.isSelected() == false)
            {
                JOptionPane.showMessageDialog(rootPane, "Please Select the Payment Method");
                check = false;
            }
            else if (ComboBox_discount.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Please Select A Discount Value");
                check = false;
            }
            else if (cashPaid == 0)
            {
                JOptionPane.showMessageDialog(null, "Please Make The Payment");
                check = false; 
            }else{
            check = true;
            }
            
        }else {
        check = false;
        }
        
    return (check);
    }
    
    
    //Do NOT DELETE
    private double cashBack ;
    
    
    //Do NOT DELETE
    public boolean compare(){
    
    boolean flag ;   
    double amount, cshpd;
        
        amount = Double.parseDouble(txt_amount.getText());
        cshpd = Double.parseDouble(txt_cashPaid.getText());
        
        if( amount > cshpd)
        {
           lbl_message.setText("Amount Is Greater !");
           
           flag = false;
        }
        
        else if (cshpd > amount)
        {
           
           lbl_message.setText("Cash Paid is Greater !");
           cashBack = cshpd - amount;
           txt_cashBack.setText(String.valueOf(cashBack));
           flag = true;
        }
        else 
        {
          lbl_message.setText("Payment Matched !");
           cashBack = 0;
           txt_cashBack.setText("0");
           flag = true;
        }
    return (flag);
    
    }
    
    
    
    //Do NOT DELETE
    public boolean checkVal(){
    
    boolean flag = true;
    
    double netTotal ;
    netTotal= Double.parseDouble(txt_netTotal.getText());
  
    
    if(netTotal == 0)
    {
         lbl_message.setText("Please Select a Product");
        flag = false;
    }
    else if(ComboBox_discount.getSelectedIndex() == 0)
    {   
        lbl_message.setText("Please Select Discount");
        flag = false;
    }
    else if(txt_cashPaid.getText().isEmpty())
    {   
        txt_cashPaid.setText("0");
        flag = false;
    }
    else
    { 
        flag = true;
    }
    
    return (flag);
    
    }
    
      
    //Do NOT DELETE
    private double  calDiscount = 0;
    
    
    private void ComboBox_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_discountActionPerformed

        double iNetTotal = Double.parseDouble(txt_netTotal.getText());

        if(iNetTotal == 0)
        {
            txt_amount.setText(null);
//            txt_discount.setText("0");
        }
        else
        {   
       if (ComboBox_discount.getSelectedIndex() != 0)
       {
       double iDiscount = Double.parseDouble(ComboBox_discount.getSelectedItem().toString());    
      // txt_discount.setText(ComboBox_discount.getSelectedItem().toString());
       
            calDiscount = (iDiscount / 100) * iNetTotal;
            iNetTotal = iNetTotal - calDiscount;
            txt_amount.setText(String.valueOf(iNetTotal));
              
        }
        else {
            txt_amount.setText(null);
        //    txt_discount.setText("0");
        }
       
        }
        
    }//GEN-LAST:event_ComboBox_discountActionPerformed

    
    //Do NOT DELETE
    public void printTY()
    {
        textArea_receipt.append("\n**************************Thank You !*************************\n");
    }
    
    
    //Do NOT DELETE
    private Object[] arr = new Object[5]; 
    
    public Object[] design (){
    
        Object [] Rdesign = new Object [15];
        //15
        Rdesign[0] = "Product ID";
        Rdesign[1] = arr[0];
        Rdesign[2] = printDash();
        
        Rdesign[3] = "Product Name";
        Rdesign[4] = arr[1]; 
        Rdesign[5] = printDash();
                
        Rdesign[6] = "Date Product Added";       
        Rdesign[7] = arr[2];
        Rdesign[8] = printDash();
                
        Rdesign[9] = "Quantity";
        Rdesign[10] = arr[3];
        Rdesign[11] = printDash();
                
        Rdesign[12] = "Price / Unit";
        Rdesign[13] = arr[4];
        Rdesign[14 ] = printDash() ; 
      
        return (Rdesign);
    }
   

    
    //Do NOT DELETE
    public void printRow1(int Rcount){
    
      
       int col = 0;
       if (Rcount == 1)
       {
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = jTable1.getValueAt(0, col++);
        }
       
       }
        
        Object [] myar = design ();
        
          
        for (int i = 0; i < myar.length; i++){
        
             if((i == 6)||(i==7)||(i==8))
            {
            continue;
            }
            textArea_receipt.append(" " + myar[i] + " " + "\n");
        }
         
    }
    
    
   //Do NOT DELETE 
   public String printDash(){
       
       String dash = "----------------------------------------------------------------------------------";
       return(dash);
    }
    
   
   
  //Do NOT DELETE 
   public void printRows(int Rcount){
        
    Object [][] ARR = new Object [Rcount][5];    
  
    Object [] rcpt = new Object[15];
  
    
    rcpt[0] = "Product ID";
    //1
    rcpt[2] = printDash();
    
    rcpt[3] = "Product Name";
    //4
    rcpt[5] = printDash();
    
    rcpt[6] = "Date Product Added";
    //7
    rcpt[8] = printDash();
    
    rcpt[9] = "Quantity";
    //10
    rcpt[11] = printDash();
    
    rcpt[12] = "Price / Unit";
    //13
    rcpt[14] = printDash();

    
    // Writing Array
        for(int r = 0; r < Rcount ; r++)
        {
            
        for(int c = 0; c < 5; c++)
        {
            ARR[r][c] = jTable1.getValueAt(r, c);
            
            // rcpt[0] = "Product ID";
            rcpt[1] = ARR[r][0]; // ID
            
            // rcpt[3] = "Product Name";
            rcpt[4] = ARR[r][1];
            
            //rcpt[6] = "Date Product Added";
            rcpt[7] = ARR[r][2];
            
            //rcpt[9] = "Quantity";
            rcpt[10] = ARR[r][3];
            
            //rcpt[12] = "Price / Unit";
            rcpt[13] = ARR[r][4];
            
            
        }
        
        for(int x = 0; x < rcpt.length; x++){
            
            if((x == 6)||(x == 7)|| (x == 8))
            {
                continue;
            }
            textArea_receipt.append(" " + rcpt[x] + " " + "\n");
            
            /* if(x == 15)
            {
            printSpace();
            }*/
           
            }
        System.out.println();
        
        }

    }
    
   
   //Do NOT DELETE
   public void deleteAll(int rowCount){
   
   DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
   
   for ( int i = rowCount-1 ; i > -1 ; i -- ){
    model.removeRow(i);
   }
   
   }
    
   
   
   //Do NOT DELETE
   public String receiptId(){
   
   
      java.util.Date date = new java.util.Date();
      java.util.Date time = new java.util.Date();   
        
      SimpleDateFormat sdf2 = new SimpleDateFormat("dMY"); 
      SimpleDateFormat sdf3 = new SimpleDateFormat("kmsS");
       
    
      
      String id1, id2;
      id1 = sdf2.format(date);
      id2 = sdf3.format(time);
      
      String receiptID = "" + id1 + id2 ;
      
      return(receiptID);
   }    
        
   
   
   //Do NOT DELETE
   public void printDetails(){
   
      java.util.Date date = new java.util.Date();
      java.util.Date time = new java.util.Date(); 
      SimpleDateFormat sdf = new SimpleDateFormat("d-M-Y");
        //textField.setText(sdf.format(date));
      SimpleDateFormat sdf1 = new SimpleDateFormat("k:m:s");
        //textField1.setText(sdf1.format(date));
      
       
      SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
      TimeZone Rdate = df.getTimeZone();
      
      textArea_receipt.append("***************************" + "SALE RECEIPT" + "**************************" + "\n" +
                              "Receipt Id: " + receiptId() +"\n" + "Date: " + sdf.format(date)+ "\n" + 
                             "Time: "+ sdf1.format(time)+ "\n" +
                              "Operator: "+ txt_operator.getText() + "\n"+
                              "Client Name: " + txt_clientName.getText() + "\n" +
                              "Counter: "  + ComboBox_counter.getSelectedItem() + "\n");
    }
   
   
  
   
   //Do NOT DELETE
   public void printPayment(){
   
   textArea_receipt.append("Net Total: " + txt_netTotal.getText() + "\n" + printDash() 
                           +"\n" + "Amount After Discount: " + txt_amount.getText() + "\n" + printDash() 
                           + "\nTotal Discount: " + calDiscount + "\n" + printDash() 
                           +"\n" + "Payment Method: "+ payMethod + "\n" + printDash() 
                          + "\n"+"Cash Paid: " + txt_cashPaid.getText() + "\n" + printDash() 
                           + "\nCash Back: " + txt_cashBack.getText() + "\n" + printDash() );
    printTY();
   }
   
   
   //Do NOT DELETE
    private String payMethod = ""; 
    
    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        
        if (CheckBox.isSelected())
        {
            payMethod = CheckBox.getText();
        }
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed

        
        if(textArea_receipt.getText().isEmpty())
        {
            lbl_message.setText("The Receipt Is Empty");
        }else{
        try {
            lbl_message.setText("Printing Receipt");
            textArea_receipt.print();
            
            
        } catch (PrinterException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
    }//GEN-LAST:event_btn_printActionPerformed

    
    
    
    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed

        if(textArea_receipt.getText().isEmpty() && jTable1.getRowCount() == 0)
        {
         System.exit(1);
        }
        else 
        {
         JOptionPane.showMessageDialog(null, "Please Clear The Selected Products And The Receipt ");
        }
        
    }//GEN-LAST:event_btn_closeActionPerformed

    boolean isAdmin = false;
    private void btn_backToAdminDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backToAdminDashboardActionPerformed

        if(isAdmin == true)
        {
            if(textArea_receipt.getText().isEmpty() && jTable1.getRowCount() == 0)
            {
             DashboardAdmin dshadmn = new DashboardAdmin();
             dshadmn.setVisible(true);
             this.setVisible(false);
            }
            else 
            {
             JOptionPane.showMessageDialog(null, "Please Clear The Selected Products And The Receipt ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
            lbl_message.setText("Access Granted Only To Admin");
        }
        
    }//GEN-LAST:event_btn_backToAdminDashboardActionPerformed

    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed

        
         if(checkVal())
        {
            if(compare())
            {
                if(flag ())
                {
                  jTable1.clearSelection();

                  int Rcount = jTable1.getRowCount();
    
                    if (Rcount == 1)
                    {
                        printDetails();
                        printRow1(Rcount);
                        printPayment();

                        deleteAll(Rcount);
                        clearAll();
                        NetTotal = 0;
                        lbl_message.setText("Receipt Written Please Print The Receipt");
                    }
                    if (Rcount > 1)
                    {
                        printDetails();    
                        printRows(Rcount);
                        printPayment();

                        deleteAll(Rcount);
                        clearAll();
                        NetTotal = 0;
                       lbl_message.setText("Receipt Written Please Print The Receipt ");   
                    }
                } 
            }
        }

        
        
    }//GEN-LAST:event_btn_buyActionPerformed

    private void btn_selectProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectProductActionPerformed

        purchaseProduct();
        
    }//GEN-LAST:event_btn_selectProductActionPerformed

    private void btn_clearReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearReceiptActionPerformed

        textArea_receipt.setText(null);
        lbl_message.setText("Receipt Cleared");
        
    }//GEN-LAST:event_btn_clearReceiptActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JComboBox<String> ComboBox_counter;
    private javax.swing.JComboBox<String> ComboBox_discount;
    private javax.swing.JTable JTable_Products;
    private javax.swing.JButton btnCancelSelectedProduct;
    private javax.swing.JButton btn_backToAdminDashboard;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_clearReceipt;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_selectProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_message;
    private javax.swing.JTextArea textArea_receipt;
    private javax.swing.JTextField txt_AddDate;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_cashBack;
    private javax.swing.JTextField txt_cashPaid;
    private javax.swing.JTextField txt_clientName;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_netTotal;
    public javax.swing.JTextField txt_operator;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
