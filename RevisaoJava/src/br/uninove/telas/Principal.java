package br.uninove.telas;

import br.uninove.revisaojava.Aluno;
import br.uninove.revisaojava.Professor;

public class Principal {
    public static void main(String args[]) {
        Aluno a1 = new Aluno();
        a1.nome = "Madruguinha";
        a1.email = "madruguinha@uni9.edu.br";
        a1.idade = 40;
        a1.ra = 123;
        a1.cpf = "123.123.123.11";
        
        Professor p1 = new Professor();
        p1.nome = "Traue";
        p1.email = "thiago.traue@uni9.pro.br";
        p1.idade = 34;
        p1.matricula = 001010;
        p1.cargaHoraria = 40;
        p1.cpf = "321.311.333.00";
        
        Aluno a2 = new Aluno();
        a2.nome = "Chiquinha";
        a2.idade = 18;
        a2.ra = 222;
        a2.email = "chiquinha@uni9.edu.br";
        
        System.out.println("Nome do professor: " + p1.nome);
        //...
    }
}
