//
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.rmi.RemoteException;
//
//public class RMIClientExecutor {
//	static String clientIp = null;
//	static int clientPort = 4567; // client's RMI port will be overridden as per args[]
//	static String regisIp = "";
//	
//	/**
//	 * 
//	 * @param args
//	 * args[0] client Ip
//	 * args[1] client port
//	 * args[2] registry server's ip
//	 * args[3] method name
//	 * args[4] article content
//	 * 
//	 */
//	public static void main(String args[]) {
//		
//
//			clientIp = args[0];
//			clientPort = Integer.valueOf(args[1]);
//			regisIp = args[2];
//			RMIClientConnector rmiClientConnector = new RMIClientConnector(clientIp, clientPort, regisIp);
//			String op = args[3];
//			String article = args[4];
//			boolean response = runOp(op, rmiClientConnector, article);
//			System.out.println("Response from Server:"+ response);
//			
//			/**
//			InputStreamReader ipsReader = new InputStreamReader(System.in);
//			BufferedReader br = new BufferedReader(ipsReader);
//			
//			boolean exitClient = false;
//			Thread t1 = new Thread(new Runnable() {
//				@Override
//				public void run() {
//					String op = null;
//					String article = null;
//					boolean response = false;
//					try {
//						while(br.readLine()!=null) {
//							System.out.println("Enter method name: ");
//						
//									op = br.readLine();
//									if(op.equals("exit")) {
//										System.out.println("Exiting client as per user's input ");
//										break;
//									}
//									else if(op.equals("subscribe")|| op.equals("unsubscribe")|| op.equals("publish")){
//										System.out.println("Enter Article : ");
//										article = br.readLine();
//										response = runOp(op, rmiClientConnector, article);
//									}else {
//										response = runOp(op, rmiClientConnector, article);
//									}
//									System.out.println("Response from Server:"+ response);
//									
//								
//						}
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			});
//		    t1.start();
//		    **/
//	}
//	
//	public static boolean runOp(String op, RMIClientConnector rmiClientConnector, String article) {
//		boolean response = false;
//		switch(op) {
//		case "join":
//			response = rmiClientConnector.join();
//			break;
//		case "ping":
//			response = rmiClientConnector.ping();
//			break;
//		case "subscribe":
//			response= rmiClientConnector.join();
//			response = rmiClientConnector.subscribe(article);
//			break;
//		case "unsubscribe":
//			response= rmiClientConnector.join();
//			response = rmiClientConnector.subscribe(article);
//			response = rmiClientConnector.unsubscribe(article);
//			break;
//		case "publish":
//			response= rmiClientConnector.join();
//			response = rmiClientConnector.publish(article);
//			break;
//		case "leave":
//			try {
//				response= rmiClientConnector.join();
//				response = rmiClientConnector.leave();
//			} catch (RemoteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
//		 default:
//			System.out.println("Invalid method to client");
//			break;
//		}
//
//		return response;
//	}
//}




