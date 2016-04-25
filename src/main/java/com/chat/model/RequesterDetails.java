package com.chat.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Entity
@Table(name = "requester_details")
public class RequesterDetails implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	@Transient
	private List<String> emails;
	@Column(name = "emails")
	private String emailsStr;

	private String name_profile_link;

	@Transient
	private List<String> phones;
	@Column(name = "phones")
	private String phonesStr;

	private String address;
	private String address_2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String company_name;
	private String company_profile_link;
	private String employees;
	private String revenue;
	private String title;
	private String website;

	@Transient
	private List<String> social_profile_links;
	@Column(name = "social_profile_links")
	private String socialProfileLinksStr;

	private String gender;
	private Integer age;
	private String influencer_score;
	private String notes;
	private String industry;

	@Transient
	private List<String> avatars;
	@Column(name = "avatars")
	private String avatarsStr;

	@Transient
	private List<String> otherData;
	@Column(name = "other_data")
	private String otherDataStr;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "chat_details_id")
	private ChatDetails chatDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_profile_link() {
		return name_profile_link;
	}

	public void setName_profile_link(String name_profile_link) {
		this.name_profile_link = name_profile_link;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_profile_link() {
		return company_profile_link;
	}

	public void setCompany_profile_link(String company_profile_link) {
		this.company_profile_link = company_profile_link;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getInfluencer_score() {
		return influencer_score;
	}

	public void setInfluencer_score(String influencer_score) {
		this.influencer_score = influencer_score;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public ChatDetails getChatDetails() {
		return chatDetails;
	}

	public void setChatDetails(ChatDetails chatDetails) {
		this.chatDetails = chatDetails;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
		this.emailsStr = getJsonArrayString(emails);
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
		this.phonesStr = getJsonArrayString(phones);
	}

	public List<String> getSocial_profile_links() {
		return social_profile_links;
	}

	public void setSocial_profile_links(List<String> socialProfileLinks) {
		this.social_profile_links = socialProfileLinks;
		this.socialProfileLinksStr = getJsonArrayString(socialProfileLinks);
	}

	public List<String> getAvatars() {
		return avatars;
	}

	public void setAvatars(List<String> avatars) {
		this.avatars = avatars;
		this.avatarsStr = getJsonArrayString(avatars);
	}

	public List<String> getOtherData() {
		return otherData;
	}

	public void setOtherData(List<String> otherData) {
		this.otherData = otherData;
		this.otherDataStr = getJsonArrayString(otherData);
	}

	public String getEmailsStr() {
		return emailsStr;
	}

	public String getPhonesStr() {
		return phonesStr;
	}

	public String getSocialProfileLinksStr() {
		return socialProfileLinksStr;
	}

	public String getAvatarsStr() {
		return avatarsStr;
	}

	public String getOtherDataStr() {
		return otherDataStr;
	}

	public void setEmailsStr(String emailsStr) {
		this.emailsStr = emailsStr;
		this.emails = getArrayString(emailsStr);
	}

	public void setPhonesStr(String phonesStr) {
		this.phonesStr = phonesStr;
		this.phones = getArrayString(phonesStr);
	}

	public void setSocialProfileLinksStr(String socialProfileLinksStr) {
		this.socialProfileLinksStr = socialProfileLinksStr;
		this.social_profile_links = getArrayString(socialProfileLinksStr);
	}

	public void setAvatarsStr(String avatarsStr) {
		this.avatarsStr = avatarsStr;
		this.avatars = getArrayString(avatarsStr);
	}

	public void setOtherDataStr(String otherDataStr) {
		this.otherDataStr = otherDataStr;
		this.otherData = getArrayString(otherDataStr);
	}

	private List<String> getArrayString(String data) {
		List<String> list = new Gson().fromJson(data, new TypeToken<List<String>>() {}.getType());
		return list;
	}

	private String getJsonArrayString(List<String> data) {
		String json = new Gson().toJson(data);
		return json;
	}
}
