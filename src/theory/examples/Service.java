package theory.examples;

// Example of constructor injection

public class Service {
    private final Repository repository;

    // Dependencies are provided through the constructor
    public Service(Repository repository) {
        this.repository = repository;
    }

    public void doSomething() {
        repository.doSomething();
    }
}

class Repository {
    public void doSomething() {
        System.out.println("Repository doing something");
    }
}

// Main class or framework manages the injection
class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Service service = new Service(repository); // Injecting dependency
        service.doSomething();
    }
}
