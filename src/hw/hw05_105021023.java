package hw;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Topic: 請同學建立一個Student類別，並用 ArrayList 進行管理
                  使用者可以一直輸入，直到使用者按 N or n才結束
	      Student 的類別裡有 name, id 及 score 三個資料成員
                  同學在加入student物件之後要能依 student 的 score 進行遞減排序
 * Date:  2017/06/11
 * Author: 105021023 林郁憲
 */
public class hw05_105021023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> Data = new ArrayList<Student>();
		while(true){
			System.out.println("請輸入學生姓名,ID,成績:");
			Data.add(new Student(scn.next(),scn.next(),scn.nextInt()));
			for(int i=0;i<Data.size();i++){
				for(int j=i+1;j<Data.size();j++){
					if(Data.get(i).getScore()<Data.get(j).getScore()){
						Student tmp = Data.get(i);
						Data.set(i, Data.get(j));
						Data.set(j, tmp);
					 }
				 }
			 }
			if(Data.get(0).equals('N')||Data.get(0).equals('n')){
				break;
			}
		    for(int i=0; i<Data.size();i++){
		    	System.out.println(Data.get(i).showAll());		
		    }
		}
		
	}

}
