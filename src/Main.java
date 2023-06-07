package src;


public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake();

        cake.addFilling(new Chocolate());
        cake.addFilling(new Frosting());

        System.out.println(cake);

        Cake cake2 = new Cake();

        cake2.addFilling(new Cream());
        cake2.addFilling(new Raisins());

        System.out.println(cake2);
    }
}
