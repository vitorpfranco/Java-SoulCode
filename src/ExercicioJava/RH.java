package ExercicioJava;

public class RH {
    public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario("Antônio", 25,"Junior");
    Funcionario funcionario2 = new Funcionario("Kleber", 27,"Pleno");
    Funcionario funcionario3 = new Funcionario("Joaquina", 30,"Sênior");
    Funcionario funcionario4 = new Funcionario("Vitor", 23,"Junior");

    funcionario1.demitirFuncionario();
    funcionario1.demitirFuncionario();
    funcionario2.trocarCargoFuncionario("Sênior");
    funcionario3.aniversario();
    funcionario4.pagarSalario();
    }
}
