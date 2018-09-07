package com.github.oxo42.stateless4j.triggers;
import com.github.oxo42.stateless4j.OutVar;
import com.github.oxo42.stateless4j.delegates.Func2;
import com.github.oxo42.stateless4j.delegates.FuncBoolean;

public class DynamicTriggerBehaviour<TState extends java.lang.Object, TTrigger extends java.lang.Object> extends TriggerBehaviour<TState, TTrigger> {
  private final Func2<Object[], TState> destination;

  public DynamicTriggerBehaviour(final TTrigger trigger, final Func2<Object[], TState> destination, final FuncBoolean guard) {
    super(trigger, guard);
    assert destination != null : "destination is null";
    this.destination = destination;
  }

  public boolean resultsInTransitionFrom(TState source, Object[] args, OutVar<TState> dest) {
    dest.set(destination.call(args));
    return true;
  }
}