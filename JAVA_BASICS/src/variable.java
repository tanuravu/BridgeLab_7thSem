public class variable {
    public void MyMethod(){
        int x=1;
        int y=2;
        int q=x+y;
        System.out.println(q);
    }
    public static void main(String[] args){
        System.out.println("hello World!");
        variable obj= new variable();
        obj.MyMethod();
    }
}
