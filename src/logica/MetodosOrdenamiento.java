package logica;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import static logica.Ordenamiento.comboMetodos;
import static logica.Ordenamiento.jTextArea1;

public class MetodosOrdenamiento implements Ordena {

    @Override
    public void burbuja(int[] matriz) {
        int temporal;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length - 1; j++) {

                if (matriz[j] > matriz[j + 1]) {
                    for (int k = 0; k < matriz.length; k++) {

                        jTextArea1.append(" " + matriz[k]);

                    }
                    jTextArea1.append(" " + " <-- Se cambia el " + " [ " + matriz[j] + " ] " + " por el " + " [ " + matriz[j + 1] + " ] \n");
                    temporal = matriz[j];

                    matriz[j] = matriz[j + 1];

                    matriz[j + 1] = temporal;

                }

            }

        }
        jTextArea1.append(" \n Arreglo ordenado");
        for (int i = 0; i < matriz.length; i++) {
            jTextArea1.append(" [ " + matriz[i] + " ] ");

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
                        jTextArea1.append(" [" + matriz[k] + " ]");

                    }
                    jTextArea1.append(" " + " <-- Se cambia el " + " [ " + matriz[pos] + " ] por el " + " [ " + matriz[pos - 1] + " ]\n");
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
            jTextArea1.append(" [ " + matriz[i] + " ] ");

        }
    }

    @Override
    public void seleccion(int[] matriz) {
        int minimo, aux;
        for (int i = 0; i < matriz.length - 1; i++) {
            minimo = i;
            for (int k = 0; k < matriz.length; k++) {
                jTextArea1.append(" [ " + matriz[k] + " ] ");

            }

            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[j] < matriz[minimo]) {
                    minimo = j;
                    jTextArea1.append(" " + " <-- Se cambia el " + " [ " + matriz[i] + " ] por el " + " [ " + matriz[minimo] + " ]\n");

                }

            }

            aux = matriz[i];
            matriz[i] = matriz[minimo];
            matriz[minimo] = aux;

        }
        jTextArea1.append(" \n Arreglo ordenado -->");
        for (int i = 0; i < matriz.length; i++) {
            jTextArea1.append(" [ " + matriz[i] + " ] ");

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
            jTextArea1.append(" \n Subarreglo A --> ");
            for (i = 0; i < elementosIzq; i++) {
                arregloIzq[i] = matriz[i];
                jTextArea1.append(" [ " + matriz[i] + " ] ");
            }
            jTextArea1.append(" \n Subarreglo B --> ");
            for (i = elementosIzq; i < elementosIzq + elementosDer; i++) {
                arregloDer[i - elementosIzq] = matriz[i];
                jTextArea1.append(" [ " + matriz[i] + " ] ");
            }
            arregloIzq = mezcla(arregloIzq);
            arregloDer = mezcla(arregloDer);

            i = 0;
            j = 0;
            k = 0;
            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    matriz[i] = arregloIzq[j];
                    //jTextArea1.append(" " + " <-- Se cambia el " + matriz[elementosIzq] + " por el " + matriz[elementosDer] + "\n");
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
                    jTextArea1.append(" " + matriz[k]);

                }
                for (int j = i; j >= increment && matriz[j - increment]
                        > matriz[j]; j -= increment) {
                    jTextArea1.append(" " + " <-- Se cambia el [ " + matriz[j] + " ] por el [ " + matriz[j - increment] + " ] \n");
                    int temp = matriz[j];
                    matriz[j] = matriz[j - increment];
                    matriz[j - increment] = temp;
                }
            }
        }
        jTextArea1.append(" Arreglo ordenado \n");
        for (int k = 0; k < matriz.length; k++) {
            System.out.print(" " + matriz[k]);
            jTextArea1.append(" [ " + matriz[k] + " ] ");
        }
    }

    @Override
    public void quicksort(int[] Arreglo, int izq, int der) {
        int pivote = Arreglo[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {

            jTextArea1.append(" \n" + " <-- Se cambia el [ " + Arreglo[izq] + " ] por el [ " + Arreglo[der] + " ] ");// mientras no se crucen las búsquedas                                   
            while (Arreglo[i] <= pivote && i < j) {

                i++; // busca elemento mayor que pivote
            }
            while (Arreglo[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            for (int k = 0; k < Arreglo.length; k++) {
                jTextArea1.append(" " + Arreglo[k]);
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = Arreglo[i];                      // los intercambia
                Arreglo[i] = Arreglo[j];
                Arreglo[j] = aux;

            }
        }

        Arreglo[izq] = Arreglo[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        Arreglo[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksort(Arreglo, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(Arreglo, j + 1, der);

        }

    }

}
