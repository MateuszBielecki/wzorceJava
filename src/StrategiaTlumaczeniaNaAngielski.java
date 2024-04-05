class StrategiaTlumaczeniaNaAngielski implements StrategiaTlumaczeniaReklamy {
    public String tlumaczReklame(String reklama, String preferowanyJezyk) {
        return "Reklama po angielsku: " + reklama;
    }
}