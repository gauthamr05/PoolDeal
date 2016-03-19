package com.pooldeal.dao;

import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.pooldeal.domain.User;

@Repository
public class PoolDealDAO extends BaseDao{

	public static DB db = getMongoConnection();


	public void createUser(User user) {
		DBCollection coll = db.getCollection("user");
		BasicDBObject doc = new BasicDBObject("email", user.getEmail()).
	            append("password", user.getPwd());
		coll.insert(doc);
	}

	public boolean authUser(User user)
	{


		BasicDBObject fields = new BasicDBObject();

		fields.put("email", user.getEmail());
		fields.put("password", user.getPwd());

		DBCollection coll = db.getCollection("user");
	    DBCursor cursor = coll.find(fields);

	    while(cursor.hasNext())
	    {
	    	System.out.println(cursor.next());
	    	return true;
	    }
	    return false;
	}




}
