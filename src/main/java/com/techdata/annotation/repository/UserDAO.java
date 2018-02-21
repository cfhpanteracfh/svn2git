package com.techdata.annotation.repository;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.techdata.annotation.model.beans.User;
import com.techdata.annotation.util.DbConnection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

@Repository
public class UserDAO {


    /**
     * insert user
     * 
     * @param User user
     * @return integer id
     * @throws SQLException
     */
    public void insert(User user) throws SQLException {
    	SqlSessionFactory sf = DbConnection.getDbConnection().getConnection();
    	SqlSession session = sf.openSession();
        session.insert("User.insert", user);
        session.commit();
        
        
    }

   

}