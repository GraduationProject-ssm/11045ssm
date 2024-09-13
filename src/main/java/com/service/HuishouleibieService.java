package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuishouleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuishouleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuishouleibieView;


/**
 * 回收类别
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface HuishouleibieService extends IService<HuishouleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuishouleibieVO> selectListVO(Wrapper<HuishouleibieEntity> wrapper);
   	
   	HuishouleibieVO selectVO(@Param("ew") Wrapper<HuishouleibieEntity> wrapper);
   	
   	List<HuishouleibieView> selectListView(Wrapper<HuishouleibieEntity> wrapper);
   	
   	HuishouleibieView selectView(@Param("ew") Wrapper<HuishouleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuishouleibieEntity> wrapper);
   	
}

