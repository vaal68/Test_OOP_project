class Predators(name: String, sound: String,var eatMeat: Boolean,var fangs: Boolean) :Animal (name, sound) {
    override fun toString(): String {
        return "${super.toString()}, eatMeat=$eatMeat, fangs=$fangs, class Predators;"
    }
}