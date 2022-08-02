public class App {
    public static void main(String[] args) throws Exception {

        // wrapper classes sao classes equivalentes aos tipos primitivos

        // int = Integer
        // char = Character
        // long = Long
        // double = Double
        // float = Float
        // short = Short
        // byte = Byte
        // boolean = Boolean

        // o Number serve para todos os tipos de numeros

        // as wrapper classes fazem com que os castings sejam desnecessarios durante
        // boxing / unboxing

        int x = 20;

        Object obj = x;

        // int y = obj; o compilador nao permite

        int y = (int) obj;

        Integer obj_2 = x; // adicionando a wrapper class Integer...

        int z = obj_2; // o compilador permite

        System.out.println(y);
        System.out.println(z);
    }
}
