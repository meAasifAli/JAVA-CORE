
public class Encapsulation {

    private String name;

    public Encapsulation() {
        this.name = "Aasif";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        System.out.println(obj.name);
    }
}

class Child extends Encapsulation {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        // System.out.println(obj.name); // as we can see we can't access name here directly
        obj.setName("Aasif");
        System.out.println(obj.getName());
    }
}
