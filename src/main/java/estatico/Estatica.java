package estatico;

public class Estatica {

    private Estatica() {
        throw new UnsupportedOperationException("Classe não pode ser instânciada");
    }

    private static final int VALOR = 4;

    public static int retornaValor() {
        return VALOR;
    }
}
