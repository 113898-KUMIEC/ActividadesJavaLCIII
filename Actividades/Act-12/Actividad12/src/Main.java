import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cualquier numero para empezar a calcular || aprete 0 para salir");
        int n = leer.nextInt();

        antiguedadAuto(n);
    }

    static void antiguedadAuto(int n){
        Scanner leer = new Scanner(System.in);

        int totalAuto = 0;
        int cantPocoUso = 0;
        int aniosNoMuyAntiguo = 0;
        int totalAutoNoMuyAntiguo = 0;

        while (n != 0){
            System.out.println("Ingrese antiguedad:");
            n = leer.nextInt();

            if (n >= 1 && n <= 5){
                totalAuto++;
                System.out.println("NUEVO");
                aniosNoMuyAntiguo += n;
                totalAutoNoMuyAntiguo++;
            }
            else if (n >= 6 && n <= 10){
                totalAuto++;
                System.out.println("POCO USO");
                cantPocoUso++;
                aniosNoMuyAntiguo += n;
                totalAutoNoMuyAntiguo++;
            }
            else if (n >= 11 && n <= 20){
                totalAuto++;
                System.out.println("MUCHO USO");
                aniosNoMuyAntiguo += n;
                totalAutoNoMuyAntiguo++;
            }
            else if (n > 20) {
                totalAuto++;
                System.out.println("MUY ANTIGUO");
            }
        }


        System.out.println("La cantidad total de autos es de: " + totalAuto + "\n");

        System.out.println("La cantidad de autos con poco uso es de: " + cantPocoUso + "\n");

        float promedioNoMuyAntiguo = aniosNoMuyAntiguo / totalAutoNoMuyAntiguo;
        System.out.println("El promedio de antiguedad de autos que no sean muy antiguos es de: " + promedioNoMuyAntiguo);
    }
}