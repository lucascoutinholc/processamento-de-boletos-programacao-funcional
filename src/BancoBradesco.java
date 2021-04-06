import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BancoBradesco implements LeituraRetorno {
    @Override
    public List<Boleto> lerArquivo(String nomeArquivo) {
        List<Boleto> listaDeBoletos = new ArrayList<>();
        try {
            BufferedReader bufferDeLeitura = new BufferedReader(new FileReader(nomeArquivo));
            String linhaLida = bufferDeLeitura.readLine();
            String[] informacoesDaLinha;

            while (linhaLida != null) {
                informacoesDaLinha = linhaLida.split(";");

                Boleto boleto = new Boleto();
                boleto.setId(Integer.parseInt(informacoesDaLinha[0]));
                boleto.setCodigoBanco(informacoesDaLinha[1]);
                boleto.setAgencia(informacoesDaLinha[2]);
                boleto.setContaBancaria(informacoesDaLinha[3]);
                boleto.setDataVencimento(LocalDate.parse(informacoesDaLinha[4]));
                boleto.setDataPagamento(LocalDateTime.parse(informacoesDaLinha[5]));
                boleto.setCpfCliente(informacoesDaLinha[6]);
                boleto.setValor(Double.parseDouble(informacoesDaLinha[7]));
                boleto.setMulta(Double.parseDouble(informacoesDaLinha[8]));
                boleto.setJuros(Double.parseDouble(informacoesDaLinha[9]));
                listaDeBoletos.add(boleto);

                linhaLida = bufferDeLeitura.readLine();
            }
            bufferDeLeitura.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return listaDeBoletos;
    }
}