package com.dao;

import com.entity.TejiaquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TejiaquVO;
import com.entity.view.TejiaquView;


/**
 * 特价区
 * 
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface TejiaquDao extends BaseMapper<TejiaquEntity> {
	
	List<TejiaquVO> selectListVO(@Param("ew") Wrapper<TejiaquEntity> wrapper);
	
	TejiaquVO selectVO(@Param("ew") Wrapper<TejiaquEntity> wrapper);
	
	List<TejiaquView> selectListView(@Param("ew") Wrapper<TejiaquEntity> wrapper);

	List<TejiaquView> selectListView(Pagination page,@Param("ew") Wrapper<TejiaquEntity> wrapper);
	
	TejiaquView selectView(@Param("ew") Wrapper<TejiaquEntity> wrapper);
	
}
