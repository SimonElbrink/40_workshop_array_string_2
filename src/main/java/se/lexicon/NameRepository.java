package se.lexicon;

import java.util.Arrays;

/**
 * Part 1
 * 1. Create a new class called NameRepository
 * 2. Inside NameRepository create a private static empty array of String called names
 * 3. Define following methods:
 * public static int getSize()
 * Returns number of elements in the array
 *
 * public static void setNames(String[] names)
 * Sends in an array that set the private static array.
 * This should replace all existing names.
 *
 * public static void clear()
 * Should completely empty the array.
 *
 * public static String[] findAll()
 * Returns all names in a new array
 */
public class NameRepository {

    private static String[] names = new String[0];

    public static int getSize(){
        return names.length;
    }

    public static void setNames(String[] names){
        NameRepository.names = names;
    }

    public static void clear(){
        names = new String[0];
    }

    public static String[] findAll(){
        return Arrays.copyOf(names, names.length);
    }


}
