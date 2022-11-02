public class numdias {
    enum Mes {
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
    }
    public static void main(String[] args) {
  
        Mes mesActual = Mes.NOVIEMBRE;
        int numdias;
        switch (mesActual) {
            case ENERO: case MARZO: case MAYO: case JULIO: case AGOSTO: case OCTUBRE: case DICIEMBRE:
            numdias = 31;
            case FEBRERO:
            numdias = 28;
            default:
            numdias = 30;
            break;
        }
        System.out.println("El mes de " + mesActual + " tiene " + numdias + " días.");
    }
    
}
