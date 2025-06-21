public class App {
    public static void main(String[] args) throws Exception {
        Logger logger1 = Logger.getInstance();
        logger1.log("Log message-1.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Log message-2");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. It is Singleton");
        } else {
            System.out.println("The logger instances are different. It is not Singleton");
        }

    }
}
