class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    public void moverCola() {
        System.out.println("El perro mueve la cola");
    }
}

public class Herencia {
    public static void main(String[] args) {
        Perro miPerro = new Perro();

        miPerro.hacerSonido();
        miPerro.moverCola();
    }
}
