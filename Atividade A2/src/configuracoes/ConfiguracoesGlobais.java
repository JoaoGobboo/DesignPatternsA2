package configuracoes;

public class ConfiguracoesGlobais {
    // Atributos que representam as configurações globais
    private String config1 = "Valor Padrão 1";
    private String config2 = "Valor Padrão 2";
    private String config3 = "Valor Padrão 3";

    // Métodos Getter e Setter para as configurações globais
    public String getConfig1() {
        return config1;
    }

    public void setConfig1(String config1) {
        this.config1 = config1;
    }

    public String getConfig2() {
        return config2;
    }

    public void setConfig2(String config2) {
        this.config2 = config2;
    }

    public String getConfig3() {
        return config3;
    }

    public void setConfig3(String config3) {
        this.config3 = config3;
    }

    // Método para exibir as configurações
    @Override
    public String toString() {
        return "Configurações Globais: " + config1 + ", " + config2 + ", " + config3;
    }
}
