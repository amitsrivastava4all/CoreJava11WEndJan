interface Card{
	void shopLimit();
	void moreGracePeriod();
	void vouchers();
}
abstract class CardAdapter implements Card{

	@Override
	public void shopLimit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moreGracePeriod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vouchers() {
		// TODO Auto-generated method stub
		
	}
	
}
class SilverCard extends CardAdapter {
	@Override
	public void shopLimit() {
		System.out.println("Silver Card has LImit of 1 Lakh");
		
	}
}
class GoldCard extends CardAdapter{

	
	
}
class PlCard extends CardAdapter{

	
	
}
public class Limitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
