package Animals;

import java.util.Objects;

public abstract class Animal {

    private final String name;
    
    public Animal (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public abstract String getType();
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return Objects.equals(name, animal.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
   
}
