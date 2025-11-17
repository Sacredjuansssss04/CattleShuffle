package com.mycompany.cattleshuffle.Windows;

import javax.swing.JOptionPane;
import com.mycompany.cattleshuffle.Classes.Animal;
        
public class AddAnimalBreeder extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddAnimalBreeder.class.getName());
    private double age;
    private double weight;
    private String name;
    
    
    public AddAnimalBreeder() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        animalAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        animalWeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        animalName = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(101, 178, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Agregar nuevo animal de crianza");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jPanel2.setBackground(new java.awt.Color(204, 229, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Edad (meses):");

        animalAge.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        animalAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalAgeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Peso (kg):");

        animalWeight.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        animalWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalWeightActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Nombre:");

        animalName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        animalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalNameActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(255, 153, 153));
        saveButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        saveButton.setText("Guardar registro");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        mainButton.setBackground(new java.awt.Color(153, 255, 153));
        mainButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        mainButton.setText("Regresar al menu animal");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animalAge, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(animalWeight)
                    .addComponent(animalName))
                .addGap(71, 71, 71))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(mainButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(animalAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(animalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(animalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainButton)
                    .addComponent(saveButton))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        // TODO add your handling code here:
        AnimalType ventana = new AnimalType();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_mainButtonActionPerformed

    private void animalAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalAgeActionPerformed
        try{
            this.age = Double.parseDouble(animalAge.getText().trim());
            System.out.println(this.age);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Edad inválida. Debe ser un número");
            this.age = 0;
        }
    }//GEN-LAST:event_animalAgeActionPerformed

    private void animalWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalWeightActionPerformed
        try{
            this.weight = Double.parseDouble(animalWeight.getText().trim());
            System.out.println(this.weight);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Peso inválido. Debe ser un número");
            this.weight = 0;
        }
    }//GEN-LAST:event_animalWeightActionPerformed

    private void animalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalNameActionPerformed
        this.name = animalName.getText().trim();
        System.out.println(this.name);
    }//GEN-LAST:event_animalNameActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        /*try{
            double age = Double.parseDouble(animalAge.getText());
            double weight = Double.parseDouble(animalWeight.getText().trim());
            String name = animalName.getText().trim();
            
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío");
                return;
            }
            
        }*/ 
        //estaba tratando de hacer lo de guardar animal pero falta como coherencia con las clases
    }//GEN-LAST:event_saveButtonActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AddAnimalBreeder().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField animalAge;
    private javax.swing.JTextField animalName;
    private javax.swing.JTextField animalWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
