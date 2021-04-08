package designpattern.creational;

import java.io.Serializable;

public class SingletonPattern implements Serializable {
    private static final long serialVersionUID = 1L;

    private SingletonPattern() {
        if (getInstance() != null) {
            throw new IllegalStateException("Cannot create second instance of this class");
        }
    }

    public static SingletonPattern getInstance() {
        return SingletonInner.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }

    private static class SingletonInner {
        private static final SingletonPattern INSTANCE = new SingletonPattern();
    }
}
