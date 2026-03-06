//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota",true);

        carro.arrancar();
        carro.acelerar();
        carro.frenar();
        carro.mostrarInformacion();

    }
}