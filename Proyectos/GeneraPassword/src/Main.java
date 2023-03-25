
public class Main {

    public static void main(String[] args) {
        
        System.out.println(generarContrasena());
    }
    
    static String generarContrasena(){
        
        char[] mayusculas = {'A','B','C','D','E','F','G','H','I','J','K'};
        
        char[] minusculas = {'a','b','c','d','e','f','g','h','i','j','k'};
        
        char[] numeros = {'1','2','3','4','5','6','7','8','9','0'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        
        
        StringBuilder contraseña = new StringBuilder();
        
        for(int i = 0; i<= 15; i++){
            
            int cantidad = caracteres.length();
            
            int numeroRandom = (int)(Math.random()*cantidad);
            
            contraseña.append(caracteres.toString().charAt(numeroRandom));
        }
        return contraseña.toString();
    }
}
