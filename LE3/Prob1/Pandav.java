class Pandav extends Bharatvanshi implements Obedient {

    @Override
    public void obey() {
        System.out.println("Obedient.");
    }

    void kind(String name) {
        if (name.equals("Arjun")) {
            System.out.println("Kind.");
        } else if (name.equals("Bheem")) {
            System.out.println("Less kind than Arjun.");
        }
    }
}