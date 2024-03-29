
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author MONSTER
 */
public class ogrenciEkrani extends javax.swing.JDialog {
    
    DefaultTableModel model;
    ogrenciIslemleri islemler=new ogrenciIslemleri();
    
    

    /**
     * Creates new form ogrenciEkrani
     */
    public ogrenciEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) ogrenci_tablosu.getModel();
        ogrenciGoruntule();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ogrenci_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        email_alani = new javax.swing.JTextField();
        ogrencino_alani = new javax.swing.JTextField();
        bolum_alani = new javax.swing.JTextField();
        ogrenci_ekle = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        ogrenci_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ad", "Soyad", "E-Mail", "Öğrenci No", "Kulüp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ogrenci_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrenci_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ogrenci_tablosu);
        if (ogrenci_tablosu.getColumnModel().getColumnCount() > 0) {
            ogrenci_tablosu.getColumnModel().getColumn(0).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(1).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(2).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(3).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(4).setResizable(false);
            ogrenci_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        arama_cubugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_cubuguActionPerformed(evt);
            }
        });
        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad");

        jLabel2.setText("Soyad");

        jLabel3.setText("E-Mail");

        jLabel4.setText("Öğrenci No");

        jLabel5.setText("Bölüm");

        ad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_alaniActionPerformed(evt);
            }
        });

        email_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_alaniActionPerformed(evt);
            }
        });

        ogrenci_ekle.setText("Yeni Öğrenci Ekle");
        ogrenci_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenci_ekleActionPerformed(evt);
            }
        });

        mesaj_yazisi.setForeground(new java.awt.Color(204, 0, 0));

        guncelle.setText("Öğrenci Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setText("Öğrenci Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(arama_cubugu)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ad_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(soyad_alani)
                                    .addComponent(email_alani)
                                    .addComponent(ogrencino_alani)
                                    .addComponent(bolum_alani))))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ogrenci_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ogrenci_ekle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ogrencino_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bolum_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_cubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_cubuguActionPerformed
        
    }//GEN-LAST:event_arama_cubuguActionPerformed

    
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        ogrenci_tablosu.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
       
    }
    
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara=arama_cubugu.getText();
        
        dinamikAra(ara);
        
        
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void ad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad_alaniActionPerformed

    private void ogrenci_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenci_ekleActionPerformed
       mesaj_yazisi.setText("");
       String ad=ad_alani.getText();
       String soyad=soyad_alani.getText();
       String email=email_alani.getText();
       String ogrencino=ogrencino_alani.getText();
       String bolum=bolum_alani.getText();
       
       islemler.ogrenciEkle(ad,soyad,email,ogrencino,bolum);
       ogrenciGoruntule();
       
       mesaj_yazisi.setText("Yeni öğrenci başarıyla eklendi...");
       
    }//GEN-LAST:event_ogrenci_ekleActionPerformed

    private void ogrenci_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrenci_tablosuMouseClicked
        int selectedrow = ogrenci_tablosu.getSelectedRow();
        
        ad_alani.setText(model.getValueAt(selectedrow,1).toString());
        soyad_alani.setText(model.getValueAt(selectedrow,2).toString());
        email_alani.setText(model.getValueAt(selectedrow,3).toString());
        ogrencino_alani.setText(model.getValueAt(selectedrow,4).toString());
        bolum_alani.setText(model.getValueAt(selectedrow,5).toString());
        
        
    }//GEN-LAST:event_ogrenci_tablosuMouseClicked

    private void email_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_alaniActionPerformed

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        
        String ad=ad_alani.getText();
        String soyad=soyad_alani.getText();
        String email=email_alani.getText();
        String ogrencino=ogrencino_alani.getText();
        String bolum=bolum_alani.getText();
        
        
        int selectedrow=ogrenci_tablosu.getSelectedRow();
        
        if(selectedrow==-1){
            if(model.getRowCount()==0)
            {
                mesaj_yazisi.setText("Öğrenci tablosu şu anda boş");
            }
            else
            {
                mesaj_yazisi.setText("Lütfen güncellenecek bir çalışan seçin");
            }
            
        }
        else
        {
         
            int id=(int)model.getValueAt(selectedrow,0);
            islemler.ogrenciGuncelle(id,ad,soyad,email,ogrencino,bolum);
            ogrenciGoruntule();
            mesaj_yazisi.setText("Öğrenci başarıyla güncellendi");
            
            
        }
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
       mesaj_yazisi.setText("");
       int selectedrow=ogrenci_tablosu.getSelectedRow();
        
       if(selectedrow==-1) //tablo ya boştur ya da herhangi bir alan seçilmemiştir
       {
           if(model.getRowCount()==0){
               mesaj_yazisi.setText("Öğrenci tablosu şu anda boş...");
               
           }
           else{
           mesaj_yazisi.setText("Lütfen bir öğrenci seçin...");
           }
       }
       else{ //tablo dolu ve öğrenci seçilmişse
           
           int id=(int)model.getValueAt(selectedrow,0);
           islemler.ogrenciSil(id);
           ogrenciGoruntule();
           mesaj_yazisi.setText("Öğrenci başarıyla silindi...");
           
           
       }
    }//GEN-LAST:event_silActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    
    
    public void ogrenciGoruntule(){
    
        model.setRowCount(0); //ogrenciler bosalmıs olucak ogrenci goruntule metodunu cagırdıgımızda tekrardan goruntulencek
        ArrayList<Ogrenci> ogrenciler=new ArrayList<Ogrenci>();
        
        
        ogrenciler=islemler.ogrencileriGetir();
        
        if(ogrenciler!=null)
        {
            for(Ogrenci ogrenci:ogrenciler)
            {
                Object[] eklenecek={ogrenci.getId(),ogrenci.getAd(),ogrenci.getSoyad(),ogrenci.getEmail(),ogrenci.getStudent_no(),ogrenci.getDepartment()};
                model.addRow(eklenecek);
                
            }
            
        }
        
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(ogrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ogrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ogrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ogrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ogrenciEkrani dialog = new ogrenciEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JTextField bolum_alani;
    private javax.swing.JTextField email_alani;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton ogrenci_ekle;
    private javax.swing.JTable ogrenci_tablosu;
    private javax.swing.JTextField ogrencino_alani;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyad_alani;
    // End of variables declaration//GEN-END:variables
}
