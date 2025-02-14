package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelacaoAlunoTest {
    private Aluno aluno1, aluno2, aluno3, aluno4;

    @BeforeEach public void setup()
    {
        System.out.println("Criando novos alunos...");
            aluno1 = new Aluno("jeff the killer", 12);
            aluno2 = new Aluno("Arthur",6911732991041171121113211411110897115.0);
            aluno3 = new Aluno("Natan",34);
            aluno4 = new Aluno("Ney",57);
        System.out.println("Novos alunos criados com sucesso!");
    }

    @Test public void testDescansoSuficiente()
    {
        var descanso = RelacaoAluno.calcularDescanso(aluno1);
        System.out.println("Testando se o descando é suficiente para o Aluno1...");
        assertEquals("Descanso diario suficiente:O aluno é um cara tranquilo", descanso);
        System.out.println("O descanso é suficiente para o Aluno1!");
    }
}
