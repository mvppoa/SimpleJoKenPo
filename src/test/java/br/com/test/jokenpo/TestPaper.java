package br.com.test.jokenpo;

import br.com.test.jokenpo.game.Paper;
import br.com.test.jokenpo.game.Rock;
import br.com.test.jokenpo.game.Scissor;
import br.com.test.jokenpo.game.enums.ResultEnum;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Marcelo on 28/03/2017.
 */
public class TestPaper extends TestCase{
    @Test
    public void testAgainstStone(){
        assertEquals(ResultEnum.GANHOU, (new Paper()).play(new Rock()));
    }

    @Test
    public void testAgainstScissor(){
        assertEquals(ResultEnum.PERDEU, (new Paper()).play(new Scissor()));
    }

    @Test
    public void testAgainstPaper(){
        assertEquals(ResultEnum.EMPATOU, (new Paper()).play(new Paper()));
    }
}
