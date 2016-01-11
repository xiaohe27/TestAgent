/**
 * Created by xiaohe on 4/17/15.
 */
public class TestRegex {

    public static void main(String[] args) {
        String regex= "(abc\\s*\\(|def\\s*\\()";

        String input = "  abc  (T argOfABC){\n} def(T2 argOfDEF, T3 more) {contents of def}";

        String[] splitted = input.split(regex);

        System.out.println("The splitted string of input is ");
        for (int i = 0; i < splitted.length; i++) {
            System.out.println("Line " + i + " is " + splitted[i]);
        }
    }
}
