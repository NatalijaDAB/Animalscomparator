import java.util.*;

public class Main {
    public static void main(String[] args) {
//          create the list of animals
List<Animal> animals = Arrays.asList(new Animal("Mammals", 5, true), new Animal("Birds", 3, false));
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            //compare o1 and o2
            public int compare(Animal o1, Animal o2) {
                //the check integer P and J
//               System.out.println((int)o1.getType().charAt(0));
//               System.out.println((int)o2.getType().charAt(0));
                return (int) o1.getType().charAt(0)-(int) o2.getType().charAt(0);
            }
        });

        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            //compare o1 and o2
            public int compare(Animal o1, Animal o2) {
               return o1.getAge()- o2.getAge();
            }
        });
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            //compare o1 and o2
            public int compare(Animal o1, Animal o2) {
                return Boolean.compare(o1.isWild(),o2.isWild());
            }
        });

     for (Animal animal: animals)   {
     System.out.println(animal.getType());
         System.out.println(animal.getAge());
         System.out.println(animal.isWild());
             }

   Animal1[] animal1 = new Animal1[] {
           new Animal1("Parrot", 7, true),
           new Animal1("Hamster", 3, false)
   };
     Arrays.sort(animal1);
         System.out.println(Arrays.toString(animal1));
        }

    }
