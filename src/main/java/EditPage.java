/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author niebz
 */
public class EditPage extends javax.swing.JDialog {

    /**
     * Creates new form EditPage
     */
    public EditPage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    String edit_id = "";
    int hour_id;
    String date = "";

    public EditPage(java.awt.Frame parent, boolean modal, String id, int h_id) {
        super(parent, modal);
        initComponents();
        edit_id = id;
        hour_id = h_id;
        txtID.setText(id);

        String sql = String.format("Select user_name,user_lastname,date,year,sht.type_name,sh.hour from users as u inner join "
                + "schorlarship_hour as sh on u.user_id = sh.user_id inner join schorlarship_type as sht on sh.type_id = sht.type_id "
                + "where sh.hour_id = '%d'", hour_id,date);
        
        //JOptionPane.showMessageDialog(null,sql);
        DB db = new DB();
        try {
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) {
                txtName.setText(rs.getString(1));
                txtLastname.setText(rs.getString(2));
                LocalDate date = LocalDate.parse(rs.getString(3));
                jDate.setDate(date);
                txtYear.setText(rs.getString(4));
                cbxType.setSelectedItem(rs.getString(5));
                txtHour.setText(rs.getString(6));
            }
        } catch (Exception ex) {

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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtHour = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jDate = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("* โปรดแก้ไขชั่วโมงทุนตามความเป็นจริง");
        jLabel2.setFont(new java.awt.Font("FC Lamoon", 0, 18)); // NOI18N

        jLabel1.setText("รหัสนักศึกษา");
        jLabel1.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        txtID.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtIDInputMethodTextChanged(evt);
            }
        });

        jLabel7.setText("ชื่อ");
        jLabel7.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        txtName.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtName.setFocusable(false);

        jLabel6.setText("นามสกุล");
        jLabel6.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        txtLastname.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N
        txtLastname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtLastname.setFocusable(false);

        jLabel9.setText("ปีการศึกษา");
        jLabel9.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        txtYear.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        jLabel4.setText("วันที่");
        jLabel4.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        jLabel8.setText("ประเภทกิจกรรม");
        jLabel8.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "กรุณาเลือก", "ชั่วโมงส่วนกลาง", "ชั่วโมงคณะ", "ชั่วโมงนักศึกษาทุน" }));
        cbxType.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        jLabel3.setText("จำนวนชั่วโมง");
        jLabel3.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        txtHour.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        btnSave.setText("บันทึก");
        btnSave.setFont(new java.awt.Font("FC Lamoon", 0, 18)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jDate.setFont(new java.awt.Font("FC Lamoon", 0, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addGap(14, 14, 14)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel9)
                            .addGap(40, 40, 40)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(40, 40, 40)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIDFocusLost

    private void txtIDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtIDInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDInputMethodTextChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int year = Integer.parseInt(txtYear.getText());
        int hour = Integer.parseInt(txtHour.getText());
        String datepick = jDate.getDate() + "";
        String type_name = cbxType.getSelectedItem().toString();
        String sql = String.format(" Update schorlarship_hour Set year='%d',date ='%s', type_id=(SELECT type_id FROM schorlarship_type WHERE type_name = '%s'),hour='%d' WHERE hour_id ='%d' ", year, datepick, type_name, hour, hour_id);
        DB db = new DB();
        try {
            if (hour <= 8) {
                if (db.execute(sql)) {
                    AdCheckHour.search();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Fail!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ไม่สามารถเพิ่มชั่วโมงได้มากกว่า 8 ชั่วโมง!!");
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "กรุณาใส่ข้อมูล!!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditPage dialog = new EditPage(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxType;
    private com.github.lgooddatepicker.components.DatePicker jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtHour;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
