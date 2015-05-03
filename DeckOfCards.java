public class DeckOfCards{
  
	/**Declare and create an deck array */
	int[] deck = new int[52];

	/**Initialize 52 cards*/
	DeckOfCards(){
		for (int i = 0; i < deck.length; i++){
			deck[i] = i;
		}
	}
    
	/**a method to shuffle 52 cards*/
	public void shuffle(){
		for(int i = 0; i < deck.length; i++){
			
			/**Generate an index randomly*/
			int index = (int)(Math.random() * deck.length);
			
			/**Exchange the card number*/
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
	}

	/**a method to display the first four cards*/
	public int[] Display(){ 
		
		/**Declare and create an contentOfCard array */
		int contentOfCard[] = new int[4];
		
		/**Invoke shuffle method to shuffle 52 cards*/
		shuffle();
		
		/**Get card number of the first four cards*/
		for (int i = 0; i < 4; i++) {
			contentOfCard[i] = deck[i];
		}
		return contentOfCard;
	}
}
