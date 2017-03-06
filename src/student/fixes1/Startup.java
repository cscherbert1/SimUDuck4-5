package student.fixes1;

/**
 *
 * @author cscherbert1
 */
public class Startup {
    
    public static void main(String[] args) {
        Duck mallard = new MallardDuck(new FlyRocketPowered(), new Quack());
        
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println("Change in fly behavior...");
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();
        
        System.out.println("");
        System.out.println("New Duck:");
        Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak());
        
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        
        System.out.println("");
        System.out.println("New Duck:");
        Duck modelDuck = new ModelDuck(new FlyNoWay(), new MuteQuack());
        
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
    

}
