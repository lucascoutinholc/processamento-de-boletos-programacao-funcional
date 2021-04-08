import java.util.List;
import java.util.function.Function;

public class ProcessaBoleto {
    private Function<String, List<Boleto>> leituraRetorno;

    public ProcessaBoleto(Function<String, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo) {
        List<Boleto> resultado = leituraRetorno.apply(nomeArquivo);
        for (Boleto boleto : resultado) {
            System.out.println(boleto);
        }
    }
}