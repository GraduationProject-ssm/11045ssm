package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiushuhuishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiushuhuishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiushuhuishouView;


/**
 * 旧书回收评论表
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface DiscussjiushuhuishouService extends IService<DiscussjiushuhuishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiushuhuishouVO> selectListVO(Wrapper<DiscussjiushuhuishouEntity> wrapper);
   	
   	DiscussjiushuhuishouVO selectVO(@Param("ew") Wrapper<DiscussjiushuhuishouEntity> wrapper);
   	
   	List<DiscussjiushuhuishouView> selectListView(Wrapper<DiscussjiushuhuishouEntity> wrapper);
   	
   	DiscussjiushuhuishouView selectView(@Param("ew") Wrapper<DiscussjiushuhuishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiushuhuishouEntity> wrapper);
   	
}

