import configuracoes.SingletonConfiguracoes;

public class App {
    public static void main(String[] args) throws Exception {
        // Acessando a instância única do Singleton
        SingletonConfiguracoes singleton1 = SingletonConfiguracoes.getInstance();
        System.out.println("UUID de singleton1: " + singleton1.getInstanceId());
        System.out.println(singleton1.getConfiguracoes());

        // Acessando novamente a instância do Singleton (deve ser a mesma)
        SingletonConfiguracoes singleton2 = SingletonConfiguracoes.getInstance();
        System.out.println("UUID de singleton2: " + singleton2.getInstanceId());  // Será o mesmo UUID
        System.out.println(singleton2.getConfiguracoes());  // Será a mesma instância

        // Modificando uma configuração global
        singleton1.getConfiguracoes().setConfig1("Novo Valor");

        // A modificação será refletida em singleton2, pois ambos apontam para a mesma instância
        System.out.println("UUID de singleton2 após modificação: " + singleton2.getInstanceId());
        System.out.println(singleton2.getConfiguracoes());
    }
}
