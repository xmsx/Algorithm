package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class _20ThoughtWorks {
	public static final long MY_YEAR = 31536000000L;
	public static final long MY_DAY = 86400000L;
	public static void main(String[] args) throws ParseException {
		String msg = "SubmitDate: 2050/05/01 CAR0001|2044/05/01|Volkswagen|65535|F CAR0002|2044/05/03|BMW|100001|F CAR0003|2047/05/02|Mercedes-Benz|37789|T CAR0004|2047/05/03|Honda|59908|T CAR0005|2049/12/10|Peugeot|49999|F CAR0006|2046/11/15|Jeep|2000|F CAR0007|2046/11/16|Jeep|5000|F";
		String[] m = msg.split(" ");
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date now = df.parse(m[1]);
		
		String[] car;
		Car[] carmsg = new Car[m.length];
		List<Car> ans1 = new ArrayList<Car>();
		List<Car> ans2 = new ArrayList<Car>();
		List<Car> ans3 = new ArrayList<Car>();
 		for(int i=2 ; i<m.length ;i++ ){
			car = m[i].split("\\|");
			//System.out.println(car[0]+"+++++"+car[4]+"----"+car[4].equals("F"));
			carmsg[i] = new Car(car[0], df.parse(car[1]), car[2], Integer.parseInt(car[3]), car[4].equals("F")?false:true);
			if(carmsg[i].isWriteOff(now)==1) {
				ans3.add(carmsg[i]);
			} else if(carmsg[i].isWriteOff(now)==2){
				continue;
			} else if(carmsg[i].upkeepbyKM(now)) {
				ans2.add(carmsg[i]);
			} else if(carmsg[i].upkeepbyDate(now)) {
				ans1.add(carmsg[i]);
			} else continue;
 		}
 		Collections.sort(ans1);
 		Collections.sort(ans2);
 		Collections.sort(ans3);
 		StringBuffer ans = new StringBuffer(); 
 		List<String> s = new ArrayList<String>();
 		int k=0;
 		ans.append("Reminder\n==================\n\n* Time-related maintenance coming soon...\n");
 		for(int i=0;i<ans1.size();i++) {
 			if(i!=0&&!ans1.get(i).getName().equals(ans1.get(i-1).getName())){
 				ans.append(ans1.get(i).getName());
 				ans.append(": "+k+" ");
 				ans.append(StringUtils.join(s, ", "));
 				ans.append("\n");
 				k=0;
 				s.clear();
 			}
 			k++;
 			s.add(ans1.get(i).getID());
 		}
 		ans.append(ans1.get(ans1.size()-1).getName());
		ans.append(": "+k+" ");
		ans.append(StringUtils.join(s, ", "));
		k=0;
		s.clear();
		ans.append("\n\n* Distance-related maintenance coming soon...\n");
		for(int i=0;i<ans2.size();i++) {
 			if(i!=0&&!ans2.get(i).getName().equals(ans2.get(i-1).getName())){
 				ans.append(ans2.get(i).getName());
 				ans.append(": "+k+" ");
 				ans.append(StringUtils.join(s, ", "));
 				ans.append("\n");
 				k=0;
 				s.clear();
 			}
 			k++;
 			s.add(ans2.get(i).getID());
 		}
 		ans.append(ans2.get(ans2.size()-1).getName());
		ans.append(": "+k+" ");
		ans.append(StringUtils.join(s, ", "));
		k=0;
		s.clear();
		ans.append("\n\n* Write-off coming soon...\n");
		for(int i=0;i<ans3.size();i++) {
 			if(i!=0&&!ans3.get(i).getName().equals(ans3.get(i-1).getName())){
 				ans.append(ans3.get(i).getName());
 				ans.append(": "+k+" ");
 				ans.append(StringUtils.join(s, ", "));
 				ans.append("\n");
 				k=0;
 				s.clear();
 			}
 			k++;
 			s.add(ans3.get(i).getID());
 		}
 		ans.append(ans3.get(ans3.size()-1).getName());
		ans.append(": "+k+" ");
		ans.append(StringUtils.join(s, ", "));
		k=0;
		s.clear();
		System.out.println(ans.toString());
	}

}
class Car implements Comparable<Car> {
	public static final long MY_YEAR = 31536000000L;
	public static final long MY_DAY = 86400000L;
	private String ID;
	private Date date;
	private String name;
	private int km;
	private boolean isdamaged;
	public Car(String iD, Date date, String name, int km, boolean isdamaged) {
		super();
		ID = iD;
		this.date = date;
		this.name = name;
		this.km = km;
		this.isdamaged = isdamaged;
	}
	public boolean upkeepbyKM(Date cur) {
		//if(isWriteOff(cur))return false;
		
		int t = (km+500)%10000;
		if(t<=500&&t>=0) return true;
		return false;
	}
	public boolean upkeepbyDate(Date cur) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		//if(isWriteOff(cur))return false;
		c1.setTime(date);
		c2.setTime(cur);
		int d1 = c1.get(Calendar.DAY_OF_MONTH);
		int m1 = c1.get(Calendar.MONTH);
		int y1 = c1.get(Calendar.YEAR);
		int d2 = c2.get(Calendar.DAY_OF_MONTH);
		int m2 = c2.get(Calendar.MONTH);
		int y2 = c2.get(Calendar.YEAR);
		int m = m2-m1+(y2-y1)*12;
		if(isdamaged) {
			 if((m+1)%3==0) {
				 return true;
			 } else if((m+1)%3==1&&d2<=d1) {
				 return true;
			 } else return false;
		}
		
		if(y2-y1>=3) {
			if((m+1)%6==0) {
				 return true;
			 } else if((m+1)%6==1&&d2<=d1) {
				 return true;
			 } else return false;
		}
		if((m+1)%12==0) {
			 return true;
		 } else if((m+1)%12==1&&d2<=d1) {
			 return true;
		 } else return false;
	}
	public int isWriteOff (Date cur) {
		System.out.println("-----------:"+ID);
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Calendar c = Calendar.getInstance();
		Date ScrapDate =  new Date();
		if(isdamaged)ScrapDate.setTime(this.date.getTime()+MY_YEAR*3);
		else ScrapDate.setTime(this.date.getTime()+MY_YEAR*6);
		
		c.setTime(ScrapDate);
		Date BeforeScrapDate = new Date();
		BeforeScrapDate.setTime(ScrapDate.getTime()-c.get(Calendar.DAY_OF_MONTH)*MY_DAY);
		c.setTime(BeforeScrapDate);
		BeforeScrapDate.setTime(BeforeScrapDate.getTime()-(c.get(Calendar.DAY_OF_MONTH)-1)*MY_DAY);
		ScrapDate.setTime(ScrapDate.getTime()-1);
		System.out.println("Date:"+df.format(date));
		System.out.println("ScrapDate:"+df.format(ScrapDate));
		System.out.println("BeforeScrapDate:"+df.format(BeforeScrapDate)+"\n");
		if(cur.after(ScrapDate)) return 2;
		else if(!cur.before(BeforeScrapDate)) return 1;
		else return 0;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public boolean isIsdamaged() {
		return isdamaged;
	}
	public void setIsdamaged(boolean isdamaged) {
		this.isdamaged = isdamaged;
	}
	@Override
	public int compareTo(Car c) {
		if(this.name.compareTo(c.getName())<0)return -1;
		else if(this.name.compareTo(c.getName())>0) return 1;
		else {
			if(this.ID.compareTo(c.getID())<0) return -1;
			else if(this.ID.compareTo(c.getID())>0) return 1;
			else return 0;
		}
	}
}
