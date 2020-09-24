package regex;

public class RegEx {

    private static final String matcherAnyOneDigital = "\\d+";
    private static final String matcherAnyEmptyDigital = "\\d?";
    private static final String matcherFourDigital = "\\d{4}";

    public static void main(String[] args) {

        testDigitals(matcherAnyOneDigital);

        testDigitals(matcherAnyEmptyDigital);

        testDigitals(matcherFourDigital);


    }

    private static void testDigitals(String matcher){
        String simple1 = "159545";
        String simple2 = "15e9545";
        String simple3 = "15954.5";
        String simple4 = "4423";
        String simple5 = "";

        System.out.println(simple1.matches(matcher));
        System.out.println(simple2.matches(matcher));
        System.out.println(simple3.matches(matcher));
        System.out.println(simple4.matches(matcher));
        System.out.println(simple5.matches(matcher));
        System.out.println("\r");

    }

}
