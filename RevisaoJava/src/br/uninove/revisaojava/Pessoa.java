package br.uninove.revisaojava;

public class Pessoa {

    private String nome;
    private String email;
    private String cpf;
    private int idade;

    //Assintura do método: String, String, String, int
    Pessoa(String nome, String email, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }
    
    public Pessoa() { }
    
    /*
        Para encapsular os campos são necessários dois passos:
        1º private nos atributos
        2º um método get e um método set para cada um, public
    
         - get - me dá
         - set - tó
    
         Para usar o mecanismo automártico no NB para criar o encapsulamento, 
         basta clicar com o bt. direito no código, refatorar e encapsular campos
         selecionar tudo e clicar em ok.
    
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
    }
    
    public String fazerAniversario() {
        this.idade++;
        return "Ôba, festinha! Agora o(a) " 
                + this.nome 
                + " tem " 
                + this.idade + " anos"; 
    }
    
    public void comer(String comida) {
        //por boas práticas, evitamos que uma classe de "negócio" faça manipulações na tela
        //mas este é só um exemplo...
        System.out.println("Hmmm adoro comer " + comida);
    }
}
