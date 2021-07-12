/*
* Created by �ǽݿ���
* ������վ��http://www.zhijieketang.com/group/5
* �ǽݿ������߿��ã�www.zhijieketang.com
* �ǽݿ���΢�Ź����ţ�zhijieketang
* ���䣺eorient@sina.com
* Java���߷���QQȺ��547370999
* �����׵����顿��ַ��
*       ͼ��������
*       http://www.ituring.com.cn/book/2480
*       �ٶ��Ķ���
*       https://yuedu.baidu.com/ebook/7c1499987e192279168884868762caaedd33ba00 
*/

package dao;

import application.model.Order;


import java.util.List;

//��������DAO
public interface OrderDao {
	// ��ѯ���еĶ�����Ϣ
	List<Order> findAll();

	// ����������ѯ������Ϣ
	Order findById(int orderid);

	// ����������Ϣ
	int create(Order order);

	// �޸Ķ�����Ϣ
	int modify(Order order);

	// ɾ��������Ϣ
	int remove(Order order);

}
