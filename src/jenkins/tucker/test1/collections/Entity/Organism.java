package jenkins.tucker.test1.collections.Entity;

import java.util.List;

public abstract class Organism {
	public enum Vitality{
		STRONG, AVERAGE, WEAK, DECEASED
	}
	
	public enum Age {
		OLD, MIDDLE_AGED, YOUTH, NEW
	}
	
	public enum Speed {
		FAST, AVERAGE, SLOW, STOPPED
	}
	
	public enum Mass {
		TINY, SMALL, MEDIUM
	}
	
	private Speed speed;
	private Age age;
	private Vitality vitality;
	private Mass mass;
	
	private List diseases;
	private List injuries;
	
	private boolean reproducable;
	private boolean hasReproduced;
	public static boolean timesReproduced;
	private List<? extends Organism> parents;
	
	protected int daysOld;
	private int lifespan;
	
	public Speed getSpeed() {
		return speed;
	}
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	public Age getAge() {
		return age;
	}
	public void setAge(Age age) {
		this.age = age;
	}
	public Vitality getVitality() {
		return vitality;
	}
	public void setVitality(Vitality vitality) {
		this.vitality = vitality;
	}
	
	public List getDiseases() {
		return diseases;
	}
	public void setDiseases(List diseases) {
		this.diseases = diseases;
	}
	public List getInjuries() {
		return injuries;
	}
	public void setInjuries(List injuries) {
		this.injuries = injuries;
	}
	public boolean isReproducable() {
		return reproducable;
	}
	public void setReproducable(boolean reproducable) {
		this.reproducable = reproducable;
	}
	public boolean isHasReproduced() {
		return hasReproduced;
	}
	public void setHasReproduced(boolean hasReproduced) {
		this.hasReproduced = hasReproduced;
	}
	public List<? extends Organism> getParents() {
		return parents;
	}
	public void setParents(List<? extends Organism> parents) {
		this.parents = parents;
	}
	public int getDaysOld() {
		return daysOld;
	}
	public void setDaysOld(int daysOld) {
		this.daysOld = daysOld;
	}
	public int getLifespan() {
		return lifespan;
	}
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
	public Mass getMass() {
		return mass;
	}
	public void setMass(Mass mass) {
		this.mass = mass;
	}
	
}
