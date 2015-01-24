package jenkins.tucker.test1.collections.Factory;

import jenkins.tucker.test1.collections.Entity.Organism;

public interface OrganismFactory<T extends Organism> {
	T createOrganism();

}
