package Animals;
//класс медведь
public class Bear extends Animal implements IHasBones, IWool, IMammal {
   
   public Bear(){
    super("Белый медведь");
   }
   @Override
   public String getType(){
    return "Медведь";
   }
    @Override
    public String HasBones(){
       return " Имеет позвоночник";
    }
    @Override
    public String Wool(){
        return " Имеет шерсть";
    }
    @Override
    public String Mammal(){
        return "Млекопитающее";
    }

}
