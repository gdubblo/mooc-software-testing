package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
        @Test
    public void gHappyTest1() {
        GHappy solution = new GHappy();
        Boolean result  = solution.gHappy("xxggxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void gHappyTest2() {
        GHappy solution = new GHappy();
        Boolean result  = solution.gHappy("xxgxx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void gHappyTest3() {
        GHappy solution = new GHappy();
        Boolean result  = solution.gHappy("xxggyygxx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void gHappyTest4() {
        GHappy solution = new GHappy();
        Boolean result  = solution.gHappy("ggyygg");
        Assertions.assertEquals(true, result);
    }


}
