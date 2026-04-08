// Abstract class defining template method
abstract class CrossCompiler {

    // Template Method (final so structure cannot change)
    public final void crossCompile() {
        collectSource();
        compileToTarget();
        writeToTarget();
    }

    // Primitive methods
    abstract void collectSource();
    abstract void compileToTarget();
    abstract void writeToTarget();
}
