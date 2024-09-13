package com.dao;

import com.entity.JiushuhuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiushuhuishouVO;
import com.entity.view.JiushuhuishouView;


/**
 * 旧书回收
 * 
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface JiushuhuishouDao extends BaseMapper<JiushuhuishouEntity> {
	
	List<JiushuhuishouVO> selectListVO(@Param("ew") Wrapper<JiushuhuishouEntity> wrapper);
	
	JiushuhuishouVO selectVO(@Param("ew") Wrapper<JiushuhuishouEntity> wrapper);
	
	List<JiushuhuishouView> selectListView(@Param("ew") Wrapper<JiushuhuishouEntity> wrapper);

	List<JiushuhuishouView> selectListView(Pagination page,@Param("ew") Wrapper<JiushuhuishouEntity> wrapper);
	
	JiushuhuishouView selectView(@Param("ew") Wrapper<JiushuhuishouEntity> wrapper);
	
}
