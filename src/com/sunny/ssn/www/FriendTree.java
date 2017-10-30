package com.sunny.ssn.www;

/* Deprecated.
 * This data structure assumes that 1 person only has 0~2 friends*/
class FriendTree{
	String currentNodeName;
	FriendTree currentNode;
	FriendTree leftNode;
	FriendTree rightNode;
	
	public FriendTree(String currentNodeName){
		this.currentNodeName = currentNodeName;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	public String getCurrentNodeName(){
		return currentNodeName;
	}
	
	public void getLevelNFriends(FriendTree rootNode, int n){

		if(rootNode.leftNode != null){
			getLevelNFriends(rootNode.leftNode, n-1);
		}
		if(rootNode.rightNode != null){
			getLevelNFriends(rootNode.rightNode, n-1);
		}
		if(n == 0){
			System.out.print(rootNode.currentNodeName + " ");
		}
	}
	
}
