package org.conley;

import static org.conley.SimpleRuleEngine.*;
import static org.conley.TimesCondition.times;

public class FizzBuzz {
    public static String count(int i){
        Rule fizzBuzzRule = atom(times(3).and(times(5)), n->"FizzBuzz|");
        Rule fizzRule = atom(times(3), n-> "Fizz|");
        Rule buzzRule = atom(times(5), n->"Buzz|");

        Rule compositeFizzBuzzRule = allOf(fizzRule, buzzRule);
        Rule defaultRule = atom(n->true,n->String.valueOf(n)+"|");
        Rule rule = allOf(compositeFizzBuzzRule, fizzRule, buzzRule, defaultRule);
        return rule.apply(i);






    }
}
