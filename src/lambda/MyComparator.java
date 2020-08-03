package lambda;

import java.util.Comparator;

public class MyComparator {

    java.util.Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

}
