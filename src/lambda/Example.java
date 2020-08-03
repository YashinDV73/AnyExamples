package lambda;

import java.util.function.Function;

public class Example {

    Function<Person, Integer> f = Person::getAge;


}
