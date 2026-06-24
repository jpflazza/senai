package aula10jun;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("João");
        pessoa.setIdade(25);
        pessoa.setAltura(1.75f);
        pessoa.setSalario(3000.50);
        pessoa.setEstudante(true);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Salário: " + pessoa.getSalario());
        System.out.println("Estudante: " + pessoa.isEstudante());
    }
}