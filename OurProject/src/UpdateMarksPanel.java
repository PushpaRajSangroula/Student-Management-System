import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class UpdateMarksPanel extends javax.swing.JInternalFrame {

    
    
    String enteredRegID;
    
    //Database components
    Connection con;
    PreparedStatement pst, pst2, pst3, pst4, pst5;
    ResultSet rs, rs2, rs3;
    
    
    ClassECDUpdateMarks ecdUpdateMarks = new ClassECDUpdateMarks();
    Class1UpdateMarks oneUpdateMarks = new Class1UpdateMarks();
    Class2UpdateMarks twoUpdateMarks = new Class2UpdateMarks();
    Class3UpdateMarks threeUpdateMarks = new Class3UpdateMarks();
    Class4UpdateMarks fourUpdateMarks = new Class4UpdateMarks();
    Class5UpdateMarks fiveUpdateMarks = new Class5UpdateMarks();
    Class6UpdateMarks sixUpdateMarks = new Class6UpdateMarks();
    Class7UpdateMarks sevenUpdateMarks = new Class7UpdateMarks();
    Class8UpdateMarks eightUpdateMarks = new Class8UpdateMarks();
    
    
    
    
    
    
    
    public UpdateMarksPanel() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =  (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
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
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GO BACK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Enter Reg  ID");

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

        jPanel1.setBackground(new java.awt.Color(74, 137, 220));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SUBMIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        SelectMarksPanel smp = new SelectMarksPanel();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(smp).setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(Color.RED);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(74,137,220));
    }//GEN-LAST:event_jPanel2MouseExited

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

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel1.setBackground(Color.RED);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setBackground(new Color(74,137,220));
    }//GEN-LAST:event_jPanel1MouseExited

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       enteredRegID = jTextField1.getText();
       String fetchedGrade;
       
       //the following variables are used to store the fetched marks from "studentmarks" table and to display the respective marks in the frame
       String fNepali;
       String fEnglish;
       String fMaths;
       String fScience;
       String fDrawing;
       String fSerofero;
       String fLocalSubject;
       String fHealth;
       String fSocial;
       
       //the following variables are used to store the new values or marks that the user enter inorder to update the marks but in the integer type
       int freshNepali;
       int freshEnglish;
       int freshMaths;
       int freshScience;
       int freshDrawing;
       int freshSerofero;
       int freshLocalSubject;
       int freshHealth;
       int freshSocial;
       
       //below are the variables that store the grade value of respective subject
       String newGNepali;
       String newGEnglish;
       String newGMaths;
       String newGScience;
       String newGDrawing;
       String newGSerofero;
       String newGLocalSubject;
       String newGHealth;
       String newGSocial;
       
       //below  are the variables to store percentage and gpa
       String newGPA;
       double newPercent;
       
       //the following variable stores the total obtained marks
       int totalOM;
       
       //the following variable stores the total full marks
       int total;
       
       //the following variable store the remark
       String remark;
       
       //the following variables are used to store the full marks that are retieved from the GUI in integer type
       int fmNepali;
       int fmEnglish;
       int fmMaths;
       int fmScience;
       int fmDrawing;
       int fmSerofero;
       int fmLocalSubject;
       int fmHealth;
       int fmSocial;
       
       
       
       //String fetchedRegID;
