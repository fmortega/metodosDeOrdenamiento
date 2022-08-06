package logica;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Ordenamiento extends javax.swing.JFrame implements Ordena {

    String tipoOrdenamiento;
    int matriz[] = {21, 40, 4, 9, 10, 35};
    // int matriz[] = {8, 12, 16, 4, 20, 24, 28};

    public Ordenamiento() {
        initComponents();
        setSize(600, 454);
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
                            .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        switch (tipoOrdenamiento) {
            case "Burbuja":
                if (jTextArea1.getText().isEmpty()) {
                    jTextArea1.setForeground(Color.GREEN);
                    jTextArea1.append(" \n Metodo Burbuja");
                    long inicio = System.currentTimeMillis();
                    jTextArea1.append(" \n");
                    burbuja(matriz);
                    long fin2 = System.currentTimeMillis();
                    double tiempo = (double) ((fin2 - inicio));
                    lblTiempo.setText(" " + tiempo);
                }

                break;
            case "Insercion":
                jTextArea1.setForeground(Color.BLUE);
                jTextArea1.append(" \n Metodo Insercion");
                long inicio = System.currentTimeMillis();
                jTextArea1.append(" \n");
                insercion(matriz);
                long fin2 = System.currentTimeMillis();
                double tiempo = (double) ((fin2 - inicio));
                lblTiempo.setText(" " + tiempo);
                break;
            case "Seleccion":
                jTextArea1.setForeground(Color.red);
                jTextArea1.append(" \n Metodo Seleccion");
                long ini = System.currentTimeMillis();
                jTextArea1.append(" \n");
                seleccion(matriz);
                long fin3 = System.currentTimeMillis();
                double te = (double) ((fin3 - ini));
                lblTiempo.setText(" " + te);
                break;
            case "Mezcla":
                jTextArea1.setForeground(Color.ORANGE);
                jTextArea1.append(" \n Metodo Mezcla");
                jTextArea1.append(" \n Arreglo original");
                for (int l = 0; l < matriz.length; l++) {
                    jTextArea1.append("  " + matriz[l]);

                }
                long inc = System.currentTimeMillis();
                matriz = mezcla(matriz);
                long fin = System.currentTimeMillis();
                double tmp = (double) ((fin - inc));
                lblTiempo.setText(" " + tmp);
                jTextArea1.append(" \n Arreglo ordenado");
                for (int l = 0; l < matriz.length; l++) {
                    jTextArea1.append("  " + matriz[l]);

                }
                break;
            case "Shellsort":
                jTextArea1.setForeground(Color.GRAY);
                jTextArea1.append(" \n Metodo Shellsort");
                long in = System.currentTimeMillis();
                jTextArea1.append(" \n");
                Shellsort(matriz);
                long f = System.currentTimeMillis();
                double t = (double) ((f - in));
                lblTiempo.setText(" " + t);
                break;
            case "quicksort":
                int i = 1;
                int j = matriz.length - 1;
                jTextArea1.setForeground(Color.MAGENTA);
                jTextArea1.append(" \n Metodo Quicksort");
                long in2 = System.currentTimeMillis();

                quicksort(matriz, i, j);
                long f2 = System.currentTimeMillis();
                double tm = (double) ((f2 - in2));
                lblTiempo.setText(" " + tm);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTiempo;
    public static javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void burbuja(int[] matriz) {
        int temporal;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length - 1; j++) {

                if (matriz[j] > matriz[j + 1]) {

                    for (int k = 0; k < matriz.length; k++) {

                        // System.out.print(" " + matriz[k]);
                        jTextArea1.append(" " + matriz[k]);

                    }

                    jTextArea1.append(" " + " <-- Se cambia el " + matriz[j] + " por el " + matriz[j + 1] + "\n");
                    //  System.out.println(" <-- Se cambia el " + matriz[j] + " por el " + matriz[j + 1]);

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

                if (pos > 0) {
                    for (int k = 0; k < matriz.length; k++) {

                        System.out.print(" " + matriz[k]);
                        jTextArea1.append(" " + matriz[k]);

                    }
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
        jTextArea1.append(" \n Arreglo ordenado");
        for (int i = 0; i < matriz.length; i++) {
            jTextArea1.append(" " + matriz[i]);

        }

    }

    @Override
    public void seleccion(int[] matriz) {
        int minimo, aux;
        for (int i = 0; i < matriz.length - 1; i++) {
            minimo = i;
            for (int j = i + 1; j < matriz.length; j++) {

                if (matriz[j] < matriz[minimo]) {
                    minimo = j;

                }

            }
            for (int k = 0; k < matriz.length; k++) {
                jTextArea1.append(" " + matriz[k]);

            }
            aux = matriz[i];
            matriz[i] = matriz[minimo];
            matriz[minimo] = aux;
            jTextArea1.append(" " + " <-- Se cambia el " + matriz[i] + " por el " + matriz[minimo] + "\n");

        }
        jTextArea1.append(" \n Arreglo ordenado");
        for (int i = 0; i < matriz.length; i++) {
            jTextArea1.append(" " + matriz[i]);

        }
    }

    @Override
    public int[] mezcla(int[] matriz) {
        int i, j, k;
        if (matriz.length > 1) {
            int elementosIzq = matriz.length / 2;
            int elementosDer = matriz.length - elementosIzq;
            int arregloIzq[] = new int[elementosIzq];
            int arregloDer[] = new int[elementosDer];
            for (i = 0; i < elementosIzq; i++) {
                arregloIzq[i] = matriz[i];
            }
            for (i = elementosIzq; i < elementosIzq + elementosDer; i++) {
                arregloDer[i - elementosIzq] = matriz[i];
            }
            arregloIzq = mezcla(arregloIzq);
            arregloDer = mezcla(arregloDer);
            jTextArea1.append(" " + " <-- Se cambia el " + matriz[elementosIzq] + " por el " + matriz[elementosDer] + "\n");
            i = 0;
            j = 0;
            k = 0;
            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    matriz[i] = arregloIzq[j];
                    i++;
                    j++;

                } else {
                    matriz[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            while (arregloIzq.length != j) {
                matriz[i] = arregloIzq[j];
                i++;
                j++;

            }
            while (arregloDer.length != k) {
                matriz[i] = arregloDer[k];
                i++;
                k++;

            }

        }

        return matriz;

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
    public void quicksort(int[] Arreglo, int izq, int der) {

        int pivote = Arreglo[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (Arreglo[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (Arreglo[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }

            if (i < j) {                        // si no se han cruzado                      
                aux = Arreglo[i];                      // los intercambia
                Arreglo[i] = Arreglo[j];
                Arreglo[j] = aux;
                jTextArea1.append(" " + " <-- Se cambia el " + matriz[i] + " por el " + matriz[j] + "\n");

            }
        }

        Arreglo[izq] = Arreglo[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        Arreglo[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksort(Arreglo, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(Arreglo, j + 1, der);
            for (int k = 0; k < matriz.length; k++) {

                System.out.print(" " + matriz[k]);
                jTextArea1.append(" " + matriz[k]);

            }// ordenamos subarray derecho
        }
        jTextArea1.append(" Arreglo ordenado \n");
        for (int k = 0; k < Arreglo.length; k++) {

            jTextArea1.append(" " + matriz[k]);

        }
    }
}
