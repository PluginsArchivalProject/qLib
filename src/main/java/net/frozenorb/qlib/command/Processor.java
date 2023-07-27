package net.frozenorb.qlib.command;

@FunctionalInterface
public interface Processor<T, R> {

    R process(T var1);

}

