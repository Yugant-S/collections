class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(Context context) {
        return context.getInput().contains(data);
    }
}
