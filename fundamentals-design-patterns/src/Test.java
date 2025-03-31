import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;
public class Test {
    public static void main(String[] args) {

        System.out.println("Example Singleton");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        System.out.println();

        System.out.println("Example Strategy");
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        ContextoComportamental contexto = new ContextoComportamental();
        contexto.setComportamento(normal);
        contexto.mover();
        contexto.setComportamento(defensivo);
        contexto.mover();
        contexto.setComportamento(agressivo);
        contexto.mover();
        System.out.println();

        System.out.println("Example Facade");
        Facade facade = new Facade();
        facade.migrarCliente("Paola", "123456");
    }
}
