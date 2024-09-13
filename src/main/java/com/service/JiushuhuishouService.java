package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiushuhuishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiushuhuishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiushuhuishouView;


/**
 * 旧书回收
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface JiushuhuishouService extends IService<JiushuhuishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiushuhuishouVO> selectListVO(Wrapper<JiushuhuishouEntity> wrapper);
   	
   	JiushuhuishouVO selectVO(@Param("ew") Wrapper<JiushuhuishouEntity> wrapper);
   	
   	List<JiushuhuishouView> selectListView(Wrapper<JiushuhuishouEntity> wrapper);
   	
   	JiushuhuishouView selectView(@Param("ew") Wrapper<JiushuhuishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiushuhuishouEntity> wrapper);
   	
}

