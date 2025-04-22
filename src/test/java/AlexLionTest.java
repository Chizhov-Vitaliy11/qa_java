import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    @Mock
    Feline feline;
    AlexLion alexLion;
    @Before
    public void before() throws Exception {
        this.alexLion= new AlexLion(feline);
    }
    @Test
    public void kittensTest(){

        assertEquals("Откуда у Алекса дети ? Детей у Алекса -"+alexLion.getKittens(),0,alexLion.getKittens());
    }
    @Test
    public void getPlaceOfLiving(){
        assertEquals("Алекс жил в Нью-Йоркский зоопарке а не"+alexLion.getPlaceOfLiving(),"Нью-Йоркский зоопарк",alexLion.getPlaceOfLiving());
    }
    @Test
    public void getFriendsTest(){
        List<String> frendsAlex= List.of("Марти", "Глория", "Мелман");
        assertEquals("У Алекса были другие друзья, а не эти"+alexLion.getFriends(),frendsAlex,alexLion.getFriends());
    }
}
