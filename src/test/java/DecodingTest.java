import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    @Test
    public void getChar_getsInputtedChar_hi() {
        Decoding testDecrypt =new  Decoding (new char[]{'h', 'i'}, 2);
        assertEquals(new char[]{'h', 'i'}, testDecrypt.getInputtedString());
    }

    @Test
    public void getChar_getsInputtedKey_2() {
        Decoding testDecrypt = new Decoding(new char[]{'h', 'i'}, 2);
        assertEquals(2, testDecrypt.getInputtedPosition());
    }

    @Test
    public void EncryptInput_What_string(){
        Decoding inputtedString=new Decoding(new char[]{'j', 'k'},2);
        assertEquals("hi",inputtedString.DecryptInput());
    }


}