package singleton;

// Singleton preguiçoso, faz a verificação se for nula, caso não gera a instaciação, caso não retorna ela mesma

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstance() {
        if (instance == null) {
           instance = new SingletonLazy();
        }
        return instance;
    }
}
