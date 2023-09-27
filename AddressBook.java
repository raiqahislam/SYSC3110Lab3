import java.util.*;
public class AddressBook extends BuddyInfo
{
    private ArrayList<BuddyInfo> BuddyList;
    private BuddyInfo buddy;

    public AddressBook(){
        BuddyList = new ArrayList<BuddyInfo>();
        buddy = new BuddyInfo();
    }
    private void addBuddy(BuddyInfo buddy){
        if (buddy != null) {
            BuddyList.add(buddy);
        }
    }
    private BuddyInfo removeBuddy(int index){

        if( index >- 0 && index < BuddyList.size()){
            return BuddyList.remove(index);


        }
        return null;
    }
    private void printDescription(){

        buddy.getAddress();
        buddy.getName();
        buddy.getNumber();


    }

    private void printDescription(){

        buddy.getAddress();
        buddy.getName();
        buddy.getNumber();


    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Alice","123 Apple St",514);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("Adding text for Github");

    }

}
