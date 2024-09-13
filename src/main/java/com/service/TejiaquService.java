package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TejiaquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TejiaquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TejiaquView;


/**
 * 特价区
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface TejiaquService extends IService<TejiaquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TejiaquVO> selectListVO(Wrapper<TejiaquEntity> wrapper);
   	
   	TejiaquVO selectVO(@Param("ew") Wrapper<TejiaquEntity> wrapper);
   	
   	List<TejiaquView> selectListView(Wrapper<TejiaquEntity> wrapper);
   	
   	TejiaquView selectView(@Param("ew") Wrapper<TejiaquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TejiaquEntity> wrapper);
   	
}

