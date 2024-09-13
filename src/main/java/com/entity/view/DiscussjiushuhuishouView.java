package com.entity.view;

import com.entity.DiscussjiushuhuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旧书回收评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@TableName("discussjiushuhuishou")
public class DiscussjiushuhuishouView  extends DiscussjiushuhuishouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiushuhuishouView(){
	}
 
 	public DiscussjiushuhuishouView(DiscussjiushuhuishouEntity discussjiushuhuishouEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiushuhuishouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
