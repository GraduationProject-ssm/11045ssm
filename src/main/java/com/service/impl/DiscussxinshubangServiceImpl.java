package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxinshubangDao;
import com.entity.DiscussxinshubangEntity;
import com.service.DiscussxinshubangService;
import com.entity.vo.DiscussxinshubangVO;
import com.entity.view.DiscussxinshubangView;

@Service("discussxinshubangService")
public class DiscussxinshubangServiceImpl extends ServiceImpl<DiscussxinshubangDao, DiscussxinshubangEntity> implements DiscussxinshubangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinshubangEntity> page = this.selectPage(
                new Query<DiscussxinshubangEntity>(params).getPage(),
                new EntityWrapper<DiscussxinshubangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinshubangEntity> wrapper) {
		  Page<DiscussxinshubangView> page =new Query<DiscussxinshubangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinshubangVO> selectListVO(Wrapper<DiscussxinshubangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinshubangVO selectVO(Wrapper<DiscussxinshubangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinshubangView> selectListView(Wrapper<DiscussxinshubangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinshubangView selectView(Wrapper<DiscussxinshubangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
