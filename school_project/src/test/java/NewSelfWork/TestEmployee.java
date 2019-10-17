package NewSelfWork;

import newSelfWork.TestEngineer;
import org.junit.jupiter.api.Test;

public class TestEmployee {

    @Test
    public static void main(String[] args) {
        TestEngineer elina = new TestEngineer();
        elina.setName("Elina");
        elina.setSurName("Markova");
        elina.setAge(95);
    }
}