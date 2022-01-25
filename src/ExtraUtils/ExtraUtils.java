package ExtraUtils;

public class ExtraUtils {

    public static class Print {

        public static boolean newLine = true;
        public static String delimiter = " ";

        public static Print $(Object ... inputs){
            String output = "";

            for(Object input: inputs)
                output += input + delimiter;

            output += newLine? "\n" : "";

            System.out.print(output);
            return new Print();
        }
    }

    public static class MathConstants {

        public static final double π = Math.PI;
        public static final double e = Math.E;
        public static final double φ = 1.61803398874989;

    }
}
