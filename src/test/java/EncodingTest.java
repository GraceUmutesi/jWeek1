import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void getChar_getsInputtedChar_hi() {
        Encoding testEncrypt = new Encoding(new char[]{'h', 'i'}, 2);
        assertEquals(new char[]{'h', 'i'}, testEncrypt.getInputtedString());
    }

    @Test
    public void getChar_getsInputtedKey_2() {
        Encoding testEncrypt = new Encoding(new char[]{'h', 'i'}, 2);
        assertEquals(2, testEncrypt.getInputtedPosition());
    }

    @Test
    public void EncryptInput_What_string(){
        Encoding inputtedString=new Encoding(new char[]{'h', 'i'},2);
        assertEquals("jk",inputtedString.EncryptInput());
    }

}