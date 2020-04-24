package ros.java.spring.dao;

import java.util.List;

import ros.java.spring.entity.EntityOwner;

public interface DAOOwner {
	
	List<EntityOwner> getOwners();
	
	void addOwner(EntityOwner owner);
	
	void saveOwner(EntityOwner owner);
	
	EntityOwner getOwner(int id);
	
	void deleteOwner(int id);
	
	

}
