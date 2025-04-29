
public class Producto {
    String nombre;
    String FCaducidad;
    int NLote;

    public Producto(String nombre, String FCaducidad, int NLote) {
        this.nombre = nombre;
        this.FCaducidad = FCaducidad;
        this.NLote = NLote;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFCaducidad() {
        return FCaducidad;
    }

    public int getNLote() {
        return NLote;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFCaducidad(String FCaducidad) {
        this.FCaducidad = FCaducidad;
    }

    public void setNLote(int NLote) {
        this.NLote = NLote;
    }
    

    public String mostrarInformacion() {
    return "Nombre: " + nombre + "\n"
         + "Fecha de caducidad: " + FCaducidad + "\n"
         + "Numero de Lote: " + NLote;
        
}

    
    
}
