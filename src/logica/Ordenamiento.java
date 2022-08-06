package logica;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Ordenamiento extends javax.swing.JFrame implements Ordena {

    String tipoOrdenamiento;
    int matriz[] = {21, 40, 4, 9, 10, 35};

    public Ordenamiento() {
        initComponents();
        setSize(831, 454);
        setExtendedState(getExtendedState());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(this);
        jTextArea1.setEditable(false);
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

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboMetodos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdenar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(panel);
        panel.setBounds(10, 10, 820, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        tipoOrdenamiento = (String) comboMetodos.getSelectedItem();
        switch (tipoOrdenamiento) {
            case "Burbuja":
                jTextArea1.setText("");
                if(jTextArea1.getText().isEmpty()){
                 burbuja(matriz);
                }
               
                break;
            case "Insercion":
                jTextArea1.setText("");
                insercion(matriz);
                break;
            case "Seleccion":
                jTextArea1.setText("");
                seleccion(matriz);
                break;
            case "Mezcla":

                break;
            case "Shellsort":
                jTextArea1.setText("");
                Shellsort(matriz);
                break;
            case "quicksort":

                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione un valor valido");
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void burbuja(int[] matriz) {
        int temporal;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length - 1; j++) {

                if (matriz[j] > matriz[j + 1]) {

                    for (int k = 0; k < matriz.length; k++) {

                        System.out.print(" " + matriz[k]);
                        jTextArea1.append(" " + matriz[k]);

                    }

                    jTextArea1.append(" " + " <-- Se cambia el " + matriz[j] + " por el " + matriz[j + 1] + "\n");
                    System.out.println(" <-- Se cambia el " + matriz[j] + " por el " + matriz[j + 1]);

                    System.out.println("");
                    temporal = matriz[j];

                    matriz[j] = matriz[j + 1];

                    matriz[j + 1] = temporal;

                }

            }

        }
    }

    @Override
    public void insercion(int[] matriz) {
        int pos;
        int aux;
        try {
            for (int i = 0; i < matriz.length; i++) {
                pos = i;
                aux = matriz[i];
                for (int k = 0; k < matriz.length; k++) {

                    System.out.print(" " + matriz[k]);
                    jTextArea1.append(" " + matriz[k]);

                }
                if (pos > 0) {
                    jTextArea1.append(" " + " <-- Se cambia el " + matriz[pos] + " por el " + matriz[pos - 1] + "\n");
                    System.out.println(" <-- Se cambia el " + matriz[pos] + " por el " + matriz[pos - 1]);
                }

                while ((pos > 0) && (matriz[pos - 1] > aux)) {
                    matriz[pos] = matriz[pos - 1];
                    pos--;
                }
                matriz[pos] = aux;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

    @Override
    public void seleccion(int[] matriz) {
    }

    @Override
    public void mezcla(int[] matriz) {
    }

    @Override
    public void Shellsort(int[] matriz) {

        for (int increment = matriz.length / 2; increment > 0; increment
                = (increment == 2) ? 1 : (int) Math.round(increment / 2.2)) {

            for (int i = increment; i < matriz.length; i++) {
                for (int k = 0; k < matriz.length; k++) {

                    System.out.print(" " + matriz[k]);
                    jTextArea1.append(" " + matriz[k]);

                }

                for (int j = i; j >= increment && matriz[j - increment]
                        > matriz[j]; j -= increment) {
                    jTextArea1.append(" " + " <-- Se cambia el " + matriz[j] + " por el " + matriz[j - increment] + "\n");
                    int temp = matriz[j];
                    matriz[j] = matriz[j - increment];
                    matriz[j - increment] = temp;

                }

            }
        }
        jTextArea1.append(" Arreglo ordenado \n");
        for (int k = 0; k < matriz.length; k++) {

            System.out.print(" " + matriz[k]);
            jTextArea1.append(" " + matriz[k]);

        }

    }

    @Override
    public void quicksort(int[] matriz) {
    }
}
