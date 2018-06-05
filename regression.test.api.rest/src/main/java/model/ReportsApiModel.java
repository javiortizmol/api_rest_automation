package model;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReportsApiModel {

	private Boolean test;
	private String language;
	private String command;
	private Map<String, String> merchant;

	public Boolean getTest() {
		return test;
	}

	public void setTest(Boolean test) {
		this.test = test;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public Map<String, String> getMerchant() {
		return merchant;
	}

	public void setMerchant(Map<String, String> merchant) {
		this.merchant = merchant;
	}

	/*
	 * "{" + "\"test\": false," + "\"language\": \"en\"," + "\"command\": \"PING\","
	 * + "\"merchant\": {" + "\"apiLogin\": \"pRRXKOl8ikMmt9u\"," +
	 * "\"apiKey\":\"4Vj8eK4rloUd272L48hsrarnUA\"" + "}" +"}")
	 */

}
