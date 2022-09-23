import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import addition.Addition;

public class AdditionTest {
private Addition objUnderTest;

@BeforeEach
public void setUp() {

    objUnderTest = new Addition();
}

@Test
public void testAdd() { 
int a = 12; int b = 16; 
int expectedResult = 28;

int result = objUnderTest.add(a, b);
assertEquals(expectedResult, result);
}
}
