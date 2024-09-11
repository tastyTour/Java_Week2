public class TTTest {
    public static void main(String[] args) {
        int temperature = 20;
        final int FREEZING_POINT = 0;

        //변수 값 변경
        temperature = 25;
        System.out.println("Current temperature: " + temperature);

        //상수 값 변경 시도
        //FREEZING_POINT = 10; -> 이 코드는 컴파일 오류를 일으킨다.

        System.out.println("freezing point of water: " + FREEZING_POINT);
    }
}
