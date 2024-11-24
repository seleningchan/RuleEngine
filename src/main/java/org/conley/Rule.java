package org.conley;

@FunctionalInterface
public interface Rule {
    String apply(int n);
}
