public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes
        Continente america = new Continente("América");

        america.adicionarPais(new Pais("Brasil", 8515767, 213993437));
        america.adicionarPais(new Pais("Argentina", 2780400, 45195774));
        america.adicionarPais(new Pais("Canadá", 9984670, 37742154));

        System.out.println("Total de países: " + america.getTotalPaises());
        System.out.println("População total: " + america.getTotalPopulacao());
        System.out.println("Densidade populacional: " + america.getDensidadePopulacional());
        System.out.println("País com maior população: " + america.getPaisMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + america.getPaisMenorPopulacao().getNome());
        System.out.println("País de maior dimensão territorial: " + america.getPaisMaiorDimensaoTerritorial().getNome());
        System.out.println("País de menor dimensão territorial: " + america.getPaisMenorDimensaoTerritorial().getNome());
        System.out.println("Razão territorial: " + america.getRazaoTerritorial());
    }
}
