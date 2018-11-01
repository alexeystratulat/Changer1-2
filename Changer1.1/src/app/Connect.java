package app;

import java.io.File;

import org.ini4j.Ini;

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
	private Ini resources;

	private static int port = 22;

	public Connect(String ipAddress, String username, String password, String path, String pathForList) {
		this.ipAddress = ipAddress;
		this.username = username;
		this.password = password;
		this.path = path;
		this.pathForList = pathForList;

	}

	public Connect(Servers server, String username, String password, String mainProgramFolder,Ini resources) {
		this.server = server;
		this.username = username;
		this.password = password;
		this.mainProgramFolder = mainProgramFolder;
		this.resources = resources;
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

			System.out.println("Connecting to server: "+"username= " + username +" server= " + server.getIpAdress()+" password= " + password);
			
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
			
			CreatingDirectory dir = new CreatingDirectory(mainProgramFolder);
			dir.createDirForConfigOfServer(server.getServerName().toString());
			sftpChannel.get(resources.get("path", "pathForConfigFile"), mainProgramFolder + "\\" +server.getServerName().toString());

			sftpChannel.disconnect();
			session.disconnect();

		} catch (Exception e) {
			return error;
		}

		
		Editor edit = new Editor(mainProgramFolder + "\\" +server.getServerName().toString(),resources);
		
		System.out.println(mainProgramFolder + "\\" +server.getServerName().toString()+" azzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		
		edit.makingVportal_st( );
		edit.makingVportal_au();

		return done;
	}

	public String setIniForAu() {

		return null;
	}

	public String setIniForSt() {

		return null;
	}



}
