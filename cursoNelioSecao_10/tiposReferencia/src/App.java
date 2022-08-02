import entities.Product;

public class App {
    public static void main(String[] args) {

        // CLASSES SÃO TIPO REFERÊNCIA

        // Product p1 = new Product("Chiclete", 22);
        // Product p2 = new Product("Chiclete", 22);

        // p2 = p1; // igualando os endereços de memória

        // p2 = null; // não aponta para ninguém

        // System.out.println(p2 == p1); // falso pois tem os mesmos valores, porem com
        // diferentes endereços de memória
        // || ponteiros diferentes

        // TIPOS PRIMITIVOS SÃO TIPO VALOR

        // double x, y; // double é um tipo primitivo, como int, long, char, boolean...

        // x = 10;

        // y = x;

        // System.out.println(x == y); // verdadeiro pois têm exatamente o mesmo VALOR,
        // diferente da referência que
        // APONTA pra algo

        // VALORES PADRAO

        // quando usamos o new para instanciar algo, são atribuidos valores padrão aos
        // elementos

        Product p3 = new Product();

        System.out.println(p3.name); // valor padrao de strings == null
        System.out.println(p3.qtd); // valor padrao de int == 0
    }
}
