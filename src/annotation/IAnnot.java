package annotation;

import java.lang.reflect.Method;
import java.util.HashMap;

public interface IAnnot {

    HashMap<String, Method> methodList = new HashMap<>();


    @TestAnnot(key = "putString")
    String getString();

}
