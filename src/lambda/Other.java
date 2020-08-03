package lambda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class Other {

    private static HashMap<String,Integer> hashMap = new HashMap<>();

    static {
        hashMap.put("1", 1);
        hashMap.put("2", 2);
        hashMap.put("3", 4);
        hashMap.put("4", 8);
        hashMap.put("5", 16);
        hashMap.put("6", 32);
        hashMap.put("7", 64);
    }
    /**
     * 1=1, 2=2, 3=4,4=8,5=16,6=32,7=64
     * @param arg
     */
    public static void main(String[] arg){
        String[] strings = new String[]{"7"};
        //String[] strings = new String[]{"1","3","5"};
        //String[] strings = new String[]{"1","4","16"};

        //getBitArray(strings).stream().reduce((integer, integer2) -> integer | integer2).ifPresent(System.out::println);

        //long l = 64;
        //System.out.println(++l);

//        Object o = null;
//        Boolean b = false;
//        if (b) o = b;
//
//        boolean bb = Optional.ofNullable(o).map(String::valueOf)
//
//        if ((boolean) o) {
//            System.out.println(o);
//        }

//        Optional<Boolean> booleanOptional
//                = Optional.of(false);
//
//        booleanOptional.ifPresent(System.out::println);


        System.out.println(0 & 2);

        double d = 30490.0 - (30490.0 / ((20.0+100.0)/100.0));
        System.out.println(d);

        double d1 = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(d1);

        System.out.println(new StringBuffer().append("1117219732046172710=240152100000000°7100000°1°21617271°752052111214".substring(4,18)).delete(2,7).toString());

    }
    // i*((-1)^(i+1))
    private static ArrayList<Integer> getBitArray(String[] strings) {
        return Arrays.stream(strings).map(s -> hashMap.get(s)).collect(Collectors.toCollection(ArrayList::new));
    }

}
