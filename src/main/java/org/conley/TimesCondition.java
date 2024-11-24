package org.conley;

public class TimesCondition {
    public static Condition times(int i){
        return n -> n % i == 0;
    }
}
