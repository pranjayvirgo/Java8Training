2package com.globallogic.java8.defaultmethod;

public interface DefaultMethodInterface {
default String test(String name) {
	return name;
}
//Default Methods cannot be defined as abstract. 
//Implementation is Required
//default boolean test1();
//boolean test2();
default void  test3() {
	
}
//Static method is declared by defining the method body and defining static keyword against it.
//Cannot override in child classes.
//Utility classes can be replaced with static methods
static  void test4() {
	System.out.println("Static Default method");
}

}
