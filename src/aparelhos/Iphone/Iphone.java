package aparelhos.Iphone;

import aparelhos.AparelhoTelefonico.AparelhoTelefonico;
import aparelhos.NavegadorInternet.NavegadorInternet;
import aparelhos.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz por Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina web Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica Iphone");
    }
}
