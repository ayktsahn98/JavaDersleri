
import javax.swing.JOptionPane;

public class xox extends javax.swing.JFrame {

    String[] hücre = new String[9]; //oyuncu ve bilgisayarın tıklama verileri için
    String[] skorlardata = new String[10]; //program kapatılmadığı sürece skorlar tutulsun
    int i = 0; // skorlaar tutarken dizinin değeri arttırılsın
    String ad = "";
    int oyuncu_skor = 0;
    int bilgisayar_skor = 0;

    public xox() {
        initComponents();
        panel_oyunalani.setVisible(false);
        panel_durum.setVisible(false);
        panel_skorlar.setVisible(false);
        btn_sifirla.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_oyuncubilgi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtf_oyuncuad = new javax.swing.JTextField();
        btn_basla = new javax.swing.JButton();
        panel_oyunalani = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        panel_durum = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_oyuncu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_bilgisayar = new javax.swing.JLabel();
        btn_yenidenoyna = new javax.swing.JButton();
        panel_skorlar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_skor = new javax.swing.JList<>();
        btn_sifirla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_oyuncubilgi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Oyuncu Adı:");

        btn_basla.setBackground(new java.awt.Color(0, 51, 204));
        btn_basla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_basla.setForeground(new java.awt.Color(255, 255, 255));
        btn_basla.setText("Başla");
        btn_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baslaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyuncubilgiLayout = new javax.swing.GroupLayout(panel_oyuncubilgi);
        panel_oyuncubilgi.setLayout(panel_oyuncubilgiLayout);
        panel_oyuncubilgiLayout.setHorizontalGroup(
            panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtf_oyuncuad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_basla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_oyuncubilgiLayout.setVerticalGroup(
            panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_basla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                        .addGroup(panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtf_oyuncuad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_oyunalani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(153, 0, 102))); // NOI18N

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyunalaniLayout = new javax.swing.GroupLayout(panel_oyunalani);
        panel_oyunalani.setLayout(panel_oyunalaniLayout);
        panel_oyunalaniLayout.setHorizontalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panel_oyunalaniLayout.setVerticalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_durum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Durum", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(255, 102, 51))); // NOI18N

        jLabel2.setText("Oyuncu: ");

        label_oyuncu.setText("0");

        jLabel4.setText("Bilgisayar: ");

        label_bilgisayar.setText("0");

        btn_yenidenoyna.setBackground(new java.awt.Color(153, 0, 153));
        btn_yenidenoyna.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_yenidenoyna.setForeground(new java.awt.Color(255, 255, 255));
        btn_yenidenoyna.setText("Yeniden Oyna");
        btn_yenidenoyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yenidenoynaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_durumLayout = new javax.swing.GroupLayout(panel_durum);
        panel_durum.setLayout(panel_durumLayout);
        panel_durumLayout.setHorizontalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_durumLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_oyuncu))
                    .addGroup(panel_durumLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_bilgisayar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btn_yenidenoyna, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        panel_durumLayout.setVerticalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(label_oyuncu))
                .addGap(18, 18, 18)
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(label_bilgisayar))
                .addGap(18, 18, 18)
                .addComponent(btn_yenidenoyna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_skorlar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skorlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(0, 153, 51))); // NOI18N

        jScrollPane1.setViewportView(jlist_skor);

        javax.swing.GroupLayout panel_skorlarLayout = new javax.swing.GroupLayout(panel_skorlar);
        panel_skorlar.setLayout(panel_skorlarLayout);
        panel_skorlarLayout.setHorizontalGroup(
            panel_skorlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_skorlarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_skorlarLayout.setVerticalGroup(
            panel_skorlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_skorlarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_sifirla.setBackground(new java.awt.Color(153, 0, 0));
        btn_sifirla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sifirla.setForeground(new java.awt.Color(255, 255, 255));
        btn_sifirla.setText("Oyunu Sıfırla");
        btn_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifirlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_oyunalani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_oyuncubilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_durum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_skorlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sifirla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btn_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_skorlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_oyuncubilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_oyunalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int say = 0; //kazanan yoksa kontrolü için 9 tıklama sonrasında berabere kalır 
    private void btn_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baslaActionPerformed
        ad = txtf_oyuncuad.getText();
        panel_oyunalani.setVisible(true);
        panel_oyuncubilgi.setEnabled(false);
        txtf_oyuncuad.setEnabled(false);
        btn_basla.setEnabled(false);
        panel_skorlar.setVisible(false);
        bilgisayar_skor = 0;
        oyuncu_skor = 0;
        say = 0;
        for (int i = 0; i < 9; i++) {
            hücre[i] = "";
        }
        oyun_durum = true;
    }//GEN-LAST:event_btn_baslaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn1.setEnabled(false);
        hücre[0] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn2.setEnabled(false);
        hücre[1] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn3.setEnabled(false);
        hücre[2] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn4.setEnabled(false);
        hücre[3] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn5.setEnabled(false);
        hücre[4] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn6.setEnabled(false);
        hücre[5] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn7.setEnabled(false);
        hücre[6] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn8.setEnabled(false);
        hücre[7] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn9.setEnabled(false);
        hücre[8] = "x"; //hücreye oyuncunun oynadığı bilgisini veriyoruz
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn_yenidenoynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yenidenoynaActionPerformed
        panel_oyunalani.setVisible(true);
        butonsifirlama();
        degerleri_sifirla();
    }//GEN-LAST:event_btn_yenidenoynaActionPerformed

    private void btn_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifirlaActionPerformed
        butonsifirlama();
        degerleri_sifirla();
        skorlardata[i] = ad + "-" + oyuncu_skor;
        i++;
        ad = "";
        panel_skorlar.setVisible(true);
        panel_durum.setVisible(false);
        panel_oyunalani.setVisible(false);
        panel_oyuncubilgi.setVisible(true);
        txtf_oyuncuad.setEnabled(true);
        btn_basla.setEnabled(true);
        jlist_skor.setListData(skorlardata);
        btn_sifirla.setVisible(false);
    }//GEN-LAST:event_btn_sifirlaActionPerformed

    public void butonsifirlama() {
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

    }

    /*Bütün kullanılan değişken dizi ve değerleri sıfırladık ki */
    public void degerleri_sifirla() {
        for (int j = 0; j < 9; j++) {
            hücre[j] = "";
            say = 0;
        }
        oyun_durum = true; // oyunun yeniden başlaması durumunda
    }

    boolean oyun_durum = false; // oyun 9 adımdan önce biterse kontrolü için oyuncu ve bilgisayarın kazanma durum fonksiyonu

    /*oyuncu ya da bilgisayarın kazanıp kazanmadığını kontrol eden fonksiyondur. 
   0 1 2
   3 4 5
   6 7 8 
   
   diye hücreleri düşünürsek 0 1 2 e x konulsa oyuncu, o konulursa bilgisayar kazanacaktır. 
   kontroller şunlar olur 0 1 2,3 4 5, 6 7 8, 0 3 6, 1 4 7 , 2 5 8 */
    public void kontrol() {
        xox f = new xox(); // uyarı penceresinin açılması için 
        if (say < 9) {
            if (hücre[0] == "x" & hücre[3] == "x" & hücre[6] == "x"
                    || hücre[1] == "x" & hücre[4] == "x" & hücre[7] == "x"
                    || hücre[2] == "x" & hücre[5] == "x" & hücre[8] == "x"
                    || hücre[0] == "x" & hücre[1] == "x" & hücre[2] == "x"
                    || hücre[3] == "x" & hücre[4] == "x" & hücre[5] == "x"
                    || hücre[6] == "x" & hücre[7] == "x" & hücre[8] == "x") {
                JOptionPane.showMessageDialog(f, "Oyuncu Kazandı");
                oyuncu_skor++;
                oyun_durum = false; //oyunu sonlandırması için
                label_oyuncu.setText(String.valueOf(oyuncu_skor));
            } else if (hücre[0] == "o" & hücre[3] == "o" & hücre[6] == "o"
                    || hücre[1] == "o" & hücre[4] == "o" & hücre[7] == "o"
                    || hücre[2] == "o" & hücre[5] == "o" & hücre[8] == "o"
                    || hücre[0] == "o" & hücre[1] == "o" & hücre[2] == "o"
                    || hücre[3] == "o" & hücre[4] == "o" & hücre[5] == "o"
                    || hücre[6] == "o" & hücre[7] == "o" & hücre[8] == "o") {
                JOptionPane.showMessageDialog(f, "Bilgisayar Kazandı");
                bilgisayar_skor++;
                oyun_durum = false; //oyunu sonlandırması için
                label_bilgisayar.setText(String.valueOf(bilgisayar_skor));

            } else if (say == 9) { // oyuncu ve bilgisayar oynama sayısı toplamı 9 olduğu durumda kazanan yoktur.
                JOptionPane.showMessageDialog(f, "Kazanan Yoktur.");
                oyun_durum = false;
            }
            //oyun durumu false olduğu zaman şu işlemleer yapılır
            if (oyun_durum == false) {
                panel_durum.setVisible(true);
                panel_oyunalani.setVisible(false);
                btn_sifirla.setVisible(true);
            }
        }
        // oyun her zaman için kullanıcı başlangıçlı bir oyun 
        // kullanıcı oynadıktan sonra sıra bilgisayara gelir

    }

    public void bilgisayar_oyna() {
        if (oyun_durum == true) {
            int h = -1;
            boolean durum = false;
            //Bilgisayar 0 dan 8'e kadar rastgele yer seçiyor.(Yapay zeka kullanarak daha iyi yer seçmesi yapılabilir)
            //Daha önceden oynanan bir yere o ya da x konulmaması için tutulan sayıdakihucre dizisinin 
            //o indisinde bir x ya da o var mı kontrolü yapar*/
            do {
                h = (int) (Math.random() * 9);
                if (hücre[h] == "x") {
                    durum = false;
                } else if (hücre[h] == "o") {
                    durum = false;
                } else {
                    durum = true;
                }
            } while (durum == false);
            /*Eğer ki hücrede x ya da o yoksa tutulan h sayısının olduğu indekse bilgisayar
              o harfi koyar
             */
            hücre[h] = "o"; //O harfini hücre dizisine yerleştirdi
            say++; // kazanan olmamam durumuna karşı bir adım saydırdık.   
            if (h == 0) {
                btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn1.setEnabled(false);
            } else if (h == 1) {
                btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn2.setEnabled(false);
            } else if (h == 2) {
                btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn3.setEnabled(false);
            } else if (h == 3) {
                btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn4.setEnabled(false);
            } else if (h == 4) {
                btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn5.setEnabled(false);
            } else if (h == 5) {
                btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn6.setEnabled(false);
            } else if (h == 6) {
                btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn7.setEnabled(false);
            } else if (h == 7) {
                btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn8.setEnabled(false);
            } else if (h == 8) {
                btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn9.setEnabled(false);
            }
            kontrol(); //bilgisayar oynadıktan sonra kazanan bilgisayarda olabilir.
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
            java.util.logging.Logger.getLogger(xox.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xox.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xox.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xox.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_basla;
    private javax.swing.JButton btn_sifirla;
    private javax.swing.JButton btn_yenidenoyna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlist_skor;
    private javax.swing.JLabel label_bilgisayar;
    private javax.swing.JLabel label_oyuncu;
    private javax.swing.JPanel panel_durum;
    private javax.swing.JPanel panel_oyunalani;
    private javax.swing.JPanel panel_oyuncubilgi;
    private javax.swing.JPanel panel_skorlar;
    private javax.swing.JTextField txtf_oyuncuad;
    // End of variables declaration//GEN-END:variables
}
