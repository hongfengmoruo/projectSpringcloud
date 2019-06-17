package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Goods;

/**
 * 商品模型层的接口：用于定义商品模块的方法
 * 
 * @author WM
 *
 */
public interface GoodsService {

	/**
	 * 添加新的商品信息
	 * 
	 * @param goods	新商品信息
	 * @return	成功返回大于0的整数，否则返回0
	 */
	public abstract Integer insert(Goods goods);
	
	/**
	 * 查询满足条件的商品信息（分页功能）
	 * 
	 * @param goods	查询条件
	 * @return 		成功返回com.github.pagehelper.PageInfo的实例，否则返回null
	 */
	public abstract PageInfo<Goods> select(Goods goods,Integer pageNumber);
	
	 /**
     * 根据条件修改GOODS_ID的商品信息
     * @param goods		修改的商品信息
     * @return			成功返回大于0的 整数，否则返回小于等于0的数据
     */
	public abstract Integer updateGoodsById(Goods goods);
	
	/**
	 * 修改指定编号商品的信息
	 * 
	 * @param goods 	修改的商品信息
	 * @return			成功返回大于0的 整数，否则返回小于等于0的数据
	 */
	public abstract Integer update(Goods goods);
	
	/**
	 * 查询销量前十的商品信息
	 * 
	 * @return			成功返回大于0的 整数，否则返回小于等于0的数据
	 */
	public abstract List<Goods> selectGroup();
	
}
