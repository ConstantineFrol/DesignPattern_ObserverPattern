public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change:\t15");
        subject.setState(15);
        System.out.println("Second state change:\t10");
        subject.setState(10);
    }
}