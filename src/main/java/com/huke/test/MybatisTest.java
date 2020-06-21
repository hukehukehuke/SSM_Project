package com.huke.test;

import com.huke.dao.AccountDao;
import com.huke.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void run() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取到代理对象
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        //查询数据
        List<Account> accountList = mapper.findAll();
        for(Account account : accountList){
            System.out.println(account);
        }
        // 关闭资源
        sqlSession.close();
        inputStream.close();
    }
}
