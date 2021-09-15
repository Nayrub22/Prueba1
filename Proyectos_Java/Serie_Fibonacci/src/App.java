import java.util.Scanner;
/* Utilizo la clase Scanner para leer datos del teclado */
public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese numero de terminos: ");
        n = reader.nextInt();
        /* Declaro la variable que usare para pedir datos del teclado y pido los datos que requiero */

        if(n <= 0) /* Validacion para que no ingresen numeros menores a 0*/
        {
            System.out.printf("No es valido el numero 0");
        } 
        else
        {
            System.out.printf("0 \n"); /* Muestro el numero 0 ya que es el primero de la serie*/
            if (n >= 2) 
            {
                /* Utilizo las variables tipo long en caso de que se quiera mostrar la serie con numeros muy grandes*/
              long anterior = 0;
              long actual = 1; 
              int i = 2; 

              do
              {
                  long copiaActual = actual;
                  actual = actual + anterior;
                  anterior = copiaActual;
                  System.out.printf("%d \n", actual );
                  i++;
              } while(i <=n);
            } 
        }
    }
}
