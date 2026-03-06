//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("erick", 25);
        Mascota mascota = new Mascota("perla", "Perro", persona);

        mascota.asignarDueno(persona);

        mascota.mostrarInfo();

    }
}