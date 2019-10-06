package builderpattern;

import org.junit.Test;

public class TestPet {

    @Test
    public void testBuilder(){
        final Pet.Builder builder=new Pet.Builder();
        final Pet pet=builder.withAnimal(Animal.CAT)
                .withPetName("haha")
                .withOwnerName("Mr.Simth")
                .withAddress("five street")
                .withTelephone("2222222")
                .build();
        System.out.println(pet.getAnimal());
        System.out.println(pet.getPetName());
        System.out.println(pet.getOwnerName());
        System.out.println(pet.getAddress());
        System.out.println(pet.getTelephone());
    }
}
