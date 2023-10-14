package Usuario;

import aparelhos.Iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.atender();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
        iphone.ligar();
        iphone.pausar();
        iphone.tocar();
        iphone.iniciarCorreioVoz();
        iphone.selecionarMusica();
    }
}
