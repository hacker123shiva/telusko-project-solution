 

public class Main {
    public static void main(String []args){
        // Parent.Child obj=new Parent().new Child();   //Not possible if child class is not static 
          Parent.Child obj=new Parent.Child();
          obj.speak();

    }

}


abstract class Parent{

   static class Child{

        public void speak(){
            System.out.println("speak first Maa");
        }
    }

}