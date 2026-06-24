package aula10jun;

public class Pessoa {

    private String Nome;
    private int Idade;
    private float Altura;

    private double Salario;

    private boolean Estudante;

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public float getAltura() {
        return Altura;
    }

    public double getSalario() {
        return Salario;
    }

    public boolean isEstudante() {
        return Estudante;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void setEstudante(boolean Estudante) {
        this.Estudante = Estudante;
    }

}