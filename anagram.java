import java.util.*;

class anagram {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1");
        String s1 = sc.nextLine();
        System.out.println("enter string 2");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not a anagram");
        } else {
            boolean isanagram = false;
            char visited[] = new char[s1.length()];
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                isanagram = false;
                for (int j = 0; j < s2.length(); j++) {
                    if (ch == s2.charAt(j) && visited[j] != ch) {
                        isanagram = true;
                        visited[i] = ch;
                        break;
                    }
                }
                if (isanagram == false) {
                    System.out.println("not a anagram");
                    break;
                }
            }
            if (isanagram) {
                System.out.println("ANAGRAM");
            }

        }

        int fors1[] = new int[256];
        int fors2[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = (int) ch;
            fors1[index]++;

            ch = s2.charAt(i);
            index = (int) ch;
            fors2[index]++;

        }
        boolean isana = true;
        for(int k=0 ; k<256; k++)
        {
            if(fors1[k]!=fors2[k])
            {
                System.out.println("not an anagram"); 
                isana = false;   
                break;
            }
        }
        if(isana)
        {
            System.out.println("yes this is an anagram ");
        }

    }
}