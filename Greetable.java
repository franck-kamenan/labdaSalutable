package be.intecbrussel.lambda.demo1;

@FunctionalInterface
public interface Greetable
{
    public abstract void greet();

    default void defaultAllowed()
    {
        System.out.println("No rest for the wicked!");
    }

    static void staticAllowed()
    {
        System.out.println("This is also ok.");
    }
}
