public abstract class AbsTest implements Testable {
    @Override
    public void display() {
        System.out.println("This is the display method in the abstract class.");
    }
}

public class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method in ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display(); 
    }
}
