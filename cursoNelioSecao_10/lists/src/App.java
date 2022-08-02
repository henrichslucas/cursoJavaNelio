import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        // list eh uma estrutura de dados
        // eh homogenea(dados do msm tipo)
        // ordenada(elementos acessados por posicoes)
        // inicia vazia, e os elementos sao inseridos por demanda
        // cada elemento ocupa um no(node) da lista
        // tipo List nao eh uma classe, e sim uma interface
        // pra instanciar lists, precisa-se de classes que as implementam
        // ex ArrayList, LinkedList

        List<String> list = new ArrayList<>(); // tem que usar as wrapper classes, tipos primitivos nao sao aceitos

        list.add("Maria"); // maria foi adicionada na posicao 0
        list.add(0, "Alex"); // ao adicionar alex na posicao 0 explicitamente, maria vai pra posicao 1

        list.add("Bob"); // removendo por posicao

        list.remove(2);
        list.removeIf(x -> x.charAt(0) == 'M'); // removendo com expressao lambda / predicado

        for (String x : list) {
            System.out.println(x);
        }

        // System.out.println("Index of Joao: " + list.indexOf("Joao")); // retorna -1
        // pois joao nao existe na lista

        // para filtrar a lista para mostrar apenas os nomes que comecam com 'A'

        // List<String> result = list.stream().filter(x -> x.charAt(0) ==
        // 'A').collect(Collectors.toList());
        // .stream(), para tornar o list compativel com operacoes lambda
        // .filter(), para filtrar com o lambda que checa se o nome comeca com 'A'
        // .collect(Collectors.toList()), para converter de volta para lista

        // for (String x : result) {
        // System.out.println(x);
        // }

    }
}
