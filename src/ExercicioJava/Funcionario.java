package ExercicioJava;

public class Funcionario {
    public String nome;
    public int idade;

    public String cargo;
    public String situação;
    public int SalarioAcumulado;

    public Funcionario(String nome, int idade, String cargo, String situação){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situação = situação;
        this.SalarioAcumulado = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public int getSalarioAcumulado() {
        return SalarioAcumulado;
    }

    public void setSalarioAcumulado(int salarioAcumulado) {
        SalarioAcumulado = salarioAcumulado;
    }

    public void demitirFuncionario(){
        if (getSituação() == "Ativo"){
        setSituação("Inativo");
            System.out.println("Situação de " +getNome() + " alterada para Inativo.");
        } else {
            System.out.println("ERROR:O funcionário já está inativo");
        }
    }

    public void trocarCargoFuncionario(String cargo){
        if(getCargo() != cargo){
            System.out.println("Cargo de " +getNome() + " alterado de " + getCargo()+ " para " +cargo+".");
        setCargo(cargo);
        } else{
            System.out.println("ERROR: O funcionário já exerce esse cargo, tente outro.");
        }
    }
    public void pagarSalario(){
        if(getCargo()=="Junior"){
            setSalarioAcumulado(getSalarioAcumulado() + 4000);
        } else if (getCargo()=="Pleno"){
            setSalarioAcumulado(getSalarioAcumulado() + 8000);
        } else if (getCargo()=="Sênior"){
            setSalarioAcumulado(getSalarioAcumulado() + 16000);
        }
        System.out.println("Salário de " +getNome() + " pago com sucesso.");

    }

    public void aniversario(){
        setIdade(getIdade()+1);
        System.out.println("Nova idade de " +getNome() + ": " +getIdade() + " anos.");
    }
}
