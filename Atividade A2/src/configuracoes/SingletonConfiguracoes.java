package configuracoes;

import java.util.UUID;

public class SingletonConfiguracoes {
    // Atributo estático que armazenará a instância única do Singleton
    private static SingletonConfiguracoes instancia;
    
    // Objeto lock para garantir thread safety
    private static final Object lock = new Object();
    
    // A instância da classe ConfiguracoesGlobais
    private ConfiguracoesGlobais configuracoes;

    // Atributo UUID para identificar a instância
    private final UUID instanceId;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private SingletonConfiguracoes() {
        configuracoes = new ConfiguracoesGlobais(); // Criando a instância das configurações globais
        instanceId = UUID.randomUUID(); // Gerando um UUID único para esta instância
    }

    // Método para obter a instância única do Singleton
    public static SingletonConfiguracoes getInstance() {
        if (instancia == null) {
            synchronized (lock) {
                if (instancia == null) {
                    instancia = new SingletonConfiguracoes();
                }
            }
        }
        return instancia;
    }

    // Getter para as configurações globais
    public ConfiguracoesGlobais getConfiguracoes() {
        return configuracoes;
    }

    // Método para obter o UUID da instância
    public UUID getInstanceId() {
        return instanceId;
    }
}
