//import Calculator.Numeric;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scaner = new Scanner(System.in);// класс для чтения ввода из различных источников
//        Numeric numeric = new Numeric();
//
//        System.out.println("Калькулятор");
//        System.out.println("1 - Сложение +");
//        System.out.println("2 - Вычитание -");
//        System.out.println("3 - Умножение *");
//        System.out.println("4 - Деление /");
//
//        while (true)
//        {
//            System.out.print("Выберите операцию от 0 - 4 ");
//            int choise = scaner.nextInt();
//            if(choise == 0){
//                System.out.println("До свидания");
//                break;
//            }
//
//            System.out.print("Введите первое число ");
//            double a = scaner.nextDouble();
//            System.out.print("Введите второе число ");
//            double b = scaner.nextDouble();
//            double result = Calc(choise, a, b);
//
//            if (result != Double.MAX_VALUE) {
//                System.out.printf("Результат: %.2f\n", result);
//            }
//        }
//           scaner.close();
//    }
//
//    public static double Calc(int number, double a, double b) {
//       switch (number){
//           case 1:
//               return Numeric.add(a, b);
//           case 2:
//               return Numeric.subtracting(a, b);
//           case 3:
//               return  Numeric.multiplication(a, b);
//           case 4:
//               if (b == 0 ){
//                   System.out.println("Деление на 0 запрещено");
//                   return Double.MAX_VALUE;
//               }
//               return  Numeric.division(a, b);
//
//           default:
//               System.out.println("Неизвестная операция!");
//               return Double.MAX_VALUE;
//       }
//    }
//}




//public class BufferedInputExample {
//
//    public static void main(String[] args) throws Exception {
//        InputStream inputStream = null;
//        BufferedInputStream buffer = null;
//
//        try {
//
//            inputStream = new FileInputStream("F:/SQL запросы.txt");
//
//            buffer = new BufferedInputStream(inputStream);
//
//            while(buffer.available()>0) {
//
//                char c = (char)buffer.read();
//
//                System.out.println("Был прочитан символ " + c);
//            }
//        } catch(Exception e) {
//
//            e.printStackTrace();
//
//        } finally {
//
//            inputStream.close();
//            buffer.close();
//        }
//    }
//}



import Animals.Animal;

import Animals.IMammal;
import Animals.IWool;
import Animals.ILiveInWater;
import Animals.IHasBones;

import Animals.Kat;
import Animals.Fish;
import Animals.Bear; 
import Animals.Whale;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args ){
        Animal kat = new Kat();
        Animal fish = new Fish();
        Animal bear = new Bear();
        Animal whale = new Whale();

        PrintAnimal(kat);
        PrintAnimal(fish);
        PrintAnimal(bear);
        PrintAnimal(whale);
        
        // Демонстрация работы equals и hashCode
        System.out.println("\n=== ДЕМОНСТРАЦИЯ equals и hashCode ===");
        
        // Создаем одинаковых животных
        Animal kat1 = new Kat();
        Animal kat2 = new Kat();
        Animal fish1 = new Fish();
        
        System.out.println("Сравнение одинаковых кошек:");
        System.out.println("kat1.equals(kat2): " + kat1.equals(kat2));
        System.out.println("kat1.hashCode() == kat2.hashCode(): " + (kat1.hashCode() == kat2.hashCode()));
        
        System.out.println("\nСравнение разных животных:");
        System.out.println("kat1.equals(fish1): " + kat1.equals(fish1));
        System.out.println("kat1.hashCode() == fish1.hashCode(): " + (kat1.hashCode() == fish1.hashCode()));
        
        // Демонстрация работы с HashSet
        System.out.println("\n=== РАБОТА С HashSet ===");
        Set<Animal> animalSet = new HashSet<>();
        animalSet.add(kat1);
        animalSet.add(kat2); // Дубликат - не добавится
        animalSet.add(fish1);
        animalSet.add(bear);
        animalSet.add(whale);
        
        System.out.println("Размер HashSet: " + animalSet.size());
        System.out.println("Содержит ли Set кошку: " + animalSet.contains(new Kat()));
    }

    public static void PrintAnimal(Animal animal){
      
        System.out.println("\n--------------" + animal.getName() + "------------------");
        System.out.println("\n--------------" + animal.getType() + "------------------");

        if (animal instanceof IMammal){
           System.out.println("Класс животного: " + ((IMammal) animal).Mammal());
        }
        if (animal instanceof IWool){
            System.out.println("Наличие шерсти: " + ((IWool) animal).Wool());
        }
        if (animal instanceof IHasBones){
            System.out.println("Наличие позвоночника: " + ((IHasBones) animal).HasBones());
        }
        if (animal instanceof ILiveInWater){
            System.out.println("Среда обитания: " + ((ILiveInWater) animal).LiveInWater());
        }
    }
}
