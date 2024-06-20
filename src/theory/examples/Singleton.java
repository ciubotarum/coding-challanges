package theory.examples;
public class Singleton {
    // volatile - can be used only in field declarations (methods, classes can not be declared with this).
    //            the value of the variable is read and written from the main memory not local memory
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
