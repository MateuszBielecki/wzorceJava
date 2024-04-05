class StrategiaWysylaniaSMS implements StrategiaWysylaniaReklamy {
    public void wyslijReklame(String reklama, String odbiorca) {
        System.out.println("Wysłano SMS z reklamą \"" + reklama + "\" do: " + odbiorca);
    }
}