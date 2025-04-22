import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    Lion lion;



    @Test
    public void doesHaveManeTest() throws Exception {
        lion = new Lion("Самец", feline);
        assertTrue("Это не самец", lion.doesHaveMane());
    }

    @Test
    public void getKittensTest() throws Exception {
        lion =  new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();

        assertEquals(1, actualKittensCount);

    }
    @Test
    public void lionFoodTest() throws  Exception{
        lion = new Lion("Самец", feline);
        List <String> lionFood= List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(lionFood);
        assertEquals(lionFood, lion.getFood());
    }

    @Test
    public void doesHaveManeThrowsException() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Тигр", feline);
        });
        String textException = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(textException, exception.getMessage());
    }
}
