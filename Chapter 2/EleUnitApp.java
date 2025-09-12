/*
Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                	For first 50 units Rs. 0.50/unit
                	For next 100 units Rs. 0.75/unit
                	For next 150 units Rs. 1.20/unit
                	For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill.
*/

3
		if(unit <= 50){
		 double amt1 = unit*0.50;
		 amt1  = amt1+ (amt1*20/100);
		 System.out.println("total electricity bill:" + amt1);
		}else if(unit> 50 && unit <=100){
		 double amt2 = unit*0.75;
		 amt2  = amt2+ (amt2*20/100);
		 System.out.println("total electricity bill:" + amt2);
		}else if(unit> 100 && unit <=150){
		 double amt3 = unit*1.20;
		 amt3  = amt3+ (amt3*20/100);
		 System.out.println("total electricity bill:" + amt3);
		}else if(unit> 150){
		 double amt4 = unit*1.50;
		 amt4  = amt4+ (amt4*20/100);
		 System.out.println("total electricity bill:" + amt4);}
		 
		 
		 }}