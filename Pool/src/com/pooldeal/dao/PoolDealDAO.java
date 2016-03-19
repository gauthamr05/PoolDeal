package com.pooldeal.dao;

import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.pooldeal.domain.Registration;
import com.pooldeal.domain.User;

@Repository
public class PoolDealDAO extends BaseDao{

	public static DB db = getMongoConnection();
	public boolean getUserDetails(User user)
	{
		return false;

		//db.createCollection("user", null);
	}


	public void createUser(User user) {
		DBCollection coll = db.getCollection("user");
		BasicDBObject doc = new BasicDBObject("email", user.getEmail()).
	            append("password", user.getPwd());
		coll.insert(doc);
	}

//	public void createUser(Registration registration) {
//		DBCollection coll = db.getCollection("user");
//		BasicDBObject doc = new BasicDBObject(registration.getEmail(),registration.getPassword()).
//	            append("password", "abc123");
//		coll.insert(doc);
//	}

}
