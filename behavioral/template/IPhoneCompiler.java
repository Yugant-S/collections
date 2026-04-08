// iPhone Compiler Implementation
class IPhoneCompiler extends CrossCompiler {

    @Override
    void collectSource() {
        System.out.println("Collecting source code for iPhone...");
    }

    @Override
    void compileToTarget() {
        System.out.println("Compiling source code into iPhone executable (.ipa)...");
    }

    @Override
    void writeToTarget() {
        System.out.println("Writing iPhone executable to target device...");
    }
}
