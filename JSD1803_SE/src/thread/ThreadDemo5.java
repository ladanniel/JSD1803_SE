package thread;

public class ThreadDemo5 {
	public static void main(String[] args) {
		Thread main = new Thread();
		System.out.println("�̵߳�����:"+main);
		
		String name  = main.getName();
		System.out.println("name:"+name);
		
		long id = main.getId();
		System.out.println("ID:"+id);
		
		int priority = main.getPriority();
		System.out.println("���ȼ�:"+priority);
		
		boolean alive = main.isAlive();
		System.out.println("isalive"+alive);
		
		boolean dead = main.isDaemon();
		System.out.println("�Ƿ�Ϊ�ػ��߳�:"+dead);
		
		boolean isIntertupted = main.isInterrupted();
		System.out.println("�߳��Ƿ��ж�:"+isIntertupted);
		main.interrupt();
	}

}
