import java.util.Scanner;
public class Fatorial {
    //Inicialização dos atributos
    int num;
    int fat=1;

    //Método construtor para inicializar os atributos
    public Fatorial(int num){
        this.num=num;
    }
    //Método para calcular o fatorial do número digitado
    public int calculoFatorial(){
        for(int i=1;i<=num;i++){
            fat*=i;
        }
        return fat;
    }

    //Método string que retorna o valor do fatorial do número
    public String descricao(){
        return "Fatorial: "+calculoFatorial();
    }
    
    public static void main(String[] args) {
         //Instanciando objetos
        Scanner scn = new Scanner(System.in);
        Fatorial f1 = new Fatorial(0);

        //entrada de dados
        System.out.println("Digite um número: ");
        f1.num =scn.nextInt();

        //Chamada do método String descricao() que retorna o valor fatorial
        System.out.println(f1.descricao());
        
        scn.close();
    }
    
}
