class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(float pressure) {
        System.out.println("Użytkownik " + name + ": " + pressure);
    }
}