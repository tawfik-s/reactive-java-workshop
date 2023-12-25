package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()


        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(e -> System.out.println(e));
        System.out.println();

        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream().filter(e -> e < 5).forEach(System.out::println);
        System.out.println();
        
        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream().filter(e -> e > 5).forEach(System.out::println);
        System.out.println();

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        StreamSources.intNumbersStream().filter(e -> e > 5).findFirst().orElse(-1);
        System.out.println();
        // Print first names of all users in userStream
        StreamSources.userStream().map(user -> user.getFirstName()).forEach(System.out::println);
        System.out.println();
        // Print first names in userStream for users that have IDs from number stream
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().toList().contains(user.getId()))
                .map(user -> user.getFirstName()).forEach(System.out::println);

    }

}
