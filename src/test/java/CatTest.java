import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Feline feline;
    Cat cat;

    @Before
    public void before(){
        this.cat = new Cat(feline);
    }
    @Test
    public void soundCatTest(){
        assertEquals("Это не Кот", "Мяу", cat.getSound());
    }
    @Test
    public void  foodCatTest() throws Exception{
        List <String> catFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(catFood);
        assertEquals(catFood, cat.getFood());
    }
}
