//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("ercik", "ingenieria de sistemas");
        Universidad universidad = new Universidad("Universidad de Cundinamarca",e1);
        universidad.mostrarInformacion();

    }
}