package src;


public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake();

        cake.addFilling(new Chocolate());
        cake.addFilling(new Cream());
        cake.addFilling(new Frosting());
        cake.addFilling(new Raisins());

        System.out.println(cake);
    }
}
