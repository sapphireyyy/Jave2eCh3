package com.yy.ch3.main;

import com.yy.ch3.mapper.RoleMapper;
import com.yy.ch3.pojo.Role;
import org.apache.ibatis.session.SqlSession;
import com.yy.ch3.utils.SqlSessionFactoryUtils;
import org.apache.log4j.Logger;

public class Ch3Main {

    public static void main(String[] args) {
        Logger log = Logger.getLogger(Ch3Main.class);
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(2L);
            log.debug(role.getRoleName());
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
