package testExecution;


import drivers.WebActions;


public class ExecuteTestSuite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebActions obj1 = new WebActions();
		obj1.executeTestSuite("ie","DCCS Smoke","Smoke");

	}

}
