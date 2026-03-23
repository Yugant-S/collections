// Android Compiler Implementation
class AndroidCompiler extends CrossCompiler {

    @Override
    void collectSource() {
        System.out.println("Collecting source code for Android...");
    }

    @Override
    void compileToTarget() {
        System.out.println("Compiling source code into Android executable (.apk)...");
    }

    @Override
    void writeToTarget() {
        System.out.println("Writing Android executable to target device...");
    }
}
