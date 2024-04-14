class Pais {
    private String nome;
    private double dimensaoTerritorial;
    private int populacao;

    public Pais(String nome, double dimensaoTerritorial, int populacao) {
        this.nome = nome;
        this.dimensaoTerritorial = dimensaoTerritorial;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public double getDimensaoTerritorial() {
        return dimensaoTerritorial;
    }

    public int getPopulacao() {
        return populacao;
    }
}