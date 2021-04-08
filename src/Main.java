public class Main {
    public static void main(String[] args) {
        ProcessaBoleto processador = new ProcessaBoleto(LeituraRetorno::lerBancoBrasil);
        System.out.println("Boletos do Banco do Brasil:");
        processador.processar("boletos-banco-brasil-1.txt");
        System.out.println("");

        System.out.println("Boletos do Banco Bradesco:");
        processador = new ProcessaBoleto(LeituraRetorno::lerBradesco);
        processador.processar("boletos-bradesco-1.txt");
    }
}
