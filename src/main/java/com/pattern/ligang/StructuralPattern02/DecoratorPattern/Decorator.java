package com.pattern.ligang.StructuralPattern02.DecoratorPattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:29
 */
public class Decorator implements Person{
	protected  Person person;
	public void setPerson(Person person){
		this.person = person;
	}
	@Override
	public void eat() {
           person.eat();
	}
}
