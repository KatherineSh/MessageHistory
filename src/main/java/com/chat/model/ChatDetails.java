package com.chat.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "chat_details")
public class ChatDetails implements Serializable {

	@Id
	@GeneratedValue
	private Integer chat_details_id;

	@NotNull
	@NotBlank
	private String id;
	private String widget_id;
	private String url;
	private String snapshot_image_url;
	private String type;
	private String requested_by;
	private String description;
	private String created_at_date;
	private Integer created_at_seconds;
	private Integer created_at_milliseconds;
	private Boolean proactive_chat;
	private String page_url;
	private String referrer_url;
	private String entry_url;
	private String ip_address;
	private String user_agent;
	private String browser;
	private String os;
	private String country_code;
	private String region;
	private String city;
	private Float latitude;
	private Float longitude;
	private Integer source_id;
	private Integer chat_waittime;
	private Integer chat_duration;
	private String language_code;

	@OneToOne(mappedBy = "chatDetails", cascade = CascadeType.ALL)
	private RequesterDetails requester_details;

	@OneToMany(mappedBy = "chatDetails", cascade = CascadeType.ALL)
	private List<Transcript> transcripts;

	@OneToMany(mappedBy = "chatDetails", cascade = CascadeType.ALL)
	private List<Plugin> plugins;

	@OneToMany(mappedBy = "chatDetails", cascade = CascadeType.ALL)
	private List<JavascriptVariable> javascript_variables;

	@OneToMany(mappedBy = "chatDetails", cascade = CascadeType.ALL)
	private List<OperatorVariable> operator_variables;

	public Integer getChat_details_id() {
		return chat_details_id;
	}

	public void setChat_details_id(Integer chatDetailsId) {
		this.chat_details_id = chatDetailsId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWidget_id() {
		return widget_id;
	}

	public void setWidget_id(String widget_id) {
		this.widget_id = widget_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSnapshot_image_url() {
		return snapshot_image_url;
	}

	public void setSnapshot_image_url(String snapshot_image_url) {
		this.snapshot_image_url = snapshot_image_url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRequested_by() {
		return requested_by;
	}

	public void setRequested_by(String requested_by) {
		this.requested_by = requested_by;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreated_at_date() {
		return created_at_date;
	}

	public void setCreated_at_date(String created_at_date) {
		this.created_at_date = created_at_date;
	}

	public Integer getCreated_at_seconds() {
		return created_at_seconds;
	}

	public void setCreated_at_seconds(Integer created_at_seconds) {
		this.created_at_seconds = created_at_seconds;
	}

	public Integer getCreated_at_milliseconds() {
		return created_at_milliseconds;
	}

	public void setCreated_at_milliseconds(Integer created_at_milliseconds) {
		this.created_at_milliseconds = created_at_milliseconds;
	}

	public Boolean getProactive_chat() {
		return proactive_chat;
	}

	public void setProactive_chat(Boolean proactive_chat) {
		this.proactive_chat = proactive_chat;
	}

	public String getPage_url() {
		return page_url;
	}

	public void setPage_url(String page_url) {
		this.page_url = page_url;
	}

	public String getReferrer_url() {
		return referrer_url;
	}

	public void setReferrer_url(String referrer_url) {
		this.referrer_url = referrer_url;
	}

	public String getEntry_url() {
		return entry_url;
	}

	public void setEntry_url(String entry_url) {
		this.entry_url = entry_url;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getUser_agent() {
		return user_agent;
	}

	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Integer getSource_id() {
		return source_id;
	}

	public void setSource_id(Integer source_id) {
		this.source_id = source_id;
	}

	public Integer getChat_waittime() {
		return chat_waittime;
	}

	public void setChat_waittime(Integer chat_waittime) {
		this.chat_waittime = chat_waittime;
	}

	public Integer getChat_duration() {
		return chat_duration;
	}

	public void setChat_duration(Integer chat_duration) {
		this.chat_duration = chat_duration;
	}

	public String getLanguage_code() {
		return language_code;
	}

	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}

	public RequesterDetails getRequester_details() {
		return requester_details;
	}

	public void setRequester_details(RequesterDetails requester_details) {
		this.requester_details = requester_details;
		this.requester_details.setChatDetails(this);
	}

	public List<Transcript> getTranscripts() {
		return transcripts;
	}

	public void setTranscripts(List<Transcript> transcripts) {
		this.transcripts = transcripts;
		for (Transcript el : transcripts) {
			el.setChatDetails(this);
		}
	}

	public List<Plugin> getPlugins() {
		return plugins;
	}

	public void setPlugins(List<Plugin> plugins) {
		this.plugins = plugins;
		for (Plugin el : plugins) {
			el.setChatDetails(this);
		}
	}

	public List<JavascriptVariable> getJavascript_variables() {
		return javascript_variables;
	}

	public void setJavascript_variables(List<JavascriptVariable> javascript_variables) {
		this.javascript_variables = javascript_variables;
		for (JavascriptVariable el : javascript_variables) {
			el.setChatDetails(this);
		}
	}

	public List<OperatorVariable> getOperator_variables() {
		return operator_variables;
	}

	public void setOperator_variables(List<OperatorVariable> operator_variables) {
		this.operator_variables = operator_variables;
		for (OperatorVariable el : operator_variables) {
			el.setChatDetails(this);
		}
	}
}
