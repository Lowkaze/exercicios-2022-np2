package exercicio2;

public class TestaMamifero {
    public static void main(String[] args) {
        BichoPreguica bichoPreguica = new BichoPreguica();
        bichoPreguica.emiteSom();

        Esquilo esquilo = new Esquilo();
        esquilo.emiteSom();

        Lhama lhama = new Lhama();
        lhama.emiteSom();

        Ornitorrinco ornitorrinco = new Ornitorrinco();
        ornitorrinco.emiteSom();
    }
}
