import java.util.Scanner;
public class Maior {
    //Inicialização dos atributos
    int a;
    int b;
    int c;
    int maior=0;


    //Método construtor para inicializar os atributos
    public Maior(int a, int b, int c, int maior){
        this.a=a;
        this.b=b;
        this.c=c;
        this.maior=maior;
    }

    //Método que verifica qual o maior número entre os 3 números digitados
    public int maiorNumero(){
        
        if(a>b && a>c){
            maior=a;
        }
        else if(b>a && b>c){
            maior=b;
        }
        else{
            maior=c;
        }
        return maior;
    }

    //Método string que retorna qual o maior número
    public String descricao(){
        return "Maior: "+maiorNumero();
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Instanciando o objeto
        Maior num = new Maior(0, 0, 0, 0);


        //Entrada de dados
        System.out.println("Digite o valor de A: ");
        num.a = scn.nextInt();

        System.out.println("Digite o valor de A: ");
        num.b = scn.nextInt();

        System.out.println("Digite o valor de A: ");
        num.c = scn.nextInt();

        //Chamada do método String descricao() que retorna qual o maior número
        System.out.println(num.descricao());
        
        scn.close();
    }
    
}
