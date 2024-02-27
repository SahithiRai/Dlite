package bus_ticket;
import java.util.Scanner;
public class bus_ticket
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int fromStage,toStage,adults,children,numStages;
		double adultCostPerStage=10.0,childCostPerStage=5.0,totalTicketCost,discount,discountAmount,ticketCostAfterDiscount,serviceCharge,totalCost;
		System.out.print("Enter From stage number: ");
        fromStage=sc.nextInt();
        System.out.print("Enter To stage number: ");
        toStage=sc.nextInt();
        System.out.print("Enter number of adult passengers: ");
        adults=sc.nextInt();
        System.out.print("Enter number of children passengers: ");
        children=sc.nextInt();
        numStages=Math.abs(toStage-fromStage);
        totalTicketCost=(adults*adultCostPerStage+children*childCostPerStage)*numStages;
        if(adults>=5)
            discount=0.20;
        else if(adults==4)
            discount=0.15;
        else if(adults==3)
            discount=0.10;
        else if(adults==2)
            discount=0.05;
        else
            discount=0.0;
        discountAmount=totalTicketCost*discount;
        ticketCostAfterDiscount=totalTicketCost-discountAmount;
        serviceCharge=ticketCostAfterDiscount*0.05;
        totalCost=ticketCostAfterDiscount+serviceCharge;
        System.out.println("Total Ticket Cost: Rs."+totalCost);
        sc.close();
	}
}
