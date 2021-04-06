public class Main {
    public static void main(String[] args) {
        LeituraRetorno leituraBoletoBancoBrasil = new BancoBrasil();
        LeituraRetorno leituraBoletoBradesco = new BancoBradesco();

        ProcessaBoleto processador = new ProcessaBoleto();
        processador.processar(leituraBoletoBancoBrasil, "boletos-banco-brasil-1.txt");
        processador.processar(leituraBoletoBradesco, "boletos-bradesco-1.txt");
    }
}
