package Calculator;


public  class Numeric  {

    public static double add (double a, double b){

        return a+b;
    }

    public static double subtracting (double a, double b){
        double sum = a-b;
        System.out.println("результат вычитания");
        return sum;
    }
    public static double multiplication (double a, double b) {
        double sum = a * b;
        System.out.println("результат умножения");
        return sum;
    }

    public static double division (double a, double b ){
        double sum = a/ b;

        System.out.println("результат деления");
        return sum;
    }
}
