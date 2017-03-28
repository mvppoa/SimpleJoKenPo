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
public class TestRock extends TestCase {

    @Test
    public void testAgainstScissor() {
        assertEquals(ResultEnum.GANHOU, (new Rock()).play(new Scissor()));
    }

    @Test
    public void testAgainstPaper() {
        assertEquals(ResultEnum.PERDEU, (new Rock()).play(new Paper()));
    }

    @Test
    public void testAgainstRock() {
        assertEquals(ResultEnum.EMPATOU, (new Rock()).play(new Rock()));
    }
}
