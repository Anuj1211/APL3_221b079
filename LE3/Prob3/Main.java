
public class Main {
    public static void main(String[] args) {

        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        ((RubberDuck) rubberDuck).squeak();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
       
        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        ((RedHeadDuck) redHeadDuck).fly();
        ((RedHeadDuck) redHeadDuck).quack();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        ((LakeDuck) lakeDuck).fly();
        ((LakeDuck) lakeDuck).quack();
    }
}
