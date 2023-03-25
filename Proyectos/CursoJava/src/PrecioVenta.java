import java.util.Scanner;

public class PrecioVenta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese valor de venta: ");
        double vv = leer.nextDouble();
        
        //IGV 18%
        double igv = vv * 0.18;
        double pv = vv + igv;
        
        System.out.println("Valor de venta: " + vv);
        System.out.println("IGV: " + igv);
        System.out.println("Precio de venta: " + pv);
        
    }
}
