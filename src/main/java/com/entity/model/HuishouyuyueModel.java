package com.entity.model;

import com.entity.HuishouyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 回收预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public class HuishouyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 回收名称
	 */
	
	private String huishoumingcheng;
		
	/**
	 * 预约名称
	 */
	
	private String yuyuemingcheng;
		
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
	 * 预约日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueriqi;
		
	/**
	 * 上门时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangmenshijian;
		
	/**
	 * 预约内容
	 */
	
	private String yuyueneirong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 上门地址
	 */
	
	private String shangmendizhi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：预约名称
	 */
	 
	public void setYuyuemingcheng(String yuyuemingcheng) {
		this.yuyuemingcheng = yuyuemingcheng;
	}
	
	/**
	 * 获取：预约名称
	 */
	public String getYuyuemingcheng() {
		return yuyuemingcheng;
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
	 * 设置：预约日期
	 */
	 
	public void setYuyueriqi(Date yuyueriqi) {
		this.yuyueriqi = yuyueriqi;
	}
	
	/**
	 * 获取：预约日期
	 */
	public Date getYuyueriqi() {
		return yuyueriqi;
	}
				
	
	/**
	 * 设置：上门时间
	 */
	 
	public void setShangmenshijian(Date shangmenshijian) {
		this.shangmenshijian = shangmenshijian;
	}
	
	/**
	 * 获取：上门时间
	 */
	public Date getShangmenshijian() {
		return shangmenshijian;
	}
				
	
	/**
	 * 设置：预约内容
	 */
	 
	public void setYuyueneirong(String yuyueneirong) {
		this.yuyueneirong = yuyueneirong;
	}
	
	/**
	 * 获取：预约内容
	 */
	public String getYuyueneirong() {
		return yuyueneirong;
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
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
