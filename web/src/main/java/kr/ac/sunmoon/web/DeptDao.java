package kr.ac.sunmoon.web;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    public Dept select(Dept dept) {
        return sqlSessionTemplate.selectOne("kr.ac.sunmoon.web.DeptMapper.select", dept);
    }
}