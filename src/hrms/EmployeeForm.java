package hrms;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LORDsajan
 */
public class EmployeeForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public EmployeeForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtn = new javax.swing.ButtonGroup();
        marriedBtn = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        n = new javax.swing.JSeparator();
        middleName = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lastName = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        addresslab = new javax.swing.JLabel();
        emailinp = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        addressinp = new javax.swing.JTextField();
        addresslab1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        addresslab2 = new javax.swing.JLabel();
        contcInp = new javax.swing.JTextField();
        addresslab3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        addresslab4 = new javax.swing.JLabel();
        dobInp = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        addresslab5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        others = new javax.swing.JRadioButton();
        noo = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        yess = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        doj = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        empId = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        Designation = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        Department = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        qualifi = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        expInp = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        workLocation = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        mthSalInp = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        yearlyInp = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        deduInp = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BonusInp = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        NetsalInp = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        twdInp = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        presentDayInp = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        FullDayinp = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        halfLeaveinp = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        confirmBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        DelBtn = new javax.swing.JButton();
        post = new javax.swing.JComboBox<>();
        wageSel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(220, 220, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PERSONAL INFORMATION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 330, 40));

        firstName.setBackground(new java.awt.Color(220, 220, 255));
        firstName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        firstName.setForeground(new java.awt.Color(51, 0, 0));
        firstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstName.setBorder(null);
        firstName.setOpaque(false);
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        jPanel2.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, -1));

        n.setBackground(new java.awt.Color(204, 204, 204));
        n.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 80, 10));

        middleName.setBackground(new java.awt.Color(220, 220, 255));
        middleName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        middleName.setForeground(new java.awt.Color(51, 0, 0));
        middleName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        middleName.setBorder(null);
        middleName.setOpaque(false);
        jPanel2.add(middleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 90, 20));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 90, 10));

        lastName.setBackground(new java.awt.Color(220, 220, 255));
        lastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(51, 0, 0));
        lastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastName.setBorder(null);
        lastName.setOpaque(false);
        jPanel2.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 90, 20));

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 90, 10));

        addresslab.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab.setText("Email");
        jPanel2.add(addresslab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 80, 20));

        emailinp.setBackground(new java.awt.Color(220, 220, 255));
        emailinp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailinp.setForeground(new java.awt.Color(51, 0, 0));
        emailinp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailinp.setBorder(null);
        emailinp.setOpaque(false);
        jPanel2.add(emailinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 200, 20));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 200, 10));

        addressinp.setBackground(new java.awt.Color(220, 220, 255));
        addressinp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addressinp.setForeground(new java.awt.Color(51, 0, 0));
        addressinp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressinp.setBorder(null);
        addressinp.setOpaque(false);
        jPanel2.add(addressinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 200, 20));

        addresslab1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab1.setText("Address");
        jPanel2.add(addresslab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 20));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 200, 10));

        addresslab2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab2.setText("Gender");
        jPanel2.add(addresslab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 80, 20));

        contcInp.setBackground(new java.awt.Color(220, 220, 255));
        contcInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contcInp.setForeground(new java.awt.Color(51, 0, 0));
        contcInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contcInp.setBorder(null);
        contcInp.setOpaque(false);
        contcInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contcInpActionPerformed(evt);
            }
        });
        jPanel2.add(contcInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 200, 20));

        addresslab3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab3.setText("Conatact");
        jPanel2.add(addresslab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 80, 20));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 200, 10));

        addresslab4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab4.setText("Birth Date");
        jPanel2.add(addresslab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 80, 20));

        dobInp.setBackground(new java.awt.Color(220, 220, 255));
        dobInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dobInp.setForeground(new java.awt.Color(51, 0, 0));
        dobInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dobInp.setBorder(null);
        dobInp.setOpaque(false);
        dobInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobInpActionPerformed(evt);
            }
        });
        jPanel2.add(dobInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 200, 20));

        jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 200, 10));

        addresslab5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab5.setText("Married");
        jPanel2.add(addresslab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 70, 20));

        jPanel7.setBackground(new java.awt.Color(210, 234, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHOTO HERE");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 270));

        others.setBackground(new java.awt.Color(220, 220, 255));
        genderBtn.add(others);
        others.setText("Others");
        jPanel2.add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 70, 30));

        noo.setBackground(new java.awt.Color(220, 220, 255));
        marriedBtn.add(noo);
        noo.setText("No");
        noo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nooActionPerformed(evt);
            }
        });
        jPanel2.add(noo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 50, 30));

        F.setBackground(new java.awt.Color(220, 220, 255));
        genderBtn.add(F);
        F.setText("F");
        F.setName(""); // NOI18N
        jPanel2.add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 50, 30));

        M.setBackground(new java.awt.Color(220, 220, 255));
        genderBtn.add(M);
        M.setSelected(true);
        M.setText("M");
        M.setName("M"); // NOI18N
        jPanel2.add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 50, 30));

        yess.setBackground(new java.awt.Color(220, 220, 255));
        marriedBtn.add(yess);
        yess.setText("Yes");
        jPanel2.add(yess, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 50, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Last name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 90, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("First name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 80, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Middle name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 730));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SALARY INFORMATION");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 610, 40));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("OFFICE INFORMATION");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 610, 40));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ATTENDENCE INFORMATION");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 610, 40));

        doj.setBackground(new java.awt.Color(220, 255, 255));
        doj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        doj.setForeground(new java.awt.Color(51, 0, 51));
        doj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        doj.setBorder(null);
        doj.setOpaque(false);
        doj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dojActionPerformed(evt);
            }
        });
        jPanel1.add(doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 160, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel13.setText("Employee ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 130, 30));

        empId.setBackground(new java.awt.Color(220, 255, 255));
        empId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empId.setForeground(new java.awt.Color(51, 0, 51));
        empId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empId.setBorder(null);
        empId.setOpaque(false);
        jPanel1.add(empId, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 160, 20));

        jSeparator17.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, 10));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel14.setText("Designation");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 130, 30));

        Designation.setBackground(new java.awt.Color(220, 255, 255));
        Designation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Designation.setForeground(new java.awt.Color(51, 0, 51));
        Designation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Designation.setBorder(null);
        Designation.setOpaque(false);
        jPanel1.add(Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, 20));

        jSeparator18.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 160, 10));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel15.setText("Department");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 130, 30));

        Department.setBackground(new java.awt.Color(220, 255, 255));
        Department.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Department.setForeground(new java.awt.Color(51, 0, 51));
        Department.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Department.setBorder(null);
        Department.setOpaque(false);
        Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 160, 20));

        jSeparator19.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 160, 10));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel16.setText("Start Date");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 130, 30));

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(51, 0, 51));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(null);
        jTextField11.setOpaque(false);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 160, 20));

        jSeparator20.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, 10));

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 10, 170));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel17.setText("Qualifiacation");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 130, 30));

        qualifi.setBackground(new java.awt.Color(220, 255, 255));
        qualifi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qualifi.setForeground(new java.awt.Color(51, 0, 51));
        qualifi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qualifi.setBorder(null);
        qualifi.setOpaque(false);
        qualifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualifiActionPerformed(evt);
            }
        });
        jPanel1.add(qualifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 160, 20));

        jSeparator22.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 160, 10));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel18.setText("Experience");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 130, 30));

        expInp.setBackground(new java.awt.Color(220, 255, 255));
        expInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        expInp.setForeground(new java.awt.Color(51, 0, 51));
        expInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expInp.setBorder(null);
        expInp.setOpaque(false);
        jPanel1.add(expInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 160, 20));

        jSeparator23.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 160, 10));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel19.setText("Work Location");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 130, 30));

        workLocation.setBackground(new java.awt.Color(220, 255, 255));
        workLocation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        workLocation.setForeground(new java.awt.Color(51, 0, 51));
        workLocation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workLocation.setBorder(null);
        workLocation.setOpaque(false);
        jPanel1.add(workLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 160, 20));

        jSeparator24.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 150, 10));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel26.setText("Monthly Salary");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 130, 30));

        mthSalInp.setBackground(new java.awt.Color(220, 255, 255));
        mthSalInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mthSalInp.setForeground(new java.awt.Color(51, 0, 51));
        mthSalInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mthSalInp.setBorder(null);
        mthSalInp.setOpaque(false);
        mthSalInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mthSalInpActionPerformed(evt);
            }
        });
        jPanel1.add(mthSalInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 160, 20));

        jSeparator32.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 150, 10));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel27.setText("Yearly Salary");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 130, 30));

        yearlyInp.setBackground(new java.awt.Color(220, 255, 255));
        yearlyInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yearlyInp.setForeground(new java.awt.Color(51, 0, 51));
        yearlyInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearlyInp.setBorder(null);
        yearlyInp.setOpaque(false);
        yearlyInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyInpActionPerformed(evt);
            }
        });
        jPanel1.add(yearlyInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 160, 20));

        jSeparator33.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 160, 10));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel28.setText("Deduction");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 130, 30));

        deduInp.setBackground(new java.awt.Color(220, 255, 255));
        deduInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deduInp.setForeground(new java.awt.Color(51, 0, 51));
        deduInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        deduInp.setBorder(null);
        deduInp.setOpaque(false);
        deduInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deduInpActionPerformed(evt);
            }
        });
        jPanel1.add(deduInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 160, 20));

        jSeparator34.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 160, 10));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel20.setText("Position Type");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 130, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel21.setText("Bonous");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 130, 30));

        BonusInp.setBackground(new java.awt.Color(220, 255, 255));
        BonusInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BonusInp.setForeground(new java.awt.Color(51, 0, 51));
        BonusInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BonusInp.setBorder(null);
        BonusInp.setOpaque(false);
        BonusInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BonusInpActionPerformed(evt);
            }
        });
        jPanel1.add(BonusInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 160, 20));

        jSeparator26.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 160, 10));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel22.setText("Net Salary");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 130, 30));

        NetsalInp.setBackground(new java.awt.Color(220, 255, 255));
        NetsalInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NetsalInp.setForeground(new java.awt.Color(51, 0, 51));
        NetsalInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NetsalInp.setBorder(null);
        NetsalInp.setOpaque(false);
        NetsalInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetsalInpActionPerformed(evt);
            }
        });
        jPanel1.add(NetsalInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 160, 20));

        jSeparator27.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 160, 10));

        jSeparator29.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 10, 190));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel23.setText("Wage Type");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 130, 30));

        jSeparator30.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 10, 170));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel29.setText("Total working days");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 130, 30));

        twdInp.setBackground(new java.awt.Color(220, 255, 255));
        twdInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        twdInp.setForeground(new java.awt.Color(51, 0, 51));
        twdInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        twdInp.setBorder(null);
        twdInp.setOpaque(false);
        twdInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twdInpActionPerformed(evt);
            }
        });
        jPanel1.add(twdInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 120, 20));

        jSeparator35.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 120, 10));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel30.setText("Present Days");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 130, 30));

        presentDayInp.setBackground(new java.awt.Color(220, 255, 255));
        presentDayInp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        presentDayInp.setForeground(new java.awt.Color(51, 0, 51));
        presentDayInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        presentDayInp.setBorder(null);
        presentDayInp.setOpaque(false);
        presentDayInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentDayInpActionPerformed(evt);
            }
        });
        jPanel1.add(presentDayInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 160, 20));

        jSeparator36.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 160, 10));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel31.setText("Full Leave");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 130, 30));

        FullDayinp.setBackground(new java.awt.Color(220, 255, 255));
        FullDayinp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FullDayinp.setForeground(new java.awt.Color(51, 0, 51));
        FullDayinp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FullDayinp.setBorder(null);
        FullDayinp.setOpaque(false);
        FullDayinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullDayinpActionPerformed(evt);
            }
        });
        jPanel1.add(FullDayinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 160, 20));

        jSeparator37.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, 160, 10));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel24.setText("Half Leave");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 130, 30));

        halfLeaveinp.setBackground(new java.awt.Color(220, 255, 255));
        halfLeaveinp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        halfLeaveinp.setForeground(new java.awt.Color(51, 0, 51));
        halfLeaveinp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        halfLeaveinp.setBorder(null);
        halfLeaveinp.setOpaque(false);
        halfLeaveinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfLeaveinpActionPerformed(evt);
            }
        });
        jPanel1.add(halfLeaveinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 160, 20));

        jSeparator31.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 160, 10));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 940, 10));

        confirmBtn.setBackground(new java.awt.Color(0, 153, 153));
        confirmBtn.setText("CONFIRM");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        jPanel1.add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 750, 130, 30));

        UpdateBtn.setBackground(new java.awt.Color(0, 204, 102));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 750, 130, 30));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 940, 10));

        DelBtn.setBackground(new java.awt.Color(255, 51, 51));
        DelBtn.setText("DELETE");
        jPanel1.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 750, 130, 30));

        post.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "full time", "part time", "Intern" }));
        post.setToolTipText("");
        jPanel1.add(post, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 130, 30));

        wageSel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annual", "Hourly" }));
        jPanel1.add(wageSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 160, 30));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contcInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contcInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contcInpActionPerformed

    private void dobInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobInpActionPerformed

    private void DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentActionPerformed

    private void qualifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualifiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualifiActionPerformed

    private void mthSalInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mthSalInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mthSalInpActionPerformed

    private void yearlyInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlyInpActionPerformed

    private void deduInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deduInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deduInpActionPerformed

    private void BonusInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BonusInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BonusInpActionPerformed

    private void NetsalInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetsalInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NetsalInpActionPerformed

    private void twdInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twdInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twdInpActionPerformed

    private void presentDayInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentDayInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentDayInpActionPerformed

    private void FullDayinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullDayinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullDayinpActionPerformed

    private void halfLeaveinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfLeaveinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_halfLeaveinpActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed

        try {
            SqliteConnect.connectDb();
            String first = firstName.getText();
            String middle = middleName.getText();
            String last = lastName.getText();
            String add = addressinp.getText();
            String email = emailinp.getText();
            String contac = contcInp.getText();
            String gender;
            if (M.isSelected()) {
                gender = "M";
            } else if (F.isSelected()) {
                gender = "F";
            } else {
                gender = "others";
            }
            String dob = dobInp.getText();
            String married;
            if (yess.isSelected()) {
                married = "Yes";
            } else {
                married = "No";
            }

            String empID = empId.getText();
            String desig = Designation.getText();
            String dep = Department.getText();
            String Doj = doj.getText();
            String qualif = qualifi.getText();
            String exp = expInp.getText();
            String workP = workLocation.getText();
            String position = (String) post.getSelectedItem();
            String mthsal = mthSalInp.getText();
            double yearSal;
            yearSal = Integer.parseInt(mthsal) * 12;
            String insurance = yearlyInp.getText();
            String dedu = deduInp.getText();
            String Bonous = BonusInp.getText();
            String Wage = (String) wageSel.getSelectedItem();
            String netsal = NetsalInp.getText();
            String twd = twdInp.getText();
            String fLev = FullDayinp.getText();
            String pres = presentDayInp.getText();
            String hLev = halfLeaveinp.getText();
            String sql = "INSERT INTO employee (emp_id, first_name, middle_name, last_name, photo, gender, dob, Married, address, contact_no, email, designation, department, qualification, position_type, yoExp, doJoin, work_place, monthlySalary, yearlySalary, Deduction, Insurance, netSalary, wage_type, totalDays, halfLeaves, fullLeaves, totalPresent)"
                    + "VALUES('" + empID + "','" + first + "','" + middle + "','" + last + "','" + email + "''" + null + "','" + gender + "','" + dob + "','" + married + "','" + add + "','" + contac + "','" + email + "','" + desig + "','" + dep + "','" + qualif + "','" + position + "','" + exp + "','" + Doj + "','" + workP + "','" + mthsal + "','" + yearSal + "','" + dedu + "','" + insurance + "','" + netsal + "','" + Wage + "','" + twd + "','" + hLev + "','" + fLev + "','" + pres + "');";
            System.out.println(sql);
            pst = SqliteConnect.conn.prepareStatement(sql);
            int a = pst.executeUpdate();
            if (a != 0) {
                JOptionPane.showMessageDialog(null, "Employee added successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Error in insertation");
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed

    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void nooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nooActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nooActionPerformed

    private void dojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dojActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField BonusInp;
    protected javax.swing.JButton DelBtn;
    protected javax.swing.JTextField Department;
    protected javax.swing.JTextField Designation;
    protected javax.swing.JRadioButton F;
    protected javax.swing.JTextField FullDayinp;
    protected javax.swing.JRadioButton M;
    protected javax.swing.JTextField NetsalInp;
    protected javax.swing.JButton UpdateBtn;
    protected javax.swing.JTextField addressinp;
    private javax.swing.JLabel addresslab;
    private javax.swing.JLabel addresslab1;
    private javax.swing.JLabel addresslab2;
    private javax.swing.JLabel addresslab3;
    private javax.swing.JLabel addresslab4;
    private javax.swing.JLabel addresslab5;
    protected javax.swing.JButton confirmBtn;
    protected javax.swing.JTextField contcInp;
    protected javax.swing.JTextField deduInp;
    protected javax.swing.JTextField dobInp;
    protected javax.swing.JTextField doj;
    protected javax.swing.JTextField emailinp;
    protected javax.swing.JTextField empId;
    protected javax.swing.JTextField expInp;
    protected javax.swing.JTextField firstName;
    protected javax.swing.ButtonGroup genderBtn;
    protected javax.swing.JTextField halfLeaveinp;
    protected javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    protected javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField11;
    protected javax.swing.JTextField lastName;
    protected javax.swing.ButtonGroup marriedBtn;
    protected javax.swing.JTextField middleName;
    protected javax.swing.JTextField mthSalInp;
    private javax.swing.JSeparator n;
    protected javax.swing.JRadioButton noo;
    protected javax.swing.JRadioButton others;
    protected javax.swing.JComboBox<String> post;
    protected javax.swing.JTextField presentDayInp;
    protected javax.swing.JTextField qualifi;
    protected javax.swing.JTextField twdInp;
    protected javax.swing.JComboBox<String> wageSel;
    protected javax.swing.JTextField workLocation;
    protected javax.swing.JTextField yearlyInp;
    protected javax.swing.JRadioButton yess;
    // End of variables declaration//GEN-END:variables
}
