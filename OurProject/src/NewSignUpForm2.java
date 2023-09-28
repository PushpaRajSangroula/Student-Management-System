import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;

public class NewSignUpForm2 extends javax.swing.JFrame {

    int xCor, yCor;
    
    //Database components
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    
    //variables to receive the entered data
    String enteredName;
    String enteredMail;
    String enteredPassword;
    String confirmedPassword;
    
    public NewSignUpForm2() {
        initComponents();
        scaleImage();
        addPlaceholderStyle(uName);
        addPlaceholderStyle(uMail);
        addPlaceholderStyle(uPass);
        addPlaceholderStyle(uPass2);
        connectToDatabase();
    }

    public void connectToDatabase(){
        
        try{
            String url = "jdbc:mysql://localhost:3306/firstproject";
            String username = "root";
            String password = "seeuagain";
            con = DriverManager.getConnection(url, username, password);
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }catch(ClassNotFoundException e){
            e.getMessage();
        }catch(SQLException e){
            e.getMessage();
        }
   
    }
    
    
    
    public void addPlaceholderStyle(JTextField tf){
        Font fnt = tf.getFont();
        fnt = fnt.deriveFont(Font.ITALIC);
        tf.setFont(fnt);
        tf.setForeground(new Color(153, 153, 153));
    }
    
