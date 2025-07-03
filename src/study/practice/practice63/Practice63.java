package study.practice.practice63;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice63 {

	public static void main(String[] args) throws Exception {
		String jsonText = """
								{
				  "도서관": {
				    "위치": "서울특별시 강남구",
				    "운영시간": {
				      "평일": [
				        "09:00",
				        "21:00"
				      ],
				      "주말": [
				        "10:00",
				        "18:00"
				      ]
				    },
				    "책목록": [
				      {
				        "제목": "자바 프로그래밍",
				        "저자": "홍길동",
				        "출판연도": 2023,
				        "가격": 25000,
				        "대출가능": true,
				        "카테고리": [
				          "프로그래밍",
				          "자기계발"
				        ]
				      },
				      {
				        "제목": "데이터 분석 입문",
				        "저자": "김철수",
				        "출판연도": 2022,
				        "가격": 28000,
				        "대출가능": false,
				        "카테고리": [
				          "데이터",
				          "분석"
				        ]
				      }
				    ],
				    "특별서비스": {
				      "키오스크": true,
				      "스터디룸": {
				        "개수": 5,
				        "예약 가능": true,
				        "비용": {
				          "1시간당": 5000,
				          "하루": 30000
				        }
				      }
				    }
				  }
				}
								""";

		JSONParser jsonParser = new JSONParser();	//JSON 포맷 최초 변환 해주는 역할
		JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonText);
		// 최초 최상단 {에 해당하는 객체타입 >> JSONObject

		// : { >> 객체 >> (JSONObject)
		// : [ >> 배열 >> (JSONArray)
		// : "값" >> 값 >> 변수명.get("키")
		// : 123 >> 값 >> 변수명.get("키")

		JSONObject library = (JSONObject) jsonObj.get("도서관");
		//최당산의 객체 입장을 기준으로 보면, 키값이 "도서관" 밖에 없음.
		//"도서관"이라는 키값으로 접근하면 옆에 Value에 해당하는 게  { (중괄호)로 시작함 >> 객체 >> JSONObject
		//System.out.println("도서관: " + library);

//		String location = (String) library.get("위치");
		System.out.println("위치: " + library.get("위치"));
		
		System.out.println();

		JSONObject operating = (JSONObject) library.get("운영시간");
		JSONArray weekdays = (JSONArray) operating.get("평일");
		JSONArray weekends = (JSONArray) operating.get("주말");

		System.out.println("=====운영시간=====");
		System.out.println("평일: " + weekdays.get(0) + " ~ " + weekdays.get(1));
		System.out.println("주말: " + weekends.get(0) + " ~ " + weekends.get(1));

		System.out.println();
		
		JSONArray bookList = (JSONArray) library.get("책목록");
		System.out.println("=====책목록=====");
		
		for(int i=0; i<bookList.size(); i++) {
			JSONObject book = (JSONObject) bookList.get(i);
			System.out.println("책 제목: " + book.get("제목"));
			System.out.println("저자: " + book.get("저자"));
			System.out.println("출판연도: " + book.get("출판연도"));
			System.out.println("가격: " + book.get("가격") + "원");
			System.out.println("대출가능: " + (Boolean) book.get("대출가능"));
			
			JSONArray category = (JSONArray) book.get("카테고리");
			for(int j=0; j<bookList.size(); j++) {
				System.out.println("카테고리: " + category.get(j) + " ");
			}
			System.out.println();
		}

		JSONObject service = (JSONObject) library.get("특별서비스");
		System.out.println("=====특별서비스=====");
		System.out.println("키오스크: " + service.get("키오스크"));
		
		JSONObject studyroom = (JSONObject) service.get("스터디룸");
		System.out.println("개수: " + studyroom.get("개수"));
		System.out.println("예약가능: " + studyroom.get("예약가능"));
		
		JSONObject price = (JSONObject) studyroom.get("비용");
		System.out.println("1시간당: " + price.get("1시간당"));
		System.out.println("하루: " + price.get("하루"));
		
		
	}

}
