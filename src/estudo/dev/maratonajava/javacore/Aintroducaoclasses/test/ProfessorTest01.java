package estudo.dev.maratonajava.javacore.Aintroducaoclasses.test;

import estudo.dev.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "marcelo";
        professor.idade = 30;
        professor.sexo = 'm';


        System.out.println("nome: " + professor.nome + "    idade:  " + professor.idade + "  sexo: " + professor.sexo);
    }
}
