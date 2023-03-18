package Dip;

public interface IWorker {
public void work();
}
class Worker1 implements IWorker
{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	
}
class SuperWorker1 implements IWorker{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	
}
class Manager1{
	IWorker worker;
	public void setWorker(IWorker w) {
	worker=w;
	}
	public void manage()
	{
		worker.work();
	}
}