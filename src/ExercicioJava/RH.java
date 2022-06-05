package ExercicioJava;

public class RH {
    public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario("Antônio", 25,"Junior","Ativo");
    Funcionario funcionario2 = new Funcionario("Renato", 18,"Pleno","Ativo");
    Funcionario funcionario3 = new Funcionario("Tatiana", 30,"Sênior","Ativo");
    Funcionario funcionario4 = new Funcionario("Vitor", 23,"Junior","Ativo");

    funcionario1.demitirFuncionario();
    funcionario2.trocarCargoFuncionario("Sênior");
    funcionario3.aniversario();
    funcionario4.pagarSalario();
    }
}
