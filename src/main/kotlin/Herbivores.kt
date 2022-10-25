class Herbivores(name: String, sound: String,var eatPlants: Boolean,var herd: Boolean) :Animal(name, sound) {
    override fun toString(): String {
        return "${super.toString()}, eatPlants=$eatPlants, herd=$herd, class Herbivores;"
    }
}