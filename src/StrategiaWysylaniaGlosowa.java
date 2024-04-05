class StrategiaWysylaniaGlosowa implements StrategiaWysylaniaReklamy {
    public void wyslijReklame(String reklama, String odbiorca) {
        System.out.println("Wysłano wiadomość głosową z reklamą \"" + reklama + "\" do: " + odbiorca);
    }
}