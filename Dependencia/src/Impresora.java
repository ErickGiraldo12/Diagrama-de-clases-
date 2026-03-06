public class Impresora {
    private  boolean estaEncendida;

    public Impresora() {
    }

    public Impresora(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }

    public boolean isEstaEncendida() {
        return estaEncendida;
    }

    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "estaEncendida=" + estaEncendida +
                '}';
    }
    public void imprimir(Documento doc){
        if(estaEncendida){
            System.out.println("Imprimiendo doc "+ doc.getTitulo());
            System.out.println(doc.getContenido());

        }else{
            System.out.println("impresora apagada");
        }

    }
}
