package ie.gmit.sw;

public class MyDBDriverImpl implements Driveable{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected");
	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
