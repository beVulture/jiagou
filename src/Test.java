import com.rimi.serviceimpl.UserServiceImpl;
import com.rimi.util.Tool;

public class Test {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		System.out.println("欢迎来到XXX系统");

		while (true) {
			System.out.println("请选择 	1. 登陆	2. 注册 3. 退出");
			int option = Tool.inputInt();
			switch (option) {
			case 1:
				userServiceImpl.logIn();
				break;
			case 2:
				userServiceImpl.register();
				break;
			case 3:
				return;
			}
		}
	}
}
