import entities.Product;

public class App {
    public static void main(String[] args) {
        // a desalocacao por garbage collector desaloca o que nao estiver sendo
        // utilizado, liberando memoria

        Product p1 = new Product("peixe", 2);
        Product p2 = new Product("bolsa", 1);

        p1 = p2; // ao fazer isso, o objeto que foi criado para p2 perde sua referencia, sendo
                 // eliminado eventualmente
    }

    public static void method1() {
        // desalocacao por escopo desaloca todas as variaveis dentro quando o escopo sai
        // da execucao

        int x = 10;

        if (x > 0) {
            int y = 20; // y so existe dentro do if, ou seja, acabando o if, o y sera desalocado
        }
    }// o mesmo acontece no final do method1, onde todas as variaveis serao
     // desalocadas ao final da execucao

    public static void method2() {
        Product p3 = method3();

        System.out.println(p3.name); // vai retornar "sapato" normalmente pois o method3 retorna o ENDERECO do
                                     // objeto, logo, ele eh referenciado e pode ser acessado normalmente
    }

    public static Product method3() {

        Product p4 = new Product("sapato", 5);

        return p4;

    }

}
