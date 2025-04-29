
public class Congelado extends Producto {
    double tempCongelada;

    public Congelado( String nombre, String FCaducidad, int NLote, double tempCongelada) {
        super(nombre, FCaducidad, NLote);
        this.tempCongelada = tempCongelada;
    }
    
    

    public double getTempCongelada() {
        return tempCongelada;
    }

    public void setTempCongelada(double tempCongelada) {
        this.tempCongelada = tempCongelada;
    }
    

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\n"
          
        +"Temperatura recomendada para Congelar:  " +tempCongelada +"ºC";
        
    }
    
    
}
