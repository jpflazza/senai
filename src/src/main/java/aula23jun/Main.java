package aula23jun;

public class Main {
    public static void main(String[] args) {
        double media = 0.0;
        Aluno[] turma = new Aluno[5];

        Aluno aluno1 = new Aluno();
        aluno1.setAluno("João");
        aluno1.setNota(10.0);
        turma[0] = aluno1;

        Aluno aluno2 = new Aluno();
        aluno2.setAluno("Paulo");
        aluno2.setNota(10.0);
        turma[1] = aluno2;

        Aluno aluno3 = new Aluno();
        aluno3.setAluno("Eduardo");
        aluno3.setNota(8.5);
        turma[2] = aluno3;

        Aluno aluno4 = new Aluno();
        aluno4.setAluno("Fabio");
        aluno4.setNota(6.5);
        turma[3] = aluno4;

        Aluno aluno5 = new Aluno();
        aluno5.setAluno("Wesley");
        aluno5.setNota(0.5);
        turma[4] = aluno5;

        System.out.printf("A media da turma foi: " + media);
    }
        public double calcular(double media){
            for (int i = 0; i < 5; i++) {
                media += set;
            }
            media /= 2;
            return media;
        }
}
