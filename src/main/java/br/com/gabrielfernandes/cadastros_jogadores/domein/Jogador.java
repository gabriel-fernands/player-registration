package br.com.gabrielfernandes.cadastros_jogadores.domein;

public record Jogador(
        String nome,
        String email,
        String telefone,
        String codinome,
        GrupoCodinome grupoCodinome
) {
}
