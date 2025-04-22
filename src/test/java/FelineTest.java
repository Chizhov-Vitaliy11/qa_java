import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline;
    @Before
    public  void before(){
        feline = new Feline();
    }
    @Test
    public void familyTest(){
        assertEquals("Кошачьи",feline.getFamily());
    }
    @Test
    public void eatMeatTest() throws Exception{
        assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }
    @Test
    public void kittensOneTest(){
        assertEquals(1,feline.getKittens());
    }
    @Test
    public void kittensTest(){
        assertEquals(4,feline.getKittens(4));
    }

}
