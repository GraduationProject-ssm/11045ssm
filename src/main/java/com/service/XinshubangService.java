package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinshubangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinshubangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinshubangView;


/**
 * 新书榜
 *
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
public interface XinshubangService extends IService<XinshubangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinshubangVO> selectListVO(Wrapper<XinshubangEntity> wrapper);
   	
   	XinshubangVO selectVO(@Param("ew") Wrapper<XinshubangEntity> wrapper);
   	
   	List<XinshubangView> selectListView(Wrapper<XinshubangEntity> wrapper);
   	
   	XinshubangView selectView(@Param("ew") Wrapper<XinshubangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinshubangEntity> wrapper);
   	
}

