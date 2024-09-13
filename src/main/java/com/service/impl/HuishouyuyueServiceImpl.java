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


import com.dao.HuishouyuyueDao;
import com.entity.HuishouyuyueEntity;
import com.service.HuishouyuyueService;
import com.entity.vo.HuishouyuyueVO;
import com.entity.view.HuishouyuyueView;

@Service("huishouyuyueService")
public class HuishouyuyueServiceImpl extends ServiceImpl<HuishouyuyueDao, HuishouyuyueEntity> implements HuishouyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuishouyuyueEntity> page = this.selectPage(
                new Query<HuishouyuyueEntity>(params).getPage(),
                new EntityWrapper<HuishouyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuishouyuyueEntity> wrapper) {
		  Page<HuishouyuyueView> page =new Query<HuishouyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuishouyuyueVO> selectListVO(Wrapper<HuishouyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuishouyuyueVO selectVO(Wrapper<HuishouyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuishouyuyueView> selectListView(Wrapper<HuishouyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuishouyuyueView selectView(Wrapper<HuishouyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
