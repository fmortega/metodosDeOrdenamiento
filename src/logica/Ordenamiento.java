package logica;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Ordenamiento extends javax.swing.JFrame  {

    String tipoOrdenamiento;
    int nElementos;
    int matriz[];
    MetodosOrdenamiento metodos;

    public Ordenamiento() {
        initComponents();
        setSize(600, 454);
        setExtendedState(getExtendedState());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(this);
        jTextArea1.setEditable(false);
        metodos = new MetodosOrdenamiento();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        comboMetodos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnOrdenar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(204, 204, 204));

        comboMetodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Burbuja", "Insercion", "Seleccion", "Mezcla", "Shellsort", "quicksort" }));

        jLabel1.setText("Selecciona metodo ordenamiento");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("Tiempo de ejecucion");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(comboMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnOrdenar)
                            .addGap(17, 17, 17)
                            .addComponent(btnLimpiar)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel2)
                            .addGap(10, 10, 10)
                            .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenar)
                    .addComponent(btnLimpiar)
                    .addComponent(jLabel2)
                    .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel);
        panel.setBounds(0, 0, 560, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        tipoOrdenamiento = (String) comboMetodos.getSelectedItem();
        if (comboMetodos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un metodo a ordenar");
        } else {
            nElementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de elelmentos"));
            matriz = new int[nElementos];
            for (int i = 0; i < nElementos; i++) {
                matriz[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero en la posicion " + (i + 1)));
            }
        }

        switch (tipoOrdenamiento) {
            case "Burbuja":

                jTextArea1.setForeground(Color.GREEN);
                jTextArea1.append(" \n Metodo Burbuja");
                jTextArea1.append(" \n Arreglo original");
                for (int i = 0; i < matriz.length; i++) {
                    jTextArea1.append(" " + matriz[i]);

                }
                long inicio = System.currentTimeMillis();
                jTextArea1.append(" \n");
                metodos.burbuja(matriz);
                long fin2 = System.currentTimeMillis();
                double tiempo = (double) ((fin2 - inicio));
                lblTiempo.setText(" " + tiempo+" milisegundos");

                break;
            case "Insercion":
                jTextArea1.setForeground(Color.BLUE);
                jTextArea1.append(" \n Metodo Insercion");
                jTextArea1.append(" \n Arreglo original");
                for (int i = 0; i < matriz.length; i++) {
                    jTextArea1.append(" " + matriz[i]);

                }
                long inici = System.currentTimeMillis();
                jTextArea1.append(" \n");
                metodos.insercion(matriz);
                long fin3 = System.currentTimeMillis();
                double tiemp = (double) ((fin3 - inici));
                lblTiempo.setText(" " + tiemp+" milisegundos");
                break;
            case "Seleccion":
                jTextArea1.setForeground(Color.red);
                jTextArea1.append(" \n Metodo Seleccion");
                jTextArea1.append(" \n Arreglo original");
                for (int i = 0; i < matriz.length; i++) {
                    jTextArea1.append(" " + matriz[i]);

                }
                long ini = System.currentTimeMillis();
                jTextArea1.append(" \n");
                metodos.seleccion(matriz);
                long fin4 = System.currentTimeMillis();
                double te = (double) ((fin4 - ini));
                lblTiempo.setText(" " + te+" milisegundos");
                break;
            case "Mezcla":
                jTextArea1.setForeground(Color.ORANGE);
                jTextArea1.append(" \n Metodo Mezcla");
                jTextArea1.append(" \n Arreglo original");
                for (int i = 0; i < matriz.length; i++) {
                    jTextArea1.append(" " + matriz[i]);

                }
                jTextArea1.append(" \n Arreglo original");
                for (int l = 0; l < matriz.length; l++) {
                    jTextArea1.append("  " + matriz[l]);

                }
                long inc = System.currentTimeMillis();
                matriz = metodos.mezcla(matriz);
                long fin = System.currentTimeMillis();
                double tmp = (double) ((fin - inc));
                lblTiempo.setText(" " + tmp+" milisegundos");
                jTextArea1.append(" \n Arreglo ordenado");
                for (int l = 0; l < matriz.length; l++) {
                    jTextArea1.append("  " + matriz[l]);

                }
                break;
            case "Shellsort":
                jTextArea1.setForeground(Color.GRAY);
                jTextArea1.append(" \n Metodo Shellsort");
                jTextArea1.append(" \n Arreglo original");
                for (int i = 0; i < matriz.length; i++) {
                    jTextArea1.append(" " + matriz[i]);

                }
                long in = System.currentTimeMillis();
                jTextArea1.append(" \n");
                metodos.Shellsort(matriz);
                long f = System.currentTimeMillis();
                double t = (double) ((f - in));
                lblTiempo.setText(" " + t+" milisegundos");
                break;
            case "quicksort":
                int i = 1;
                int j = matriz.length - 1;
                jTextArea1.setForeground(Color.MAGENTA);
                jTextArea1.append(" \n Metodo Quicksort");
                jTextArea1.append(" \n Arreglo original");
                for (int k = 0; k < matriz.length; k++) {
                    jTextArea1.append(" " + matriz[k]);

                }
                long in2 = System.currentTimeMillis();

                metodos.quicksort(matriz, i, j);
                long f2 = System.currentTimeMillis();
                double tm = (double) ((f2 - in2));
                lblTiempo.setText(" " + tm+" milisegundos");
                break;

        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Ordenamiento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOrdenar;
    public static javax.swing.JComboBox<String> comboMetodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTiempo;
    public static javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

   

    }
