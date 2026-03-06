public class Universidad {
    String nombre;
    Estudiante estudiante;

    public Universidad() {
    }

    public Universidad(String nombre, Estudiante estudiante) {
        this.nombre = nombre;
        this.estudiante = estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", estudiante=" + estudiante +
                '}';
    }

    void mostrarInformacion(){
        System.out.println("Universidad: " + this.getNombre());
        System.out.println("Estudiante: " + this.estudiante.nombre);
        System.out.println("Carrera: " + this.estudiante.carrera);
    }
}
