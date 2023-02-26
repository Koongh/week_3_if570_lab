package example.myapp

interface FishColor{
    val color: String
}

interface FishAction{
    fun eat()
}

object GoldColor: FishColor{
    override val color = "gold"
}

class PrintingFishAction(val food: String): FishAction{
    override fun eat() {
        println(food)
    }
}

//abstract  class AquariumFish: FishAction {
//    abstract val color: String
//    override fun eat() = println("yum")
//}
//class Shark: AquariumFish(), FishAction
class Shark: FishAction, FishColor{
    override val color = "grey"
    override fun eat(){
        println("hunt and eat fish")
    }

}
//class Plecostomus: AquariumFish(), FishAction
//class Plecostomus: FishAction, FishColor{
//    override val color = "gold"
//    override fun eat(){
//        println("eat algae")
//    }
//}

//class Plecostomus: FishAction, FishColor by GoldColor
//class Plecostomus(fishColor: FishColor = GoldColor): FishAction, FishColor by GoldColor{
//
//    override fun eat(){
//        println("eat algae")
//    }
//}

class Plecostomus(fishColor: FishColor = GoldColor):FishColor by GoldColor, FishAction by PrintingFishAction("eat algae")




