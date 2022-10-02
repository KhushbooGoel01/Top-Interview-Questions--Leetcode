import java.util.*;
class Anagram
{
   public static void main(String[] args)
   {
        String a="cat";
        String b="atc";
        boolean isAnagram=false;
         
        if(a.length()==b.length())
        {
         for(int i=0;i<a.length();i++)
          {
            char c=a.charAt(i);
            isAnagram=false;
            for(int j=0;j<b.length();j++)
            {
                if(b.charAt(j)==c)
                {
                    isAnagram=true;
                    break;
                }
                
              }
          }
        }
        else
        {
          isAnagram=false;
         }
    if(isAnagram)
    {
        System.out.println("Anagram");
    }
    else 
    {
        System.out.println("not anagram");
    }
   }
}