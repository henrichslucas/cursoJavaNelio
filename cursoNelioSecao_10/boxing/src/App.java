public class App {
    public static void main(String[] args) throws Exception {

        // boxing: converte um objeto tipo valor para um objeto tipo referencia
        // compativel

        int x = 20;

        Object obj = x;

        System.out.println(obj); // 20

        // unboxing: o processo reverso

        int y = 30;

        Object obj_2 = y;

        int z = (int) obj_2; // tem que ter o cast int para passar de object para int

        System.out.println(z);
    }
}
