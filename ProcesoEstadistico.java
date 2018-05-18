import java.util.Random;

public class ProcesoEstadistico {
    public static void main(String[] args) {
        //Un profesor de crossfit necesita
        //una herramienta que le permita
        //saber cuantas repeticiones hace
        //cada alumno en cada estación
        //y saber cuantas repeticiones hacen
        //todos los alumno en una estación
        //y cuantas repeteciones hace un alumno
        //en total en todas las estaciones
        //y el total de totales

        //Asumimos que hay 5 alumnos y 4 estaciones

        //Por lo tanto necesitamos una matriz de
        //6 por 5

        int[][] matriz = new int[6][5];
        for(int i = 0; i < matriz.length - 1; i++) {
            for(int j = 0; j < matriz[0].length - 1; j++) {
                cargarMatriz(matriz,i,j,new Random().nextInt(2));
            }
        }

        mostrarMatriz(matriz);
    }

    public static void cargarMatriz(int[][] matriz, int alumno, int estacion, int repeticiones) {
            int colTotalAlumno = matriz[0].length - 1;
            int filaTotEstacion = matriz.length - 1;

            matriz[alumno][estacion] = repeticiones;
            matriz[alumno][colTotalAlumno] += repeticiones;
            matriz[filaTotEstacion][estacion] += repeticiones;
            matriz[filaTotEstacion][colTotalAlumno] += repeticiones;
    }

    public static void mostrarMatriz(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
