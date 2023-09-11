package com.iphone.classes;

import com.iphone.interfaces.AparelhoTelefonico;
import com.iphone.interfaces.NavegadorInternet;
import com.iphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(int numero) {
        System.out.println("ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica...");
    }
}
