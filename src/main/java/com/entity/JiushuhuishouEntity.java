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
 * 旧书回收
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@TableName("jiushuhuishou")
public class JiushuhuishouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiushuhuishouEntity() {
		
	}
	
	public JiushuhuishouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 回收名称
	 */
					
	private String huishoumingcheng;
	
	/**
	 * 类别
	 */
					
	private String leibie;
	
	/**
	 * 标签
	 */
					
	private String biaoqian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 回收价
	 */
					
	private Integer huishoujia;
	
	/**
	 * 回收详情
	 */
					
	private String huishouxiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：回收名称
	 */
	public void setHuishoumingcheng(String huishoumingcheng) {
		this.huishoumingcheng = huishoumingcheng;
	}
	/**
	 * 获取：回收名称
	 */
	public String getHuishoumingcheng() {
		return huishoumingcheng;
	}
	/**
	 * 设置：类别
	 */
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
	/**
	 * 设置：标签
	 */
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	/**
	 * 获取：标签
	 */
	public String getBiaoqian() {
		return biaoqian;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：回收价
	 */
	public void setHuishoujia(Integer huishoujia) {
		this.huishoujia = huishoujia;
	}
	/**
	 * 获取：回收价
	 */
	public Integer getHuishoujia() {
		return huishoujia;
	}
	/**
	 * 设置：回收详情
	 */
	public void setHuishouxiangqing(String huishouxiangqing) {
		this.huishouxiangqing = huishouxiangqing;
	}
	/**
	 * 获取：回收详情
	 */
	public String getHuishouxiangqing() {
		return huishouxiangqing;
	}

}
