package com.woniu.mapper;

import com.woniu.pojo.Role;
import com.woniu.pojo.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    long countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int deleteByPrimaryKey(Integer rid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    Role selectByPrimaryKey(Integer rid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int updateByPrimaryKey(Role record);
}