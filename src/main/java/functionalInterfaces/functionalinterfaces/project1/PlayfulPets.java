package functionalInterfaces.functionalinterfaces.project1;

import java.util.ArrayList;
import java.util.List;

public class PlayfulPets {
    private static void matchPet(String criteria, PetMatcher matcher, Pet pet) {
        System.out.println("\n" + criteria + ":");
        System.out.println("First: " + matcher.first(pet));
        System.out.println("All matches:");
        List<Pet> matches = matcher.match(pet);
        for (Pet p : matches)
            System.out.println(p);
    }

    public static void main(String[] args) {
        Pet.pets.add(new Pet("Max", "dog", "poodle", "black", 740.25));
        Pet.pets.add(new Pet("Scruffy", "dog", "poodle", "white", 895.00));
        Pet.pets.add(new Pet("Slider", "snake", "garden", "green", 340.00));
        Pet.pets.add(new Pet("Sasha", "cat", "streets", "black", 540.50));
        Pet.pets.add(new Pet("Cuddles", "dog", "pug", "black", 1200.45));


        PetMatcher breedMatcher = new PetMatcher() {
            @Override
            public List<Pet> match(Pet pet) {
                List<Pet> matches = new ArrayList<>();
                for (Pet p : Pet.pets)
                    if (p.equals(pet))
                        matches.add(p);
                return matches;
            }
        };

        PetMatcher priceMatcher = new PetMatcher() {
            @Override
            public List<Pet> match(Pet pet) {
                List<Pet> matches = new ArrayList<>();
                for (Pet p : Pet.pets)
                    if (p.price <= pet.price)
                        matches.add(p);
                return matches;
            }

            @Override
            public Pet first(Pet pet) {
                for (Pet p : Pet.pets)
                    if (p.price <= pet.price)
                        return p;
                return null;
            }
        };

        matchPet("Poodles", breedMatcher, new Pet(null, "dog", "poodle", null, 0.0));
        matchPet("Pets for $800 or less", priceMatcher, new Pet(null, null, null, null, 800.0));
    }
}
