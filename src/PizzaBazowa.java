public class PizzaBazowa implements Pizza {
    @Override
    public String getOpis() {
        return "Pizza Bazowa (sos pomidorowy, mozzarella)";
    }

    @Override
    public double getCena() {
        return 30.0;
    }
}