//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.rmi.RemoteException;
//
//public class RMIClientExecutor {
//	static String clientIp = null;
//	static int clientPort = 4567; // client's RMI port will be overridden as per args[]
//	static String regisIp = "";
//	
//	/**
//	 * 
//	 * @param args
//	 * args[0] client Ip
//	 * args[1] client port
//	 * args[2] registry server's ip
//	 * args[3] method name
//	 * args[4] article content
//	 * 
//	 */
//	public static void main(String args[]) {
//		
//
//			clientIp = args[0];
//			clientPort = Integer.valueOf(args[1]);
//			regisIp = args[2];
//			RMIClientConnector rmiClientConnector = new RMIClientConnector(clientIp, clientPort, regisIp);
//			String op = args[3];
//			String article = args[4];
//			//boolean response = runOp(op, rmiClientConnector, article);
//		//	System.out.println("Response from Server:"+ response);
//			
//			
//			InputStreamReader ipsReader = new InputStreamReader(System.in);
//			BufferedReader br = new BufferedReader(ipsReader);
//			
//			
//			Thread t1 = new Thread(new Runnable() {
//				@Override
//				public void run() {
//					String op = null;
//					String article = null;
//					boolean response = false;
//					String cmdIp = null;
//					try {
//						System.out.println("Enter method name: ");
//						while(true) {
//							cmdIp = br.readLine();
//							while(cmdIp==null) {
//								Thread.sleep(3000);
//							}
//							op = cmdIp;
//							/*
//							if(op.equals("exit")) {
//								System.out.println("Exiting client as per user's input ");
//								break;
//							}*/
//							 if(op.equals("subscribe")|| op.equals("unsubscribe")|| op.equals("publish")){
//								//System.out.println("Enter Article : ");
//								//article = br.readLine();
//								response = runOp(op, rmiClientConnector, article);
//								System.out.println("Response from Server:"+ response);
//							}else {
//								response = runOp(op, rmiClientConnector, article);
//								System.out.println("Response from Server:"+ response);	
//								System.out.println("Enter method name: ");
//							}
//							
//						}
//						
//						
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			});
//		    t1.start();
//		    
//	}
//	
//	public static boolean runOp(String op, RMIClientConnector rmiClientConnector, String article) {
//		boolean response = false;
//		switch(op) {
//		case "join":
//			response = rmiClientConnector.join();
//			break;
//		case "ping":
//			response = rmiClientConnector.ping();
//			break;
//		case "subscribe":
//			//response= rmiClientConnector.join();
//			response = rmiClientConnector.subscribe(article);
//			break;
//		case "unsubscribe":
//			//response= rmiClientConnector.join();
//			//response = rmiClientConnector.subscribe(article);
//			response = rmiClientConnector.unsubscribe(article);
//			break;
//		case "publish":
//			//response= rmiClientConnector.join();
//			response = rmiClientConnector.publish(article);
//			break;
//		case "leave":
//			try {
//				//response= rmiClientConnector.join();
//				response = rmiClientConnector.leave();
//			} catch (RemoteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
//		 default:
//			System.out.println("Invalid method to client");
//			break;
//		}
//
//		return response;
//	}
//}
//





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

public class RMIClientExecutor {
	static String clientIp = null;
	static int clientPort = 4567; // client's RMI port will be overridden as per args[]
	static String regisIp = "";
	
	/**
	 * 
	 * @param args
	 * args[0] client Ip
	 * args[1] client port
	 * args[2] registry server's ip
	 * args[3] method name
	 * args[4] article content only for subscribe, unsubscribe, publish
	 * 
	 * 
	 */
	public static void main(String args[]) {
		
		String article = null;
		String clientIp2 = null;
		String clientIp3 = null;
			clientIp = args[0];
			clientPort = Integer.valueOf(args[1]);
			regisIp = args[2];
			RMIClientConnector rmiClientConnector = new RMIClientConnector(clientIp, clientPort, regisIp);
			String op = args[3];
			
		
			if(op.equals("subscribe")|| op.equals("unsubscribe")||op.equals("publish")) {
				article = args[4];
			}
			
			boolean response = runOp(op, rmiClientConnector, article, clientIp2, clientIp3, regisIp);
			
			
	}
	
	public static boolean runOp(String op, RMIClientConnector rmiClientConnector, String article, String clientIp2, String clientPort2, 
			String regisIp) {
		boolean response = false;
		switch(op) {
		case "join":
			response = rmiClientConnector.join();
			break;
		case "ping":
			response = rmiClientConnector.ping();
			break;
		case "subscribe":
			//response= rmiClientConnector.join();
			response = rmiClientConnector.subscribe(article);
			break;
		case "unsubscribe":
			
			//response = rmiClientConnector.join();
			response = rmiClientConnector.unsubscribe(article);
			
			break;
		case "publish":
			//response= rmiClientConnector.join();
			response = rmiClientConnector.publish(article);
			break;
		case "leave":
			try {
				//response= rmiClientConnector.join();
				
				response = rmiClientConnector.leave();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Subscribing to server to check whether leave is successful or not ");

				rmiClientConnector.subscribe("Science;Origantor;UMN;");
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		 default:
			System.out.println("Invalid method to client");
			break;
		}

		return response;
	}
}
