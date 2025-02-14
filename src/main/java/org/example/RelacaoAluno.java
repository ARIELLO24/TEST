package org.example;

public class RelacaoAluno {

    public static String calcularDescanso(Aluno aluno) {

        if(aluno.getCansaco() <= 20){
            return "Descanso diario suficiente:O aluno é um cara tranquilo";
        }

        if (aluno.getCansaco() <= 50) {
            return "Descanso nos fins de semana é suficiente: O aluno está moderadamente descansado";
        }

        if (aluno.getCansaco() <= 80) {
            return "Ferias são necessarias! O aluno esta exausto";

        }

        else {
            return "Alerta! O aluno está completamente exausto!";
        }


    }
}
