package GUI;

import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("SIMPLEX");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("FILAS:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("COLUMNAS:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("PROCEDIMIENTOS");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("MATRIZ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("CALCULAR Max");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("CALCULAR Min");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(35, 35, 35)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton2)
                                        .addGap(61, 61, 61)
                                        .addComponent(jButton3)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //TABLA
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int fila = Integer.parseInt(jTextField1.getText());
        int columna = Integer.parseInt(jTextField2.getText());
        int columna1 = columna;
        for (int i = 0; i < columna; i++) {
            model.addColumn("x" + (i + 1));
        }
        columna = fila + columna;

        model.setRowCount(fila);
        model.setColumnCount(columna);
        for (int j = columna1; j < columna; j++) {
            jTable1.setValueAt(0, 0, j);
        }
        int i1 = 1, j1 = columna1;
        for (int i = 1; i < fila; i++) {
            for (int j = columna1; j < columna - 1; j++) {
                if (i1 == i && j1 == j) {
                    jTable1.setValueAt(1, i, j);
                } else {
                    jTable1.setValueAt(0, i, j);
                }
            }
            j1++;
            i1++;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //RESULTADOS Max
        jTextArea1.append("Metodo simplex\n");
        DecimalFormat  l= new DecimalFormat("0.000");
        int fila= Integer.parseInt(jTexField1.getText());
        int columna = Integer.parseInt (jTextField2.getText());
        int columna1= columna;
        columna= fila+ columna; 
        double v [][]= new double [fila][colomna];
        int y1= 1;
        for (int i= 0; i< columna; i++){
            if (i< columna1){
                jTextArea1.append("\t x" + (i+ 1));
            } else if (i>= columna1 && i<columna-1){
                jTextArea1.append("t\d" + (y1));
                y1++;
            }else{
                jTextArea1.append ("\ t result");
         }
 }  

        jTextArea1.append ("\n");
        for (int i= 0; i< fila; i++);
          for (int j= 0; j< columna; j++){
              v [i][j]= Double.parseDouble (jTable2,getValueAt(i, j).toString ());
          }
}
        for (int i= 0; i< fila; i++){
            if (i!= 0){
                jTextArea1.append ("d"+ i);
            }
            for (int j= 0; j< columna; j++){
                jTextArea1.append("\t" + l.format( v [i][j]));
            }
            jTextArea1.append ("\n);
        }
        jTextArea1.append("\n\n");
        String v2 [] = new String [fila];
        int v3 [] = new int [fila];
        int v4 [] = new int [fila];
        int co= 0;
        while (true){
            if (co== columna1){
                break;
            }
            int f= 0, c= 0;
            double negativo= 0; 
            for (int i= 0; i< columna1; i++){
                if (v [0][i]<negativo){
                negativo= v [0][i];
                c= i; 
            }
        }  
        jTextArea1.append(""El maximo negativo es\n");
        jTextArea1.append(""+negativo+"\nla columna es\n");
        for(int i=0; i<fila; i++) {
            jTextArea1.append(""+v[i][c]+"\n");
        } 
        jTextArea1.append("\n");
        jTextArea1.append("\n diviendo con la columna\n");
        double menor= 0;
        double v1[]=new double[fila-1];
        int h=0;
        for(int i=1; i<fila; i++) {
        v1[h]=v[i][columna-1]/v[i][c];
            jTextArea1.append(""+v[i][columna-1]+"/"+v[i][c]+"="+v1[h]+"\n");
            h++;
          }
        menor=v1[0];
         for(int i=0; i<fila-1; i++) {
             if(v1[i]c=menor){
                 menor=v1[i];
                 f=i+1;
                 }
             } 
        jTextArea1.append(""El menor de la division es:"+menor +¨\n");
        double pivo=v[f][c];
jTextArea1.append(""El pivote es:¨+pivo);

         jTextArea1.append("\n proceso de convertir el pivote en 1\n diviendo toda la fila con el pivote\n");
        for(int i=0; i<columna; i++) {
            double va=v[f][i];
            v[f][i]=v[f][i]/pivo;
            jTextArea1.append(""+va+"/"+pivo+"="+v[f][i]+"\n");
            } 
            for(int i=1; i<fila; i++) {
                 if(i==f){
                     v2[i]="x"+(c+1);
                     v3[i]=c+1;
                         v4[i]=i;
                  } 
                  if(v3[i]<=0){
                       v2[i]=¨d¨+(i);
                  }
             }
                         jTextArea1.append("\n proceso \n");
                 for(int i=0; i<fila; i++) {
                 if(i!=f){
                 jTextArea1.append("convirtiendo la columna del pivote en cero, en fila¨+(i+1)+¨\n\n");
                 double guar=0;
                 guar=-v[i][c];
                         for(int j=1; j<columna; j++) {
                         }
                             double vaa=[i][j];
                            [i][j]=guar*[f][j]+v[i][j];
                           jTextArea1.append(""+guar+¨*¨v[f][j]+¨+¨+"+vaa+¨=¨+ v[i][j]+¨\n");
                              }
                          }
                      }
                      y1=1;
                      for(int i=0; i<columna; i++) {
                        if(i<columna1){
                         jTextArea1.append("\tx¨+(i+1));
                       }else if(i>=columna1 && i<columna-1) { 
                            jTextArea1.append("\td¨+(y1));
                                                        y1++;
                            }else{
                            jTextArea1.append("\t result¨);
                         }
                        }
                        jTextArea1.append("\n");


                        for(int i=0; i<fila; i++) {
                            if(i!=0){
                        jTextArea1.append(v2[i];
                                }
                           for(int j=0; j<columna; j++){   
                          jTextArea1.append("\t¨+l.format(v[i][j]));
                            }   
                             jTextArea1.append("\n");
                         }   
                        jTextArea1.append("\n\n");
                      }
                      int y2=0;
                     jTextArea1.append("Resultado\n");
                    jTextArea1.append("z="+v[0][columna-1]+"\n¨);
                    for(int i=1; i<fila; i++) {
                        char m1[]=v2[i].toCharArray();
                        if(m1[0]==¨x¨){
                            jTextArea1.append(""+v2[i]+"="+v[v4][i]][columna-1]+"\n");
                           }
                      
                       }
                
                    }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //RESULTADOS Min
        jTextArea1.append ("Metodo Simplex\n");
        DecimalFormat 1 = new DecimalFormat("0.000");
        int fila = Integer.parseInt (jTextField1.getText());
        int columna = Integer.parseInt(jTextField2.getText());
        int columna1 = columna;
        columna = fila + columna;
        double v[] [] = new double [fila][columna];
        int y1 = 1;
        for(int i = 0; i < columna; i++){
            if(i < columna1){
                jTextArea1.append("\t x" + (i+1));
            }else if (i >= columna1 && i < columna - 1){
                jTextArea1.append ("\t d" + (y1));
                y1++;
            }else{
                jTextArea1.append("\t resul");
            }  
        }
        jTextArea1.append ("\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                v[i][j] = Double.parseDouble(jTable2.getValueAt(i, j).toString());
            }
        }
        for (int i = 0; i < fila; i++) {
            if(i!=0){
                jTextArea1.append("d"+i);
            }
            for (int j = 0; j < columna; j++) {
                jTextArea1.append("\t " + l.format(v[i][j]));
            }
            jTextArea1.append("\n");
        }
        jTextArea1.append("\n\n");
        String v2[] = new String [fila];
        int v3 [] = new int [fila];
        int v4 [] = new int [fila];
        int co = 0;
        while (true){
            if (co == colmuna1){
                break;
            }
            int f = 0, c= 0;
            double Maypositivo = 0;
            for(int i = 0; i < columna1; i++){
                if(v [0][i] < mayPositivo){
                    mayPositivo = v [0][i];
                    c = i;
                }
            }
            jTextArea1.append("EL MAXIMO POSITIVO ES\n");
            jTextArea1.append("" + mayPositivo\n la columna es\n);
            for(int i = 0; i < fila; i++){
                v1[h] = v [i][columna + 1] / v[i][c];
                jTextArea1.append(" " + v[i][columna + 1]  + " / " + v[i][c] + " = " + v1[h] + " \n");
                
            }
            jTextArea1.append("\n");
            jTextArea1.append("\n Dividiendo con la columna\n");
            double mayor = 0;
            double v1 [] = new double [fila - 1];
            int h = 0;
            for(int i = 1; i < fila; i++){
                v1[h] = v[i][columna1 +1] / v [i][c];
                jTextArea1.append(" " + v[i][columna - 1] + " / " + v[i][c] + " = " + v1[h] + " \n");
                h++;
            }
            mayor = v1[0];
            for(int i; i< fila - 1; i++){
                if(v1[i]>= menor){
                    mayor = v1 [i];
                    f= i+1;
                }
            }
            jTextArea1.append("el mayor de la division es :" + mayor + " \n");
            double pivo = v [f][c];
            jTextArea1.append ("el pivote es "+ pivo);

            jTextArea1.append("\nproceso de convertir el pivote en 1\n dividiendo toda la fila en el pivote\n");
            for (int i = 0; i< columna; i++) {
                double va  = v [f][i];
                v[f][i] = v[f][i] / pivo;
                jTextArea1.append("" + va + "/" + pivo + "=" + v [f][i] + " \n");
            }
            for (int = 1; i< fila; i++){
                if(i == f){
                    v2[i] = "x" + (c + 1);
                    v3[i] = c + 1;
                    v4[i] = i;
                }
                if (v3[i]<= 0){
                   v2 [i] = "d" + (i);
                }
            }
            jTextAreal.append ("\n proceso\n");
            for(int i = 0; i< fila; i++){
                if(i != f){
                    jTextArea1.append("Convertiendo la columna del pivote en cero, en fila"+ (i+1) +"\n\n");
                    double guar = 0;
                    guar = v [i][c];
                     for (int j = 0; j < columna; j++) {
                        double vaa = v[i][j];
                        v[i][j] = guar * v[f][j] + v[i][j];
                        jTextArea1.append(" " + guar + "*" + v[f][j] + " + " + vaa + " = " + v[i][j] + "\n");
                }
            }
        }
            co = 0;
            for(int i = 0; i< colummna1; i++){
                if(v[0][i] >= 0){
                    co++;
                }
            }
            y1 = 1;
            for(int i = 0; i< columna; i++){
                if(i<columna1){
                    jTextArea1.append (("\t x" + (i + 1));
                }else if (i>= columna1 && i< columna-1){
                    jTextArea1.append("\t d" + (y1));
                    y1++;
                }else{
                    jTextArea1.append ("\t resul");
                }
            }
            jTextArea1.append("\n");
            for(int i = 0; i<fila; i++){
                if(i!=0){
                    jTextArea1.append(v2[i]);
                }
                for (int j = 0; j < columna; j++) {
                    jTextArea1.append("\t " + l.format(v[i][j]));
                }
                jTextArea1.append("\n");
            }
            jTextArea1.append("\n\n");
            }
            int y2 = 0;
            jTextArea1.append ("Resultado\n");
            jTextArea1.append("z = "+v[0][columna-1]+"\n");
            for(int i = 1; i< fila; i++){
                char m1[] = v2[i].toCharArray();
                if (m1[0] == 'x'){
                    jTextArea1.append("" + v2[i] + "=" + v[v4[i]][columna - 1] + "\n");
                }
            }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
