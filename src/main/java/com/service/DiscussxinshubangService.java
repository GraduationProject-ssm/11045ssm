package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinshubangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinshubangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinshubangView;


/**
 * 新书榜评论表
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface DiscussxinshubangService extends IService<DiscussxinshubangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinshubangVO> selectListVO(Wrapper<DiscussxinshubangEntity> wrapper);
   	
   	DiscussxinshubangVO selectVO(@Param("ew") Wrapper<DiscussxinshubangEntity> wrapper);
   	
   	List<DiscussxinshubangView> selectListView(Wrapper<DiscussxinshubangEntity> wrapper);
   	
   	DiscussxinshubangView selectView(@Param("ew") Wrapper<DiscussxinshubangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinshubangEntity> wrapper);
   	
}

