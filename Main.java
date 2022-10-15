public class Main {

    public static void main(String[] args)
    {

        MatrizInversa matriz = new MatrizInversa(1, 1);

        matriz.obtenerF();
        matriz.obtenerC();
        matriz.pedirmatriz();
        matriz.mostrarmatriz();
        matriz.matrizTranspuesta();
        matriz.matrizInversa();

        MatrizInversa matriz1 = new MatrizInversa(1, 1);

        matriz1.obtenerF();
        matriz1.obtenerC();
        matriz1.pedirmatriz();
        matriz1.mostrarmatriz();
    }
}