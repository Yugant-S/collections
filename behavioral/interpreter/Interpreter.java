class Interpreter {

    public static Expression getMaleExpression() {

        Expression bob = new TerminalExpression("Bob");
        Expression male = new TerminalExpression("male");

        return new AndExpression(bob, male);
    }

    public static Expression getMarriedWomanExpression() {

        Expression alice = new TerminalExpression("Alice");
        Expression married = new TerminalExpression("married");
        Expression woman = new TerminalExpression("woman");

        Expression marriedWoman =
                new AndExpression(married, woman);

        return new AndExpression(alice, marriedWoman);
    }
}
