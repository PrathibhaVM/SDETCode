package restAssuredPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthRequest{
    @JsonProperty
	String Username;
    @JsonProperty
	String Password;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	}
