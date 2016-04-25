package com.chat.repository;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chat.model.ChatDetails;
import com.chat.model.Transcript;

@Repository("repo")
public class ChatDetailsRepositoryImpl implements ChatDetailsRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(rollbackFor=Exception.class)
	public boolean save(ChatDetails chatDetails) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.save(chatDetails);
		} catch (HibernateException ex) {
			return false;
		} catch (ConstraintViolationException ex){
			return false;
		} finally {
			session.clear();
		}
		return true;
	} 

	@Transactional
	public Integer getMessageCount() {
		Session session = sessionFactory.getCurrentSession();

		Number count = (Number) session.createCriteria(Transcript.class)
				.setProjection(Projections.rowCount())
				.uniqueResult();
		return count.intValue();
	}

	@Transactional
	public List<Object> getChatsByCountry() {
		Session session = sessionFactory.getCurrentSession();

		List<Object> chatByCountry = session.createSQLQuery("select country_code, count(id) from chat_details group by country_code").list();
		return chatByCountry;
	}

}
