public class IntroMatrices {
    public static void main(String[] args) {
        //instanciación de matriz
        int[][] matriz = new int[5][5];

        //inicializar al definir arreglo
        int[] arreglo = {1, 2, 3, 4, 5};
        //comprobar que la matriz es un arreglo
        //de arreglos
        int[][] matriz2 =
                {      //C1 C2 C3 C4 C5
                        {1, 2, 3, 4, 5}, //fila 1
                        {6, 7, 8, 9, 0}  //fila 2
                };

        //Utilizando matriz.length obtengo
        //la cantidad de filas
        System.out.println("Cantidad de filas");
        System.out.println(matriz2.length);
        int filas = matriz2.length;
        //Utilizando matriz[cualquier fila]
        //la cantidad de columnas
        System.out.println("Cantidad de columnas");
        System.out.println(matriz2[0].length);
        int columnas = matriz2[0].length;

        //Recorremos
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j]);
            }
            System.out.println();
        }
    }
}
