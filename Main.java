public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Yamaha", "YZF-R1", 2021, true);

        System.out.println("Informações do Carro:");
        carro.exibirInformacao();
        carro.abrirPortaMalas();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacao();
        moto.empinar();
    }
}