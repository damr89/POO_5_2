
public class Fresco extends Producto {
    String FEnvasado;
    String POrigen;

    public Fresco( String nombre, String FCaducidad, int NLote, String FEnvasado, String POrigen) {
        super(nombre, FCaducidad, NLote);
        this.FEnvasado = FEnvasado;
        this.POrigen = POrigen;
    }

    public String getFEnvasado() {
        return FEnvasado;
    }

    public String getPOrigen() {
        return POrigen;
    }

    public void setFEnvasado(String FEnvasado) {
        this.FEnvasado = FEnvasado;
    }

    public void setPOrigen(String POrigen) {
        this.POrigen = POrigen;
    }
    

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\n"
        +"Fecha de envasado: " + FEnvasado+ "\n"  
        +"Pais de origen: " + POrigen;
       
    }
    
    
}
