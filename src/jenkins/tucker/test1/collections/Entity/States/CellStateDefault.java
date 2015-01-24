package jenkins.tucker.test1.collections.Entity.States;

import jenkins.tucker.test1.collections.Entity.Organism;

public class CellStateDefault extends CellState {
	
	private static CellStateDefault instance;
	
	private CellStateDefault(){	}
	
	public static CellStateDefault getInstance(){
			if (instance == null){
				instance = new CellStateDefault();
			} 
			return instance;
	}
	
	public void determineCellState(Organism o){
		super.determineCellState(o);
	}
}
