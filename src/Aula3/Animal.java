package Aula3;

public class Animal {
    public String nome;
    public String raça;
    public int idade;
    public String especie;

    public Animal(String nome, String raça, int idade, String especie){
        this.nome = nome;
        this.raça = raça;
        this.idade = idade;
        this. especie = especie;
    }
    public void vacinar(){
        System.out.println("O" + getNome() + "foi vacinado.");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


}