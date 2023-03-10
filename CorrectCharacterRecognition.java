import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class CorrectCharacterRecognition {
    public static String correct(String string) {

        String s= string.replaceAll("1","I");
        String s2=s.replaceAll("0","O");
        String s3=s2.replaceAll("5","S");
        return s3;

    }
    @Test
    public void testSomething() {
        assertEquals("IF-RUDYARD KIPLING", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("1F-RUDYARD K1PL1NG")));
        assertEquals("ROBERT MERLE - THE DAY OF THE DOLPHIN", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N")));
        assertEquals("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5")));
        assertEquals("RICHARD P. FEYNMAN - STATISTICAL MECHANICS", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5")));
        assertEquals("STEPHEN HAWKING - A BRIEF HISTORY OF TIME", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME")));
        assertEquals("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL")));
        assertEquals("ERNEST HEMINGWAY - A FARWELL TO ARMS", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("ERNE5T HEM1NGWAY - A FARWELL T0 ARM5")));
        assertEquals("ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5")));
        assertEquals("ERNEST HEMINGWAY - THE OLD MAN AND THE SEA", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA")));
        assertEquals("J. R. R. TOLKIEN - THE LORD OF THE RINGS", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5")));
        assertEquals("J. D. SALINGER - THE CATCHER IN THE RYE", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. D. 5AL1NGER - THE CATCHER 1N THE RYE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE PHILOSOPHER'S STONE", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE CHAMBER OF SECRETS", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE PRISONER OF Azkaban", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE GOBLET OF FIRE", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE ORDER OF PHOENIX", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. K. R0WL1NG - HARRY P0TTER AND THE 0RDER 0F PH0EN1X")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE HALF-BLOOD PRINCE", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE DEATHLY HALLOWS", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5")));
        assertEquals("URSULA K. LE GUIN - A WIZARD OF EARTHSEA", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA")));
        assertEquals("URSULA K. LE GUIN - THE TOMBS OF ATUAN", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN")));
        assertEquals("URSULA K. LE GUIN - THE FARTHEST SHORE", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE")));
        assertEquals("URSULA K. LE GUIN - TALES FROM EARTHSEA", CorrectCharacterRecognition.correct(CorrectCharacterRecognition.correct("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA")));
    }
}
