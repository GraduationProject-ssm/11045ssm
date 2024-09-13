package com.entity.model;

import com.entity.TushuhuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 图书回收
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public class TushuhuishouModel  implements Serializable {
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
	 * 回收价
	 */
	
	private String huishoujia;
		
	/**
	 * 重量
	 */
	
	private Integer zhongliang;
		
	/**
	 * 总价格
	 */
	
	private String zongjiage;
		
	/**
	 * 回收日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huishouriqi;
		
	/**
	 * 订单状态
	 */
	
	private String dingdanzhuangtai;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 上门地址
	 */
	
	private String shangmendizhi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：回收价
	 */
	 
	public void setHuishoujia(String huishoujia) {
		this.huishoujia = huishoujia;
	}
	
	/**
	 * 获取：回收价
	 */
	public String getHuishoujia() {
		return huishoujia;
	}
				
	
	/**
	 * 设置：重量
	 */
	 
	public void setZhongliang(Integer zhongliang) {
		this.zhongliang = zhongliang;
	}
	
	/**
	 * 获取：重量
	 */
	public Integer getZhongliang() {
		return zhongliang;
	}
				
	
	/**
	 * 设置：总价格
	 */
	 
	public void setZongjiage(String zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public String getZongjiage() {
		return zongjiage;
	}
				
	
	/**
	 * 设置：回收日期
	 */
	 
	public void setHuishouriqi(Date huishouriqi) {
		this.huishouriqi = huishouriqi;
	}
	
	/**
	 * 获取：回收日期
	 */
	public Date getHuishouriqi() {
		return huishouriqi;
	}
				
	
	/**
	 * 设置：订单状态
	 */
	 
	public void setDingdanzhuangtai(String dingdanzhuangtai) {
		this.dingdanzhuangtai = dingdanzhuangtai;
	}
	
	/**
	 * 获取：订单状态
	 */
	public String getDingdanzhuangtai() {
		return dingdanzhuangtai;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：上门地址
	 */
	 
	public void setShangmendizhi(String shangmendizhi) {
		this.shangmendizhi = shangmendizhi;
	}
	
	/**
	 * 获取：上门地址
	 */
	public String getShangmendizhi() {
		return shangmendizhi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
