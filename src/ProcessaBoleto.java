import java.util.List;

public class ProcessaBoleto {
    public void processar(LeituraRetorno conexao, String nomeArquivo) {
        List<Boleto> resultado = conexao.lerArquivo(nomeArquivo);
        System.out.println(resultado.toString());
    }
}