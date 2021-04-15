package ge.jibo.aspectj;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.print("Message from App object...");
    }

    public void print(String value) {
        System.out.println(value);
    }
}
