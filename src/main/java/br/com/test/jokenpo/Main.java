package br.com.test.jokenpo;

import br.com.test.jokenpo.game.Item;
import br.com.test.jokenpo.game.Rock;
import br.com.test.jokenpo.game.Scissor;

/**
 * Created by Marcelo on 28/03/2017.
 */
public class Main {

    /**
     * Main method of the project.
     * Only contains one game of Jo Ken Po.
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Rodando o jogo");

        Item item1 = new Rock();
        Item item2 = new Scissor();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("O item Pedra ")
                .append(item1.play(item2).toString().toLowerCase())
                .append(" jogando contra o item Tesoura.");

        System.out.println(stringBuilder.toString());

    }

}
