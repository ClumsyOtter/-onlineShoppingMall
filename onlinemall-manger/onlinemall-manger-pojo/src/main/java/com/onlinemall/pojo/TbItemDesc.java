package com.onlinemall.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemDesc implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_desc.item_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_desc.created
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_desc.updated
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_desc.item_desc
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String itemDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_desc.item_id
     *
     * @return the value of tb_item_desc.item_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_desc.item_id
     *
     * @param itemId the value for tb_item_desc.item_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_desc.created
     *
     * @return the value of tb_item_desc.created
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_desc.created
     *
     * @param created the value for tb_item_desc.created
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_desc.updated
     *
     * @return the value of tb_item_desc.updated
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_desc.updated
     *
     * @param updated the value for tb_item_desc.updated
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_desc.item_desc
     *
     * @return the value of tb_item_desc.item_desc
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_desc.item_desc
     *
     * @param itemDesc the value for tb_item_desc.item_desc
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}