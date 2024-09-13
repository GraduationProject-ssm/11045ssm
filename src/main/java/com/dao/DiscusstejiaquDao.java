package com.dao;

import com.entity.DiscusstejiaquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstejiaquVO;
import com.entity.view.DiscusstejiaquView;


/**
 * 特价区评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface DiscusstejiaquDao extends BaseMapper<DiscusstejiaquEntity> {
	
	List<DiscusstejiaquVO> selectListVO(@Param("ew") Wrapper<DiscusstejiaquEntity> wrapper);
	
	DiscusstejiaquVO selectVO(@Param("ew") Wrapper<DiscusstejiaquEntity> wrapper);
	
	List<DiscusstejiaquView> selectListView(@Param("ew") Wrapper<DiscusstejiaquEntity> wrapper);

	List<DiscusstejiaquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstejiaquEntity> wrapper);
	
	DiscusstejiaquView selectView(@Param("ew") Wrapper<DiscusstejiaquEntity> wrapper);
	
}
