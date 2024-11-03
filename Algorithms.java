public class Algorithms 
{
    public static int countLetter(String[] names, char letter) 
    {
        int count = 0;
        for (int i = 0; i < names.length; i++) 
    {
        String name = names[i];
        if (name.charAt(0) == letter) 
        {
            count++;
        }
    }
    return count;
}

    public static void getFirstLast(String[] names) 
    { 
        if (names.length > 0) {
            System.out.println("First name: " + names[0]);
            System.out.println("Last name: " + names[names.length - 1]);
        }
        else
        {
            System.out.println("It's empty");
        }
    }


    public static void addName(String[] names, String name) // I don't have this much friends
    {
        for (int i = 0; i < names.length; i++)
        {
            if (names[i] == null)
            {
                names[i] = name;
                System.out.println("Added " + name);
                return; // exit OR break method to exit after adding name
            }
        }
        // if the array is full
        System.out.println("Friend list is full");
    }
}


