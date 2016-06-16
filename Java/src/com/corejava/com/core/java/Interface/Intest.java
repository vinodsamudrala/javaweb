package com.corejava.com.core.java.Interface;

interface Ian{
	public boolean Menatality();
	public boolean Good();
}

class ability implements Ian{
	
	public ability(){
		System.out.println("ok");
		
	}

	@Override
	public boolean Menatality() {
		System.out.println("Stable");
		return false;
	}

	@Override
	public boolean Good() {
		System.out.println("Unstable");
		return false;
	}
	
}
class abilitychild extends ability{
	public abilitychild(){
		System.out.println("Extended class");
	}
	@Override
	public boolean Good() {
		System.out.println("Extended class inheited property");
		return true;
	}
}
class rakes implements Ian{

	@Override
	public boolean Menatality() {
		System.out.println("Rakesh class");
		
		return true;
	}

	@Override
	public boolean Good() {
		System.out.println("Rakesh class details");
		
		return true;
	}
	
}
	class rchild extends rakes{
		public rchild(){
			System.out.println("inside rchild");
		}
		
	}
	
public class Intest {
	
	public static void main(String[] args) {
		Ian ability = new ability();
		ability.Menatality();
		ability.Good();
		
		Ian Asha= new ability();
		Asha.Menatality();
		Asha.Good();
		
		Ian rakesh = new rakes();
		rakesh.Menatality();
		rchild rc = new rchild();
		rc.Menatality();
		
		ability ab= new ability();
		ab.Menatality();
		ab.Good();
	
		
	}
}