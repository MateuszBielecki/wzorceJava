public interface PizzaDekorator extends Pizza {
    Pizza getPizzaStandardowa();

    @Override
    String getOpis();

    @Override
    double getCena();
}