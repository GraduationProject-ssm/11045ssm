package com.entity.vo;

import com.entity.JiushuhuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 旧书回收
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public class JiushuhuishouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
