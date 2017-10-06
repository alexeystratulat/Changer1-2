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
	
	private static int port = 22;

	public Connect(String ipAddress, String username, String password, String path,String pathForList) {
		this.ipAddress = ipAddress;
		this.username = username;
		this.password = password;
		this.path = path;
		this.pathForList = pathForList;
	}

	public String downloadingSourseFile() {
		
		System.out.println(ipAddress );
		System.out.println(username );
		System.out.println(password );
		System.out.println(path );
		System.out.println(pathForList );
		
			
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
				//
				File file = new File("C:\\Changer1.1\\list.ini");
				
				//File file = new File(pathForList);
				file.createNewFile();
				//sftpChannel.get(path, pathForList);
				//sftpChannel.get(path, "C:\\Changer\\list.ini");
				sftpChannel.get("/cygdrive/c/Windows/Vportal.ini", "C:\\Changer1.1\\list.ini");
				//sftpChannel.get("/cygdrive/d/Changer/list.ini", "C:\\Changer1.1\\list.ini");
			
				System.out.println(ipAddress.toString() +path+" -----> "+pathForList);
				

				sftpChannel.disconnect();
				session.disconnect();
				
				
				
				
				
			} catch (Exception e) {
				return null;
			}
		

			
		
		
		
		
		
		
		
		
		
		
		

		return null;
	}

	public String downloadingSettingFile() {

		return null;
	}

}
