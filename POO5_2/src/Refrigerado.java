
public class Refrigerado extends Producto {
    String CodOrganismo;

    public Refrigerado(String nombre, String FCaducidad, int NLote, String CodOrganismo) {
        super(nombre, FCaducidad, NLote);
        this.CodOrganismo = CodOrganismo;
    }

    public String getCodOrganismo() {
        return CodOrganismo;
    }

    public void setCodOrganismo(String CodOrganismo) {
        this.CodOrganismo = CodOrganismo;
    }
    

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\n"
        +"Codigo del organismo: "+ CodOrganismo;
    }
    
    
    
}
