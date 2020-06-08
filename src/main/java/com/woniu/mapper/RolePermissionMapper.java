package com.woniu.mapper;

import com.woniu.pojo.RolePermission;
import com.woniu.pojo.RolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    long countByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int deleteByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int deleteByPrimaryKey(Integer rpid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int insert(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int insertSelective(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    List<RolePermission> selectByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    RolePermission selectByPrimaryKey(Integer rpid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int updateByExampleSelective(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int updateByExample(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac..role_permission
     *
     * @mbg.generated Mon Jun 08 17:52:10 CST 2020
     */
    int updateByPrimaryKey(RolePermission record);
}