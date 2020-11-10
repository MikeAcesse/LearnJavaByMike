package object;

public class CopyRule {

	public CopyRule(String srcDir, String backupDir,String unmonitoredDir) {
		this.srcDir = srcDir;
		this.backupDir = backupDir;
		this.unmonitoredDir = unmonitoredDir;
	}
	public String getUnmonitoredDir() {
		return unmonitoredDir;
	}
	public void setUnmonitoredDir(String unmonitoredDir) {
		this.unmonitoredDir = unmonitoredDir;
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
	private String srcDir;
	private String backupDir;
	private String unmonitoredDir;

	@Override
	public String toString() {
		return "CopyRule{" +
				"srcDir='" + srcDir + '\'' +
				", backupDir='" + backupDir + '\'' +
				", unmonitoredDir='" + unmonitoredDir + '\'' +
				'}';
	}
}
