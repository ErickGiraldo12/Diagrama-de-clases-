public class Carro implements Conducible {
    private String marca;
    private boolean estaEncendido;

    public Carro() {
    }

    public Carro(String marca, boolean estaEncendido) {
        this.marca = marca;
        this.estaEncendido = estaEncendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", estaEncendido=" + estaEncendido +
                '}';
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Encendido: " + this.isEstaEncendido());
    }
    public void arrancar() {
        this.estaEncendido = true;
        System.out.println(this.marca + "ha arrancado");
    }
    public void frenar() {
        System.out.println(this.marca + "ha frenado");
    }
    public void acelerar() {
        System.out.println(this.marca + "esta acelerando");
    }
}
