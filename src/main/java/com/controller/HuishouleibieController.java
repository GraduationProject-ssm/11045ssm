package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuishouleibieEntity;
import com.entity.view.HuishouleibieView;

import com.service.HuishouleibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 回收类别
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@RestController
@RequestMapping("/huishouleibie")
public class HuishouleibieController {
    @Autowired
    private HuishouleibieService huishouleibieService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuishouleibieEntity huishouleibie, HttpServletRequest request){

        EntityWrapper<HuishouleibieEntity> ew = new EntityWrapper<HuishouleibieEntity>();
		PageUtils page = huishouleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huishouleibie), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuishouleibieEntity huishouleibie, HttpServletRequest request){
        EntityWrapper<HuishouleibieEntity> ew = new EntityWrapper<HuishouleibieEntity>();
		PageUtils page = huishouleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huishouleibie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuishouleibieEntity huishouleibie){
       	EntityWrapper<HuishouleibieEntity> ew = new EntityWrapper<HuishouleibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huishouleibie, "huishouleibie")); 
        return R.ok().put("data", huishouleibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuishouleibieEntity huishouleibie){
        EntityWrapper< HuishouleibieEntity> ew = new EntityWrapper< HuishouleibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huishouleibie, "huishouleibie")); 
		HuishouleibieView huishouleibieView =  huishouleibieService.selectView(ew);
		return R.ok("查询回收类别成功").put("data", huishouleibieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuishouleibieEntity huishouleibie = huishouleibieService.selectById(id);
        return R.ok().put("data", huishouleibie);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuishouleibieEntity huishouleibie = huishouleibieService.selectById(id);
        return R.ok().put("data", huishouleibie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuishouleibieEntity huishouleibie, HttpServletRequest request){
    	huishouleibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huishouleibie);

        huishouleibieService.insert(huishouleibie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuishouleibieEntity huishouleibie, HttpServletRequest request){
    	huishouleibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huishouleibie);

        huishouleibieService.insert(huishouleibie);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuishouleibieEntity huishouleibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huishouleibie);
        huishouleibieService.updateById(huishouleibie);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huishouleibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HuishouleibieEntity> wrapper = new EntityWrapper<HuishouleibieEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = huishouleibieService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
