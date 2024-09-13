package com.dao;

import com.entity.HuishouleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuishouleibieVO;
import com.entity.view.HuishouleibieView;


/**
 * 回收类别
 * 
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface HuishouleibieDao extends BaseMapper<HuishouleibieEntity> {
	
	List<HuishouleibieVO> selectListVO(@Param("ew") Wrapper<HuishouleibieEntity> wrapper);
	
	HuishouleibieVO selectVO(@Param("ew") Wrapper<HuishouleibieEntity> wrapper);
	
	List<HuishouleibieView> selectListView(@Param("ew") Wrapper<HuishouleibieEntity> wrapper);

	List<HuishouleibieView> selectListView(Pagination page,@Param("ew") Wrapper<HuishouleibieEntity> wrapper);
	
	HuishouleibieView selectView(@Param("ew") Wrapper<HuishouleibieEntity> wrapper);
	
}
