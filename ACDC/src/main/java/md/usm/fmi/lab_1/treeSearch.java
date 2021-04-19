package md.usm.fmi.lab_1;

import md.usm.fmi.assets.Movie;

public class treeSearch {
    int i=0;
    public void inorder(Node root)
    {
        if (root == null) {
            return;
        }

        i+=1;

        inorder(root.left);
        System.out.println(root.data.toString());
        inorder(root.right);
    }

    public Node insert(Node root, Movie key)
    {
        if (root == null) {
            return new Node(key);
        }

        if (root.data == null) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }


    public Node find(Node root,int key){
        while(root.data.getId() != key){
            i+=1;
            root = root.right;
            if(root==null){
                return null;
            }
        }
        System.out.println("We found an element under the index: " + key + " in " + (i+1) + " steps");
        return root;
    }
}
