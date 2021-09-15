import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese numero de terminos: ");
        n = reader.nextInt();

        if(n <= 0)
        {
            System.out.printf("No es valido el numero 0");
        }else
        {
            System.out.printf("0 ");
            if (n >= 2) 
            {
              long anterior = 0;
              long actual = 1; 
              int i = 2; 

              do
              {
                  long copiaActual = actual;
                  actual = actual + anterior;
                  anterior = copiaActual;
                  System.out.printf("%d", actual );
                  i++;
              } while(i <=n);
            } 
        }
    }
}
