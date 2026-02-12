package estudo.dev.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //* operadores basicos no + - * /

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // resto %
        // operadores logicos: < > <= >= == != esses valores irão retornar valores booleanos


        int resto = 21 % 7;

        boolean isDezMaiorQuevinte = 10 > 20;
        boolean isDezMenorQuevinte = 10 < 20;
        boolean isDezMenorIgualQuevinte = 10 <= 20;
        boolean isDezMaiorIgualQuevinte = 10 >= 20;
        boolean isDezIgualQuevinte = 10 == 20;
        boolean isDezDiferenteQuevinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte" + isDezMaiorQuevinte);
        System.out.println("isDezMenorQueVinte" + isDezMenorQuevinte);
        System.out.println("isDezMenorIgualQueVinte" + isDezMenorQuevinte);
        System.out.println("isDezMenorIgualQuevinte" + isDezMenorIgualQuevinte);
        System.out.println("isDezMaiorIgualQuevinte" + isDezMaiorIgualQuevinte);
        System.out.println("isDezMenorigualQueVinte" + isDezIgualQuevinte);
        System.out.println("isDezDiferenteQuevinte" + isDezDiferenteQuevinte);
        System.out.println(resto);
        System.out.println();


        // outros operadore logicos && (AND) || (or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario <= 3500;

        System.out.println("isDentroDaLeuMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        //operadores aritiméticos: += -= %= /=



    }
}
