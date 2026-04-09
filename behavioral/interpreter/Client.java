public class InterpreterPatternDemo {

    public static void main(String[] args) {

        Context context1 =
                new Context("Bob is male");

        Context context2 =
                new Context("Alice is married woman");

        Expression maleRule =
                Interpreter.getMaleExpression();

        Expression marriedWomanRule =
                Interpreter.getMarriedWomanExpression();

        System.out.println("Bob is male → "
                + maleRule.interpret(context1));

        System.out.println("Alice is married woman → "
                + marriedWomanRule.interpret(context2));
    }
}
