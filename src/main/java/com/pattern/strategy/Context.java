package com.pattern.strategy;

public class Context {
    Stratety stra;

    public Context(Stratety stra) {
        this.stra = stra;
    }

    public void doMethod() {
        stra.method();
    }
}
