class WhatsappV1
{
	public void delivery(boolean deliver,boolean seen)
	{
		System.out.println("One tick");
	}
}
class WhatsappV2 extends WhatsappV1
{
	public void delivery(boolean deliver,boolean seen)
	{
		if(deliver == true)
		{
			System.out.println("Two Ticks");
		}
		else if(deliver == true&&seen == false)
		{
			System.out.println("Two Ticks");
		}
		else
		{
			System.out.println("One Tick");
		}
	}
}
class WhatsappV3 extends WhatsappV2
{
	public void delivery(boolean deliver,boolean seen)
	{
		if(seen == true&&deliver==true)
		{
			System.out.println("Two blue Ticks");
		}
		else if(deliver == true&&seen==false)
		{
			System.out.println("Two black Ticks");
		}
		else
		{
			System.out.println("One Tick");
		}
	}	
}
class Whatsapp
{
	public static void main(String[] args) {
		WhatsappV1 w1 = new WhatsappV1();
		System.out.println("WhatsappV1 Starts");
		w1.delivery(false,false);//Message Not Delivered Not Seen
		w1.delivery(true,true);//Message Delivered Seen
		w1.delivery(true,false);//Message Delivered Not Seen
		System.out.println("WhatsappV2 starts");
		WhatsappV2 w2 = new WhatsappV2();
		w2.delivery(false,false);//Message Not Delivered Not Seen
		w2.delivery(true,true);//Message Delivered Seen
		w2.delivery(true,false);//Message Delivered Not Seen
		w2.delivery(false,true);//Message Not Delivered 
		System.out.println("WhatsappV3 Starts");
		WhatsappV3 w3 = new WhatsappV3();
		w3.delivery(false,false);//Message Not Delivered Not Seen
		w3.delivery(true,true);//Message Delivered Seen
		w3.delivery(true,false);//Message Delivered Not Seen
		w3.delivery(false,true);//Message not Delivered 
	}
}