import java.util.ArrayList;

public class MainDuckSim {
    public static void main(String[] args) {
        ArrayList<Duck> kaczki = new ArrayList<>();
        kaczki.add(new MallardDuck(new FlyingWithWings(),new Quack()));
        kaczki.add(new RubberDuck(new FlyingNoWay(),new Squeak()));
        kaczki.add(new MallardDuck(new FlyingNoWay(),new MuteQuack()));

        for(Duck duck:kaczki){
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }
        kaczki.get(1).setFlyingBehavior(new FlyingBehavior(){

            @Override
            public void fly() {
                System.out.println("Duck is flying with a rocket!");
            }
        });
        kaczki.get(1).performFly();
    }
}
