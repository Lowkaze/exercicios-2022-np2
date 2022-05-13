package exercicio1;

// Aqui uma classe abstrata é herdada por outra classe
public class Java extends LinguagemDeProgramacao {
    @Override
    public void mostrarSintaxe() {
        System.out.println("System.out.println(\"Olá, Mundo!\")");
    }
}
