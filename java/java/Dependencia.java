class Documento {
    public void mostrarContenido() {
        System.out.println("Este es el contenido del documento");
    }
}

class Impresora {
    public void imprimir(Documento documento) {
        System.out.println("Imprimiendo documento:");
        documento.mostrarContenido();
    }
}

public class Dependencia {
    public static void main(String[] args) {
        Documento miDocumento = new Documento();
        Impresora miImpresora = new Impresora();

        miImpresora.imprimir(miDocumento);
    }
}
