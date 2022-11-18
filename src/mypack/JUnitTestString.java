package mypack;
import static org.junit.jupiter.api.Assertions.*;
class JUnitTestString {

    @org.junit.jupiter.api.Test
    void addString() {
        JUnitClass unit = new JUnitClass();
                int result = unit.Addnumber(200,300);
        assertEquals (500,result);
    }
}