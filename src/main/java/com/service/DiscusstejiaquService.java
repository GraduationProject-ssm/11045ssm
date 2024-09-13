package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstejiaquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstejiaquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstejiaquView;


/**
 * 特价区评论表
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface DiscusstejiaquService extends IService<DiscusstejiaquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstejiaquVO> selectListVO(Wrapper<DiscusstejiaquEntity> wrapper);
   	
   	DiscusstejiaquVO selectVO(@Param("ew") Wrapper<DiscusstejiaquEntity> wrapper);
   	
   	List<DiscusstejiaquView> selectListView(Wrapper<DiscusstejiaquEntity> wrapper);
   	
   	DiscusstejiaquView selectView(@Param("ew") Wrapper<DiscusstejiaquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstejiaquEntity> wrapper);
   	
}

