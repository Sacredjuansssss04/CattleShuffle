package com.mycompany.cattleshuffle.Windows;

import javax.swing.JOptionPane;
import com.mycompany.cattleshuffle.Classes.AnimalBreeder;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.mycompany.cattleshuffle.Classes.FileManager;
import java.util.List;
        
public class AddAnimalBreeder extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddAnimalBreeder.class.getName());
    private double age;
    private double weight;
    private String name;
    private String tag;
    private String species;
    public static final Path BREEDER_PATH = Paths.get("data/animals/breeders.json");
    
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
        jLabel2 = new javax.swing.JLabel();
        animalTag = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        animalSpecie = new javax.swing.JTextField();

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

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        animalTag.setBackground(new java.awt.Color(255, 255, 255));
        animalTag.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        animalTag.setForeground(new java.awt.Color(0, 0, 0));
        animalTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalTagActionPerformed(evt);
            }
        });

        jLabel6.setText("Especie:");

        animalSpecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalSpecieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(mainButton)
                .addGap(37, 37, 37)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animalAge, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(animalWeight)
                    .addComponent(animalName)
                    .addComponent(animalTag)
                    .addComponent(animalSpecie))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(animalAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(animalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(animalSpecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(animalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(animalTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainButton)
                    .addComponent(saveButton))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 430, 380));

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
        try{
            double age = Double.parseDouble(animalAge.getText());
            double weight = Double.parseDouble(animalWeight.getText().trim());
            String name = animalName.getText().trim();
            String tag = animalTag.getText().trim();
            
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío");
                return;
            }
            AnimalBreeder animal = new AnimalBreeder(0, "none", "none", "none", (int)0, "none", "none", "none", 0);
            animal.setName(name);
            animal.setWeight(weight);
            animal.setTag(tag);
            animal.setAge((int)age);
            animal.setSpecies(species);
            
            List<AnimalBreeder> breeders = FileManager.loadBreeders(BREEDER_PATH);
            breeders.add(animal);
            FileManager.saveBreeders(breeders, BREEDER_PATH);
            
            JOptionPane.showMessageDialog(this, "Animal de crianza registrado correctamente");
            
            animalAge.setText("");
            animalWeight.setText("");
            animalName.setText("");
            animalTag.setText("");
            animalSpecie.setText("");
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error, debes usar números válidos para edad y peso");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error inesperado" + e.getMessage());
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void animalTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalTagActionPerformed
        this.tag = animalTag.getText().trim();
        System.out.println(this.tag);
    }//GEN-LAST:event_animalTagActionPerformed

    private void animalSpecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalSpecieActionPerformed
        this.species = animalSpecie.getText().trim();
        System.out.println(this.species);
    }//GEN-LAST:event_animalSpecieActionPerformed

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
    private javax.swing.JTextField animalSpecie;
    private javax.swing.JTextField animalTag;
    private javax.swing.JTextField animalWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
