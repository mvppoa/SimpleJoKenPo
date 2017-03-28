package br.com.test.jokenpo.game;

import br.com.test.jokenpo.game.enums.ResultEnum;

/**
 * Created by Marcelo on 28/03/2017.
 */
public class Scissor extends Item {
    public ResultEnum play(Item item) {
        if (item instanceof Paper)
            return ResultEnum.GANHOU;
        else if (item instanceof Rock)
            return ResultEnum.PERDEU;
        return ResultEnum.EMPATOU;
    }
}
