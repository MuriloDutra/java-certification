class Pessoa {
    static int id = 1;
    static void metodo(){
        System.out.println(id);
    }
}

public class LocalVariables {
    //Sinônimos: Variáveis de instância, variáveis de objeto, atributo, membro
    String myCity =  "Campinas";
    String cityAndState = myCity + "- São Paulo";
 
    public LocalVariables(String teamName){//constructor
        System.out.println("myCity: " + myCity);
        System.out.println("teamName: " + teamName);

        Pessoa p = new Pessoa();
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        System.out.println("P ID: " + p.id); //resultado será 1
        System.out.println("P1 ID: " + p1.id); //resultado também será 1
        System.out.println("Pessoa ID: " + Pessoa.id); //resultado também será 1

        Pessoa.metodo();
    }

    public void m1(String localVariableName){
        System.out.println("myCity - m1(): " + myCity);
        System.out.println("cityAndState - m1(): " + cityAndState);

        int localVariableX = 10;

        if(localVariableX >= 10){
            int localVariableY = 50;
            System.out.println(localVariableY);
        }
        
        System.out.println(localVariableX);
        System.out.println(localVariableName);
    }

    public void m2(){
        for(int x=0, y=0; x <= 3; x++){
            System.out.print(x);
            System.out.println(y);
        }
    }

    public static void main(String[] args){
        LocalVariables t = new LocalVariables("Barcelona");
        t.m1("Murilo");
        t.m2();

        t.cityAndState = "Belo Horizonte - Minas Gerais";
        System.out.println("New city and state: " + t.cityAndState);
    }
}