package jenkins.tucker.test1.collections.Entity.States.Diseased;

import jenkins.tucker.test1.collections.Entity.Organism;
import jenkins.tucker.test1.collections.Entity.States.CellState;

public abstract class DiseasedState extends CellState{
	abstract void determineDiseasedState();
	abstract void calculateSusceptibility(Organism o);
}
