public class LinkTester {

    public static void main(String[] args) {
        SinglyLinkedList<String> helloBaby = new SinglyLinkedList<>();




        helloBaby.addToFront("Hello");

        helloBaby.addToBack("Red");
        helloBaby.addToBack("Pants");
        helloBaby.addToFront("I wanna know why it hurts so bad");

        helloBaby.addToBack("Where'd");
        helloBaby.addToBack("You");
        helloBaby.addToBack("Get");

        helloBaby.removeFromFront();
        helloBaby.removeFromFront();
        helloBaby.removeFromBack();
        helloBaby.removeFromBack();


        SinglyLinkedListNode<String> curr = helloBaby.getHead();
        while(curr != null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }






    }
}