//       String cfNepali = ecdUpdateMarks.omNepali;
//       String cfEnglish;
//       String cfMaths;
//       String cfScience;
//       String cfDrawing;
       
       
       try{
           pst = con.prepareStatement("SELECT * FROM obtainedMarks WHERE regid = ?");
           pst.setString(1, enteredRegID);
           rs = pst.executeQuery();
           
           if(enteredRegID.equals("")){
               JOptionPane.showMessageDialog(this, "Please Enter the Registration ID", "NOT NULL Message", JOptionPane.WARNING_MESSAGE);
           }
           
           else if(rs.next()){
               JOptionPane.showMessageDialog(this, "Registration ID MATCHED", "Successful Reg ID Message", JOptionPane.PLAIN_MESSAGE);
               
               pst2 = con.prepareStatement("SELECT * FROM studentpersonaldetails WHERE regid =?");
               pst2.setString(1, enteredRegID);
               rs2 = pst2.executeQuery();
               
               rs2.next();
               fetchedGrade = rs2.getString("grade");
               
               if(fetchedGrade.equalsIgnoreCase("ecd")){
                   
                   ecdUpdateMarks.setVisible(true);
                   ecdUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fDrawing = (rs3.getInt("drawing"))+"";
                   
                   
                   ecdUpdateMarks.jTextField1.setText(fNepali);
                   ecdUpdateMarks.jTextField2.setText(fEnglish);
                   ecdUpdateMarks.jTextField3.setText(fMaths);
                   ecdUpdateMarks.jTextField4.setText(fScience);
                   ecdUpdateMarks.jTextField5.setText(fDrawing);
                   
                   
                 
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }
               else if(fetchedGrade.equals("1")){
                   
                   oneUpdateMarks.setVisible(true);
                   oneUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fSerofero = (rs3.getInt("serofero"))+"";
                   fLocalSubject = (rs3.getInt("localsubject"))+"";
                   
                   
                   oneUpdateMarks.jTextField1.setText(fNepali);
                   oneUpdateMarks.jTextField2.setText(fEnglish);
                   oneUpdateMarks.jTextField3.setText(fMaths);
                   oneUpdateMarks.jTextField4.setText(fScience);
                   oneUpdateMarks.jTextField5.setText(fSerofero);
                   oneUpdateMarks.jTextField8.setText(fLocalSubject);
                   
          
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }
               else if(fetchedGrade.equals("2")){
                   
                   twoUpdateMarks.setVisible(true);
                   twoUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fSerofero = (rs3.getInt("serofero"))+"";
                   fLocalSubject = (rs3.getInt("localsubject"))+"";
                   
                   
                   twoUpdateMarks.jTextField1.setText(fNepali);
                   twoUpdateMarks.jTextField2.setText(fEnglish);
                   twoUpdateMarks.jTextField3.setText(fMaths);
                   twoUpdateMarks.jTextField4.setText(fScience);
                   twoUpdateMarks.jTextField5.setText(fSerofero);
                   twoUpdateMarks.jTextField8.setText(fLocalSubject);
                   
          
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }
               else if(fetchedGrade.equals("3")){
                   
                   threeUpdateMarks.setVisible(true);
                   threeUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fSerofero = (rs3.getInt("serofero"))+"";
                   fLocalSubject = (rs3.getInt("localsubject"))+"";
                   
                   
                   threeUpdateMarks.jTextField1.setText(fNepali);
                   threeUpdateMarks.jTextField2.setText(fEnglish);
                   threeUpdateMarks.jTextField3.setText(fMaths);
                   threeUpdateMarks.jTextField4.setText(fScience);
                   threeUpdateMarks.jTextField5.setText(fSerofero);
                   threeUpdateMarks.jTextField8.setText(fLocalSubject);
                   
          
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }
               else if(fetchedGrade.equals("4")){
                   
                   fourUpdateMarks.setVisible(true);
                   fourUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fLocalSubject = (rs3.getInt("localsubject"))+"";
                   fHealth = (rs3.getInt("health"))+"";
                   fSocial = (rs3.getInt("social"))+"";
                   
                   
                   fourUpdateMarks.jTextField1.setText(fNepali);
                   fourUpdateMarks.jTextField2.setText(fEnglish);
                   fourUpdateMarks.jTextField3.setText(fMaths);
                   fourUpdateMarks.jTextField4.setText(fScience);
                   fourUpdateMarks.jTextField5.setText(fLocalSubject);
                   fourUpdateMarks.jTextField8.setText(fHealth);
                   fourUpdateMarks.jTextField9.setText(fSocial);
                   
          
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }
               else if(fetchedGrade.equals("5")){
                   
                   fiveUpdateMarks.setVisible(true);
                   fiveUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fLocalSubject = (rs3.getInt("localsubject"))+"";
                   fHealth = (rs3.getInt("health"))+"";
                   fSocial = (rs3.getInt("social"))+"";
                   
                   
                   fiveUpdateMarks.jTextField1.setText(fNepali);
                   fiveUpdateMarks.jTextField2.setText(fEnglish);
                   fiveUpdateMarks.jTextField3.setText(fMaths);
                   fiveUpdateMarks.jTextField4.setText(fScience);
                   fiveUpdateMarks.jTextField5.setText(fLocalSubject);
                   fiveUpdateMarks.jTextField8.setText(fHealth);
                   fiveUpdateMarks.jTextField9.setText(fSocial);
                   
          
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }
               else if(fetchedGrade.equals("6")){
                   
                   sixUpdateMarks.setVisible(true);
                   sixUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fLocalSubject = (rs3.getInt("localsubject"))+"";
                   fHealth = (rs3.getInt("health"))+"";
                   fSocial = (rs3.getInt("social"))+"";
                   
                   
                   sixUpdateMarks.jTextField1.setText(fNepali);
                   sixUpdateMarks.jTextField2.setText(fEnglish);
                   sixUpdateMarks.jTextField3.setText(fMaths);
                   sixUpdateMarks.jTextField4.setText(fScience);
                   sixUpdateMarks.jTextField5.setText(fLocalSubject);
                   sixUpdateMarks.jTextField8.setText(fHealth);
                   sixUpdateMarks.jTextField9.setText(fSocial);
                   
          
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }
               else if(fetchedGrade.equals("7")){
                   
                   sevenUpdateMarks.setVisible(true);
                   sevenUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fLocalSubject = (rs3.getInt("localsubject"))+"";
                   fHealth = (rs3.getInt("health"))+"";
                   fSocial = (rs3.getInt("social"))+"";
                   
                   
                   sevenUpdateMarks.jTextField1.setText(fNepali);
                   sevenUpdateMarks.jTextField2.setText(fEnglish);
                   sevenUpdateMarks.jTextField3.setText(fMaths);
                   sevenUpdateMarks.jTextField4.setText(fScience);
                   sevenUpdateMarks.jTextField5.setText(fLocalSubject);
                   sevenUpdateMarks.jTextField8.setText(fHealth);
                   sevenUpdateMarks.jTextField9.setText(fSocial);
                   
          
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }
               else{
                   
                   eightUpdateMarks.setVisible(true);
                   eightUpdateMarks.jLabel3.setText(enteredRegID);
                   
                   
                   pst3 = con.prepareStatement("SELECT * FROM studentmarks WHERE regid = ?");
                   pst3.setString(1, enteredRegID);
                   rs3 = pst3.executeQuery();
                   rs3.next();
                   fNepali = (rs3.getInt("nepali"))+"";
                   fEnglish = (rs3.getInt("english"))+"";
                   fMaths = (rs3.getInt("maths"))+"";
                   fScience = (rs3.getInt("science"))+"";
                   fLocalSubject = (rs3.getInt("localsubject"))+"";
                   fHealth = (rs3.getInt("health"))+"";
                   fSocial = (rs3.getInt("social"))+"";
                   
                   
                   eightUpdateMarks.jTextField1.setText(fNepali);
                   eightUpdateMarks.jTextField2.setText(fEnglish);
                   eightUpdateMarks.jTextField3.setText(fMaths);
                   eightUpdateMarks.jTextField4.setText(fScience);
                   eightUpdateMarks.jTextField5.setText(fLocalSubject);
                   eightUpdateMarks.jTextField8.setText(fHealth);
                   eightUpdateMarks.jTextField9.setText(fSocial);
                   
          
                   Dashboard dash = (Dashboard) SwingUtilities.getWindowAncestor(this);
                   dash.dispose();

               }

               
           }else{
               JOptionPane.showMessageDialog(this, "Registration ID didn't match", "Invalid Reg ID Message", JOptionPane.ERROR_MESSAGE);
           }
           
           
           
       }catch(SQLException e){
           e.printStackTrace();
       }
  
    }//GEN-LAST:event_jPanel1MouseClicked

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
