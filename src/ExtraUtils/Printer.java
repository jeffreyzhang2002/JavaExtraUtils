package ExtraUtils;

import java.io.PrintStream;
import java.util.Arrays;

public class Printer {

    public static class Print {

        public static PrintStream output = System.out;
        public static String delimiter = " ";

        public static Print $(Object ... inputs){
            String printVal = "";

            try {
                for(Object input: inputs)
                    printVal += (input.getClass().isArray()? Arrays.toString((Object[]) input) : input) + delimiter;
            } catch (ClassCastException e) {
                e.printStackTrace();
                $("This error may occur if you pass in an array of primitive types as a parmeter. If this is the case" +
                        " you can fix this issue by converting int[] to Integer[] etc");
            }
            output.println(printVal);
            return new Print();
        }

        public static Print $(byte[] inputs){
            output.println(Arrays.toString(inputs));
            return new Print();
        }

        public static Print $(short[] inputs){
            output.println(Arrays.toString(inputs));
            return new Print();
        }

        public static Print $(int[] inputs){
            output.println(Arrays.toString(inputs));
            return new Print();
        }

        public static Print $(long[] inputs){
            output.println(Arrays.toString(inputs));
            return new Print();
        }

        public static Print $(float[] inputs){
            output.println(Arrays.toString(inputs));
            return new Print();
        }

        public static Print $(double[] inputs){
            output.println(Arrays.toString(inputs));
            return new Print();
        }

        public static Print $(char[] inputs){
            output.println(Arrays.toString(inputs));
            return new Print();
        }

        public static Print $(boolean[] inputs){
            output.println(Arrays.toString(inputs));
            return new Print();
        }

        public static Print _$(Object ... inputs){
            String printVal = "";

            try {
                for(Object input: inputs)
                    printVal += (input.getClass().isArray()? Arrays.toString((Object[]) input) : input) + delimiter;
            } catch (ClassCastException e) {
                e.printStackTrace();
                $("This error may occur if you pass in an array of primitive types as a parmeter. If this is the case" +
                        " you can fix this issue by converting int[] to Integer[] etc");
            }
            output.print(printVal);
            return new Print();
        }

        public static Print _$(byte[] inputs){
            output.print(Arrays.toString(inputs));
            return new Print();
        }

        public static Print _$(short[] inputs){
            output.print(Arrays.toString(inputs));
            return new Print();
        }

        public static Print _$(int[] inputs){
            output.print(Arrays.toString(inputs));
            return new Print();
        }

        public static Print _$(long[] inputs){
            output.print(Arrays.toString(inputs));
            return new Print();
        }

        public static Print _$(float[] inputs){
            output.print(Arrays.toString(inputs));
            return new Print();
        }

        public static Print _$(double[] inputs){
            output.print(Arrays.toString(inputs));
            return new Print();
        }

        public static Print _$(char[] inputs){
            output.print(Arrays.toString(inputs));
            return new Print();
        }

        public static Print _$(boolean[] inputs){
            output.print(Arrays.toString(inputs));
            return new Print();
        }

    }
}
