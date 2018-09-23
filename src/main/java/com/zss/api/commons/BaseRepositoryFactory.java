package com.zss.api.commons;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BaseRepositoryFactory extends SqlSessionDaoSupport {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public BaseRepositoryFactory() {
    }

    public int insert(String sqlMapperID, Object object) {
        return this.getSqlSession().insert(sqlMapperID, object);
    }

    public int update(String sqlMapperID, Object obj) {
        return this.getSqlSession().update(sqlMapperID, obj);
    }

    public int delete(String sqlMapperID, Object obj) {
        return this.getSqlSession().delete(sqlMapperID, obj);
    }

    public <T> T selectOne(String sqlMapperID) {
        return this.getSqlSession().selectOne(sqlMapperID);
    }

    protected <T> T selectOne(String sqlMapperID, Object obj) {
        return this.getSqlSession().selectOne(sqlMapperID, obj);
    }

    public <T> List<T> selectList(String sqlMapperID, Object obj) {
        return this.getSqlSession().selectList(sqlMapperID, obj);
    }
}
