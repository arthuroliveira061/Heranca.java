public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo o porta-malas do carro.");
    }

    @Override
    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("Número de portas: " + portas);
    }
}