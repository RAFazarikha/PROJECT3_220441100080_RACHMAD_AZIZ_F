/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PROJECT31;

/**
 *
 * @author HP
 */
public class project31 extends javax.swing.JFrame {

    /**
     * Creates new form project32
     */
    public project31() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbuku = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        fjudul = new javax.swing.JTextField();
        fpenulis = new javax.swing.JTextField();
        fpenerbit = new javax.swing.JTextField();
        ftahun = new javax.swing.JTextField();
        fhal = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 55, 109));
        jPanel1.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(165, 215, 232));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERPUSTAKAAN");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(165, 215, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbuku.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        cbuku.setForeground(new java.awt.Color(11, 36, 71));
        cbuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Judul Buku ---", "Bintang", "Rindu", "Hujan", "Sepotong Hati Yang Baru", "Rembulan Tenggelam Di Wajahmu", "Hafalan Sholat Delisa", "Pulang" }));
        cbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbukuActionPerformed(evt);
            }
        });
        jPanel2.add(cbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 36, 71));
        jLabel2.setLabelFor(cbuku);
        jLabel2.setText("Daftar Buku");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(165, 215, 232));
        jPanel3.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel4.setBackground(new java.awt.Color(165, 215, 232));
        jPanel4.setLayout(new java.awt.GridLayout(5, 0, 5, 5));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(11, 36, 71));
        jLabel8.setLabelFor(fjudul);
        jLabel8.setText("Judul Buku :");
        jPanel4.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(11, 36, 71));
        jLabel9.setLabelFor(fpenulis);
        jLabel9.setText("Penulis :");
        jPanel4.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(11, 36, 71));
        jLabel10.setLabelFor(fpenerbit);
        jLabel10.setText("Penerbit :");
        jPanel4.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(11, 36, 71));
        jLabel11.setLabelFor(ftahun);
        jLabel11.setText("Tahun Terbit :");
        jPanel4.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(11, 36, 71));
        jLabel12.setLabelFor(fhal);
        jLabel12.setText("Jumlah Halaman :");
        jPanel4.add(jLabel12);

        jPanel3.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(165, 215, 232));
        jPanel5.setLayout(new java.awt.GridLayout(5, 0, 5, 5));

        fjudul.setEditable(false);
        fjudul.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fjudul.setForeground(new java.awt.Color(11, 36, 71));
        jPanel5.add(fjudul);

        fpenulis.setEditable(false);
        fpenulis.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fpenulis.setForeground(new java.awt.Color(11, 36, 71));
        jPanel5.add(fpenulis);

        fpenerbit.setEditable(false);
        fpenerbit.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fpenerbit.setForeground(new java.awt.Color(11, 36, 71));
        jPanel5.add(fpenerbit);

        ftahun.setEditable(false);
        ftahun.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ftahun.setForeground(new java.awt.Color(11, 36, 71));
        ftahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftahunActionPerformed(evt);
            }
        });
        jPanel5.add(ftahun);

        fhal.setEditable(false);
        fhal.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fhal.setForeground(new java.awt.Color(11, 36, 71));
        jPanel5.add(fhal);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cetak(String judul, String penulis, String penerbit, int tahun, String hal){
            fjudul.setText(judul);
            fpenulis.setText(penulis);
            fpenerbit.setText(penerbit);
            ftahun.setText(Integer.toString(tahun));
            fhal.setText(hal);
    }
    
    
    private void cbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbukuActionPerformed
        // TODO add your handling code here:
        switch (cbuku.getSelectedIndex()) {
            case 0 -> 
                cetak("", "", "", 0, "");
            case 1 -> 
                cetak("Bintang", "Tere Liye", "Gramedia Pustaka Utama", 2006, "396 halaman");
            case 2 -> 
                cetak("Rindu", "Tere Liye", "Republika Penerbit", 2007, "464 halaman");
            case 3 -> 
                cetak("Hujan", "Tere Liye", "Gramedia Pustaka Utama", 2011, "448 halaman");
            case 4 -> 
                cetak("Sepotong Hati yang Baru", "Tere Liye", "Gramedia Pustaka Utama", 2013, "544 halaman");
            case 5 -> 
                cetak("Rembulan Tenggelam di Wajahmu", "Tere Liye", "Republika Penerbit", 2014, "576 halaman");
            case 6 -> 
                cetak("Hafalan Shalat Delisa", "Tere Liye", "Republika Penerbit", 2005, "368 halaman");
            case 7 -> 
                cetak("Pulang", "Tere Liye", "Gramedia Pustaka Utama", 2015, "624 halaman");
            default -> {
            }
        }
    }//GEN-LAST:event_cbukuActionPerformed

    private void ftahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftahunActionPerformed

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
            java.util.logging.Logger.getLogger(project31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project31().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbuku;
    private javax.swing.JTextField fhal;
    private javax.swing.JTextField fjudul;
    private javax.swing.JTextField fpenerbit;
    private javax.swing.JTextField fpenulis;
    private javax.swing.JTextField ftahun;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}