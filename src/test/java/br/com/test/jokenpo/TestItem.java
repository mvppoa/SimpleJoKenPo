package br.com.test.jokenpo;

import br.com.test.jokenpo.game.Paper;
import br.com.test.jokenpo.game.Rock;
import br.com.test.jokenpo.game.Scissor;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Marcelo on 28/03/2017.
 */
public class TestItem extends TestCase {


    @Test
    public void testRockItem() {
        Rock rock =  new Rock();
        assertTrue(rock instanceof Rock);
    }

    @Test
    public void testPaperItem() {
        Paper paper = new Paper();
        assertTrue(paper instanceof Paper);
    }

    @Test
    public void testArmaTesoura() {
        Scissor scissor = new Scissor();
        assertTrue(scissor instanceof Scissor);
    }
}
