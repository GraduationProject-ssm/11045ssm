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


import com.dao.TushuhuishouDao;
import com.entity.TushuhuishouEntity;
import com.service.TushuhuishouService;
import com.entity.vo.TushuhuishouVO;
import com.entity.view.TushuhuishouView;

@Service("tushuhuishouService")
public class TushuhuishouServiceImpl extends ServiceImpl<TushuhuishouDao, TushuhuishouEntity> implements TushuhuishouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuhuishouEntity> page = this.selectPage(
                new Query<TushuhuishouEntity>(params).getPage(),
                new EntityWrapper<TushuhuishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuhuishouEntity> wrapper) {
		  Page<TushuhuishouView> page =new Query<TushuhuishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuhuishouVO> selectListVO(Wrapper<TushuhuishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuhuishouVO selectVO(Wrapper<TushuhuishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuhuishouView> selectListView(Wrapper<TushuhuishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuhuishouView selectView(Wrapper<TushuhuishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
