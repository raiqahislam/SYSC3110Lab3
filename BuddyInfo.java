public class BuddyInfo {

    private String name;

    private String address;

    private int number;

    public BuddyInfo(){
        name = "John Doe";
        address = "123 Street";
        number = 614567;

    }
    public BuddyInfo(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {

        BuddyInfo friend = new BuddyInfo("Mary","56 Locker St",1234);
        System.out.println("Hello " + friend.getName());



    }
}