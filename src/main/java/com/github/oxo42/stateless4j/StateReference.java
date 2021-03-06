package com.github.oxo42.stateless4j;

public class StateReference<TState, TTrigger> {
    private TState state;

    public TState getState() {
        return state;
    }

    public void setState(TState value) {
        state = value;
    }
}
