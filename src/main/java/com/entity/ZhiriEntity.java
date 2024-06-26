package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 值日
 *
 * @author 
 * @email
 */
@TableName("zhiri")
public class ZhiriEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhiriEntity() {

	}

	public ZhiriEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 保安
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 值日日期
     */
    @TableField(value = "zhiri_time",fill = FieldFill.UPDATE)

    private String zhiriTime;


    /**
     * 备注
     */
    @TableField(value = "zhiri_content")

    private String zhiriContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：保安
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：保安
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：值日日期
	 */
    public String getZhiriTime() {
        return zhiriTime;
    }


    /**
	 * 获取：值日日期
	 */

    public void setZhiriTime(String zhiriTime) {
        this.zhiriTime = zhiriTime;
    }
    /**
	 * 设置：备注
	 */
    public String getZhiriContent() {
        return zhiriContent;
    }


    /**
	 * 获取：备注
	 */

    public void setZhiriContent(String zhiriContent) {
        this.zhiriContent = zhiriContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zhiri{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", zhiriTime=" + zhiriTime +
            ", zhiriContent=" + zhiriContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
