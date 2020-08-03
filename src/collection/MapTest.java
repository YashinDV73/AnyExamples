package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    private static final Map<String,String> STRING_STRING_MAP = new HashMap<>(2);

    public static void main(String[] args) {
        STRING_STRING_MAP.put("k1" , "v1");
        STRING_STRING_MAP.put("k2" , "v2");
        STRING_STRING_MAP.put("k3" , "v2");

        System.out.println(STRING_STRING_MAP);
    }

}
