package dataobject;

public class Node {
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCcIp() {
		return ccIp;
	}
	public void setCcIp(String ccIp) {
		this.ccIp = ccIp;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getDataIp() {
		return dataIp;
	}
	public void setDataIp(String dataIp) {
		this.dataIp = dataIp;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String setServiceName) {
		this.serviceName = serviceName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getIncludePath() {
		return includePath;
	}

	public Node(String name, String ccIp, String port, String dataIp, String user, String pwd, String includePath, String license, String osType, String osVersion) {
		this.name = name;
		this.ccIp = ccIp;
		this.port = port;
		this.dataIp = dataIp;
		this.user = user;
		this.pwd = pwd;
		this.includePath = includePath;
		this.license = license;
		this.osType = osType;
		this.osVersion = osVersion;
	}

	public void setIncludePath(String includePath) {
		this.includePath = includePath;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	
	public String toString() {
		return new StringBuilder(name).append(" ").append(ccIp).append(" ").append(osType).append(" ").append(osVersion)
				.toString();
	}
	
	public Node(String name) {
		this.name = name;
	}
	
	private String name;
	private String ccIp;
	private String port;
	private String dataIp;
	private String user;
	private String pwd;
	private String note;
	private String includePath;
	private String license;
	private String osType;
	private String osVersion;
	private String serviceName;
}

