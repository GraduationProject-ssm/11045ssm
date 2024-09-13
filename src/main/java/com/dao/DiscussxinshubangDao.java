package com.dao;

import com.entity.DiscussxinshubangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinshubangVO;
import com.entity.view.DiscussxinshubangView;


/**
 * 新书榜评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface DiscussxinshubangDao extends BaseMapper<DiscussxinshubangEntity> {
	
	List<DiscussxinshubangVO> selectListVO(@Param("ew") Wrapper<DiscussxinshubangEntity> wrapper);
	
	DiscussxinshubangVO selectVO(@Param("ew") Wrapper<DiscussxinshubangEntity> wrapper);
	
	List<DiscussxinshubangView> selectListView(@Param("ew") Wrapper<DiscussxinshubangEntity> wrapper);

	List<DiscussxinshubangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinshubangEntity> wrapper);
	
	DiscussxinshubangView selectView(@Param("ew") Wrapper<DiscussxinshubangEntity> wrapper);
	
}
