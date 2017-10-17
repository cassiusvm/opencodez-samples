package com.opencodez.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.opencodez.domain.UserModel;

@Repository
public class GenericRepoImpl implements GenericRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<UserModel> getUserModel() {

		String qry = "SELECT id as id, name as name, salary as salary FROM USER";
		Query query = entityManager.createNativeQuery(qry,
				UserModel.class);

		@SuppressWarnings("unchecked")
		List<UserModel> daoDtolist = query.getResultList();
		
		return daoDtolist;
	}

}
