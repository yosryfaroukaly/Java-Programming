package day63_functional_interface;

import java.util.function.Predicate;

public class UsePredicate {

    public static Predicate<String> isPalindrome = str -> {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    };

}
