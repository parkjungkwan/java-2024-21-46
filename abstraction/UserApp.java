package abstraction;
import java.util.Scanner;
public class UserApp {
	public static void main(String[] args) {
		int a = 3;
		String s = "";
		Scanner scanner = new Scanner(System.in);
		UserController userController = new UserController();
		UserDto user = null;
		while(true) {
			System.out.println("(1)회원가입* (2)로그인 (3)비밀번호 수정* \r\n"
					+ "(4)회원탈퇴* (5)아이디 중복체크 (6)마이페이지 \r\n"
					+ "(7)회원목록 (8)아이디검색 (9)이름검색 \r\n"
					+ "(10)전체 회원수");
			switch (scanner.next()) {
			case "1":
				System.out.println("[회원가입] 아이디,비번,이름 ");
				user = new UserDto();
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				user.setName(scanner.next());
				userController.postJoin(user);
				break;
			case "2":
				System.out.println("[로그인] 아이디,비번 ");
				user = new UserDto();
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDto loginUser = userController.postLogin(user);
				if(loginUser == null) {
					System.out.println("로그인 실패");
				}else {
					System.out.println(loginUser.toString());
				}
				
				break;
			case "3":
				System.out.println("[비밀번호 수정] 아이디, 변경할 비번 ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.putUpdate(user);
				break;
			case "4":
				System.out.println("[회원탈퇴] 아이디,비번 ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.deleteUser(user);
				break;
			case "5":
				System.out.println("[아이디 중복체크] 아이디");
				boolean exist = userController.getIdCheck(scanner.next());
				if(exist) {
					System.out.println("사용가능한 아이디입니다.");
				}else {
					System.out.println("사용 불가능한 아이디입니다.");
				}
				break;
			case "6":
				System.out.println("아이디,비번 ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDto mypage = userController.getMypage(user);
				break;
			case "7":
				UserDto[] list = userController.getUserList();
				for(int i=0; i< userController.getCount(); i++) {
					System.out.println(list[i].toString()+"\n");
				}
				break;
			case "8":
				System.out.println("아이디");
				UserDto idSearch = userController.getIdSearch(scanner.next());
				break;
			case "9":
				System.out.println("이름");
				String name = scanner.next();
				UserDto[] nameSearch = userController.getNameSearch(name);
				for(int i=0; i< userController.getCountSameName(name); i++) {
					System.out.println(nameSearch[i].toString()+"\n");
				}
				break;
			case "10":
				System.out.printf("전체회원수 : %d 명\n",userController.getCount());
				break;
			case "0":
				System.out.println("시스템종료");
				return;
			}
		}
	}
}
class UserDto {
	private String userid, name, password;

	public String getUserid() {return userid;}
	public void setUserid(String userid) {this.userid = userid;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	@Override
	public String toString() {
		return "UserDto [userid=" + userid + ", name=" + name + ", password=" + password + "]";
	}
}
interface UserService {
	public void join(UserDto user);
	public UserDto login(UserDto user);
	public void update(UserDto user);
	public void delete(UserDto user);
	public boolean idCheck(String id);
	public UserDto mypage(UserDto user);
	public int countSameName(String name);
	public UserDto[] userList();
	public UserDto idSearch(String id);
	public UserDto[] nameSearch(String name);
	public int count();
}
class UserServiceImpl implements UserService{
	private UserDto[] users;
	private int count;
	public UserServiceImpl() {
		users = new UserDto[3];
	}

	@Override
	public void join(UserDto user) {
		users[count] = user;
		count++;
	}

	@Override
	public UserDto login(UserDto user) {
		UserDto result = new UserDto();
		for(int i=0;i < count; i++) {
			if(user.getUserid().equals(users[i].getUserid()) &&
					user.getPassword().equals(users[i].getPassword())) {
				result = users[i];
				break;
			}
		}
		return result;
	}

	@Override
	public void update(UserDto user) {
		for(int i=0; i< count; i++) {
			if(user.getUserid().equals(users[i].getUserid())) {
				users[i].setPassword(user.getPassword());
				break;
			}
		}
		
	}

	@Override
	public void delete(UserDto user) {
		for(int i=0; i< count; i ++) {
			if(user.getUserid().equals(users[i].getUserid())&&
					user.getPassword().equals(users[i].getPassword())) {
				users[i] = users[count-1];
				users[count-1] = null;
				count--;
				break;
			}
		}
		
	}

	@Override
	public boolean idCheck(String id) {
		boolean flag = false;
		for(int i=0; i<count; i++) {
			if(id.equals(users[i].getUserid())) {
				flag = true; 
				break;
			}
		}
		return flag;
	}

	@Override
	public UserDto mypage(UserDto user) {
		UserDto result = new UserDto();
		for(int i=0; i< count; i++) {
			if(user.getUserid().equals(users[i].getUserid())) {
				result = users[i];
				break;
			}
		}
		return result;
	}

	@Override
	public UserDto[] userList() {
		return users;
	}

	@Override
	public UserDto idSearch(String id) {
		UserDto user = new UserDto();
		for(int i = 0; i < count; i++) {
			if(id.equals(users[i].getUserid())) {
				user = users[i];
			}
		}
		return user;
	}
	@Override
	public int countSameName(String name) {
		int num = 0;
		for(int i = 0; i< count; i++) {
			if(name.equals(users[i].getName())) {
				num++;
			}
		}
		return num;
	}
	
	@Override
	public UserDto[] nameSearch(String name) {
		int num = countSameName(name);
		UserDto[] usersWithSameName = new UserDto[num];
		int j = 0;
		for(int i = 0; i< count; i++) {
			if(name.equals(users[i].getName())) {
				usersWithSameName[j] = users[i];
				j++;
				if(j==num) {break;}
			}
		}
		return usersWithSameName;
	}

	@Override
	public int count() {
		return count;
	}
	
}
interface UserDao {
	public void insertUser(UserDto user);
	public UserDto login(UserDto user);
	public void updateUser(UserDto user);
	public void deleteUser(UserDto user);
	public boolean selectIdCheck(String id);
	public UserDto selectUser(UserDto user);
	public UserDto[] selectUserList();
	public UserDto selectById(String id);
	public UserDto[] selectByName(String name);
	public int selectCount();
}
class UserDaoImpl implements UserDao{

	@Override
	public void insertUser(UserDto user) {
		
		
	}

	@Override
	public UserDto login(UserDto user) {
		
		return null;
	}

	@Override
	public void updateUser(UserDto user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(UserDto user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean selectIdCheck(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto selectUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto[] selectUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto[] selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
class UserController {
	private UserService userService;

	public UserController() {
		userService = new UserServiceImpl();
	}

	public void postJoin(UserDto user) {
		userService.join(user);
	}

	public UserDto postLogin(UserDto user) {
		return userService.login(user);
	}

	public void putUpdate(UserDto user) {
		userService.update(user);
	}

	public void deleteUser(UserDto user) {
		userService.delete(user);
	}

	public boolean getIdCheck(String id) {
		return userService.idCheck(id);
	}

	public UserDto getMypage(UserDto user) {
		return userService.mypage(user);
	}

	public UserDto[] getUserList() {
		return userService.userList();
	}

	public UserDto getIdSearch(String id) {
		return userService.idSearch(id);
	}
	public int getCountSameName(String name) {
		return userService.countSameName(name);
	}

	public UserDto[] getNameSearch(String name) {
		return userService.nameSearch(name);
	}

	public int getCount() {
		return userService.count();
	}

}