package br.com.test.jokenpo.game;

import br.com.test.jokenpo.game.enums.ResultEnum;

/**
 * Created by Marcelo on 28/03/2017.
 */
public class Rock extends Item {
    public ResultEnum play(Item item) {
        if (item instanceof Scissor)
            return ResultEnum.GANHOU;
        else if (item instanceof Paper)
            return ResultEnum.PERDEU;
        return ResultEnum.EMPATOU;
    }
}
