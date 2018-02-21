package com.techdata.annotation.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 /**
  * This is MyBatis related class. For connection via MyBatis
  * to database. 
  * @author 806560
  *
  */
public class DbConnection {
    
	private static DbConnection dbConnection;
    private SqlSessionFactory sqlSessionFactory;
 
    public static DbConnection getDbConnection(){
    	if(dbConnection == null){
    		dbConnection = new DbConnection();
    	}
    	return dbConnection;
    }
    
    /**
     * It reads config file written in specific location. Create
     * and return sqlSession Factory. Something similar to java.util.Connection
     * Through app there is openSession on SqlSession object that we can relate to 
     * java.util.Statement. Big picture is the same. And finally there
     * is Mappers folder with mapping files of modeled beans. 
     * @return SqlSessionFactory
     */
    public SqlSessionFactory getConnection(){
        try {
 
            String resource = "com/techdata/annotation/util/mappers/config.xml";
            Reader reader = Resources.getResourceAsReader(resource);
 
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }
            return sqlSessionFactory;

        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }
    
    
}