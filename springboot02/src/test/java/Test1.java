import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import web.com.entity.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @version V1.0.1
 * @classname Test1
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-12-25  13:19
 **/

public class Test1 {


    @Test
    public void test01(){
        int [] a= new int[]{999,888,999,777,666,777};
        System.out.println(a);
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = a.length - 1; i >=0; i--) {
            set.add(a[i]);
        }

        for (Integer integer : set) {
            System.out.println("new :"+set);

        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }


    @Test
    public void test02(){

        Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int a3 = scanner.nextInt();
            int a4 = scanner.nextInt();
            int a5 = scanner.nextInt();
            list.add(a);
            list.add(a1);
            list.add(a2);
            list.add(a3);
            list.add(a4);
            list.add(a5);
        }
    }


    @Test
    public void test03(){
        List<User> users = new ArrayList<User>();
        User user1 = new User(2,"张三","28");
        User user2 = new User(1,"李四","21");
        User user3 = new User(4,"王五","24");
        User user4 = new User(3,"赵六","22");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        for (User user : users) {
            System.out.println("未排序前的数据"+user);
        }

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        for (User user : users) {
            System.out.println("根据id排序后的数据"+user);

        }
    }
    @Test
    public void test04(){
        Set<User> users = new TreeSet<User>(
                new Comparator<User>(){
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.getId() - o2.getId();
                    }
                }
        );
        User user1 = new User(2,"张三","28");
        User user2 = new User(1,"李四","21");
        User user3 = new User(4,"王五","24");
        User user4 = new User(3,"赵六","22");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


    }
}
