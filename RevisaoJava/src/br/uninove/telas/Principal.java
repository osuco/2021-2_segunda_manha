package br.uninove.telas;

import br.uninove.revisaojava.Aluno;
import br.uninove.revisaojava.Professor;

public class Principal {
    public static void main(String args[]) {
        Aluno a1 = new Aluno();
        a1.setNome("Madruguinha");
        a1.setEmail("madruguinha@uni9.edu.br");
        a1.setIdade(40);
        a1.setRa(123);
        a1.setCpf("123.123.123.11");
        
        Professor p1 = new Professor();
        p1.setNome("Traue");
        p1.setEmail("thiago.traue@uni9.pro.br");
        p1.setIdade(34);
        p1.setMatricula(001010);
        p1.setCargaHoraria(40);
        p1.setCpf("321.311.333.00");
        
        Aluno a2 = new Aluno();
        a2.setNome("Chiquinha");
        a2.setIdade(18);
        a2.setRa(222);
        a2.setEmail("chiquinha@uni9.edu.br");
        
        System.out.println("Nome do professor: " + p1.getNome());
        //...
        
        Aluno a3 = new Aluno("Edilson", "edi@uni.com", "00000", 20, 9999);
        System.out.println("Nome do \"terceiro aluno\": " + a3.getNome());
        
        a3.setNome("Edilson Carlos");
        System.out.println("Nome do terceiro aluno: " + a3.getNome());
        System.out.println("Idade do terceiro aluno: " + a3.getIdade());
        
        a3.setIdade(-10);
        System.out.println("Idade do terceiro aluno: " + a3.getIdade());
        
        System.out.println(a3.fazerAniversario());        
        
        System.out.println("Idae atualizada do aluno 3: " + a3.getIdade());
        
        a3.comer("Chocolate");
        
        System.out.println(p1.toString());
    }
}
