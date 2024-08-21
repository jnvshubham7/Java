class animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class dog extends animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class poppy extends dog {
}

public class Main {
    public static void main(String[] args) {
        animal a = new animal();
        a.sound();

        dog d = new dog();
        d.sound();

        poppy p = new poppy();
        p.sound();
    }
}
