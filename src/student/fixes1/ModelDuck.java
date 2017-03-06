package student.fixes1;

public class ModelDuck implements Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        // these properties are inherited from Duck
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public final void display() {
        System.out.println("I'm a model duck");
    }

    @Override
    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public final void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public final void performFly() {
       flyBehavior.fly();
    }
    

}
