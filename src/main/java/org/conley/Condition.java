package org.conley;

import java.util.Objects;

@FunctionalInterface
public interface Condition {
    boolean evaluate(int n);

    default Condition and(Condition other){
        Objects.requireNonNull(other);
        return (n)->{
            return this.evaluate(n) && other.evaluate(n);
        };
    }

    default Condition or (Condition other){
        Objects.requireNonNull(other);
        return (n) -> {
            return this.evaluate(n) || other.evaluate(n);
        };
    }



















}
