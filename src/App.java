public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosOrdenamiento = new Metodos();

        int[] arreglo = {5, 7, 30, 12, 9};

        // Ordenar arreglo de enteros
        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenado); // Llamar al método para imprimir el arreglo

        // Cadena de texto para ordenar palabras
        String cadena = "este es un ejemplo de texto para Ordenar";
        String[] palabras = cadena.split(" ");  // Cambiado "-" por "."
        
        // Ordenar palabras
        String[] palabrasOrdenadas = metodosOrdenamiento.sortByBubblePalabras(palabras);
        metodosOrdenamiento.printArreglo(palabrasOrdenadas); // Llamar al método para imprimir el arreglo de palabras
    }
}
