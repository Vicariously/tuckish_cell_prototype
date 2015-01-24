package jenkins.tucker.test1.collections.Entity;
import jenkins.tucker.test1.collections.Entity.States.*;
import jenkins.tucker.test1.collections.Entity.States.Diseased.DiseasedState;
import jenkins.tucker.test1.collections.Entity.States.Injured.InjuredState;

import java.util.List;

/*
 * The cell can be diseased and/or injured
 * 
 * The Cell class is the owner of the
 * different states the Cell can be in.
 * 
 * The Cell is also the owner of the actions
 * (methods) that can be applied to the states.
 * 
 * I.E. Cell is what we are manipulating
 * through outside behavior.
 * 
 */

public class Cell extends Organism{
	
	private CellState cellState;
	private DiseasedState diseasedState;
	private InjuredState injuredState;
	
	public void Cell(){
		this.daysOld = 0;
		this.initialize(); 
	}
	
	private void initialize(){
		//setting up for first time
		this.cellState = CellStateDefault.getInstance();
		this.cellState.determineCellState(this);
		
	}
}
