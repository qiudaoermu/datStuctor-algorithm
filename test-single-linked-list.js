class Node {
    constructor (){
        this.head = {}
    }
    insert (node,silbing) {
       let strBefore = silbing
       let strnext = node

        node = {}
        silbing = {}
        if(!silbing.next){
            this.head.next = node;
            node.data = strnext
            this.head.data = strBefore
        }
    }
}
var node = new Node();
node.insert("one","two");
// node.insert("three","one")
console.log(node);

