public boolean switchType(Dog[][] arr, int x, int y) {
		if(arr[x][y].getClass() == Poodle.class) {
			arr[x][y] = new Bulldog("garg", "new");
		}
		if(arr[x][y].getClass() == Bulldog.class) {
			arr[x][y] = new Bulldog("garg", "new");
		}
		return true;
	}
	public void empty(Dog[][] arr, int x, int y) {
		arr[x][y] = null;
	}
	public void randomizeDogOrder(Dog[][] arr) {
		int x = (int)((arr.length - 0 + 1) * Math.random() + 0);
		int y = (int)((arr[x].length - 0 + 1) * Math.random() + 0);
		int x2 = (int)((arr.length - 0 + 1) * Math.random() + 0);
		int y2 = (int)((arr[x].length - 0 + 1) * Math.random() + 0);
		Dog[] temp = new Dog[1];
		temp[0] = arr[x][y];
		arr[x][y] = arr[x2][y2];
		arr[x2][y2] = temp[0];
	}
	public boolean diagonalDog(Dog[][] arr) {
		Dog[] temp = new Dog[1];
		temp[0] = arr[0][0];
		int check = 0;
		for(int i = 0; i  < arr.length; i++)
			if(arr[i][check] == temp[0])
				check++;
		if(check == arr.length - 1)
			return true;
		else {
			return false;
		}
	}

