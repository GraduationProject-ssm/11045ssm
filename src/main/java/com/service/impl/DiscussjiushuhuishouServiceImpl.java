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


import com.dao.DiscussjiushuhuishouDao;
import com.entity.DiscussjiushuhuishouEntity;
import com.service.DiscussjiushuhuishouService;
import com.entity.vo.DiscussjiushuhuishouVO;
import com.entity.view.DiscussjiushuhuishouView;

@Service("discussjiushuhuishouService")
public class DiscussjiushuhuishouServiceImpl extends ServiceImpl<DiscussjiushuhuishouDao, DiscussjiushuhuishouEntity> implements DiscussjiushuhuishouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiushuhuishouEntity> page = this.selectPage(
                new Query<DiscussjiushuhuishouEntity>(params).getPage(),
                new EntityWrapper<DiscussjiushuhuishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiushuhuishouEntity> wrapper) {
		  Page<DiscussjiushuhuishouView> page =new Query<DiscussjiushuhuishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiushuhuishouVO> selectListVO(Wrapper<DiscussjiushuhuishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiushuhuishouVO selectVO(Wrapper<DiscussjiushuhuishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiushuhuishouView> selectListView(Wrapper<DiscussjiushuhuishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiushuhuishouView selectView(Wrapper<DiscussjiushuhuishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
