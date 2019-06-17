package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Goods;

/**
 * ��Ʒģ�Ͳ�Ľӿڣ����ڶ�����Ʒģ��ķ���
 * 
 * @author WM
 *
 */
public interface GoodsService {

	/**
	 * ����µ���Ʒ��Ϣ
	 * 
	 * @param goods	����Ʒ��Ϣ
	 * @return	�ɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer insert(Goods goods);
	
	/**
	 * ��ѯ������������Ʒ��Ϣ����ҳ���ܣ�
	 * 
	 * @param goods	��ѯ����
	 * @return 		�ɹ�����com.github.pagehelper.PageInfo��ʵ�������򷵻�null
	 */
	public abstract PageInfo<Goods> select(Goods goods,Integer pageNumber);
	
	 /**
     * ���������޸�GOODS_ID����Ʒ��Ϣ
     * @param goods		�޸ĵ���Ʒ��Ϣ
     * @return			�ɹ����ش���0�� ���������򷵻�С�ڵ���0������
     */
	public abstract Integer updateGoodsById(Goods goods);
	
	/**
	 * �޸�ָ�������Ʒ����Ϣ
	 * 
	 * @param goods 	�޸ĵ���Ʒ��Ϣ
	 * @return			�ɹ����ش���0�� ���������򷵻�С�ڵ���0������
	 */
	public abstract Integer update(Goods goods);
	
	/**
	 * ��ѯ����ǰʮ����Ʒ��Ϣ
	 * 
	 * @return			�ɹ����ش���0�� ���������򷵻�С�ڵ���0������
	 */
	public abstract List<Goods> selectGroup();
	
}
