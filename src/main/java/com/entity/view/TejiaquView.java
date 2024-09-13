package com.entity.view;

import com.entity.TejiaquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特价区
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@TableName("tejiaqu")
public class TejiaquView  extends TejiaquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TejiaquView(){
	}
 
 	public TejiaquView(TejiaquEntity tejiaquEntity){
 	try {
			BeanUtils.copyProperties(this, tejiaquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
