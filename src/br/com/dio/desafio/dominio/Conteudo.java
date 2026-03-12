package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    // Constante que será usada pelas filhas
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // Método abstrato: cada filha (Curso/Mentoria) implementará sua regra de cálculo
    public abstract double calcularXp();

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}