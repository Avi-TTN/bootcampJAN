package BasicMultithreading2;

public class Resource {
    String name;
    Resource(String name){
        this.name = name;
    }
    void take() {
        System.out.println("Resource locked");
    }

    @Override
    public String toString() {
        return name;
    }
}
