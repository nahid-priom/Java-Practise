public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insertAtFirst(15);
        list.insertAtFirst(150);
        list.insertAtInex(0, 100);
        list.deleteAt(2);
    
        
       

        list.Show();
    }
}