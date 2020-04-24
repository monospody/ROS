package ros.java.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ros.java.spring.dao.DAOOwner;
import ros.java.spring.entity.EntityOwner;

@Service
public class ServiceOwnerImpl implements ServiceOwner {

	@Autowired
	private DAOOwner ownerDAO;
	
	@Override
	@Transactional
	public List<EntityOwner> getOwners() {
		return ownerDAO.getOwners();
	}

	@Override
	@Transactional
	public void saveOwner(EntityOwner owner) {
		ownerDAO.saveOwner(owner);

	}

	@Override
	@Transactional
	public EntityOwner getOwner(int id) {
		return ownerDAO.getOwner(id);
	}

	@Override
	@Transactional
	public void addOwner(EntityOwner owner) {
		ownerDAO.addOwner(owner);

	}

	@Override
	public void deleteOwner(int id) {
		ownerDAO.deleteOwner(id);

	}

}
