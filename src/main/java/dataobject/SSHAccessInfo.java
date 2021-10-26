package dataobject;

public class SSHAccessInfo {
    protected final String LF = "\r\n";
    
    public String hostName;
    public int sshPort = 22;
    public String hostUserName;
    public String hostPassword;

    public SSHAccessInfo() {
    }

    public SSHAccessInfo(String hostName, String userName, String password) {
        this.hostName = hostName;
        this.hostUserName = userName;
        this.hostPassword = password;
    }

    public SSHAccessInfo(String hostName, int port, String userName, String password) {
        this.hostName = hostName;
        this.sshPort = port;
        this.hostUserName = userName;
        this.hostPassword = password;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(hostName);
        sb.append(":");
        sb.append(sshPort);
        sb.append(",");
        sb.append(hostUserName);
        sb.append("/");
        sb.append(hostPassword);

        return sb.toString();
    }
}
