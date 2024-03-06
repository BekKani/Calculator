public class WeightCalculatorOnTheMars {
        /* Variables declaration */
        private static float earthWeightBeksultanova;
        private static float gravityMars = 0.38f;

        public static void main(String[] args) {
            /* calculating weight on the Mars */
            earthWeightBeksultanova= 56.69f;
            System.out.println("Earth weight  Beksultanova: " +  earthWeightBeksultanova);

            double marsWeightDouble =  earthWeightBeksultanova * gravityMars;
            System.out.println("Mars weight (double): " + String.format("%.4f", marsWeightDouble));

            /* converting double to int */
            int marsWeightInt = (int) marsWeightDouble;
            System.out.println("Mars weight (int): " + marsWeightInt);

             /*converting int to char*/
            char marsWeightChar = (char) marsWeightInt;
            System.out.println("Mars weight (char): " + marsWeightChar);


            /* performing some math operation */
            int modifiedMarsWeightInt = marsWeightChar + 70;
            System.out.println("Modified Mars weight (int): " + modifiedMarsWeightInt);
        }
    }



