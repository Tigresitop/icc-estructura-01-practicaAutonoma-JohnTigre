import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: El metodo retorna un arreglo vacio(retunr new int{})
    //Correcion: Se cambio el codi por (return arreglo;) dandonos el areeglo ordenado
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo; //Linea de codigo cambiado 
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Se encontro (if (arreglo[i] > arreglo[j]) {)
    //Correccion: Se cambio el codigo (if (arreglo[i] < arreglo[j]) {) dandonos el arreglo de menor a mayor
    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) { //Se cambio < a > para imprimir de menor a mayor
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado:Estaba solo el en el for de j n
    //Correccion:Se puso en el for j n-1
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
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

    // Método de selección con errores
    // Error encontrado: No estaba el return lo cual no daba el arreglo
    //Correcion:Le agrege el ruturn arreglo;
    public int[] seleccionPrimero(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;

    }

    // Método de selección con errores
    // Error encontrado:Estaba mal el for de j (j--)
    //Correcion:Se cambio el for de j (j++)
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) { //Se cambio el -- por ++
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:Cambio de condiciones lo cual imprimia mal el arreglo y repita ciertos numeros 
    //Correcion:Se ubico bien las condicones 
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];//Se cambio por el arreglo[indiceMinimo] ya que estaba arreglo[i]
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;//estaba doble vez el arreglo arreglo[inidiceMinimo] se cambio por arreglo[i]
        }
        return arreglo;
    }

    // Método de inserción con errores 1
    // Error encontrado: Cambio de condiciones y variables que estaban mal.
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) { //Cambio en la condiciom de menor a mayor y i >=
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores 2
    // Error encontrado:Mal algunas varaibles 
    //Correcion:Se ubicaron bien las variables
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];

            int i = j - 1;

            for (; i >= 0 && arreglo[i] > key; i--) { //La variable es key no actual, ademas en vez de j deberia ir i, bucle for
                arreglo[i + 1] = arreglo[i]; //cambiar j por i 
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:Mal alguanas variables, retorno no daba el arreglo
    //Correcion:Se arreglaron las variables y el retorno
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;//Se agrego - 1

            while (i >= 0 && arreglo[i] > key) {//se cambio el < a > y se agrego =
                arreglo[i + 1] = arreglo[i];
                i--;// itira en --
            }
            arreglo[i + 1] = key;
        }
        return arreglo;//Se cambio porque deberia retornar arreglo
    }

}
