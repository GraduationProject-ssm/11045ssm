package com.entity.view;

import com.entity.XinshubangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新书榜
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@TableName("xinshubang")
public class XinshubangView  extends XinshubangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinshubangView(){
	}
 
 	public XinshubangView(XinshubangEntity xinshubangEntity){
 	try {
			BeanUtils.copyProperties(this, xinshubangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
