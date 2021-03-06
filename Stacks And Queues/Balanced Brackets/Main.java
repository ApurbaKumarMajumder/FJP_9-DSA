import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() == 0 || st.peek() != '(') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (ch == '}') {
                if (st.size() == 0 || st.peek() != '{') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (ch == ']') {
                if (st.size() == 0 || st.peek() != '[') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            }
        }

        if (st.size() == 0) {
            System.out.println(true);
        } else { // case of extra opening brackets
            System.out.println(false);
        }
    }
}