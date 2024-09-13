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


import com.dao.DiscusstejiaquDao;
import com.entity.DiscusstejiaquEntity;
import com.service.DiscusstejiaquService;
import com.entity.vo.DiscusstejiaquVO;
import com.entity.view.DiscusstejiaquView;

@Service("discusstejiaquService")
public class DiscusstejiaquServiceImpl extends ServiceImpl<DiscusstejiaquDao, DiscusstejiaquEntity> implements DiscusstejiaquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstejiaquEntity> page = this.selectPage(
                new Query<DiscusstejiaquEntity>(params).getPage(),
                new EntityWrapper<DiscusstejiaquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstejiaquEntity> wrapper) {
		  Page<DiscusstejiaquView> page =new Query<DiscusstejiaquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstejiaquVO> selectListVO(Wrapper<DiscusstejiaquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstejiaquVO selectVO(Wrapper<DiscusstejiaquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstejiaquView> selectListView(Wrapper<DiscusstejiaquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstejiaquView selectView(Wrapper<DiscusstejiaquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
