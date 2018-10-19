class node {
	constructor(){
		this.head = null;
	}
	insert(node,sibling) {
		sibling.next = node;
		this.head = sibling;
	}

}
