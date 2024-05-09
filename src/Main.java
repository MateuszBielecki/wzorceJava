public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PizzaBazowa();
        pizza = new Oliwki(pizza);
        pizza = new Pieczarki(pizza);
        pizza = new BezMozzarelli(pizza);

        System.out.println("Zamówiona pizza: " + pizza.getOpis());
        System.out.println("Cena: " + pizza.getCena());
    }
}