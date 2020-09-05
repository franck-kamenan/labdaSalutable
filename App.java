package be.intecbrussel.lambda.demo1;

public class App
{
    public static void main(String[] args)
    {
        Greetable implObject = new Greetable() {
            @Override
            public void greet() {
                System.out.println("This is quite cumbersome!");
            }
        };

        implObject.greet();
        implObject.defaultAllowed();
        Greetable.staticAllowed();

        implObject = new Greetable() {
            @Override
            public void greet() {
                System.out.println("We made a new implementation.");
            }
        };

        implObject.greet();

        Greetable lambdaObject = () -> System.out.println("Js makes me want to flip the table and say" +
                "Screw 'this', but I can never be sure what 'this' refers to");

        lambdaObject.greet();

        Salutable lambdaSalutable = () -> System.out.println("Salut.");
        lambdaSalutable.salut();
    }
}
