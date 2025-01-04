package br.com.praticaleituraarquivos.principal;
import br.com.praticaleituraarquivos.modelos.ManipularArquivo;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {

        ManipularArquivo escreverArquivo = new ManipularArquivo("O rato roeu a roupa do rei de roma", "Arquivo.txt");
        escreverArquivo.escrita();

        escreverArquivo.leituraFileReader();
        escreverArquivo.leituraScanner();

    }
}
