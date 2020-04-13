package abstractclass.abstractclasses;

class ExtendsDogClass extends  AbstractClassDog{



    // abstract classes have to be extended
    // one method is defined and one is abstracted  so we need to tell what inside it

    @Override
    void pop() {
        System.out.println(" === pop ??? ===");
    }
}
