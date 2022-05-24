package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author bfh3000@naver.com
 * 1. lamda �⺻������ ����.
 * 2. List ������ Arrays�� �ƴ� Collections�� ó���Ѵ�.
 * 3. sort�� ���ڰ����� �������̽��� �� �� �ֱ���.
 * 4. ���ٽ�(Lambda)���� Comparator ����
 *
 */
public class Lvl2_ArrayPick {
	
	static Logger log = LogManager.getLogger();
	
	//https://programmers.co.kr/learn/courses/30/lessons/42746
	//���� ū ��
	public String solution(int[] numbers) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        
        //Sorts the specified list according to the order induced by the specified comparator.
        //https://codechacha.com/ko/java-sorting-comparator/ << "���ٽ�(Lambda)���� Comparator ����"�� ���� �� �ִ�.
        Collections.sort(list, (a, b) -> {
        	log.debug("list : "+list);
        	log.debug("a : "+a);
			log.debug("b : "+b);
			log.debug("String.valueOf(a)=as : "+String.valueOf(a));
			log.debug("String.valueOf(b)=bs : "+String.valueOf(b));
            String as = String.valueOf(a);
            String bs = String.valueOf(b);
            log.debug("-Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as)) : "+ -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as)));
            System.out.println();

            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as)); 
        });
        
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        if(answer.charAt(0) == '0') { //�̰� ���� ������?
            return "0";
        }else {
        	System.out.println("answer : "+ answer);
            return answer;
        }
    }
	
	public static void main(String[] args) {
		int[] numbers = {6, 10, 2, 3};
		new Lvl2_ArrayPick().solution(numbers);
		
//		List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < numbers.length; i++) {list.add(numbers[i]);}
//		Collections.sort(list, (a,b)->{
//			log.debug("a : "+a);
//			log.debug("b : "+b);
//			log.debug("Integer.compare(a, b) : "+Integer.compare(a, b));
//			System.out.println("");
//            return Integer.compare(a, b);
//		}); 
//		log.debug(list);
	}
}
