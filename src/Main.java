public class Main {

    public static void main(String[] args) {

        String email = "wiiliammendes00@gmail.com";

        System.out.println("E-mail informado: " + email);

        if (email.isBlank()) {
            System.out.println("E-mail inválido!");
        } else if (!email.contains("@")) {
            System.out.println("E-mail precisa conter @");
        } else if (!email.contains(".com")) {
            System.out.println("E-mail precisa conter .com");
        } else {
            System.out.println("E-mail válido!");
        }
    }
}