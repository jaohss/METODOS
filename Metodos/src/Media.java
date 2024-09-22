import java.util.Scanner;
public class Media {
    //Inicialização dos atributos
    int a;
    int b;
    int c;

    //Método construtor para inicializar os atributos
    public Media(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    /*Método para calcular a média aritmética de 3 número
     * Utilização do casting nos atributos que são int para double
    */

    public double calcularMedia(){
        return ((double)a+(double)b+(double)c)/3;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Instanciando o objeto da classe
        Media m1 = new Media(0, 0, 0);

        //Entrada de dados
        System.out.println("Digite o valor de A: ");
        m1.a = scn.nextInt();

        System.out.println("Digite o valor de A: ");
        m1.b = scn.nextInt();

        System.out.println("Digite o valor de A: ");
        m1.c = scn.nextInt();

        //Chamada do método que calcula a média aritmética
        System.out.println("média: "+m1.calcularMedia());
        
        scn.close();
    }
    
}
