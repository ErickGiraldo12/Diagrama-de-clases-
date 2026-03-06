public class Mascota {
    String nombre;
    String especie;
    Persona dueno;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, Persona dueno) {
        this.nombre = nombre;
        this.especie = especie;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", dueno=" + dueno +
                '}';
    }

    void asignarDueno(Persona dueno){
        this.dueno = dueno;
    }

    void mostrarInfo(){
        System.out.println("Mascota: " + this.getNombre());
        System.out.println("Especie: " + this.getEspecie());
        System.out.println("Duenio: " + this.dueno.getNombre());
        System.out.println("Edad del duenio: " + this.dueno.edad);
    }


}
