import java.util.Scanner;

public class NegativoPositivo{
    int num;

    //Método construtor para inicializar os atributos
    public NegativoPositivo(int num){
        this.num=num;
    }

    //Método String para verificar se o número digitado é positivo ou negativo
    public String positivoNegativo(){
        if(num<0){
            return "Negativo";
        }
        else{
            return "Positivo";
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Instanciando o objeto do numero
        NegativoPositivo num = new NegativoPositivo(0);

        //Entrada de dados
        System.out.println("Digite um número: ");
        num.num = scn.nextInt();

        //Chamada do método de verificação do número
        System.out.println(num.positivoNegativo());

        scn.close();

    }
}


