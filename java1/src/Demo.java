import java.io.*;
class Demo
{
    public static void main(String args[])
    {
        String name = "prabhat kumar singh";
        String words[] = name.split(" ");
        for(String word : words)
        {
            System.out.print(word.charAt(0)+ ".");
        }
    }
}