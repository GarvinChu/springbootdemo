package com.utah.frame.mapper;

import com.utah.frame.entity.KngSkillTagMap;

public interface KngSkillTagMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kng_skill_tag_map
     *
     * @mbg.generated Tue Nov 10 15:22:12 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kng_skill_tag_map
     *
     * @mbg.generated Tue Nov 10 15:22:12 CST 2020
     */
    int insert(KngSkillTagMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kng_skill_tag_map
     *
     * @mbg.generated Tue Nov 10 15:22:12 CST 2020
     */
    int insertSelective(KngSkillTagMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kng_skill_tag_map
     *
     * @mbg.generated Tue Nov 10 15:22:12 CST 2020
     */
    KngSkillTagMap selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kng_skill_tag_map
     *
     * @mbg.generated Tue Nov 10 15:22:12 CST 2020
     */
    int updateByPrimaryKeySelective(KngSkillTagMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kng_skill_tag_map
     *
     * @mbg.generated Tue Nov 10 15:22:12 CST 2020
     */
    int updateByPrimaryKey(KngSkillTagMap record);
}