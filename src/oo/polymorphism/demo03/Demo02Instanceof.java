package oo.polymorphism.demo03;

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal=new Dog();//本来是一只猫
        animal.eat();//猫吃鱼

        //如果希望调用子类特有方法，需要向下转型
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.watchHouse();
        }
        if(animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catchMouse();
        }
        giveMeAPet(new Dog());
    }
    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.watchHouse();
        }
        if(animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catchMouse();
        }
    }
}

