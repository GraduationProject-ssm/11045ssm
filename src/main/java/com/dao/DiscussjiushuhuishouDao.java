package com.dao;

import com.entity.DiscussjiushuhuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiushuhuishouVO;
import com.entity.view.DiscussjiushuhuishouView;


/**
 * 旧书回收评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface DiscussjiushuhuishouDao extends BaseMapper<DiscussjiushuhuishouEntity> {
	
	List<DiscussjiushuhuishouVO> selectListVO(@Param("ew") Wrapper<DiscussjiushuhuishouEntity> wrapper);
	
	DiscussjiushuhuishouVO selectVO(@Param("ew") Wrapper<DiscussjiushuhuishouEntity> wrapper);
	
	List<DiscussjiushuhuishouView> selectListView(@Param("ew") Wrapper<DiscussjiushuhuishouEntity> wrapper);

	List<DiscussjiushuhuishouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiushuhuishouEntity> wrapper);
	
	DiscussjiushuhuishouView selectView(@Param("ew") Wrapper<DiscussjiushuhuishouEntity> wrapper);
	
}
