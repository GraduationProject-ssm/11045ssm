package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuishouyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuishouyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuishouyuyueView;


/**
 * 回收预约
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface HuishouyuyueService extends IService<HuishouyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuishouyuyueVO> selectListVO(Wrapper<HuishouyuyueEntity> wrapper);
   	
   	HuishouyuyueVO selectVO(@Param("ew") Wrapper<HuishouyuyueEntity> wrapper);
   	
   	List<HuishouyuyueView> selectListView(Wrapper<HuishouyuyueEntity> wrapper);
   	
   	HuishouyuyueView selectView(@Param("ew") Wrapper<HuishouyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuishouyuyueEntity> wrapper);
   	
}

