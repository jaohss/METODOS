import java.util.Scanner;

public class Elevado {
    //Inicialização dos atributos
    int a;
    int b;

    public Elevado(int a, int b){
        //Método construtor para inicializar os atributos
        this.a=a;
        this.b=b;
    }

    /*Método que realiza o calculo do número A sendo elevado pelo número B, utilizando o casting nos números que são int para double */
    public double numeroElevado(){
        return Math.pow((double)a,(double)b);
    }

    public static void main(String[] args) {

        //Instanciando objetos
        Scanner scn = new Scanner(System.in);
        Elevado n1 = new Elevado(0, 0);

        //Entrada de dados
        System.out.println("Digite o valor de A: ");
        n1.a = scn.nextInt();

        System.out.println("Digite o valor de B: ");
        n1.b = scn.nextInt();

        //Chamada do método que realiza o calculos do número elevado
        System.out.println(n1.numeroElevado());

        scn.close();
    }
    
}
