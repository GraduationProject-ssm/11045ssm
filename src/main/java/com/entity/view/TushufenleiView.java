package com.entity.view;

import com.entity.TushufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@TableName("tushufenlei")
public class TushufenleiView  extends TushufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TushufenleiView(){
	}
 
 	public TushufenleiView(TushufenleiEntity tushufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, tushufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
