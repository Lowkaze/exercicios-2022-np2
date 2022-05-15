package exercicio1;

// Conceito de classe abstrata sendo utilizado
public class Java extends LinguagemDeProgramacao {
    // Polimorfismo alterando o comportamento de um método
    @Override
    public void mostrarAnoDeCriacao() {
        System.out.println(1995);
    }

    // Implementação de um método abstrato
    @Override
    public void mostrarSintaxe() {
        System.out.println("System.out.println(\"Olá, Mundo!\")");
    }
}
