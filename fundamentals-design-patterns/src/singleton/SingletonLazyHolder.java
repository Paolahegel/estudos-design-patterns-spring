package singleton;

// instancia ao objeto em outra classe, modo thread safe
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}
