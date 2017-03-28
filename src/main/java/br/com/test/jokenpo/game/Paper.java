package br.com.test.jokenpo.game;

import br.com.test.jokenpo.game.enums.ResultEnum;

/**
 * Created by Marcelo on 28/03/2017.
 */
public class Paper extends Item{
    public ResultEnum play(Item item) {
        if (item instanceof Scissor)
            return ResultEnum.PERDEU;
        else if (item instanceof Rock)
            return ResultEnum.GANHOU;
        return ResultEnum.EMPATOU;
    }
}
