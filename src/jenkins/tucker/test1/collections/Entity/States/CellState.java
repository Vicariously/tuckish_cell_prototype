package jenkins.tucker.test1.collections.Entity.States;

import jenkins.tucker.test1.collections.Entity.Organism;

public abstract class CellState {
	
	public void determineCellState(Organism o){
		if(o.getDaysOld() < 10){
			this.setNew(o);		
		}else if (o.getDaysOld() >= 10 && o.getDaysOld() < 20){
			this.setYouth(o);
		}else if (o.getDaysOld() >= 20 && o.getDaysOld() < 50){
			this.setAdult(o);
		}else if (o.getDaysOld() >=50 && o.getDaysOld() < 65){
			this.setOld(o);
		}else{
			this.setDeceased(o);
		}
	}
	
	private void setNew(Organism o){
			o.setAge(Organism.Age.NEW);
			o.setVitality(Organism.Vitality.STRONG);
			o.setSpeed(Organism.Speed.SLOW);
			o.setMass(Organism.Mass.TINY);
	}
	
	private void setYouth(Organism o){
			o.setAge(Organism.Age.YOUTH);
			o.setVitality(Organism.Vitality.STRONG);
			o.setSpeed(Organism.Speed.AVERAGE);
			o.setMass(Organism.Mass.SMALL);
	}
	
	private void setAdult(Organism o){
			o.setAge(Organism.Age.MIDDLE_AGED);
			o.setVitality(Organism.Vitality.STRONG);
			o.setSpeed(Organism.Speed.FAST);
			o.setMass(Organism.Mass.MEDIUM);
	}
	
	private void setOld(Organism o){
			o.setAge(Organism.Age.OLD);
			o.setVitality(Organism.Vitality.WEAK);
			o.setSpeed(Organism.Speed.AVERAGE);
			o.setMass(Organism.Mass.SMALL);
	}
	
	private void setDeceased(Organism o){
		o.setVitality(Organism.Vitality.DECEASED);
		o.setSpeed(Organism.Speed.STOPPED);
		o.setMass(Organism.Mass.TINY);
	}
	
}
