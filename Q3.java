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
