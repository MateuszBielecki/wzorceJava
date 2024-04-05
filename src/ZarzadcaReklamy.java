public class ZarzadcaReklamy {
    private StrategiaTlumaczeniaReklamy strategiaTlumaczenia;

    public ZarzadcaReklamy(StrategiaTlumaczeniaReklamy strategiaTlumaczenia) {
        this.strategiaTlumaczenia = strategiaTlumaczenia;
    }

    public void wyslijReklame(String reklama, String preferowanyJezyk, double kwotaZaplacona, String odbiorca) {
        String przetlumaczonaReklama = strategiaTlumaczenia.tlumaczReklame(reklama, preferowanyJezyk);

        StrategiaWysylaniaReklamy strategiaWysylania;

        if (kwotaZaplacona >= 1000) {
            strategiaWysylania = new StrategiaWysylaniaGlosowa();
        } else if (kwotaZaplacona >= 500) {
            strategiaWysylania = new StrategiaWysylaniaSMS();
        } else {
            strategiaWysylania = new StrategiaWysylaniaEmail();
        }

        strategiaWysylania.wyslijReklame(przetlumaczonaReklama, odbiorca);
    }
}
