public class Main {

    public static void main(String[] args) {

        String email = "wiiliammendes00@gmail.com";

        System.out.println("E-mail informado: " + email);

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        if (email.isBlank()) {

            System.out.println("E-mail inválido!");

        } else if (!email.matches(regex)) {

            System.out.println("Formato de e-mail inválido!");

        } else {

            int posicaoArroba = email.indexOf("@");

            String usuario = email.substring(0, posicaoArroba);

            String dominio = email.substring(posicaoArroba + 1);

            StringBuilder relatorio = new StringBuilder();

            relatorio.append("E-mail válido!\n");
            relatorio.append("Usuário: ").append(usuario).append("\n");
            relatorio.append("Domínio: ").append(dominio);

            System.out.println(relatorio);
        }
    }
}