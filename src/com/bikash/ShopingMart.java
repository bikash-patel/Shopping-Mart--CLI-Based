package com.bikash;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;  

public class ShopingMart {
	Scanner sc=new Scanner(System.in);
	int option,code;
	static int whichmeth;
	static int count;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();
    static int procode[]=new int[1000];
    static int qty[]=new int[1000];
    String item[]=new String[1000];
    String unit[]=new String[1000];
    String free[]=new String[1000];
    int price[]=new int[1000];
    static int total;
    static int freetotal1,freetotal2,freetotal3,freetotal4,freetotal5;
    static int count1,count2,count3,count4,count5;
	void disp()
	{
		System.out.println("●～●～●～●～●●～●～●～●～●●～●～●～●～●●～●～●～●～●");
		System.out.println("●        𝕎𝔼𝕃ℂ𝕆𝕄𝔼 𝕋𝕆 𝔻𝔸𝕀𝕃𝕐 𝔽ℝ𝔼𝕊ℍ 𝕄𝔸ℝ𝕋             ●");
		System.out.println("●～●～●～●～●●～●～●～●～●●～●～●～●～●●～●～●～●～●");
		option();
	}
	void option()
	{
		System.out.println("\n1.Menu");
		System.out.println("2.Exit");
		System.out.print("\nPlease enter your option : ");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			menu();
			break;
		case 2:
			exit();
			break;
		default:
			System.out.println("\nPlease enter a valid option");
			option();
		}
	}
	void menu()
	{
		System.out.println("\n                ***Main Menu***");
		System.out.println("                  1.Groceries");
		System.out.println("                  2.Fruits & Veggies");
		System.out.println("                  3.Beverages");
		System.out.println("                  4.Chocolates");
		System.out.println("                  5.Scacks");
		System.out.println("                  6.Start Menu");
		System.out.println("                  000.To Get Bill");
		System.out.println("\nPlease Select Code for Further Details:");
		code=sc.nextInt();
		switch(code)
		{
		case 1:
			groceries();
			break;
		case 2:
			fv();
			break;
		case 3:
			bever();
			break;
		case 4:
			chocolates();
			break;
		case 5:
			scacks();
			break;
		case 6:
			option();
			break;
		case 000:
			if(count>0)
				 bill();
			else
				System.out.println("You have not bought anything yet!!");
			    option();
			break;
		default :
			System.out.println("Please enter valid code ");
			menu();
			
		}
	}
	void exit()
	{
		if(count==0)
		{
			System.out.println("\nYou have not bought anything yet..!\n\n");
			System.out.println("\n𓂀 🙏🙏🙏🙏𝐓𝐡𝐚𝐧𝐤𝐬 𝐟𝐨𝐫 𝐯𝐢𝐬𝐢𝐭𝐢𝐧𝐠 𝐉𝐚𝐯𝐚 𝐒𝐭𝐮𝐝𝐞𝐧𝐭 𝐌𝐚𝐫𝐭🙏🙏🙏🙏 𓂀");
			System.out.println("              ⭐🌟 V͙i͙s͙i͙t͙  U͙s͙  A͙g͙a͙i͙n͙ 🌟⭐");
		}
		else
		{
			System.out.println("If you want to exit , your purchase item will be cancel ");
			System.out.println("Press 1 for canceling and 2 to get bill");
			int choose=sc.nextInt();
			if(choose==2)
				{
				count++;
				bill();
				}
			    else if(choose==1)
			    {
			    	System.out.println("\n𓂀 🙏🙏🙏🙏𝐓𝐡𝐚𝐧𝐤𝐬 𝐟𝐨𝐫 𝐯𝐢𝐬𝐢𝐭𝐢𝐧𝐠 𝐉𝐚𝐯𝐚 𝐒𝐭𝐮𝐝𝐞𝐧𝐭 𝐌𝐚𝐫𝐭🙏🙏🙏🙏 𓂀");
					System.out.println("              ⭐🌟 V͙i͙s͙i͙t͙  U͙s͙  A͙g͙a͙i͙n͙ 🌟⭐");
			    }
			    else
			    {
			    	System.out.println("Please enter a valid option");
			    	exit();
			    }
		}
	}
	void groceries()
	{
		whichmeth=1;
		System.out.println("\n                     ***Groceries***\n");
		System.out.println("                  101     Face Wash        ₹95/pcs ");
		System.out.println("                  102     Tomato Sauce     ₹30/pcs");
		System.out.println("                  103     Olive Oil        ₹120/pkt");
		System.out.println("                  104     Shamphoo         ₹60/pcs");
		System.out.println("                  105     Bath Soap        ₹10/pcs");
		System.out.println("                  000     To Get Bill");
		System.out.println("                  222     Main Menu");
		count++;
        order();
	}
	void fv()
	{
		whichmeth=2;
		System.out.println("\n                ***Fruits & Veggies***\n");
		System.out.println("                  201     Banana           ₹60/dozen ");
		System.out.println("                  202     Apple            ₹120/kg");
		System.out.println("                  203     Pineapple        ₹120/kg");
		System.out.println("                  204     Papaya           ₹40/kg");
		System.out.println("                  205     Tomato           ₹70/kg");
		System.out.println("                  000     To Get Bill");
		System.out.println("                  222     Main Menu");
		count++;
		order();
	}
	void bever()
	{
		whichmeth=3;
		System.out.println("\n                     ***Beverages***\n");
		System.out.println("                  301     Tea             ₹35/cup ");
		System.out.println("                  302     Coffee          ₹50/cup");
		System.out.println("                  303     Orange Blush    ₹40/glass");
		System.out.println("                  304     Fresh Lime      ₹30/glass");
		System.out.println("                  305     Hot Milk        ₹30/glass");
		System.out.println("                  000     To Get Bill");
		System.out.println("                  222     Main Menu");
		count++;
		order();
	}
	void chocolates()
	{
		whichmeth=4;
		System.out.println("\n                    ***Chocolates***\n");
		System.out.println("                  401     Munch            ₹20/pcs ");
		System.out.println("                  402     5 Star           ₹30/pcs");
		System.out.println("                  403     Dairy Milk       ₹60/pcs");
		System.out.println("                  404     KitKat           ₹40/pcs");
		System.out.println("                  405     Chocomass        ₹30/pcs");
		System.out.println("                  000     To Get Bill");
		System.out.println("                  222     Main Menu");
		count++;
		order();
	}
	void scacks()
	{
		whichmeth=5;
		System.out.println("\n                       ***Snacks***\n");
		System.out.println("                  501     Burger            ₹70/pcs");
		System.out.println("                  502     Sandwich          ₹230/pcs");
		System.out.println("                  503     Pizza             ₹260/pcs");
		System.out.println("                  504     Egg Role          ₹60/pcs");
		System.out.println("                  505     Manchurian        ₹60/plate");
		System.out.println("                  000     To Get Bill");
		System.out.println("                  222     Main Menu");
		count++;
		order();
	}
	void order()
	{
		item[101]="Face Wash      ";
		item[102]="Tomato Sauce   ";
		item[103]="Olive Oil      ";
		item[104]="Shamphoo       ";
		item[105]="Bath Soap      ";
		item[201]="Banana         ";
		item[202]="Apple          ";
		item[203]="Pineapple      ";
		item[204]="Papaya         ";
		item[205]="Tomato         ";
		item[301]="Tea            ";
		item[302]="Cofee          ";
		item[303]="Orange Blush   ";
		item[304]="Fresh Lime     ";
		item[305]="Hot Milk       ";
		item[401]="Munch          ";
		item[402]="5 star         ";
		item[403]="Dairy Milk     ";
		item[404]="KitKat         ";
		item[405]="Chocomass      ";
		item[501]="Burger         ";
		item[502]="Sandwich       ";
		item[503]="Pizza          ";
		item[504]="Egg Role       ";
		item[505]="Manchurian     ";
		
		unit[101]="pieces  ";
		unit[102]="pieces  ";
		unit[103]="packet  ";
		unit[104]="pieces  ";
		unit[105]="pieces  ";
		unit[201]="dozen   ";
		unit[202]="kg      ";
		unit[203]="kg      ";
		unit[204]="kg      ";
		unit[205]="kg      ";
		unit[301]="cup     ";
		unit[302]="cup     ";
		unit[303]="glass   ";
		unit[304]="glass   ";
		unit[305]="glass   ";
		unit[401]="pieces  ";
		unit[402]="pieces  ";
		unit[403]="pieces  ";
		unit[404]="pieces  ";
		unit[405]="pieces  ";
		unit[501]="pieces  ";
		unit[502]="pieces  ";
		unit[503]="pieces  ";
		unit[504]="pieces  ";
		unit[505]="plate   ";
		
		price[101]=90;
		price[102]=30;
		price[103]=120;
		price[104]=60;
		price[105]=10;
		price[201]=60;
		price[202]=120;
		price[203]=120;
		price[204]=40;
		price[205]=70;
		price[301]=95;
		price[302]=30;
		price[303]=120;
		price[304]=60;
		price[305]=10;
		price[401]=20;
		price[402]=30;
		price[403]=60;
		price[404]=40;
		price[405]=30;
		price[501]=70;
		price[502]=230;
		price[503]=260;
		price[504]=60;
		price[505]=60;
		System.out.print("\nPlease Select Code for Further Details:");
		procode[count]=sc.nextInt();
		if(procode[count]==000)// To get bill
		{
			bill();
		}
		else if(procode[count]==222)// main menu
		{
			count--;
			menu();
			
		}
		else
		{
		   switch(whichmeth)
		   {
		   case 1:
			   if(procode[count]==101 || procode[count]==102 || procode[count]==103 || procode[count]==104 || procode[count]==105)
			   {
				   System.out.print("\nPlease enter the quantity : ");
					qty[count]=sc.nextInt();	
					System.out.println("\n"+qty[count]+" "+unit[procode[count]]+" "+item[procode[count]]+" price : "+(qty[count]*price[procode[count]]));
					freetotal1=freetotal1+(qty[count]*price[procode[count]]);
					if(freetotal1>=200 && count1==0)
					{
						count1++;
						System.out.println("Congratulation you have got free FaceWash gift");
						free[count]="FaceWash";
					}
					else
					{
						if(!(freetotal1>=200))
							{
							System.out.println("To get a free FaceWash gift, you need to purchase Groceries item more than 200 rupees");
							}
						else
						{
							System.out.println("You have already claimed Free Gift Offer");
						}
					}
					System.out.println("\nTo shop more ");
					System.out.println("Select your option");
					System.out.println("(To exit enter 000 )");
					groceries();
			   }
			   else
			   {
				   System.out.println("Please enter a valid code ");
				   count--;
				   groceries();
			   }
			   break;
		   case 2:
			   if(procode[count]==201 || procode[count]==202 || procode[count]==203 || procode[count]==204 || procode[count]==205)
			   {
				   System.out.print("\nPlease enter the quantity : ");
					qty[count]=sc.nextInt();	
					System.out.println("\n"+qty[count]+" "+unit[procode[count]]+" "+item[procode[count]]+" price : "+(qty[count]*price[procode[count]]));
					freetotal2=freetotal2+(qty[count]*price[procode[count]]);
					if(freetotal2>=500 && count2==0)
					{
						count2++;
						System.out.println("Congratulation you have got free 1 kg of Papaya gift");
						free[count]="Papaya(1kg)";
					}
					else
					{
						if(!(freetotal2>=500))
						{
							System.out.println("To get  free 1kg of Papaya gift, you need to purchase Fruit or Veggies  more than 500 rupees");
						}
					     else
					    {
					 	System.out.println("You have already claimed Free Gift Offer");
					    }
					}
					System.out.println("\nTo shop more ");
					System.out.println("Select your option");
					System.out.println("(To exit enter 000 )");
					fv();
			   }
			   else
			   {
				   System.out.println("Please enter a valid code ");
				   count--;
				   fv();
			   }
			   break;
		   case 3:
			   if(procode[count]==301 || procode[count]==302 || procode[count]==303 || procode[count]==304 || procode[count]==305)
			   {
				   System.out.print("\nPlease enter the quantity : ");
					qty[count]=sc.nextInt();	
					System.out.println("\n"+qty[count]+" "+unit[procode[count]]+" "+item[procode[count]]+" price : "+(qty[count]*price[procode[count]]));
					freetotal3=freetotal3+(qty[count]*price[procode[count]]);
					if(freetotal3>=200 && count3==0)
					{
						count3++;
						System.out.println("Congratulation you have got a free glass of Hot Milk gift");
						free[count]="Hot Milk";
					}
					else
					{
						if(!(freetotal3>=200))
						{
							System.out.println("To get a free glass of Hot Milk gift, you need to purchase Beverages more than 200 rupees");
						}
					     else
					    {
					 	System.out.println("You have already claimed Free Gift Offer");
					    }
					}
					System.out.println("\nTo shop more ");
					System.out.println("Select your option");
					System.out.println("(To exit enter 000 )");
					bever();
			   }
			   else
			   {
				   System.out.println("Please enter a valid code ");
				   count--;
				   bever();
			   }
			   break;
		   case 4:
			   if(procode[count]==401 || procode[count]==402 || procode[count]==403 || procode[count]==404 || procode[count]==405)
			   {
				   System.out.print("\nPlease enter the quantity : ");
					qty[count]=sc.nextInt();	
					System.out.println("\n"+qty[count]+" "+unit[procode[count]]+" "+item[procode[count]]+" price : "+(qty[count]*price[procode[count]]));
					freetotal4=freetotal4+(qty[count]*price[procode[count]]);
					if(freetotal4>=200 && count4==0)
					{
						count4++;
						System.out.println("Congratulation you have got a free Chocolate gift");
						free[count]="Munch Chocolate";
					}
					else
					{
						if(!(freetotal4>=200))
						{
							System.out.println("To get a free Chocolate gift, you need to purchase Chocolates more than 200 rupees");
						}
					     else
					    {
					 	System.out.println("You have already claimed Free Gift Offer");
					    }
					}
					System.out.println("\nTo shop more ");
					System.out.println("Select your option");
					System.out.println("(To exit enter 000 )");
					chocolates();
			   }
			   else
			   {
				   System.out.println("Please enter a valid code ");
				   count--;
				   chocolates();
			   }
			   break;
		   case 5:
			   if(procode[count]==501 || procode[count]==502 || procode[count]==503 || procode[count]==504 || procode[count]==505)
			   {
				   System.out.print("\nPlease enter the quantity : ");
					qty[count]=sc.nextInt();	
					System.out.println("\n"+qty[count]+" "+unit[procode[count]]+" "+item[procode[count]]+" price : "+(qty[count]*price[procode[count]]));
					freetotal5=freetotal5+(qty[count]*price[procode[count]]);
					if(freetotal5>=800 && count5==0)
					{
						count5++;
						System.out.println("Congratulation you have got 1pcs of Egg Role gift");
						free[count]="Egg Role";
					}
					else
					{
						if(!(freetotal5>=800))
						{
							System.out.println("To get 1pcs of free Egg Role gift, you need to purchase Snacks more than 800 rupees");
						}
					     else
					    {
					 	System.out.println("You have already claimed Free Gift Offer");
					    }
					}
					System.out.println("\nTo shop more ");
					System.out.println("Select your option");
					System.out.println("(To exit enter 000 )");
					scacks();
			   }
			   else
			   {
				   System.out.println("Please enter a valid code ");
				   count--;
				   scacks();
			   }
			   break;
		   }
			
		}
	}
	void bill()
	{
		System.out.print("Enter your Name : ");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.print("\nEnter your Address : ");
		String add=sc.nextLine();
		System.out.print("\nEnter your mobile number : ");
		long mblno=sc.nextLong();
		System.out.println("\n\n●～●～●～●～●●～●～●～●～●●～●～●～●～●●～●～●～●～●");
		System.out.println("●        𝕎𝔼𝕃ℂ𝕆𝕄𝔼 𝕋𝕆 𝔻𝔸𝕀𝕃𝕐 𝔽ℝ𝔼𝕊ℍ 𝕄𝔸ℝ𝕋             ●");
		System.out.println("●～●～●～●～●●～●～●～●～●●～●～●～●～●●～●～●～●～●\n");
		  
		System.out.println("Purchase Date & Time(IST):               "+formatter.format(date));
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println("  𝐒𝐥 𝐍𝐨.         𝐐𝐓𝐘            𝐍𝐀𝐌𝐄                    𝐏𝐑𝐈𝐂𝐄 ");
		System.out.println("-------------------------------------------------------------");
		
		
		for(int i=1;i<count;i++)
		{ 
			System.out.print("   "+i+"             ");
			System.out.print(qty[i]+"            ");
			System.out.print(item[procode[i]]+"            ");
			System.out.println(qty[i]*price[procode[i]]);
			total=total+(qty[i]*price[procode[i]]);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("Total                                                  "+total);
		System.out.println();
		if(count1>0 || count2>0 || count3>0 || count4>0 || count5>0)
		{
			System.out.println("You have claimed following free gifts offer");
			System.out.println();
			for(int i=1;i<count;i++)
			{
				if(!(free[i]==null))
				{
					System.out.println("             🎁🎁 "+free[i]+" 🎁🎁");
				}
			}
		}
		else
		{
			System.out.println("You have not claimed  any free gifts offer");
		}
		if(total>=1000)
		{
			int disc=(total/100)*10;
			System.out.println("\nYour total amount is : ₹"+total);
			System.out.println("You received discount of 10% : ₹"+disc);
			System.out.println("Your final bill is : ₹"+(total-disc));
			System.out.println("\n𓂀 🙏🙏🙏🙏𝐓𝐡𝐚𝐧𝐤𝐬 𝐟𝐨𝐫 𝐯𝐢𝐬𝐢𝐭𝐢𝐧𝐠 𝐃𝐀𝐈𝐋𝐘 𝐅𝐑𝐄𝐒𝐇 𝐌𝐀𝐑𝐓🙏🙏🙏🙏 𓂀");
			System.out.println("              ⭐🌟 V͙i͙s͙i͙t͙  U͙s͙  A͙g͙a͙i͙n͙ 🌟⭐");
			System.out.println("\n--------------------");
			System.out.println("Customer Details:");
			System.out.println("\nＮａｍｅ : "+name);
			System.out.println("Ａｄｄｒｅｓｓ : "+add);
			System.out.println("Ｍｏｂｉｌｅ Ｎｏ．: "+mblno);
			
		}
		else
		{
			System.out.println("\nYour total amount is : ₹"+total);
			System.out.println("To get discount of 10% you need purchase of rs: ₹"+(1000-total));
			System.out.println("Your final bill is : ₹"+(total));
			System.out.println("\n𓂀 🙏🙏🙏🙏𝐓𝐡𝐚𝐧𝐤𝐬 𝐟𝐨𝐫 𝐯𝐢𝐬𝐢𝐭𝐢𝐧𝐠 𝐃𝐀𝐈𝐋𝐘 𝐅𝐑𝐄𝐒𝐇 𝐌𝐀𝐑𝐓🙏🙏🙏🙏 𓂀");
			System.out.println("              ⭐🌟 V͙i͙s͙i͙t͙  U͙s͙  A͙g͙a͙i͙n͙ 🌟⭐");
			System.out.println("\n--------------------");
			System.out.println("Customer Details:");
			System.out.println("\nＮａｍｅ : "+name);
			System.out.println("Ａｄｄｒｅｓｓ : "+add);
			System.out.println("Ｍｏｂｉｌｅ Ｎｏ．: "+mblno);
			
		}
	}
	public static void main(String[] args) {
		new Shop2().disp();
	}
}