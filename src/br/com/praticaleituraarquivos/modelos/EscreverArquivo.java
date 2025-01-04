package br.com.praticaleituraarquivos.modelos;

import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {

    private String conteudoEscrita;
    private String nomeArquivo;

    public EscreverArquivo(String conteudoEscrita, String nomeArquivo) {
        this.conteudoEscrita = conteudoEscrita;
        this.nomeArquivo = nomeArquivo;
    }

    public void escrita() throws IOException {
        FileWriter escrever = new FileWriter(nomeArquivo);
        escrever.write(conteudoEscrita);
        escrever.close();
        System.out.println("Escrita finalizada");
    }
}
