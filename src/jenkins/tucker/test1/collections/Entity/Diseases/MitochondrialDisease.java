package jenkins.tucker.test1.collections.Entity.Diseases;

import jenkins.tucker.test1.collections.Entity.Organism;

public class MitochondrialDisease extends Disease{
	
	public MitochondrialDisease(){
		this.congenital = true;
	}

	@Override
	public void afflict(Organism o) {
		// TODO Auto-generated method stub
		//get parents, check if they had the disease, and increase modifer
		
	}

}
