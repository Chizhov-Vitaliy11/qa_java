import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParadmeterizedTest {
    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean hasMane;
    @Mock
    Feline feline;
    @Parameterized.Parameters
    public static Object[] getData(){
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }

    @Test
    public void haveManeTest() throws Exception {
        Lion lion = new Lion(sex,feline);
        assertEquals(hasMane,lion.doesHaveMane());
    }
}
