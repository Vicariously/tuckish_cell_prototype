package jenkins.tucker.test1.collections.Factory;

import java.util.ArrayList;
import java.util.List;

import jenkins.tucker.test1.collections.Entity.Organism;
import jenkins.tucker.test1.collections.Entity.Diseases.Disease;
import jenkins.tucker.test1.collections.Entity.Injury.Injury;

public class OrganismPool<T extends Organism> {
	private final List<T> pool = new ArrayList<T>();
	private final OrganismFactory<T> factory;
	
	public OrganismPool(OrganismFactory<T> factory, int max){
		this.factory = factory;
	}
	
	public T retrieve() {
		if(!pool.isEmpty()){
			int size = pool.size();
			return pool.get(size-1);
		} else {
			return factory.createOrganism();
		}
	}
	
	public void restore(T organism){
		
	}
	
	private void cleanse(T organism){
		organism.setDiseases(new ArrayList<Disease>());
		organism.setInjuries(new ArrayList<Injury>());
		organism.setDaysOld(0);
		organism.setHasReproduced(false);
		organism.setReproducable(false);
	}
	
		
}
