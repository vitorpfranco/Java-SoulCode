package Aula2;

public class metodos {

    public static void main(String[] args) {
        impressao("teste"+ dobro(5));
    }

    //metodo sem retorno -void e sem parametros pois nao colocamos nada
    public static void  impressao (String batata) {
        System.out.println(batata);
    }
    public static int dobro(int numero) {
        return numero*2;
    }

}