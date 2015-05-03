public class DeckOfCards{
  
	int[] deck = new int[52];


	DeckOfCards(){
		for (int i = 0; i < deck.length; i++){
			deck[i] = i;
		}
	}
    

	public void shuffle(){
		for(int i = 0; i < deck.length; i++){
			//Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
			
	}

	public int[] Display(){ 
		int contentOfCard[] = new int[4];
		shuffle();
		for (int i = 0; i < 4; i++) {
			contentOfCard[i] = deck[i];
		}
		
		return contentOfCard;
	}
}
