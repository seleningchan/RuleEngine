package org.conley;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleRuleEngine {
    public static Rule atom(Condition conditon, Action action){
        return n -> conditon.evaluate(n) ? action.execute(n) : "";
    }

    public static Rule anyOf(Rule... rules){
        return n -> stringStream(n, rules).filter(s-> !s.isEmpty()).findFirst().get();
    }

    public static Rule allOf(Rule... rules){
        return n -> stringStream(n, rules).collect(Collectors.joining());
    }

    public static Stream<String> stringStream(int n, Rule[] rules){
        return Arrays.stream(rules).map(r -> r.apply(n));
    }
}