    public void removePlaceholderStyle(JTextField tf){
        Font fnt = tf.getFont();
        fnt = fnt.deriveFont(Font.PLAIN|Font.BOLD);
        tf.setFont(fnt);
        tf.setForeground(Color.BLACK);
    }
    public void scaleImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\asus\\Downloads\\usr.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(userIcon.getWidth(), userIcon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        userIcon.setIcon(scaledIcon);
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginBackPanel = new javax.swing.JPanel();
        loginBtn = new javax.swing.JLabel();
        MainPanel2 = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        signupBackPanel = new javax.swing.JPanel();
        signupBtn = new javax.swing.JLabel();
        uMail = new javax.swing.JTextField();
        uPass = new javax.swing.JPasswordField();
        uName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        uPass2 = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();

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
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 137, 220), 3, true));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please enter your details at the right portion");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("of this page to REGISTER your account.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Already have an account ? ");

        loginBackPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginBackPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 137, 220), 1, true));
        loginBackPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBackPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBackPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBackPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBackPanelMouseExited(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(74, 137, 220));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("LOGIN");

        javax.swing.GroupLayout loginBackPanelLayout = new javax.swing.GroupLayout(loginBackPanel);
        loginBackPanel.setLayout(loginBackPanelLayout);
        loginBackPanelLayout.setHorizontalGroup(
            loginBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        loginBackPanelLayout.setVerticalGroup(
            loginBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(loginBackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(398, 398, 398)
                    .addComponent(loginBackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(153, Short.MAX_VALUE)))
        );

        MainPanel2.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel2.setPreferredSize(new java.awt.Dimension(348, 505));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usr.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 137, 220));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Full Name");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 137, 220));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Email");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 137, 220));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Password");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));

        signupBackPanel.setBackground(new java.awt.Color(255, 255, 255));
        signupBackPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 137, 220), 1, true));
        signupBackPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBackPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBackPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupBackPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupBackPanelMouseExited(evt);
            }
        });

        signupBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(74, 137, 220));
        signupBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupBtn.setText("SIGNUP");

        javax.swing.GroupLayout signupBackPanelLayout = new javax.swing.GroupLayout(signupBackPanel);
        signupBackPanel.setLayout(signupBackPanelLayout);
        signupBackPanelLayout.setHorizontalGroup(
            signupBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signupBackPanelLayout.setVerticalGroup(
            signupBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        uMail.setText("Enter Email Address");
        uMail.setBorder(null);
        uMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                uMailFocusLost(evt);
            }
        });

        uPass.setText("Enter Password");
        uPass.setBorder(null);
        uPass.setEchoChar('\u0000');
        uPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                uPassFocusLost(evt);
            }
        });

        uName.setText("Enter Full Name");
        uName.setBorder(null);
        uName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                uNameFocusLost(evt);
            }
        });
        uName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uNameKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 137, 220));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("×");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 55)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 137, 220));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("-");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 137, 220));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Confirm Password");

        uPass2.setText("Confirm Password");
        uPass2.setBorder(null);
        uPass2.setEchoChar('\u0000');
        uPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uPass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                uPass2FocusLost(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout MainPanel2Layout = new javax.swing.GroupLayout(MainPanel2);
        MainPanel2.setLayout(MainPanel2Layout);
        MainPanel2Layout.setHorizontalGroup(
            MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(signupBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uPass2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel2Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        MainPanel2Layout.setVerticalGroup(
            MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupBackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
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

    private void loginBackPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBackPanelMouseExited
        loginBackPanel.setBackground(Color.BLACK);
        loginBtn.setForeground(new Color(74, 137, 220));
    }//GEN-LAST:event_loginBackPanelMouseExited

    private void loginBackPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBackPanelMouseEntered
        loginBackPanel.setBackground(new Color(74, 137, 220));
        loginBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_loginBackPanelMouseEntered

    private void loginBackPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBackPanelMouseClicked
        LandingPage lpg = new LandingPage();
        this.dispose();
        lpg.setVisible(true);
    }//GEN-LAST:event_loginBackPanelMouseClicked

    
    
    
    
    
    
    
    
    
    
    private void signupBackPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBackPanelMouseClicked
       enteredName = uName.getText();
       enteredMail = uMail.getText();
       enteredPassword = String.valueOf(uPass.getPassword());
       confirmedPassword = String.valueOf(uPass2.getPassword());
       
       //below is the regular expression for the email field validation
       String regExp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

       
       //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regExp);  
        
        //match the pattern with the inputed Email
        Matcher matcher = pattern.matcher(enteredMail);

       //checking not null condition
       if(enteredName.equals("Enter Full Name")||enteredMail.equals("Enter Email Address")||enteredPassword.equals("Enter Password")||confirmedPassword.equals("Confirm Password")){
           JOptionPane.showMessageDialog(this, "All the fields are MANDATORY", "NOT Null check condition", JOptionPane.WARNING_MESSAGE);
       }
       //checking email validation
       else if(matcher.matches()==false){
           JOptionPane.showMessageDialog(this, "Invalid Email Format", "Email Field Validation Error", JOptionPane.ERROR_MESSAGE);
       }
       //checking the password length : minimum of 6 characters and maximum of 10 characters
       else if(enteredPassword.length()<6 || enteredPassword.length()>10){
           JOptionPane.showMessageDialog(this, "Password must be minimum of 6 charaters and maximum of 10 characters");
       }
       //checking whether the password and confirm password are same or not
       else if(!(enteredPassword.equals(confirmedPassword))){
           JOptionPane.showMessageDialog(this, "Password did not match", "Mismatched password message", JOptionPane.ERROR_MESSAGE);
       }
       else {
            try{
                pst = con.prepareStatement("SELECT * FROM signupprocess WHERE email = ?");
                pst.setString(1, enteredMail);
                rs = pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "Entered Email already exists. Please Enter another email", "Already Existing mail error", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    pst = con.prepareStatement("INSERT INTO signupprocess VALUES(?, ?, ?, ?)");
                    pst.setString(1, enteredName);
                    pst.setString(2, enteredMail);
                    pst.setString(3, enteredPassword);
                    pst.setString(4, confirmedPassword);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data has been Successfully INSERTED");
                    
                    uName.setText("Enter Full Name");
                    uMail.setText("Enter Email Address");
                    uPass.setText("Enter Password");
                    uPass.setEchoChar('\u0000');
                    uPass2.setText("Confirm Password");
                    uPass2.setEchoChar('\u0000');
                    addPlaceholderStyle(uName);
                    addPlaceholderStyle(uMail);
                    addPlaceholderStyle(uPass);
                    addPlaceholderStyle(uPass2);
                    uName.requestFocus();
                    
                }   
            }catch(SQLException e){
                e.getMessage();
            }
       }
    }//GEN-LAST:event_signupBackPanelMouseClicked

    
    
    
    
    
    
    
    
    
    
    
    
    private void signupBackPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBackPanelMouseEntered
        signupBackPanel.setBackground(new Color(74, 137, 220));
        signupBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_signupBackPanelMouseEntered

    private void signupBackPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBackPanelMouseExited
        signupBackPanel.setBackground(Color.WHITE);
        signupBtn.setForeground(new Color(74, 137, 220));
    }//GEN-LAST:event_signupBackPanelMouseExited

    private void uMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uMailFocusGained
        if(uMail.getText().equals("Enter Email Address")){
            uMail.setText(null);
            uMail.requestFocus();
            removePlaceholderStyle(uMail);
        }
    }//GEN-LAST:event_uMailFocusGained

    private void uMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uMailFocusLost
        if(uMail.getText().length()==0){
            addPlaceholderStyle(uMail);
            uMail.setText("Enter Email Address");
        }
    }//GEN-LAST:event_uMailFocusLost

    private void uPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uPassFocusGained
        String password = String.valueOf(uPass.getPassword());
        if(password.equals("Enter Password")){
            uPass.setText(null);
            uPass.requestFocus();
            uPass.setEchoChar('*');
            removePlaceholderStyle(uPass);
        }
    }//GEN-LAST:event_uPassFocusGained

    private void uPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uPassFocusLost
        String password = String.valueOf(uPass.getPassword());
        if(password.length()==0){
            addPlaceholderStyle(uPass);
            uPass.setEchoChar('\u0000');
            uPass.setText("Enter Password");
        }
    }//GEN-LAST:event_uPassFocusLost

    private void uNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uNameFocusGained
        if(uName.getText().equals("Enter Full Name")){
            uName.setText(null);
            uName.requestFocus();
            removePlaceholderStyle(uName);
        }
    }//GEN-LAST:event_uNameFocusGained

    private void uNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uNameFocusLost
        if(uName.getText().length()==0){
            addPlaceholderStyle(uName);
            uName.setText("Enter Full Name");

        }
    }//GEN-LAST:event_uNameFocusLost

    private void uNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uNameKeyPressed
            char c = evt.getKeyChar();
            if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
                uName.setEditable(true);
            }
            else{
                uName.setEditable(false);
            }
    }//GEN-LAST:event_uNameKeyPressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int res = JOptionPane.showConfirmDialog(this, "Do you want to EXIT the Application ? ", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            


        if(res==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setExtendedState(SignUpPage.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void uPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uPass2FocusGained
        String password = String.valueOf(uPass2.getPassword());
        if(password.equals("Confirm Password")){
            uPass2.setText(null);
            uPass2.requestFocus();
            uPass2.setEchoChar('*');
            removePlaceholderStyle(uPass2);
        }
    }//GEN-LAST:event_uPass2FocusGained

    private void uPass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uPass2FocusLost
        String password = String.valueOf(uPass2.getPassword());
        if(password.length()==0){
            addPlaceholderStyle(uPass2);
            uPass2.setEchoChar('\u0000');
            uPass2.setText("Confirm Password");
        }
    }//GEN-LAST:event_uPass2FocusLost

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xCor = evt.getX();
        yCor = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       this.setLocation(this.getX() + evt.getX() - xCor, this.getY() + evt.getY() - yCor);
    }//GEN-LAST:event_formMouseDragged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(NewSignUpForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSignUpForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSignUpForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSignUpForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSignUpForm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel loginBackPanel;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPanel signupBackPanel;
    private javax.swing.JLabel signupBtn;
    private javax.swing.JTextField uMail;
    private javax.swing.JTextField uName;
    private javax.swing.JPasswordField uPass;
    private javax.swing.JPasswordField uPass2;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
