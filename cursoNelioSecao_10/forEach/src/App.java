public class App {
    public static void main(String[] args) throws Exception {
        // for each eh um laco de repeticao

        String[] vect = new String[] { "Maria", "Bob", "Alex" };

        for (int i = 0; i < vect.length; i++) { // iteracao normal com for
            System.out.println(vect[i]);
        }

        for (String name : vect) { // a mesma iteracao com for each
            System.out.println(name); // "name" eh um apelido e pode ser modificado
                                      // funciona de forma semelhante a um .map do javascript
        }

    }
}
