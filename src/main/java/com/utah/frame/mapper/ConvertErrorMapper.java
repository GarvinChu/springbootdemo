package com.utah.frame.mapper;

import com.utah.frame.entity.ConvertError;

public interface ConvertErrorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_convert_error
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_convert_error
     *
     * @mbg.generated
     */
    int insert(ConvertError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_convert_error
     *
     * @mbg.generated
     */
    int insertSelective(ConvertError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_convert_error
     *
     * @mbg.generated
     */
    ConvertError selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_convert_error
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ConvertError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_convert_error
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(ConvertError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_convert_error
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ConvertError record);
}