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


import com.dao.XinshubangDao;
import com.entity.XinshubangEntity;
import com.service.XinshubangService;
import com.entity.vo.XinshubangVO;
import com.entity.view.XinshubangView;

@Service("xinshubangService")
public class XinshubangServiceImpl extends ServiceImpl<XinshubangDao, XinshubangEntity> implements XinshubangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinshubangEntity> page = this.selectPage(
                new Query<XinshubangEntity>(params).getPage(),
                new EntityWrapper<XinshubangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinshubangEntity> wrapper) {
		  Page<XinshubangView> page =new Query<XinshubangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinshubangVO> selectListVO(Wrapper<XinshubangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinshubangVO selectVO(Wrapper<XinshubangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinshubangView> selectListView(Wrapper<XinshubangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinshubangView selectView(Wrapper<XinshubangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
