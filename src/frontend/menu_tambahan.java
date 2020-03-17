/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author IQBAL
 */
public class menu_tambahan extends javax.swing.JFrame {
    public Connection con;
    public Statement st;
    public ResultSet rs;

    /**
     * Creates new form menu_tambahan
     */
    public menu_tambahan() {
        initComponents();
    }
    
    public void tampiltambahan1(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='kulit crispy'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namatambahan1.setText(nama_menu);
                    hargatambahan1.setText(hrg);
                    gambartambahan1.setIcon(tampilkan);
                    
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    
    public void tampiltambahan2(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='cah jamur'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namatambahan2.setText(nama_menu);
                    hargatambahan2.setText(hrg);
                    gambartambahan2.setIcon(tampilkan);
                    
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampiltambahan3(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='cah kangkung'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namatambahan3.setText(nama_menu);
                    hargatambahan3.setText(hrg);
                    gambartambahan3.setIcon(tampilkan);
                    
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampiltambahan4(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='nasi putih'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namatambahan4.setText(nama_menu);
                    hargatambahan4.setText(hrg);
                    gambartambahan4.setIcon(tampilkan);
                    
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampiltambahan5(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='tahu goreng'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namatambahan5.setText(nama_menu);
                    hargatambahan5.setText(hrg);
                    gambartambahan5.setIcon(tampilkan);
                    
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampiltambahan6(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='brokoli crispy'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namatambahan6.setText(nama_menu);
                    hargatambahan6.setText(hrg);
                    gambartambahan6.setIcon(tampilkan);
                    
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampiltambahan7(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='krupuk'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namatambahan7.setText(nama_menu);
                    hargatambahan7.setText(hrg);
                    gambartambahan7.setIcon(tampilkan);
                    
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampiltambahan8(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='terong penyet'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namatambahan8.setText(nama_menu);
                    hargatambahan8.setText(hrg);
                    gambartambahan8.setIcon(tampilkan);
                    
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
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

        namatambahan8 = new javax.swing.JLabel();
        xMinuman = new javax.swing.JButton();
        namatambahan2 = new javax.swing.JLabel();
        hargatambahan5 = new javax.swing.JLabel();
        namatambahan3 = new javax.swing.JLabel();
        namatambahan4 = new javax.swing.JLabel();
        hargatambahan1 = new javax.swing.JLabel();
        hargatambahan2 = new javax.swing.JLabel();
        hargatambahan3 = new javax.swing.JLabel();
        gambartambahan7 = new javax.swing.JLabel();
        hargatambahan4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        gambartambahan5 = new javax.swing.JLabel();
        xMakanan = new javax.swing.JButton();
        hargatambahan6 = new javax.swing.JLabel();
        hargatambahan7 = new javax.swing.JLabel();
        gambartambahan6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        gambartambahan3 = new javax.swing.JLabel();
        gambartambahan8 = new javax.swing.JLabel();
        gambartambahan1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        gambartambahan2 = new javax.swing.JLabel();
        namatambahan5 = new javax.swing.JLabel();
        hargatambahan8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        namatambahan6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        xPesanan = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        namatambahan7 = new javax.swing.JLabel();
        gambartambahan4 = new javax.swing.JLabel();
        xTambahan = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        namatambahan1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namatambahan8.setText("     nama tambahan");

        xMinuman.setText("Minuman");
        xMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinumanActionPerformed(evt);
            }
        });

        namatambahan2.setText("     nama tambahan");

        hargatambahan5.setText("     harga tambahan");

        namatambahan3.setText("     nama tambahan");

        namatambahan4.setText("     nama tambahan");

        hargatambahan1.setText("     harga tambahan");

        hargatambahan2.setText("     harga tambahan");

        hargatambahan3.setText("     harga tambahan");

        hargatambahan4.setText("     harga tambahan");

        jButton1.setText("tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        xMakanan.setText("Makanan");
        xMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMakananActionPerformed(evt);
            }
        });

        hargatambahan6.setText("     harga tambahan");

        hargatambahan7.setText("     harga tambahan");

        jButton2.setText("tambah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        gambartambahan3.setText("            ");

        jButton3.setText("tambah");

        namatambahan5.setText("     nama tambahan");

        hargatambahan8.setText("     harga tambahan");

        jButton4.setText("tambah");

        jButton5.setText("tambah");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        namatambahan6.setText("     nama tambahan");

        jButton6.setText("tambah");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        xPesanan.setText("Pesanan");
        xPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xPesananActionPerformed(evt);
            }
        });

        jButton7.setText("tambah");

        namatambahan7.setText("     nama tambahan");

        xTambahan.setText("Tambahan");
        xTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTambahanActionPerformed(evt);
            }
        });

        jButton8.setText("tambah");

        namatambahan1.setText("     nama tambahan");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambartambahan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namatambahan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargatambahan1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambartambahan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namatambahan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargatambahan2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambartambahan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xTambahan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namatambahan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargatambahan3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambartambahan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namatambahan4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(hargatambahan4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambartambahan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namatambahan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargatambahan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambartambahan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namatambahan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargatambahan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambartambahan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namatambahan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargatambahan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambartambahan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namatambahan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargatambahan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(gambartambahan1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gambartambahan3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gambartambahan2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gambartambahan4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namatambahan1)
                    .addComponent(namatambahan2)
                    .addComponent(namatambahan3)
                    .addComponent(namatambahan4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargatambahan1)
                    .addComponent(hargatambahan2)
                    .addComponent(hargatambahan3)
                    .addComponent(hargatambahan4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(gambartambahan5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gambartambahan7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gambartambahan6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gambartambahan8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namatambahan5)
                    .addComponent(namatambahan6)
                    .addComponent(namatambahan7)
                    .addComponent(namatambahan8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargatambahan5)
                    .addComponent(hargatambahan6)
                    .addComponent(hargatambahan7)
                    .addComponent(hargatambahan8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMinumanActionPerformed
        // TODO add your handling code here:
        menu_minuman minuman = new menu_minuman();
        minuman.tampilminuman1();
        minuman.tampilminuman2();
        minuman.tampilminuman3();
        minuman.tampilminuman4();
        minuman.tampilminuman5();
        minuman.tampilminuman6();
        minuman.tampilminuman7();
        minuman.tampilminuman8();
        minuman.setVisible(true);
        dispose();
    }//GEN-LAST:event_xMinumanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void xMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMakananActionPerformed
        // TODO add your handling code here:
        menu_makanan makanan = new menu_makanan();
        makanan.tampilmakanan1();
        makanan.tampilmakanan2();
        makanan.tampilmakanan3();
        makanan.tampilmakanan4();
        makanan.tampilmakanan5();
        makanan.tampilmakanan6();
        makanan.tampilmakanan7();
        makanan.tampilmakanan8();
        makanan.setVisible(true);
        dispose();
    }//GEN-LAST:event_xMakananActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void xPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xPesananActionPerformed

    private void xTambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xTambahanActionPerformed
        // TODO add your handling code here:
        menu_tambahan tambahan = new menu_tambahan();
        tambahan.tampiltambahan1();
        tambahan.tampiltambahan2();
        tambahan.tampiltambahan3();
        tambahan.tampiltambahan4();
        tambahan.tampiltambahan5();
        tambahan.tampiltambahan6();
        tambahan.tampiltambahan7();
        tambahan.tampiltambahan8();
        tambahan.setVisible(true);
        dispose();
    }//GEN-LAST:event_xTambahanActionPerformed

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
            java.util.logging.Logger.getLogger(menu_tambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_tambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_tambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_tambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_tambahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gambartambahan1;
    private javax.swing.JLabel gambartambahan2;
    private javax.swing.JLabel gambartambahan3;
    private javax.swing.JLabel gambartambahan4;
    private javax.swing.JLabel gambartambahan5;
    private javax.swing.JLabel gambartambahan6;
    private javax.swing.JLabel gambartambahan7;
    private javax.swing.JLabel gambartambahan8;
    private javax.swing.JLabel hargatambahan1;
    private javax.swing.JLabel hargatambahan2;
    private javax.swing.JLabel hargatambahan3;
    private javax.swing.JLabel hargatambahan4;
    private javax.swing.JLabel hargatambahan5;
    private javax.swing.JLabel hargatambahan6;
    private javax.swing.JLabel hargatambahan7;
    private javax.swing.JLabel hargatambahan8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namatambahan1;
    private javax.swing.JLabel namatambahan2;
    private javax.swing.JLabel namatambahan3;
    private javax.swing.JLabel namatambahan4;
    private javax.swing.JLabel namatambahan5;
    private javax.swing.JLabel namatambahan6;
    private javax.swing.JLabel namatambahan7;
    private javax.swing.JLabel namatambahan8;
    private javax.swing.JButton xMakanan;
    private javax.swing.JButton xMinuman;
    private javax.swing.JButton xPesanan;
    private javax.swing.JButton xTambahan;
    // End of variables declaration//GEN-END:variables
}
