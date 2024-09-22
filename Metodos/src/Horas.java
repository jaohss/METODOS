import java.util.Scanner;
public class Horas {
    //Inicialização dos atributos
    int num;
    int horas;
    int min;

    //Método construtor para inicializar os atributos
    public Horas(int min){
        this.min=min;
    }

    //Método para realizar o calculo dos minutos no formato hh:mm
    public int calculoMin(){
        return min = num - (horas*60);
    }

    //Método para realizar o cálculo das horas
    public int calculoHoras(){
        return horas = num/60;
    }

    //Método string que retorna o horário convertido no formato hh:mm 
    public String descricao(){
        return "Horas: "+calculoHoras()+"h "+calculoMin()+" min";
    }

    public static void main(String[] args) {
         //Instanciando objetos
        Scanner scn = new Scanner(System.in);
        Horas h1 = new Horas(0);

        //entrada de dados
        System.out.println("Digite os minutos: ");
        h1.num = scn.nextInt();

        //Chamada do método String descricao() que retorna as horas no formato hh:mm
        System.out.println(h1.descricao());
        
        scn.close();
    }
    
}
