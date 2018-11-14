package thread;

public class ThreadDemo5 {
	public static void main(String[] args) {
		Thread main = new Thread();
		System.out.println("线程的名字:"+main);
		
		String name  = main.getName();
		System.out.println("name:"+name);
		
		long id = main.getId();
		System.out.println("ID:"+id);
		
		int priority = main.getPriority();
		System.out.println("优先级:"+priority);
		
		boolean alive = main.isAlive();
		System.out.println("isalive"+alive);
		
		boolean dead = main.isDaemon();
		System.out.println("是否为守护线程:"+dead);
		
		boolean isIntertupted = main.isInterrupted();
		System.out.println("线程是否被中断:"+isIntertupted);
		main.interrupt();
	}

}
