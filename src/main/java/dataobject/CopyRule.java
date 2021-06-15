package dataobject;

public class CopyRule {

	public CopyRule(String name, String srcNode, String backupNode, 
			       String srcDir, String backupDir, String mapType,String unmonitoredDir) {
		this.name = name;
		this.srcNode = srcNode;
		this.backupNode = backupNode;
		this.srcDir = srcDir;
		this.backupDir = backupDir;
		this.mapType = mapType;
		this.unmonitoredDir = unmonitoredDir;
	}
	
	
	
	public String getUnmonitoredDir() {
		return unmonitoredDir;
	}



	public void setUnmonitoredDir(String unmonitoredDir) {
		this.unmonitoredDir = unmonitoredDir;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSrcNode() {
		return srcNode;
	}
	public void setSrcNode(String srcNode) {
		this.srcNode = srcNode;
	}
	public String getBackupNode() {
		return backupNode;
	}
	public void setBackupNode(String backupNode) {
		this.backupNode = backupNode;
	}
	public String getSrcDir() {
		return srcDir;
	}
	public void setSrcDir(String srcDir) {
		this.srcDir = srcDir;
	}
	public String getBackupDir() {
		return backupDir;
	}
	public void setBackupDir(String backupDir) {
		this.backupDir = backupDir;
	}
	public String getSyncDir(){return syncDir;}
	public void setSyncDir(String syncDir){this.syncDir=syncDir;}
	public String getMapType() {
		return mapType;
	}
	
	private String name;
	private String srcNode;
	private String backupNode;
	private String srcDir;
	private String backupDir;
	private String mapType;
	private String unmonitoredDir;
	private String syncDir;
}
