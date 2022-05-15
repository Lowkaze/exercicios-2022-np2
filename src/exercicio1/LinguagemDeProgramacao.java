package exercicio1;

import java.time.LocalDate;

// Criação de uma classe abstrata
public abstract class LinguagemDeProgramacao {
    public void mostrarAnoDeCriacao() {
        int anoAtual = LocalDate.now().getYear();
        System.out.print(anoAtual);
    }

    // Criação de um método abstrato
    public abstract void mostrarSintaxe();
}
