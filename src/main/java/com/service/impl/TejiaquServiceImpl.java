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


import com.dao.TejiaquDao;
import com.entity.TejiaquEntity;
import com.service.TejiaquService;
import com.entity.vo.TejiaquVO;
import com.entity.view.TejiaquView;

@Service("tejiaquService")
public class TejiaquServiceImpl extends ServiceImpl<TejiaquDao, TejiaquEntity> implements TejiaquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TejiaquEntity> page = this.selectPage(
                new Query<TejiaquEntity>(params).getPage(),
                new EntityWrapper<TejiaquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TejiaquEntity> wrapper) {
		  Page<TejiaquView> page =new Query<TejiaquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TejiaquVO> selectListVO(Wrapper<TejiaquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TejiaquVO selectVO(Wrapper<TejiaquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TejiaquView> selectListView(Wrapper<TejiaquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TejiaquView selectView(Wrapper<TejiaquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
