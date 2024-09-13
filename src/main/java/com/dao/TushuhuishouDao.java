package com.dao;

import com.entity.TushuhuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuhuishouVO;
import com.entity.view.TushuhuishouView;


/**
 * 图书回收
 * 
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface TushuhuishouDao extends BaseMapper<TushuhuishouEntity> {
	
	List<TushuhuishouVO> selectListVO(@Param("ew") Wrapper<TushuhuishouEntity> wrapper);
	
	TushuhuishouVO selectVO(@Param("ew") Wrapper<TushuhuishouEntity> wrapper);
	
	List<TushuhuishouView> selectListView(@Param("ew") Wrapper<TushuhuishouEntity> wrapper);

	List<TushuhuishouView> selectListView(Pagination page,@Param("ew") Wrapper<TushuhuishouEntity> wrapper);
	
	TushuhuishouView selectView(@Param("ew") Wrapper<TushuhuishouEntity> wrapper);
	
}
