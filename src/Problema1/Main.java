package Problema1;

public class Main {
    public static void main(String[] args) {
        Lion leu = new Lion();
        Tiger tigru = new Tiger();
        Panther pantera = new Panther();

        System.out.println("      Leul");
        leu.eat();
        leu.sound();
        System.out.println("      Tigrul");
        leu.eat();
        leu.sound();
        System.out.println("      Pantera");
        leu.eat();
        leu.sound();
    }
}