package strings.codewars;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class EmailObfuscator {
//    Many people choose to obfuscate their email address when displaying it on the Web. One common way of doing
//    this is by substituting the @ and . characters for their literal equivalents in brackets.
//
//            Example 1:
//    user_name@example.com
//=> user_name [at] example [dot] com

//    Example 2:
//    af5134@borchmore.edu
//=> af5134 [at] borchmore [dot] edu

//    Example 3:
//    jim.kuback@ennerman-hatano.com
//=> jim [dot] kuback [at] ennerman-hatano [dot] com

//    Using the examples above as a guide, write a function that takes an email address string and returns the
//    obfuscated version as a string that replaces the characters @ and . with [at] and [dot], respectively.
//
//            Notes
//
//    Input (email) will always be a string object. Your function should return a string.
//    Change only the @ and . characters.
//    Email addresses may contain more than one . character.
//    Note the additional whitespace around the bracketed literals in the examples!
    public static String obfuscate(String email) {

        return email.replace(".", " [dot] ")
                .replace("@", " [at] ");
    }

    public static class EmailObfuscatorTest {

        @Test
        public void test1() {
            assertEquals("test [at] 123 [dot] com",
                    EmailObfuscator.obfuscate("test@123.com"));
        }
        @Test
        public void test2() {
            assertEquals("Code_warrior [at] foo [dot] ac [dot] uk",
                    EmailObfuscator.obfuscate("Code_warrior@foo.ac.uk"));
        }
    }
}
