package enumeraciones;

public enum Continentes {
    AFRICA(54),
    EUROPA(49),
    ASIA(48),
    AMERICA(35),
    OCEANIA(14);
    //ANTARTIDA(0) SI NO TIENE UN CONSTRUCTOR EN DONDE SE LE ENVIE UN PARAMETRO COMO EN EL CASO DE ABAJO NO SE LE PUEDE ASIGNAR NADA.
    
    private final int paises;
    
    private Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    
}
