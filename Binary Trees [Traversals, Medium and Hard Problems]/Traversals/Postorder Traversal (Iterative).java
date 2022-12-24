class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
    Stack<Node> st1 = new Stack<>();
    // Stack<Node> st2 = new Stack<>();
       
    ArrayList<Integer> post = new ArrayList<>();
    st1.push(node);
       
    while(!st1.isEmpty()){
        Node num = st1.pop();
        // st2.push(num);
        post.add(num.data);
        if(num.left!=null){
            st1.push(num.left);
        }
        if(num.right!=null){
            st1.push(num.right);
        }
    }
    // while(!st2.isEmpty()){
    //     Node n = st2.pop();
    //     post.add(n.data);
    // }
    Collections.reverse(post);
       return post;
       
    }
}
