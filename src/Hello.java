import java.util.Scanner;

public class Hello {
    //入口主函数
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //添加注释
        System.out.println("请输入GitHub账号：");
        String str=scanner.nextLine();
        System.out.println("请输入GitHub密码：");
        String str1=scanner.nextLine();
        if ("123".equals(str)){
            System.out.println("输入成功");
        }
        //dev分支
        System.out.println("提交新分支");
        System.out.println("分支冲突2");
        System.out.println("分支冲突");
    }
}
