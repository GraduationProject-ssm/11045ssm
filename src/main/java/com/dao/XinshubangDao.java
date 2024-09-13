package com.dao;

import com.entity.XinshubangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinshubangVO;
import com.entity.view.XinshubangView;


/**
 * 新书榜
 * 
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface XinshubangDao extends BaseMapper<XinshubangEntity> {
	
	List<XinshubangVO> selectListVO(@Param("ew") Wrapper<XinshubangEntity> wrapper);
	
	XinshubangVO selectVO(@Param("ew") Wrapper<XinshubangEntity> wrapper);
	
	List<XinshubangView> selectListView(@Param("ew") Wrapper<XinshubangEntity> wrapper);

	List<XinshubangView> selectListView(Pagination page,@Param("ew") Wrapper<XinshubangEntity> wrapper);
	
	XinshubangView selectView(@Param("ew") Wrapper<XinshubangEntity> wrapper);
	
}
