import java.util.*;
public class Word_Dictionary {
    class Node
    {
        String word;
        String dictionary;
        Node right;
        Node left;
        Node(String word,String dictionary)
        {
            this.word = word;
            this.dictionary = dictionary;
            this.right = null;
            this.left = null;
        }
    }
    Node root;
    Word_Dictionary()
    {
        this.root = null;
    }
    void insert(String word1,String meaning)
    {   
        Node n = new Node(word1,meaning);
       if(root==null)
       {
        root = n;
        n.right= n.left = null;
        System.out.println("root "+root.word);
       }
       else
       {
        System.out.println("ROOT HAS HIS SPACE");
        int direction = word1.compareTo(root.word);
        System.out.println(direction);
        if(direction<0)
        {
            int flag =0;
            Node temp = root;
            while(temp.left!=null)
            {
                int direction2 = word1.compareTo(temp.left.word);
                // System.out.println("HIHIH "+direction2);
                if(direction2>0)
                {
                    System.out.println("Right");
                    flag++;
                    temp.left.right = n;
                    break;
                }
                temp = temp.left;
            }
            // System.out.println(flag);
            if(flag==0)
            {
                // System.out.println(temp.word);
                System.out.println("Welcome Left");
                temp.left = n;

            }
        }
        else if(direction>0)
        {
            System.out.println("Right "+word1);
            int flag =0;
            Node temp = root;
            while(temp.right!=null)
            {
                int direction2 = word1.compareTo(temp.right.word);
                // System.out.println("HIHIH "+direction2);
                if(direction2<0)
                {
                    System.out.println("Left");
                    flag++;
                    temp.right.left = n;
                    n.right = n.left = null;
                    break;
                }
                temp = temp.right;
            }
            // System.out.println(flag);
            if(flag==0)
            {
                // System.out.println(temp.word);
                System.out.println("Welcome Right");
                temp.right= n;
                n.left = n.right = null;
            }
        }
        else
        {
            System.out.println("Double arreey");
        }
       }
    }
    public void display1()
    {
        Scanner sc = new Scanner(System.in);
           int choice;

        do{
        System.out.println("1. To display in PREORDER");
        System.out.println("2. To display in INORDER");
        System.out.println("3. To display in POSTORDER");
        System.out.println("4. To Dsplay All");
        System.out.println("5. To Exit");
        System.out.println("enter you choice");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1 :
            System.out.println("PREORDER TRAVERSING");
            displayPre(root);
            break;
            case 2 :
            System.out.println("INORDER TRAVERSING");
            displayIn(root);
            break;
            case 3 :
            System.out.println("POSTORDER TRAVERSING");
            displayPos(root);
            break;
            case 4 :
            System.out.println("TRAVERSING IN ALL ORDER");
            System.out.println("PREORDER TRAVERSING");
            displayPre(root);
            System.out.println("INORDER TRAVERSING");
            displayIn(root);
            System.out.println("POSTORDER TRAVERSING");
            displayPos(root);
            break;
            case 5 :
            System.out.println("THANK YOU");
            break;
            default :
            System.out.println("Enter Valid Input");
            break;
        }
        // display(root);
        }while(choice!=5);
    }
    void displayIn(Node root)
    {
        if(root!=null)
        {
            displayIn(root.left);
            System.out.println(root.word+"    "+root.dictionary);
            displayIn(root.right);
        }
    }
    void displayPre(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.word+"    "+root.dictionary);
            displayPre(root.left);
            displayPre(root.right);
        }
    }
    void displayPos(Node root)
    {
        if(root!=null)
        {
            displayPos(root.left);
            displayPos(root.right);
            System.out.println(root.word+"    "+root.dictionary);
        }
    }
}
class BST
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Word_Dictionary w = new Word_Dictionary();
        // w.insert("Aam","summer fruit");
        // w.insert("Apple","fruit");
        // w.insert("Aai","roar");
        // w.insert("Ape","Monster");
        // w.display1();
        // System.out.println(w.root.left.right.word);
        // System.out.println(w.root.word);
        // int direction = "Aa".compareTo("Aam");
        // System.out.println(direction);
        // w.insert("Nest","Bird's Home");
        // w.insert("Lion","animal");
        // w.insert("Wolf","animal");
        // w.insert("Kite","Festival");
        // w.insert("India","country");
        // w.insert("Fish","mamal");
        // w.insert("Elephant","animal");
        // w.insert("Horse","animal");

        // w.insert("X-max","Chrismas tree");
        // w.insert("Zebra","animal");
        // w.insert("Sun","planet");
        // w.insert("Parrot","bird");
        // w.insert("Truck","Vehicle");

        // w.insert("Kite","Festivals ");
        // w.insert("Orange","Fruit or colour");
        
        w.display1();
    }

}
