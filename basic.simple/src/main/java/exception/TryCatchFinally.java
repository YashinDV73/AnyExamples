package exception;

import lombok.*;

public class TryCatchFinally {

    public static void main(String[] args) {
        System.out.println(processing().toString());

    }

    private static String processing() {
        var animal = getAnimal("Cat");

        try{
            var s = animal.name;
            return animal.name;
        } catch (Exception e) {
            animal.setName("no animal");
        } finally {
            animal.setName("Anything");
        }

        return null;
    }


    private static Animal getAnimal(String name) {
        return Animal.builder().name(name).build();
    }


    @Builder
    @Data
    private static class Animal {
        private String name;
    }
}
