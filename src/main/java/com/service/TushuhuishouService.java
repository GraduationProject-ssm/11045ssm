package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushuhuishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushuhuishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuhuishouView;


/**
 * 图书回收
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface TushuhuishouService extends IService<TushuhuishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuhuishouVO> selectListVO(Wrapper<TushuhuishouEntity> wrapper);
   	
   	TushuhuishouVO selectVO(@Param("ew") Wrapper<TushuhuishouEntity> wrapper);
   	
   	List<TushuhuishouView> selectListView(Wrapper<TushuhuishouEntity> wrapper);
   	
   	TushuhuishouView selectView(@Param("ew") Wrapper<TushuhuishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuhuishouEntity> wrapper);
   	
}

