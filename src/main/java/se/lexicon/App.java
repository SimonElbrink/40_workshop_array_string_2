package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int size = NameRepository.getSize();
        System.out.println("size = " + size); //0

        String[] g40 = {"Pär", "Susanne", "Antoine", "Simon", "Emil"};

        NameRepository.setNames(g40);

        size = NameRepository.getSize();
        System.out.println("size = " + size); // 5

//        NameRepository.clear();
//
//        size = NameRepository.getSize();
//        System.out.println("size = " + size); //0

        String[] all = NameRepository.findAll();

        all[3] = "Mehrdad";

        for (String name : all) {
            System.out.println(name);
        }


        System.out.println("find all again");
        String[] all1 = NameRepository.findAll();

        for (String name : all1) {
            System.out.println(name);
        }


    }
}
