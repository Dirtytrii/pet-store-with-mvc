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

import application.model.Product;

import java.util.List;

//��Ʒ����DAO
public interface ProductDao {
	// ��ѯ���е���Ʒ��Ϣ
	List<Product> findAll();

	// ����������ѯ��Ʒ��Ϣ
	Product findById(String productid);

	// ���ݰ����б���ѯ��Ʒ��Ϣ
	List<Product> findByCategory(String category);

	// ������Ʒ��Ϣ
	int create(Product product);

	// �޸���Ʒ��Ϣ
	int modify(Product product);

	// ɾ����Ʒ��Ϣ
	int remove(Product product);

}