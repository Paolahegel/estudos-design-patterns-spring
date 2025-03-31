package singleton;

// Singleton apressado, faz a instanciação direto para depois no já retornar
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
