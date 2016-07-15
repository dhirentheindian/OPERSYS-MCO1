
public class CalTrain {
	Station st = new Station();
	int trainCalled = 0;
	int availSeats = 0;
	public void station_load_train(Station s, int count){
		while(count > 0){
			//loops here
		}
		trainCalled = 1;
		//needs a return type other than void zzzz
	}
	public void station_wait_for_train(Station s){
			if(trainCalled == 0){
				station_load_train(st, availSeats);
			}
			else{
				if(availSeats > 0){
					// return something
					//once it returns, passenger will move to the train!
					//will call station_on_board
				}
			}
	}
	public boolean station_on_board(Station s){
		return true;
		//let the train know it is on board!
	}

}
