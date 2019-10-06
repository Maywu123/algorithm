package builderpattern;
/*
*Builder pattern,更容易创建pet对象
 */

public class Pet {

    public static class Builder {//属于Pet中的一部分，为创建Pet对象
        private Animal animal;
        private String petName;
        private String ownerName;
        private String address;
        private String telephone;

        public Builder withAnimal(final Animal animal) {
            this.animal = animal;
            return this;
        }

        public Builder withPetName(final String petName) {
            this.petName = petName;
            return this;
        }

        public Builder withOwnerName(final String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder withAddress(final String address) {
            this.address = address;
            return this;
        }

        public Builder withTelephone(final String telephone) {
            this.telephone = telephone;
            return this;
        }


        //返回真正的pet对象
        public Pet build() {
            if (animal == null || petName == null || ownerName == null || address == null || telephone == null) {
                throw new IllegalStateException("Connot create pet ");
            }
            return new Pet(animal, petName, ownerName, address, telephone);
        }

    }

    private final Animal animal;
    private final String petName;
    private final String ownerName;
    private final String address;
    private final String telephone;

    private Pet(final Animal animal, final String petName, final String ownerName, final String address, final String telephone) {
        this.animal = animal;
        this.petName = petName;
        this.ownerName = ownerName;
        this.address = address;
        this.telephone = telephone;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }
}
