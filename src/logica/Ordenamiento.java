package logica;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Ordenamiento extends javax.swing.JFrame implements Ordena {

    String tipoOrdenamiento;
    int matriz[];

    public Ordenamiento() {
        initComponents();
        setSize(831, 454);
        setExtendedState(getExtendedState());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(this);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        comboMetodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Burbuja", "Insercion", "Seleccion", "Mezcla", "Shellsort", "quicksort" }));

        jLabel1.setText("Selecciona metodo ordenamiento");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
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
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboMetodos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOrdenar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenar))
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
                burbuja(matriz);
                break;
            case "Insercion":
                insercion(matriz);
                break;
            case "Seleccion":
                seleccion(matriz);
                break;
            case "Mezcla":

                break;
            case "Shellsort":

                break;
            case "quicksort":

                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione un valor valido");
                break;

        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Ordenamiento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    }

    @Override
    public void insercion(int[] matriz) {
    }

    @Override
    public void seleccion(int[] matriz) {
    }

    @Override
    public void mezcla(int[] matriz) {
    }

    @Override
    public void Shellsort(int[] matriz) {
    }

    @Override
    public void quicksort(int[] matriz) {
    }
}
