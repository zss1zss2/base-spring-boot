package com.zss.api.hello;

import com.zss.api.commons.BaseRepositoryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository extends BaseRepositoryFactory {

    private static final String SQL_MAPPER_PREFIX = "com.zss.api.hello.Hello.";

    private static final String SELECT = "selectById";

    Hello getHelloById(String id) {
        return super.selectOne(SQL_MAPPER_PREFIX + SELECT, id);
    }

}
