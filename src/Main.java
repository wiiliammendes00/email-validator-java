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

            int posicaoArroba = email.indexOf("@");

            String usuario = email.substring(0, posicaoArroba);

            String dominio = email.substring(posicaoArroba + 1);

            System.out.println("E-mail válido!");
            System.out.println("Usuário: " + usuario);
            System.out.println("Domínio: " + dominio);
        }
    }
}