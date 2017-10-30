package com.sunny.ssn.www;

/*Author: Yuchen
 * Date: 2017/10/30*/

class SunnySSN{
	
	public static void main(String[] args){		
		FriendNetwork A = new FriendNetwork("Alice");
		FriendNetwork B = new FriendNetwork("Bob");
		FriendNetwork C = new FriendNetwork("Claire");
		FriendNetwork D = new FriendNetwork("Debb");
		FriendNetwork E = new FriendNetwork("Eva");
		FriendNetwork F = new FriendNetwork("Fiona");
		FriendNetwork G = new FriendNetwork("Gina");
		FriendNetwork H = new FriendNetwork("Hebe");
		FriendNetwork I = new FriendNetwork("Ivy");
		
		A.friendNetworks.add(B);
		A.friendNetworks.add(C);
		A.friendNetworks.add(D);
		
		B.friendNetworks.add(E);
		B.friendNetworks.add(F);
		B.friendNetworks.add(G);
		
		D.friendNetworks.add(H);
		
		H.friendNetworks.add(I);
		
		A.printDegreeNFriends(A, 1);
		A.printDegreeNFriends(A, 2);

		A.printDegreeNFriends(A, 4);
		A.printDegreeNFriends(A, 3);
		
		D.printDegreeNFriends(D, 1);
		D.printDegreeNFriends(D, 2);
		
//		FriendTree treeA = new FriendTree("Alice");
//		FriendTree treeB = new FriendTree("Bob");
//		FriendTree treeC = new FriendTree("Claire");
//		FriendTree treeD = new FriendTree("Debb");
//		FriendTree treeE = new FriendTree("Eva");
//		FriendTree treeF = new FriendTree("Fiona");
//		FriendTree treeG = new FriendTree("Gina");
//		
//		treeA.leftNode = treeB;
//		treeA.rightNode = treeC;
//		treeB.leftNode = treeD;
//		treeB.rightNode = treeE;
//		treeC.leftNode = treeF;
//		treeF.leftNode = treeG;
//		
//		treeA.getLevelNFriends(treeA, 2);
	}
}

