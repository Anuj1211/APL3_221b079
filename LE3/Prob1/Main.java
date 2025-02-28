interface Obedient {
    void obey();
}

interface Cruel {
    void cruel();
}

public class Main {
    public static void main(String[] args) {
        
        Pandav arjun = new Pandav();
        Pandav bheem = new Pandav();
        Kaurav kaurav1 = new Kaurav();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun (Pandav): ");
        arjun.fight();
        arjun.obey();
        arjun.kind("Arjun");

        System.out.println("\nBheem (Pandav): ");
        bheem.fight();
        bheem.obey();
        bheem.kind("Bheem");

        System.out.println("\nKaurav: ");
        kaurav1.fight();
        kaurav1.cruel();
        kaurav1.disobey();
        kaurav1.kind();

        System.out.println("\nVikarn (Special Case): ");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}