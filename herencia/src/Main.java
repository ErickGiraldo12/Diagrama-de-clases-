//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("rockie", "blanco", "shitzu");
        //metodos heredados del padre
        perro.comer();
        perro.dormir();
        //metodo propio del hijo
        perro.ladrar();
        perro.mostrarInformacion();

    }


}