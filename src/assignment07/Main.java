package assignment07;

import assignment07.cycles.Bicycle;
import assignment07.cycles.Cycle;
import assignment07.cycles.Tricycle;
import assignment07.cycles.Unicycle;
import assignment07.rodents.Beaver;
import assignment07.rodents.GuineaPig;
import assignment07.rodents.Hamster;
import assignment07.rodents.Rat;
import assignment07.rodents.Rodent;

public class Main {
	
	public static void main(String args[]) {
		Main main = new Main();
		//main.doRodents();
		main.doCycles();
		
	}

	private void doCycles() {
		Cycle[] cycles = new Cycle[3];
		
		Unicycle unicycle = new Unicycle();
		cycles[0] = unicycle;
		
		Bicycle bicycle = new Bicycle();
		cycles[1] = bicycle;
		
		Tricycle tricycle = new Tricycle();
		cycles[2] = tricycle;
		for(Cycle cycle : cycles) {
			cycle.balance();
			((Cycle) cycle).balance();
		}
		((Cycle) unicycle).balance();
		((Cycle) bicycle).balance();
		((Cycle) tricycle).balance();
		
	}

	private void doRodents() {
		Rodent[] rodents = new Rodent[4];
		rodents[0] = new Rat();
		rodents[1] = new GuineaPig();
		rodents[2] = new Hamster();
		rodents[3] = new Beaver();
		
		for(Rodent rodent : rodents) {
			// We cannot invoke rodent.doSomething() if the method is abstract
			// Removing the abstract modifier
			rodent.doSomething();
		}
	}

}
