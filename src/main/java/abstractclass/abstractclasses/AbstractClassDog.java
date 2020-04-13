package abstractclass.abstractclasses;

 abstract  class AbstractClassDog {

     // Important : abstract classes means methods could be abstracted

   String breed ;


   // since we did not add the word abstract to this function , we have to implement it
   void bark(){

       System.out.println("===  baking !!!  =====");
   }

   // since we add abstract word to it , we dont need to tell what inside it
   abstract void pop();
}
