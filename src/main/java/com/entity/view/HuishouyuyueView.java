package com.entity.view;

import com.entity.HuishouyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 回收预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@TableName("huishouyuyue")
public class HuishouyuyueView  extends HuishouyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuishouyuyueView(){
	}
 
 	public HuishouyuyueView(HuishouyuyueEntity huishouyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, huishouyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
