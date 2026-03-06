public class Cuerpo {
    private String nombre;
    private Organo Organo;

    public Cuerpo() {
    }

    public Cuerpo(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Organo getOrgano() {
        return Organo;
    }

    public void setOrgano(Organo organo) {
        Organo = organo;
    }

    @Override
    public String toString() {
        return "Cuerpo{" +
                "nombre='" + nombre + '\'' +
                ", Organo=" + Organo +
                '}';
    }
    public void mostrarInformacion() {
        System.out.println("Cuerpo: " + this.getNombre());
        System.out.println("Organo: " + this.Organo.getNombre());
        System.out.println("Funcion: " + this.Organo.getFuncion());
    }
    public void crearOrgano(String nombre, String funcion) {
        this.Organo = new Organo(nombre, funcion);
    }


}
