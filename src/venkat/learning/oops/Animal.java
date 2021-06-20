package venkat.learning.oops;

public class Animal {
    public  void eat(){
        System.out.println("Eating");
    }
     static class Dog extends Animal {
        public void bark(){
            System.out.println("Barking");
        }
        public static void main(String[]args){
            Animal.Dog dog=new Animal.Dog();
            dog.bark();
            dog.eat();
        }
    }
}
