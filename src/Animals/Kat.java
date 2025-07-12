package Animals;

// класс кошка
public  class Kat extends Animal implements IHasBones, IWool, IMammal {
    
    public Kat(){
        super("Сибирская кошка");
    }
    @Override
    public String getType(){
        return "Кошка";
    }
    @Override
    public String HasBones(){
        return("Имеет позвоночник");
    }
    @Override
    public String Wool(){
       return("Имеет шерсть");
    }
    @Override
    public String Mammal(){
       return("Млекопитающее");
    }
}
