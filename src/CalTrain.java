
public class CalTrain {
	Station st;
	int trainCalled; // 1 = yes, 0 = no
	int availSeats; 
	public int station_load_train(Station s, int count){
		while(count > 0){
			//loops here
		}
		trainCalled = 1;
		return 1;
		//needs a return type other than void zzzz
	}
	public int station_wait_for_train(Station s){
			if(trainCalled == 0){
				station_load_train(st, availSeats);
			}
			else{
				if(availSeats > 0){
					// return something
					//once it returns, passenger will move to the train!
					//will call station_on_board
					return 1;
				}
			}
			return 0;
	}
	public boolean station_on_board(Station s){
		return true;
		//let the train know it is on board!
	}
	
	public CalTrain(){
		st = new Station();
		trainCalled = 0;
		availSeats = 0; 
	}
}
