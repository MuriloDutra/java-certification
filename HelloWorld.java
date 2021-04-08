public class HelloWorld {
    //Para um arquivo java ser executável na linha de comando, deve ter o método main()
    public static void main (String params []){
        System.out.println("Rodando o programa");
        System.out.println("length: " + params.length);

        for(int i=0; i < params.length; i++){
            System.out.println(i + " => " + params[i]);
        }
        //Método main deve retonar VOID sempre
    }
}
