package jenkins.tucker.test1.collections.Entity.Diseases;

import jenkins.tucker.test1.collections.Entity.Organism;

public abstract class Disease {
	protected boolean congenital;
	protected int afflictionModifier;
	
	public abstract void afflict(Organism o);

	public boolean isCongenital() {
		return congenital;
	}

	public void setCongenital(boolean congenital) {
		this.congenital = congenital;
	}
	
	
}
