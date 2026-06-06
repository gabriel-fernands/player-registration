package br.com.gabrielfernandes.cadastros_jogadores.domein;

public enum Codinome {

    VINGADORES("Vingadores","https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/liga_da_justica.xml"),
    LIGA_DA_JUSTICA("Liga da Justica","https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/vingadores.json");

    Codinome(String nome, String uri) {
        this.nome = nome;
        this.uri = uri;
    }

    private final String nome;
    private final String uri;

    public String getNome() {
        return nome;
    }

    public String getUri() {
        return uri;
    }
}
