package estatico;

public class Estatica {

    private Estatica() {
        throw new UnsupportedOperationException("Classe não pode ser instânciada");
    }

    private static int valor = 4;

    public static int retornaValor() {
        return valor;
    }
}
