class Metodos {
    public int[] sortByBubble(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        return arreglo;
    }

    public String[] sortByBubblePalabras(String[] palabras) {
    int tamanio = palabras.length;

    // Bucle principal del Bubble Sort
    for (int i = 0; i < tamanio - 1; i++) {
        for (int j = 0; j < tamanio - i - 1; j++) {
            // Comparar dos cadenas sin distinguir mayúsculas de minúsculas
            if (palabras[j].compareToIgnoreCase(palabras[j + 1]) > 0) {
                // Intercambiar si están en el orden incorrecto
                String temp = palabras[j];
                palabras[j] = palabras[j + 1];
                palabras[j + 1] = temp;
            }
        }
    }
    
    return palabras;
}


  // Método para imprimir el arreglo
    public void printArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea al final
    }

    // Método para imprimir el arreglo de palabras
    public void printPalabras(String[] palabras) {
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
        System.out.println(); // Salto de línea al final
    }
}

