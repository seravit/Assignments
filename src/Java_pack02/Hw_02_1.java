package Java_pack02;

class Person {
    private String name;
    private String addr;
    private String tel;
    
    Person(String name_,String addr_,String tel_){
        name = name_;
        addr = addr_;
        tel = tel_;
    }
    
    public String Getname() { return name; }
    public String Getaddr() { return addr; }
    public String Gettel() { return tel; }
    
    public String toString() {
         return "[이름]"+name+"\n"+"[주소]"+addr+"\n"+"[전화번호]"+tel+"\n";
    }
}

class Customer extends Person {
    String customNum;
    int mileage;
    
    Customer(String name_,String addr_,String tel_,String customNum_,int mileage_){
        super(name_,addr_,tel_);
        customNum = customNum_;
        mileage = mileage_;
    }

    public String toString() {
        return "[이름]"+super.Getname()+"\n"+"[주소]"+super.Getaddr()+"\n"+"[전화번호]"+super.Gettel()+"\n"+"[고객번호]"+customNum+"\n"+"[마일리지]"+mileage+"\n";
        
    }
}

public class Hw_02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("홍길동", "서울시 강남구 개포로", 
				"010-7466-5006", "20349857", 4200);
		System.out.println(c1.toString());
	}

}
