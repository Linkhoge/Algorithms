// Student Name     : Ariel Fajimiyo
// Student Id Number: C00300811@setu.ie
// Date             : 30/10/24
// Purpose          : A test driver program for my Algorithms

public class Q3 
{
    public static void main(String[] args)
    {
        String[] friendNames = {"Ariel","Ben", "Chisom", "David", "Emma", "Frank", "Gem", "Jack", "Mark"};
        for (int i = 0; i < friendNames.length; i++) 
        {
            System.out.println(friendNames[i]);
        }

        int letterA = Algorithms.countLetter(friendNames, 'A');

        System.out.println("Number of A's: " + letterA);

        Algorithms.getFirstLast(friendNames);

        Algorithms.addName(friendNames, "Tyrone");
    }
}
