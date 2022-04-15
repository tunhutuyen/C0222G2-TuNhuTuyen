package ss10_danh_sach.thuc_hanh.LinhkedListDonGian;

public class MyLinkListMain {
    public static void main(String[] args) {
        MyLinkList linkList = new MyLinkList(111);
        linkList.addFirst(11);
        linkList.addFirst(9);
        linkList.addFirst(1);
        linkList.addFirst(4);
        linkList.addFirst(20);
        linkList.addFirst(5);
        System.out.print("Before: ");
        linkList.printList();
        linkList.add(4,0);
        System.out.print("\n After: ");
        linkList.printList();
        //linkList.add();
        //linkList.printList();
    }
}
