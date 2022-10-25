fun main() {
    val animal1 = Predators("Cat","Meow", eatMeat = true, fangs = true)
    val animal2 = Predators("Dog","woof", eatMeat = true, fangs = true)
    val animal3 = Herbivores("Cow","Moo", eatPlants = true, herd = true)
    val animal4 = Herbivores("Rabbit","snuffle", eatPlants = true, herd = true )

    val list = mutableListOf<Animal>()
    list.add(animal1)
    list.add(animal2)
    list.add(animal3)
    list.add(animal4)

    print(list)

}

