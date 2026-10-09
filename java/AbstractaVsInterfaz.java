abstract class AnimalBase {
    public void dormir() {
        System.out.println("El animal está durmiendo");
    }

    public abstract void hacerSonido();
}

interface Nadador {
    void nadar();
}

class Pato extends AnimalBase implements Nadador {
    @Override
    public void hacerSonido() {
        System.out.println("El pato hace cuac");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando");
    }
}

public class AbstractaVsInterfaz {
    public static void main(String[] args) {
        Pato pato = new Pato();

        pato.dormir();
        pato.hacerSonido();
        pato.nadar();
    }
}
