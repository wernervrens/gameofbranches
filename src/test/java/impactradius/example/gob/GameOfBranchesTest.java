package impactradius.example.gob;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfBranchesTest {

    @Test
    public void testSayIt_happyCase() {
        //given
        GameOfBranches gob = new GameOfBranches();

        //when
        String actual = gob.sayIt();

        //then
        assertEquals("You know nothing John Snow", actual);
    }

    @Test
    public void testSayIt_fail() {
        //given
        GameOfBranches gob = new GameOfBranches();

        //when
        String actual = gob.sayIt();

        //then
        assertFalse("You know nothing Ned Stark".equals(actual));
    }
}