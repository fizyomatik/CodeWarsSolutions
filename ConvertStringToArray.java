import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class ConvertStringToArray {
    public static String[] stringToArray(String s) {

        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') {
                count++;
            }
        }
        if (count == 0) {
            String[] stt = new String[1];
            stt[0] = s.substring(0, s.length());
            return stt;
        }

        String[] st = new String[count + 1];
        int k = 0, t = 0;


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                st[k] = s.substring(t, i);
                t = i + 1;
                k++;
                if (k == (count)) {
                    st[k] = s.substring(t, s.length());

                }
            }
        }

        return st;
    }
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, ConvertStringToArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, ConvertStringToArray.stringToArray("I love arrays they are my favorite"));
    }

}
