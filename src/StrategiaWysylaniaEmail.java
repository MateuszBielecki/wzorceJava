class StrategiaWysylaniaEmail implements StrategiaWysylaniaReklamy {
    public void wyslijReklame(String reklama, String odbiorca) {
        System.out.println("Wysłano e-mail z reklamą \"" + reklama + "\" do: " + odbiorca);
    }
}