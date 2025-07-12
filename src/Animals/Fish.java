package Animals;

public class Fish extends Animal implements ILiveInWater {

    public Fish(){
        super("Карась");
    }

    @Override
    public String getType(){
        return "Рыба";
    }
   @Override
    public String LiveInWater(){
        return " Живет в воде";
    }
   
}
