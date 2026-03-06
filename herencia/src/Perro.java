public class Perro extends Animal {
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String color, String raza) {
        super(nombre, color);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
    public void ladrar() {
        System.out.println(this.getNombre() + "esta ladrando ");
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Color: " + this.getColor());
        System.out.println("Raza: " + this.getRaza());
    }


}


