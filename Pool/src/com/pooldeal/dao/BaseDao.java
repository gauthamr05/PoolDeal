package com.pooldeal.dao;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class BaseDao {

	public static DB getMongoConnection()
	{
	MongoClient mongo = null;
	DB db = null;
	try {
		mongo = new MongoClient( "localhost" , 27017 );
		db = mongo.getDB("pooldeal");
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return db;
	}
}
