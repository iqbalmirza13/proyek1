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
public class menu_minuman extends javax.swing.JFrame {
    
    public Connection con;
    public Statement st;
    public ResultSet rs;

    /**
     * Creates new form menu_minuman
     */
    public menu_minuman() {
        initComponents();
    }
    public void tampilminuman1(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='air mineral'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namaminuman1.setText(nama_menu);
                    hargaminuman1.setText(hrg);
                    gambarminuman1.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilminuman2(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='susu putih'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namaminuman2.setText(nama_menu);
                    hargaminuman2.setText(hrg);
                    gambarminuman2.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilminuman3(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='es jeruk'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namaminuman3.setText(nama_menu);
                    hargaminuman3.setText(hrg);
                    gambarminuman3.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilminuman4(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='es teh'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namaminuman4.setText(nama_menu);
                    hargaminuman4.setText(hrg);
                    gambarminuman4.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilminuman5(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='lemon tea'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namaminuman5.setText(nama_menu);
                    hargaminuman5.setText(hrg);
                    gambarminuman5.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilminuman6(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='soda gembira'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namaminuman6.setText(nama_menu);
                    hargaminuman6.setText(hrg);
                    gambarminuman6.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilminuman7(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='es milo'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namaminuman7.setText(nama_menu);
                    hargaminuman7.setText(hrg);
                    gambarminuman7.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilminuman8(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='soda nelongso'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namaminuman8.setText(nama_menu);
                    hargaminuman8.setText(hrg);
                    gambarminuman8.setIcon(tampilkan);
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

        xMakanan = new javax.swing.JButton();
        hargaminuman6 = new javax.swing.JLabel();
        hargaminuman7 = new javax.swing.JLabel();
        gambarminuman3 = new javax.swing.JLabel();
        gambarminuman1 = new javax.swing.JLabel();
        gambarminuman2 = new javax.swing.JLabel();
        hargaminuman8 = new javax.swing.JLabel();
        tambahminuman5 = new javax.swing.JButton();
        tambahminuman6 = new javax.swing.JButton();
        tambahminuman7 = new javax.swing.JButton();
        gambarminuman4 = new javax.swing.JLabel();
        tambahminuman8 = new javax.swing.JButton();
        namaminuman1 = new javax.swing.JLabel();
        namaminuman2 = new javax.swing.JLabel();
        namaminuman3 = new javax.swing.JLabel();
        namaminuman4 = new javax.swing.JLabel();
        hargaminuman1 = new javax.swing.JLabel();
        hargaminuman2 = new javax.swing.JLabel();
        hargaminuman3 = new javax.swing.JLabel();
        gambarminuman7 = new javax.swing.JLabel();
        hargaminuman4 = new javax.swing.JLabel();
        tambahminuman1 = new javax.swing.JButton();
        gambarminuman5 = new javax.swing.JLabel();
        gambarminuman6 = new javax.swing.JLabel();
        tambahminuman2 = new javax.swing.JButton();
        gambarminuman8 = new javax.swing.JLabel();
        tambahminuman3 = new javax.swing.JButton();
        namaminuman5 = new javax.swing.JLabel();
        tambahminuman4 = new javax.swing.JButton();
        namaminuman6 = new javax.swing.JLabel();
        xPesanan = new javax.swing.JButton();
        namaminuman7 = new javax.swing.JLabel();
        xTambahan = new javax.swing.JButton();
        namaminuman8 = new javax.swing.JLabel();
        xMinuman = new javax.swing.JButton();
        hargaminuman5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xMakanan.setText("Makanan");
        xMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMakananActionPerformed(evt);
            }
        });

        hargaminuman6.setText("     harga minuman");

        hargaminuman7.setText("     harga minuman");

        hargaminuman8.setText("     harga minuman");

        tambahminuman5.setText("tambah");
        tambahminuman5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahminuman5ActionPerformed(evt);
            }
        });

        tambahminuman6.setText("tambah");
        tambahminuman6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahminuman6ActionPerformed(evt);
            }
        });

        tambahminuman7.setText("tambah");
        tambahminuman7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahminuman7ActionPerformed(evt);
            }
        });

        tambahminuman8.setText("tambah");

        namaminuman1.setText("     nama minuman");

        namaminuman2.setText("     nama minuman");

        namaminuman3.setText("     nama minuman");

        namaminuman4.setText("     nama minuman");

        hargaminuman1.setText("     harga minuman");

        hargaminuman2.setText("     harga minuman");

        hargaminuman3.setText("     harga minuman");

        hargaminuman4.setText("     harga minuman");

        tambahminuman1.setText("tambah");
        tambahminuman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahminuman1ActionPerformed(evt);
            }
        });

        tambahminuman2.setText("tambah");
        tambahminuman2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahminuman2ActionPerformed(evt);
            }
        });

        tambahminuman3.setText("tambah");

        namaminuman5.setText("     nama minuman");

        tambahminuman4.setText("tambah");

        namaminuman6.setText("     nama minuman");

        xPesanan.setText("Pesanan");
        xPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xPesananActionPerformed(evt);
            }
        });

        namaminuman7.setText("     nama minuman");

        xTambahan.setText("Tambahan");
        xTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTambahanActionPerformed(evt);
            }
        });

        namaminuman8.setText("     nama minuman");

        xMinuman.setText("Minuman");
        xMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinumanActionPerformed(evt);
            }
        });

        hargaminuman5.setText("     harga minuman");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
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
                            .addComponent(gambarminuman1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaminuman1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargaminuman1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(tambahminuman1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambarminuman2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaminuman2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargaminuman2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(tambahminuman2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarminuman3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xTambahan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaminuman3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargaminuman3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(tambahminuman3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambarminuman4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaminuman4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(hargaminuman4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(tambahminuman4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarminuman5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaminuman5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargaminuman5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tambahminuman5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarminuman6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaminuman6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargaminuman6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tambahminuman6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarminuman7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaminuman7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargaminuman7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tambahminuman7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarminuman8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaminuman8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargaminuman8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tambahminuman8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(gambarminuman1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gambarminuman3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(gambarminuman4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gambarminuman2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaminuman1)
                    .addComponent(namaminuman2)
                    .addComponent(namaminuman3)
                    .addComponent(namaminuman4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaminuman1)
                    .addComponent(hargaminuman2)
                    .addComponent(hargaminuman3)
                    .addComponent(hargaminuman4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahminuman1)
                    .addComponent(tambahminuman2)
                    .addComponent(tambahminuman3)
                    .addComponent(tambahminuman4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(gambarminuman5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gambarminuman7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gambarminuman6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gambarminuman8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaminuman5)
                    .addComponent(namaminuman6)
                    .addComponent(namaminuman7)
                    .addComponent(namaminuman8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaminuman5)
                    .addComponent(hargaminuman6)
                    .addComponent(hargaminuman7)
                    .addComponent(hargaminuman8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahminuman5)
                    .addComponent(tambahminuman6)
                    .addComponent(tambahminuman7)
                    .addComponent(tambahminuman8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tambahminuman5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahminuman5ActionPerformed
        // TODO add your handling code here:
        menu_makanan makanan = new menu_makanan();
        makanan.setVisible(true);
        dispose();
    }//GEN-LAST:event_tambahminuman5ActionPerformed

    private void tambahminuman6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahminuman6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahminuman6ActionPerformed

    private void tambahminuman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahminuman1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahminuman1ActionPerformed

    private void tambahminuman2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahminuman2ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_tambahminuman2ActionPerformed

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

    private void tambahminuman7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahminuman7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahminuman7ActionPerformed

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
            java.util.logging.Logger.getLogger(menu_minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_minuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gambarminuman1;
    private javax.swing.JLabel gambarminuman2;
    private javax.swing.JLabel gambarminuman3;
    private javax.swing.JLabel gambarminuman4;
    private javax.swing.JLabel gambarminuman5;
    private javax.swing.JLabel gambarminuman6;
    private javax.swing.JLabel gambarminuman7;
    private javax.swing.JLabel gambarminuman8;
    private javax.swing.JLabel hargaminuman1;
    private javax.swing.JLabel hargaminuman2;
    private javax.swing.JLabel hargaminuman3;
    private javax.swing.JLabel hargaminuman4;
    private javax.swing.JLabel hargaminuman5;
    private javax.swing.JLabel hargaminuman6;
    private javax.swing.JLabel hargaminuman7;
    private javax.swing.JLabel hargaminuman8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namaminuman1;
    private javax.swing.JLabel namaminuman2;
    private javax.swing.JLabel namaminuman3;
    private javax.swing.JLabel namaminuman4;
    private javax.swing.JLabel namaminuman5;
    private javax.swing.JLabel namaminuman6;
    private javax.swing.JLabel namaminuman7;
    private javax.swing.JLabel namaminuman8;
    private javax.swing.JButton tambahminuman1;
    private javax.swing.JButton tambahminuman2;
    private javax.swing.JButton tambahminuman3;
    private javax.swing.JButton tambahminuman4;
    private javax.swing.JButton tambahminuman5;
    private javax.swing.JButton tambahminuman6;
    private javax.swing.JButton tambahminuman7;
    private javax.swing.JButton tambahminuman8;
    private javax.swing.JButton xMakanan;
    private javax.swing.JButton xMinuman;
    private javax.swing.JButton xPesanan;
    private javax.swing.JButton xTambahan;
    // End of variables declaration//GEN-END:variables
}
