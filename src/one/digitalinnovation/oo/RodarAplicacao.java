package one.digitalinnovation.oo;

/**
 * Classe de exemplo para o exercício da Aula 2 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {
        //ex obj vazio
        Carro carro1 = new Carro();//Estou criando o objeto carro1, da classe carro. Chamo o construtor mais simples, construtor default, sem parâmetros.
                                   // É o construtor que cria/instancia o obj e armazena/vincula a variável carro1
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));
        //ex obj com parâmetros
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
