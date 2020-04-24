package ros.java.spring.service;

import java.util.List;

import ros.java.spring.entity.EntityOwner;

public interface ServiceOwner {

	List<EntityOwner> getOwners();
	
	void saveOwner(EntityOwner owner);
	
	EntityOwner getOwner(int id);
	
	void addOwner(EntityOwner owner);
	
	void deleteOwner(int id);
	
}
