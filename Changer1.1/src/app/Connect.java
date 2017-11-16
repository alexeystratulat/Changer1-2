package app;

import java.io.File;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class Connect {

	private String ipAddress;
	private String username;
	private String password;
	private String path;
	private String pathForList;
	private Servers server;
	private String mainProgramFolder;

	private static int port = 22;

	public Connect(String ipAddress, String username, String password, String path, String pathForList) {
		this.ipAddress = ipAddress;
		this.username = username;
		this.password = password;
		this.path = path;
		this.pathForList = pathForList;

	}

	public Connect(Servers server, String username, String password, String mainProgramFolder) {
		this.server = server;
		this.username = username;
		this.password = password;
		this.mainProgramFolder = mainProgramFolder;
		// TODO Auto-generated constructor stub
	}

	public String downloadingSourseFile() {

		System.out.println(ipAddress);
		System.out.println(username);
		System.out.println(password);
		System.out.println(path);
		System.out.println(pathForList);

		try {

			JSch jsch = new JSch();
			Session session = jsch.getSession(username, ipAddress, port);
			session.setPassword(password);
			session.setConfig("StrictHostKeyChecking", " no");
			System.out.println(ipAddress.toString() + " Establishing Connection...");
			session.connect();

			ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
			sftpChannel.connect();
			System.out.println(ipAddress.toString() + " SFTP Channel created.");

			File file = new File(pathForList);
			file.createNewFile();
			sftpChannel.get(path, pathForList);

			System.out.println(ipAddress.toString() + path + " -----> " + pathForList);

			sftpChannel.disconnect();
			session.disconnect();

		} catch (Exception e) {
			return null;
		}

		return null;
	}

	public String checkConnection() {

		String done = "connected";
		String error = "connection error!";
		try {

			JSch jsch = new JSch();
			Session session = jsch.getSession(username, server.getIpAdress(), port);
			session.setPassword(password);
			session.setConfig("StrictHostKeyChecking", " no");
			System.out.println(server.getIpAdress().toString() + " Establishing Connection...");
			session.connect();
			System.out.println(server.getIpAdress().toString() + " Connection established.");

			ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
			sftpChannel.connect();
			System.out.println(server.getIpAdress().toString() + " SFTP Channel created.");
			//

			sftpChannel.disconnect();
			session.disconnect();

		} catch (Exception e) {
			return error;
		}

		CreatingDirectory dir = new CreatingDirectory(mainProgramFolder);
		dir.createDirForConfigOfServer(server.getServerName().toString());
		setIniForAu();
		setIniForSt();

		return done;
	}

	public String setIniForAu() {

		return null;
	}

	public String setIniForSt() {

		return null;
	}

	public String downloadingSettingFile() {

		return null;
	}

}
