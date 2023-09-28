
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class ViewStudentGradeDetails extends javax.swing.JFrame {

    //Database Components
    Connection con;
    PreparedStatement pst1, pst2;
    ResultSet rs1, rs2;
    
    
    //other essential variables
    String fetchedFirstMiddleName;
    String fetchedLastName;
    String fullName;
    String fetchedClass;
    String enteredRegID;
    String gradeNepali;
    String gradeEnglish;
    String gradeMaths;
    String gradeScience;
    String gradeDrawing;
    String gradeSerofero;
    String gradeLocalSubject;
    String gradeSocial;
    String gradeHealth;
    
    String fetchedGPA;
    String fetchedRemark;
    
    
    GradeDetailsHolder gdh = new GradeDetailsHolder();
    
    
    
    int xCor, yCor;
    public ViewStudentGradeDetails() {
        initComponents();
        connectToDatabase();
    }
    
    
    public void connectToDatabase(){
        
        try{
            String url = "jdbc:mysql://localhost:3306/firstproject";
            String username = "root";
            String password = "seeuagain";
            con = DriverManager.getConnection(url, username, password);
            //stmt = con.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }catch(ClassNotFoundException e){
            e.getMessage();
        }catch(SQLException e){
            e.getMessage();
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 137, 220), 3));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Enter Reg  ID");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(74, 137, 220));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIEW GRADE DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(74, 137, 220));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)){
            jTextField1.setEditable(true);
        }
        else{
            jTextField1.setEditable(false);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
       jPanel2.setBackground(Color.RED);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(74,137,220));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        this.dispose();
        Dashboard db = new Dashboard();
        db.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(Color.RED);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color(74,137,220));
    }//GEN-LAST:event_jPanel3MouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       xCor = evt.getX();
        yCor = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
         this.setLocation(this.getX() + evt.getX() - xCor, this.getY() + evt.getY() - yCor);
    }//GEN-LAST:event_formMouseDragged

    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        enteredRegID = jTextField1.getText();
        
        if(enteredRegID.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Student's Registration ID", "NOT NULL Message", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            try{
                pst1 = con.prepareStatement("SELECT * FROM obtainedmarks WHERE regid = ?");
                pst1.setString(1, enteredRegID);
                rs1 = pst1.executeQuery();
                
                if(rs1.next()){
                    JOptionPane.showMessageDialog(this, "Registration ID Matched");
                    
                    
                    //frist of all, we fetch the obtained grades of student of entered registration id from "obtainedmarks" table
                    gradeNepali = rs1.getString("nepali");
                    gradeEnglish = rs1.getString("english");
                    gradeMaths = rs1.getString("maths");
                    gradeScience = rs1.getString("science");
                    gradeDrawing = rs1.getString("drawing");
                    gradeSerofero = rs1.getString("hamroserofero");
                    gradeLocalSubject = rs1.getString("localsubject");
                    gradeSocial = rs1.getString("social");
                    gradeHealth = rs1.getString("health");
                    fetchedGPA = rs1.getString("gpa");
                    fetchedRemark = (rs1.getString("remarks")).toUpperCase();
                    
                    //now fetching the respective name and class of the student from "studentpersonaldetials" table
                    pst2 = con.prepareStatement("SELECT * FROM studentpersonaldetails WHERE regid = ?");
                    pst2.setString(1, enteredRegID);
                    rs2 = pst2.executeQuery();
                    rs2.next();
                    fetchedFirstMiddleName = rs2.getString("firstmiddlename");
                    fetchedLastName = rs2.getString("lastname");
                    fullName = (fetchedFirstMiddleName + " " + fetchedLastName).toUpperCase();
                    fetchedClass = rs2.getString("grade");
                    
                    if(fetchedClass.equalsIgnoreCase("ecd")){
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("DRAWING");
                        
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeDrawing);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    else if(fetchedClass.equals("1")){
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("Serofero");
                        gdh.sub6.setText("Local Subject");
                        
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeSerofero);
                        gdh.om6.setText(gradeLocalSubject);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    else if(fetchedClass.equals("2")){
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("Serofero");
                        gdh.sub6.setText("Local Subject");
                        
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeSerofero);
                        gdh.om6.setText(gradeLocalSubject);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    else if(fetchedClass.equals("3")){
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("Serofero");
                        gdh.sub6.setText("Local Subject");
                        
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeSerofero);
                        gdh.om6.setText(gradeLocalSubject);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    else if(fetchedClass.equals("4")){
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("Health");
                        gdh.sub6.setText("Local Subject");
                        gdh.sub7.setText("Social");
                         
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeHealth);
                        gdh.om6.setText(gradeLocalSubject);
                        gdh.om7.setText(gradeSocial);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    else if(fetchedClass.equals("5")){
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("Health");
                        gdh.sub6.setText("Local Subject");
                        gdh.sub7.setText("Social");
                         
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeHealth);
                        gdh.om6.setText(gradeLocalSubject);
                        gdh.om7.setText(gradeSocial);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    else if(fetchedClass.equals("6")){
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("Health");
                        gdh.sub6.setText("Local Subject");
                        gdh.sub7.setText("Social");
                         
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeHealth);
                        gdh.om6.setText(gradeLocalSubject);
                        gdh.om7.setText(gradeSocial);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    else if(fetchedClass.equals("7")){
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("Health");
                        gdh.sub6.setText("Local Subject");
                        gdh.sub7.setText("Social");
                         
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeHealth);
                        gdh.om6.setText(gradeLocalSubject);
                        gdh.om7.setText(gradeSocial);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    else{
                        
                        gdh.setVisible(true);
                        this.dispose();
                        
                        gdh.stdName.setText(fullName);
                        gdh.stdRegID.setText(enteredRegID);
                        gdh.stdClass.setText(fetchedClass);
                        
                        gdh.sub1.setText("NEPALI");
                        gdh.sub2.setText("ENGLISH");
                        gdh.sub3.setText("MATHS");
                        gdh.sub4.setText("SCIENCE");
                        gdh.sub5.setText("Health");
                        gdh.sub6.setText("Local Subject");
                        gdh.sub7.setText("Social");
                         
                        gdh.om1.setText(gradeNepali);
                        gdh.om2.setText(gradeEnglish);
                        gdh.om3.setText(gradeMaths);
                        gdh.om4.setText(gradeScience);
                        gdh.om5.setText(gradeHealth);
                        gdh.om6.setText(gradeLocalSubject);
                        gdh.om7.setText(gradeSocial);
                        
                        gdh.stdGPA.setText(fetchedGPA);
                        gdh.stdRemark.setText(fetchedRemark);
                        
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid Registration ID", "RegID NOT MATCHED Messaage", JOptionPane.ERROR_MESSAGE);
                }
                
                
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            

        }
    }//GEN-LAST:event_jPanel2MouseClicked

    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(ViewStudentGradeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudentGradeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudentGradeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudentGradeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentGradeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}