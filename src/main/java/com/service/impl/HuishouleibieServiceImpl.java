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


import com.dao.HuishouleibieDao;
import com.entity.HuishouleibieEntity;
import com.service.HuishouleibieService;
import com.entity.vo.HuishouleibieVO;
import com.entity.view.HuishouleibieView;

@Service("huishouleibieService")
public class HuishouleibieServiceImpl extends ServiceImpl<HuishouleibieDao, HuishouleibieEntity> implements HuishouleibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuishouleibieEntity> page = this.selectPage(
                new Query<HuishouleibieEntity>(params).getPage(),
                new EntityWrapper<HuishouleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuishouleibieEntity> wrapper) {
		  Page<HuishouleibieView> page =new Query<HuishouleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuishouleibieVO> selectListVO(Wrapper<HuishouleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuishouleibieVO selectVO(Wrapper<HuishouleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuishouleibieView> selectListView(Wrapper<HuishouleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuishouleibieView selectView(Wrapper<HuishouleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
