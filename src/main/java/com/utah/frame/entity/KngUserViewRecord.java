package com.utah.frame.entity;

/**
 *
 * 用户浏览知识记录信息
 */
public class KngUserViewRecord {
    /**
     *   主键id
     *
     */
    private Long id;

    /**
     *   机构id
     *
     */
    private String orgId;

    /**
     *
     *   知识id
     *
     */
    private String kngId;

    /**
     *
     *   来源类型code,如kng、o2o、ote
     *
     *
     */
    private String targetCode;

    /**
     *
     *   用户id
     *
     */
    private String userId;

    /**
     *
     *   创建者部门id
     *
     */
    private String userDeptId;

    /**
     *
     *   创建者部岗位id
     *
     */
    private String userPostId;

    /**
     *
     *   创建人id
     *
     *
     */
    private String createUserId;

    /**
     *
     *   创建人姓名
     *
     */
    private String createFullname;

    /**
     *
     *   创建时间
     *
     */
    private String createTime;

    /**
     *
     *   更新者id
     *
     */
    private String updateUserId;

    /**
     *
     *   更新者名称
     *
     */
    private String updateFullname;

    /**
     *
     *   更新时间
     *
     */
    private String updateTime;


}