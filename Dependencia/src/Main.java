//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("TITULO","CONTENIDO DE BUENA CALIDAD");
        Impresora impresora = new Impresora(true);
        impresora.imprimir(documento);

    }
}