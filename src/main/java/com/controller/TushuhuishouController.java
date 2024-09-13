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

import com.entity.TushuhuishouEntity;
import com.entity.view.TushuhuishouView;

import com.service.TushuhuishouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 图书回收
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-18 07:36:34
 */
@RestController
@RequestMapping("/tushuhuishou")
public class TushuhuishouController {
    @Autowired
    private TushuhuishouService tushuhuishouService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TushuhuishouEntity tushuhuishou, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			tushuhuishou.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TushuhuishouEntity> ew = new EntityWrapper<TushuhuishouEntity>();
		PageUtils page = tushuhuishouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuhuishou), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TushuhuishouEntity tushuhuishou, HttpServletRequest request){
        EntityWrapper<TushuhuishouEntity> ew = new EntityWrapper<TushuhuishouEntity>();
		PageUtils page = tushuhuishouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuhuishou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TushuhuishouEntity tushuhuishou){
       	EntityWrapper<TushuhuishouEntity> ew = new EntityWrapper<TushuhuishouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tushuhuishou, "tushuhuishou")); 
        return R.ok().put("data", tushuhuishouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TushuhuishouEntity tushuhuishou){
        EntityWrapper< TushuhuishouEntity> ew = new EntityWrapper< TushuhuishouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tushuhuishou, "tushuhuishou")); 
		TushuhuishouView tushuhuishouView =  tushuhuishouService.selectView(ew);
		return R.ok("查询图书回收成功").put("data", tushuhuishouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TushuhuishouEntity tushuhuishou = tushuhuishouService.selectById(id);
        return R.ok().put("data", tushuhuishou);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TushuhuishouEntity tushuhuishou = tushuhuishouService.selectById(id);
        return R.ok().put("data", tushuhuishou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TushuhuishouEntity tushuhuishou, HttpServletRequest request){
    	tushuhuishou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuhuishou);

        tushuhuishouService.insert(tushuhuishou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TushuhuishouEntity tushuhuishou, HttpServletRequest request){
    	tushuhuishou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuhuishou);

        tushuhuishouService.insert(tushuhuishou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TushuhuishouEntity tushuhuishou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tushuhuishou);
        tushuhuishouService.updateById(tushuhuishou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tushuhuishouService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TushuhuishouEntity> wrapper = new EntityWrapper<TushuhuishouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = tushuhuishouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
