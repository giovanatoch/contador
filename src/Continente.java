import java.util.ArrayList;
import java.util.List;
class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public int getTotalPaises() {
        return paises.size();
    }

    public int getTotalPopulacao() {
        int totalPopulacao = 0;
        for (Pais pais : paises) {
            totalPopulacao += pais.getPopulacao();
        }
        return totalPopulacao;
    }

    public double getDensidadePopulacional() {
        return (double) getTotalPopulacao() / getTotalDimensaoTerritorial();
    }

    public Pais getPaisMaiorPopulacao() {
        Pais maiorPopulacao = null;
        int maxPopulacao = Integer.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maxPopulacao) {
                maxPopulacao = pais.getPopulacao();
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }

    public Pais getPaisMenorPopulacao() {
        Pais menorPopulacao = null;
        int minPopulacao = Integer.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() < minPopulacao) {
                minPopulacao = pais.getPopulacao();
                menorPopulacao = pais;
            }
        }
        return menorPopulacao;
    }

    public Pais getPaisMaiorDimensaoTerritorial() {
        Pais maiorDimensao = null;
        double maxDimensao = Double.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensaoTerritorial() > maxDimensao) {
                maxDimensao = pais.getDimensaoTerritorial();
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }

    public Pais getPaisMenorDimensaoTerritorial() {
        Pais menorDimensao = null;
        double minDimensao = Double.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensaoTerritorial() < minDimensao) {
                minDimensao = pais.getDimensaoTerritorial();
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }

    public double getRazaoTerritorial() {
        Pais maiorDimensao = getPaisMaiorDimensaoTerritorial();
        Pais menorDimensao = getPaisMenorDimensaoTerritorial();
        return maiorDimensao.getDimensaoTerritorial() / menorDimensao.getDimensaoTerritorial();
    }

    private double getTotalDimensaoTerritorial() {
        double totalDimensao = 0;
        for (Pais pais : paises) {
            totalDimensao += pais.getDimensaoTerritorial();
        }
        return totalDimensao;
    }
}
