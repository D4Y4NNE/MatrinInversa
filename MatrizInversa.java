public class MatrizInversa
{
    int primeraMatriz[][];
    int matrizTranspuesta[][];
    int f;
    int c;
    public MatrizInversa(int f, int c)
    {

        establecerF(f);
        establecerC(c);
    }
    public int obtenerF()
    {
        return f;
    }
    public void establecerF(int f)
    {
        this.f = f;
    }
    public int obtenerC()
    {
        return f;
    }
    public void establecerC(int c)
    {
        this.c = c;
    }
    public void pedirmatriz()
    {
        primeraMatriz = new int[f][c];

        System.out.println("Primera matriz");
        for (int i = 0; i < obtenerF(); i++)
        {
            for (int j = 0; j < obtenerC(); j++)
            {
                System.out.print("Posicion [" + i + "][" + j + "] : ");
                primeraMatriz[i][j] = primeraMatriz[i][j];
            }
        }
    }
    public void mostrarmatriz()
    {
        for (int i = 0; i < obtenerF(); i++)
        {
            for (int j = 0; j < obtenerC(); j++)
            {
                System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
            }
        }
    }

    public void matrizTranspuesta()
    {
        matrizTranspuesta = new int[f][c];

        for (int i = 0; i < obtenerF(); i++)
        {
            for (int j = 0; j < obtenerC(); j++)
            {
                matrizTranspuesta[i][j] = primeraMatriz[j][i];
            }
        }
    }
    public void matrizInversa()
    {
        System.out.println("La matriz inversa es :");

        for (int i = 0; i < obtenerF(); i++)
        {
            for (int j = 0; j < obtenerC(); j++)
            {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
        }
    }
}