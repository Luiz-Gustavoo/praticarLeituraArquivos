package br.com.praticaleituraarquivos.principal;
import br.com.praticaleituraarquivos.modelos.EscreverArquivo;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {

        EscreverArquivo escreverArquivo = new EscreverArquivo("Teste", "Arquivo.txt");
        escreverArquivo.escrita();

    }
}
