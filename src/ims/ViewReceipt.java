/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ViewReceipt extends javax.swing.JFrame {

    /**
     * Creates new form ViewReceipt
     */
    public ViewReceipt() {
        initComponents();
        ShowReceiptInTable();
    }
    
    
    
    public Connection getConnection()
    {
    Connection con = null;
    
    try {
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "abc1994");
   // System.out.println("Connected");
    //JOptionPane.showMessageDialog(null, "Database is connected !");
    return con;
    } catch (SQLException ex) {
    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
 //  System.out.println("Not Connected");
  //  JOptionPane.showMessageDialog(null, "Database is not connected !");
    return null;
    }
    }
    
      //1 Fill ArrayList with data
    public ArrayList<Receipt> getReceiptList()
    {
        ArrayList<Receipt> productList = new ArrayList();
        Connection con = getConnection();
        String query = "SELECT * FROM receipt";
            
        Statement st;
        ResultSet rs;
        
        try {         
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            Receipt receipt;
            
            while (rs.next())
            {             
 //(int INVOICE_ID,float PRICE,int QUANTITY,String INVOICE_DATE,String CLIENT_NAME,String COUNTER,String PAYMENT_DETAIL,float NET_AMOUNT,float DISCOUNT,float CASH_PAID,float CASH_BACK,String OPERATOR)
            receipt = new Receipt(rs.getInt(1), rs.getFloat(2), rs.getInt(3), rs.getString(4), rs.getString(5) , rs.getString(6), rs.getString(7), rs.getFloat(8), rs.getFloat(9), rs.getFloat(10),rs.getFloat(11), rs.getString(12));
               
            productList.add(receipt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return productList;
                
    
    }
    
    // 2 - Populate the JTable
    public void ShowReceiptInTable()
    {
        //JTable 1
        ArrayList<Receipt> list = getReceiptList();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        
        Object[] row = new Object [13];
        
        // clear jtable content
        model.setRowCount(0);
        /*
    this.invoice_id = INVOICE_ID;
    this.price = PRICE;
    this.quantity = QUANTITY;
    this.invoice_date = INVOICE_DATE;
    this.client_name = CLIENT_NAME;
    this.counter = COUNTER;
    this.payment_detail =  PAYMENT_DETAIL;
    this.net_amount = NET_AMOUNT;
    this.discount = DISCOUNT;
    this.cash_paid = CASH_PAID;
    this.cash_back = CASH_BACK;
    this.operator = OPERATOR;
        */
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getInvoice_id();
            row[1] = list.get(i).getPrice();
            row[2] = list.get(i).getQuantity();
            row[3] = list.get(i).getInvoice_date();
            row[4] = list.get(i).getClient_name();
            
            row[5] = list.get(i).getCounter();
            row[6] = list.get(i).getPayment_detail();
            row[7] = list.get(i).getNet_amount();
            row[8] = list.get(i).getDiscount();
            row[9] = list.get(i).getCash_paid();
            
            row[10] = list.get(i).getCash_back();
            row[11] = list.get(i).getOperator();
            
            model.addRow(row);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTable.setBackground(new java.awt.Color(102, 153, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice Id", "Price", "Quantity", "Invoice Date", "Client Name", "Counter", "Payment Detail", "Net Amount", "Discount", "Cash Paid", "Cash Back", "Operator"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
