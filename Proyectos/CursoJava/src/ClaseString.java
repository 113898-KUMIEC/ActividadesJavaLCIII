public class ClaseString {
    public static void main(String[] args) {
        
        String nombre = "Laura";
        System.out.println(nombre.charAt(3));
        
        System.out.println(nombre.length());
        
        for(int i = 0; i<nombre.length();i++){
            System.out.println(nombre.charAt(i));
        }
        
        nombre = "l a u r a";
        System.out.println(nombre.replace(" ", "-"));
    
        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);
        
        nuevo.append("Hola");
        nuevo.append( " Mundo");
        
        System.out.println(nuevo);
    }
}
