package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void shiftByThreeEnd() {
        CaesarShiftCipher test1 = new CaesarShiftCipher();
        String result = test1.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void shiftByThreeStart() {
        CaesarShiftCipher test1 = new CaesarShiftCipher();
        String result = test1.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }

    @Test
    public void shiftByZero() {
        CaesarShiftCipher test2 = new CaesarShiftCipher();
        String result = test2.CaesarShiftCipher("abc", 0);
        Assertions.assertEquals("abc", result); }

}
