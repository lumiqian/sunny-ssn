package com.sunny.ssn.www;

import java.util.ArrayList;

/*This data structure assumes that 1 person can have "unlimited" number of friends in this social network*/
class FriendNetwork{
	String currentName;
	ArrayList<FriendNetwork> friendNetworks;
		
	public FriendNetwork(String currentNetworkName){
		this.currentName = currentNetworkName;
		this.friendNetworks = new ArrayList<FriendNetwork>();
	}
	
	/*get a list of n-degree friends of the current user*/
	public ArrayList<String> getLevelNFriends(RecursionHelper helper, FriendNetwork currentNetwork, int n){
		
		if(currentNetwork.friendNetworks != null){
			for(FriendNetwork firstDegreeNetwork: currentNetwork.friendNetworks){
				getLevelNFriends(helper, firstDegreeNetwork, n-1);
			}
		}
		if(n == 0){
			helper.friendList.add(currentNetwork.currentName);
		}	
		
		return helper.friendList;
	}
		
	/*print out the list of the current user's n-degree friends, 
	 * and echo error message if there's no n-degree friends of the current user*/
	public void printDegreeNFriends(FriendNetwork user, int n){
		ArrayList<String> friendNames = getLevelNFriends(new RecursionHelper(), user, n);
		if (friendNames.size() != 0){
			System.out.println("Here's the list of " + user.currentName + "'s " + n + "-degree of friends: " );
			for(String friendName: friendNames)
				System.out.print(friendName + " ");
			System.out.println();
		}
		else{
			System.out.println("Sorry, but " + user.currentName +  " doesn't have " + n + "-degree of friends.");
		}
	}
	
}

