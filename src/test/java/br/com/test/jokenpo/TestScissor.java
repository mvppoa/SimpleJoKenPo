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
public class TestScissor extends TestCase {
    @Test
    public void testAgainstPaper(){
        assertEquals(ResultEnum.GANHOU, (new Scissor()).play(new Paper()));
    }

    @Test
    public void testAgainstRock(){
        assertEquals(ResultEnum.PERDEU, (new Scissor()).play(new Rock()));
    }

    @Test
    public void testAgainstScissor(){
        assertEquals(ResultEnum.EMPATOU, (new Scissor()).play(new Scissor()));
    }
}
