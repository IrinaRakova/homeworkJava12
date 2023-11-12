import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.ManagerMoviePoster;

public class ManagerMoviePosterTest {

    @Test
    public void shouldFindMovies() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addMovie("First film");

        String[] expected = {"First film"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddSomeMovie() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addMovie("First film");
        manager.addMovie("Second film");
        manager.addMovie("Third film");

        String[] expected = {"First film", "Second film", "Third film"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimitMovie() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addMovie("First film");
        manager.addMovie("Second film");
        manager.addMovie("Third film");
        manager.addMovie("Fourth film");
        manager.addMovie("Fifth film");

        String[] expected = {"Fifth film", "Fourth film", "Third film", "Second film", "First film"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastUnderLimitMovie() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addMovie("First film");
        manager.addMovie("Second film");
        manager.addMovie("Third film");

        String[] expected = {"Third film", "Second film", "First film"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAboveLimitMovie() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addMovie("First film");
        manager.addMovie("Second film");
        manager.addMovie("Third film");
        manager.addMovie("Fourth film");
        manager.addMovie("Fifth film");
        manager.addMovie("Sixth film");
        manager.addMovie("Seventh film");

        String[] expected = {"Seventh film", "Sixth film", "Fifth film", "Fourth film", "Third film"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


