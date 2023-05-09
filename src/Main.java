import Entidades.Produtos;

public class Main {
    public static void main(String[] args) {
        Produtos tvs = new Produtos("TV", 1300, 12);
        System.out.printf("%s%n", tvs);
        tvs.setQuantidade(20);
        System.out.printf("%s%n", tvs);
        tvs.setQuantidade(3);
        System.out.printf("%s%n", tvs);
    }
}