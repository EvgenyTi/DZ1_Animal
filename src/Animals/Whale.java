package Animals;
//Кит
public class Whale extends Animal implements ILiveInWater, IHasBones, IMammal {
   
   public Whale(){
    super ("Косатка");
   }
   @Override
   public String getType(){
    return "Кит";
   }
   @Override
    public String LiveInWater(){
       return "Живет в воде";
    }
    @Override
    public String HasBones(){
        return "Имеет позвоночник";
    }
    @Override
    public String Mammal(){
        return "Млекопитающее";
    }
}
