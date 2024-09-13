package com.entity.view;

import com.entity.DiscusstejiaquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特价区评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@TableName("discusstejiaqu")
public class DiscusstejiaquView  extends DiscusstejiaquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstejiaquView(){
	}
 
 	public DiscusstejiaquView(DiscusstejiaquEntity discusstejiaquEntity){
 	try {
			BeanUtils.copyProperties(this, discusstejiaquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
