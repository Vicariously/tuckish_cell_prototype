package jenkins.tucker.test1.collections.Entity;

import java.util.ArrayList;
import java.util.List;

public class Environment {
	//there is only one environment
	private static Environment instance;
	
	private final List<Cell> cells = new ArrayList<Cell>();
	
	private Environment(){}
	
	public Environment getInstance(){
		if(instance == null){
			instance = new Environment();
		}
		return instance;
	}

	public List<? extends Organism> getCells() {
		return cells;
	}
	
}
