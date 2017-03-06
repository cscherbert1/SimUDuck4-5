package student.fixes1;

/**
 * The main difference with this 5th version is that the class
 * provides methods for setting fly and quack behaviors at runtime.
 * Otherwise, everything else is the same.
 * 
 * @author jlombardo
 *
 */
public interface Duck {
		
	public abstract void setFlyBehavior(FlyBehavior fb);
	
	public abstract void setQuackBehavior(QuackBehavior qb);
	
	public abstract void display();
	
	/*
	 * Rather than handling the quack behavior itself, the Duck object
	 * delegates that behavior to the object referenced by quackBehavior.
	 * This object is unknown -- that's DIP in action!
	 */
	public abstract void performQuack();
	
	public abstract void performFly();
	
	
	// OTHER DUCK-LIKE METHODS
}
