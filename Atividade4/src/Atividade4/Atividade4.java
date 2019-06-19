package Atividade4;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args){
        double nota[] = new double[4];
        double nota_final;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite a nota do primeiro bimestre.");
        nota[0] = read.nextDouble();
        System.out.println("Digite a nota do segundo bimestre.");
        nota[1] = read.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre.");
        nota[2] = read.nextDouble();
        System.out.println("Digite a nota do quarto bimestre.");
        nota[3] = read.nextDouble();
        
        nota_final = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;
        System.out.println("A nota final do aluno é... " + nota_final);
    }
}
