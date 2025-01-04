package br.com.praticaleituraarquivos.modelos;

import java.io.*;

public class ManipularArquivo {

    private String conteudoEscrita;
    private String nomeArquivo;

    public ManipularArquivo(String conteudoEscrita, String nomeArquivo) {
        this.conteudoEscrita = conteudoEscrita;
        this.nomeArquivo = nomeArquivo;
    }

    public void escrita() throws IOException {
        FileWriter escrever = new FileWriter(nomeArquivo);
        escrever.write(conteudoEscrita);
        escrever.close();
        System.out.println("Escrita finalizada");
    }

    public void leituraFileReader() throws IOException {
        File arquivoLeitura = new File(this.nomeArquivo);

        FileReader leitor = new FileReader(arquivoLeitura);
        int dadoArquivo = leitor.read();

        while (dadoArquivo != -1) {
            System.out.println((char) dadoArquivo);
            dadoArquivo = leitor.read();
        }
        leitor.close();
    }
}
