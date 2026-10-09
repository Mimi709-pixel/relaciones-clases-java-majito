interface Pagable {
    void pagar(double cantidad);
}

class PagoTarjeta implements Pagable {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pago con tarjeta: $" + cantidad);
    }
}

public class EjemploInterfaz {
    public static void main(String[] args) {
        Pagable pago = new PagoTarjeta();
        pago.pagar(50000);
    }
}
