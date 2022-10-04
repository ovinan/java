package calculadorasimple;

/**
 * Ejemplo de calculadora simple, con operaciones basicas
 * @author ovinan
 */
public class CalculadoraSimple {
    /**
     * Realiza la suma de dos números enteros. 
     * @param num1
     * @param num2
     * @return num1+ num2.
     */
    public static int  sumar (int num1, int num2){
                    return num1 + num2;
    }

    /**
     * Realiza la resta de dos números enteros. 
     * @param num1
     * @param num2
     * @return num1 - num2.
     */
    public static  int  restar (int num1, int num2){
                    return num1 - num2;
    }

    /**
     * Realiza la multiplicación de dos números enteros. 
     * @param num1
     * @param num2
     * @return num1 * num2.
     */
    public static  int  multiplicar (int num1, int num2){
                    return num1 * num2;
    }

    /**
     * Realiza la división de dos números enteros. 
     * @param num1
     * @param num2
     * @return num1 / num2.
     */
    public static  double  dividir (int num1, int num2){
                    return num1 / num2;
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
