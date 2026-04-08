// Main Class
public class TemplatePatternCrossCompilerDemo {

    public static void main(String[] args) {

        CrossCompiler androidCompiler = new AndroidCompiler();
        System.out.println("Android Compilation Process:");
        androidCompiler.crossCompile();

        System.out.println("\n---------------------------\n");

        CrossCompiler iphoneCompiler = new IPhoneCompiler();
        System.out.println("iPhone Compilation Process:");
        iphoneCompiler.crossCompile();
    }
}
